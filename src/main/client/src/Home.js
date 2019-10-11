import React, { Component } from 'react';
import { Container } from 'reactstrap';
import Message from "./Message";
import Decision from "./Decision";

class Home extends Component {
  constructor(props) {
    super(props);
    this.state = {
      previouslyPlayed: [{text: 'pinging...  acquired signal  status...connected', speaker: 0}, {text: 'Ah-- what the hell?', speaker: 1}],
      currentNode: {
        id: 1,
        text: 'Stupid thing.',
        decisions: [
          {
            id: 'n1d1',
            text: 'Who is this?',
            whichChild: 0,
            attitude: 0,
            shortText: "Who is this?"
          },
          {
            id: 'n1d2',
            text: 'Whoa -- is this an actual person?.',
            whichChild: 0,
            attitude: 0,
            shortText: "Whoa."
          }
        ],
        speaker: 0,
        checkpoint: true
      },
      decisionList: [0, 0]
    };

    this.onDecide = this.onDecide.bind(this);

  }

  // Generate the previous messages to be displayed on the screen (do not modify state)
  generateMessages() {
    return this.state.previouslyPlayed.map((superSimpleNode) =>
      <Message key={this.state.previouslyPlayed.indexOf(superSimpleNode)} text={superSimpleNode.text} speaker={superSimpleNode.speaker}/>
    );
  }

  // Generate the current decision that the play must make (do not modify state)
  generateDecision() {
    return <Decision decisions={this.state.currentNode.decisions} onDecide={this.onDecide}/>;
  }

  updatePreviouslyPlayed(superSimpleNode) {
    if (superSimpleNode.text.length > 0) {
      let previouslyPlayed = this.state.previouslyPlayed;
      previouslyPlayed.push(superSimpleNode);
      this.setState({previouslyPlayed: previouslyPlayed});
    }
  }

  updateDecisionList(whichChild) {
    let decisionList = this.state.decisionList;
    decisionList.push(whichChild);
    this.setState({decisionList: decisionList});
  }

  async onDecide(answer) {
    //Update the state to reflect the decision made
    this.updatePreviouslyPlayed({text: answer.text, speaker: 3});
    this.updateDecisionList(answer.whichChild);

    //console.log(this.state.decisionList);

    let body = { decisionList: this.state.decisionList };

    let currentNode = await (await fetch('http://localhost:8080/decide', {
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

    this.setState({currentNode: currentNode});
    this.updatePreviouslyPlayed({text: currentNode.text, speaker: currentNode.speaker});

    if (currentNode.decisions[0].id === '') {
      this.onDecide(currentNode.decisions[0]);
    }

  }

  //A method to get the next node when no decision is necessary

  render() {
    return (
      <div id={'background'}>
        <Container id={'Application'}>
          {this.generateMessages()}
          {this.generateDecision()}
        </Container>
      </div>
    );
  }
}

export default Home;