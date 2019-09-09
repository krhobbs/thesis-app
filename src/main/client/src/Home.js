import React, { Component } from 'react';
import { Container } from 'reactstrap';
import Message from "./Message";
import Decision from "./Decision";

class Home extends Component {
  constructor(props) {
    super(props);
    this.state = {
      previouslyPlayed: [],
      currentNode: {
        id: 1,
        text: 'Ah-- what the hell? Stupid thing.',
        decisions: [
          {
            id: 'n1d1',
            text: 'Who is this?',
            whichChild: 0,
            attitude: 0
          },
          {
            id: 'n1d2',
            text: 'What the hell yourself.',
            whichChild: 0,
            attitude: 0
          }
        ],
        speaker: 0,
        checkpoint: true
      },
      decisionList: []
    };

    this.onDecide = this.onDecide.bind(this);

  }

  // Generate the previous messages to be displayed on the screen
  generateMessages() {
    let currentPrevious = this.state.previouslyPlayed;
    if (currentPrevious.indexOf(this.state.currentNode.text) < 0) {
      currentPrevious.push(this.state.currentNode.text);
    }

    return currentPrevious.map((text) =>
      <Message key={}{currentPrevious.indexOf(text)} text={text}/>
    );
  }

  // Generate the current decision that the play must make
  generateDecision() {
    return <Decision decisions={this.state.currentNode.decisions} onDecide={this.onDecide}/>;
  }

  updatePreviouslyPlayed(text) {
    let previouslyPlayed = this.state.previouslyPlayed;
    previouslyPlayed.push(text);
    this.setState({previouslyPlayed: previouslyPlayed});
  }

  updateDecisionList(whichChild) {
    let decisionList = this.state.decisionList;
    decisionList.push(whichChild);
    this.setState({decisionList: decisionList});
  }

  async onDecide(answer) {
    //Update the state to reflect the decision made
    this.updatePreviouslyPlayed(answer.text);
    this.updateDecisionList(answer.whichChild);

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

  }

  render() {
    return (
      <div>
        <Container id={'Application'}>
          {this.generateMessages()}
          {this.generateDecision()}
        </Container>
      </div>
    );
  }
}

export default Home;