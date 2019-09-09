import React, { Component } from 'react';
import { ButtonGroup, Button } from 'reactstrap';

class Decision extends Component {

  generateAnswerButtons() {
    if (this.props.decisions.length > 0) {
      return this.props.decisions.map((decision) =>
        <Button
          key={decision.id}
          onClick={() => {
            this.props.onDecide(decision);}
          }
          value={decision.text}
        >
          {decision.text}
        </Button>
      );
    }
  }

  render() {
    return (
      <ButtonGroup>
        {this.generateAnswerButtons()}
      </ButtonGroup>
    );
  }
}


export default Decision;