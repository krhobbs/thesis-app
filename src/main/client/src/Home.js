import React, { Component } from 'react';
import { Container } from 'reactstrap';
import ls from 'local-storage';
import Message from "./Message";
import Decision from "./Decision";

class Home extends Component {
  constructor(props) {
    super(props);
    this.state = {
      name: "",
      pronouns: "",
      previouslyPlayed: [],
      currentNode: {
        id: 1,
        text: '',
        decisions: [
          {
            id: 'xx',
            text: '',
            whichChild: 0,
            attitude: 0,
            shortText: "Connect (Begin Playing)"
          }
        ],
        speaker: 0,
        checkpoint: true
      },
      decisionList: [],
      checkpointInfo: {
        previouslyPlayed: [],
        checkpointList: []
      }
    };

    this.onDecide = this.onDecide.bind(this);
    this.updateName = this.updateName.bind(this);
    this.updatePronoun = this.updatePronoun.bind(this);
    this.restartButton = this.restartButton.bind(this);

  }

  componentDidMount() {
    let state  = JSON.parse(ls.get('game-state') || '{}');
    this.setState(state);
  }

  componentDidUpdate(prevProps, prevState, snapshot) {
    this.scrollToBottom();
  }

  // Generate the previous messages to be displayed on the screen (do not modify state)
  generateMessages() {
    return this.state.previouslyPlayed.map((superSimpleNode) =>
      <Message key={this.state.previouslyPlayed.indexOf(superSimpleNode)} text={superSimpleNode.text} speaker={superSimpleNode.speaker} name={this.state.name}/>
    );
  }

  // Generate the current decision that the play must make (do not modify state)
  generateDecision() {
    return <Decision decisions={this.state.currentNode.decisions} onDecide={this.onDecide} updateName={this.updateName} updatePronoun={this.updatePronoun} restartButton={this.restartButton}/>;
  }

  updatePreviouslyPlayed(superSimpleNode) {
    if (superSimpleNode.text.length > 0) {
      let previouslyPlayed = this.state.previouslyPlayed;
      previouslyPlayed.push(superSimpleNode);
      this.setState({previouslyPlayed: previouslyPlayed});
      ls.set('game-state', JSON.stringify(this.state));
    }
  }

  updateDecisionList(whichChild) {
    let decisionList = this.state.decisionList;
    decisionList.push(whichChild);
    this.setState({decisionList: decisionList});
    ls.set('game-state', JSON.stringify(this.state));
  }

  updateName(name) {
    this.setState({name: name});
    ls.set('game-state', JSON.stringify(this.state));
  }

  updatePronoun(pronoun) {
    this.setState({pronoun: pronoun})
    ls.set('game-state', JSON.stringify(this.state));
  }

  //Sets the decision list back to what it should be, after death or end. Also clears cookies.
  restartButton(id) {
    if (id === 'r') {
      let backToList = this.state.checkpointInfo.checkpointList.slice();
      let backToPrev = this.state.checkpointInfo.previouslyPlayed.slice();
      this.setState({
        decisionList: backToList,
        previouslyPlayed: backToPrev
      });
      ls.clear();
      let promise = this.onDecide({id: 'r', text: '', whichChild: 0, attitude:0, shortText: ''});
      console.log(promise);
    } else {
      let newState = {
        name: "",
        pronouns: "",
        previouslyPlayed: [],
        currentNode: {
          id: 1,
          text: '',
          decisions: [
            {
              id: 'xx',
              text: '',
              whichChild: 0,
              attitude: 0,
              shortText: "Connect (Begin Playing)"
            }
          ],
          speaker: 0,
          checkpoint: true
        },
        decisionList: [],
        checkpointInfo: {
          previouslyPlayed: [],
          checkpointList: []
        }
      };
      this.setState(newState);
      ls.clear();
      let promise = this.onDecide({id: 'f', text: '', whichChild: 0, attitude:0, shortText: ''});
      console.log(promise);
    }


  }

  scrollToBottom() {
    this.el.scrollIntoView({behavior: "auto"});
  }

  async onDecide(answer) {
    //Update the state to reflect the decision made
    this.updatePreviouslyPlayed({text: answer.text, speaker: 3});
    this.updateDecisionList(answer.whichChild);

    //console.log(this.state.decisionList);

    let body = { decisionList: this.state.decisionList };

    let currentNode = await (await fetch('http://localhost:9000/decide', {
      method: 'POST',
      mode: 'cors',
      headers: {
        'Accept': 'application/json',
        'Cache-Control': 'no-cache',
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*'
      },
      body: JSON.stringify(body),
    })).json();

    //Update the checkpoint information if the node is a checkpoint
    if (currentNode.checkpoint === true) {
      console.log("Test");
      let newCheckpointList = this.state.decisionList.slice();
      let newCheckpointPrevious = this.state.previouslyPlayed.slice();
      let newCheckpointInfo = {
        previouslyPlayed: newCheckpointPrevious,
        checkpointList: newCheckpointList
      };
      this.setState({checkpointInfo: newCheckpointInfo});
    }

    this.setState({currentNode: currentNode});
    this.updatePreviouslyPlayed({text: currentNode.text, speaker: currentNode.speaker});
    ls.set('game-state', JSON.stringify(this.state));

    if (currentNode.decisions[0].id === '') {
      this.onDecide(currentNode.decisions[0]);
    }

  }


  render() {
    return (
      <div id={'background'}>
        <Container id={'Application'}>
          {this.generateMessages()}
          {this.generateDecision()}
        </Container>
        <div ref={el => {this.el = el}} style={{float: "left", clear: "both"}}/>
      </div>
    );
  }
}

export default Home;