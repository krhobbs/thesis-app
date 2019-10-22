import React, { Component } from 'react';
import { ButtonGroup, Button, Form, Input } from 'reactstrap';

class Decision extends Component {

  generateAnswerButtons() {
    //For the three decisions where the player may have to enter their name, add a form to do so
    if (this.props.decisions[0].id === "n11d1" || this.props.decisions[0].id === "n12d1") {
      return (
        <div>
          <Form inline>
            <Input type={"text"}
                   placeholder={"Enter your name"}
                   onChange={(event) => {this.props.updateName(event.target.value)}}
            />
            <Button
              key={this.props.decisions[0].id}
              onClick={() => {
                this.props.onDecide(this.props.decisions[0])
              }}
              value={"Done."}
            >
              Done.
            </Button>
          </Form>
          <Button
            key={this.props.decisions[1].id}
            onClick={() => {
              this.props.onDecide(this.props.decisions[1]);
            }}
            value={this.props.decisions[1].shortText}
          >
            {this.props.decisions[1].shortText}
          </Button>
        </div>
      );
    }

    if (this.props.decisions[0].id === "n13d1") {
      return (
        <div>
          <Form inline>
            <Input type={"text"}
                   placeholder={"Enter your name"}
                   onChange={(event) => {this.props.updateName(event.target.value)}}
            />
            <Button
              key={this.props.decisions[0].id}
              onClick={() => {
                this.props.onDecide(this.props.decisions[0])
              }}
              value={"Done."}
            >
              Done.
            </Button>
          </Form>
        </div>
      );
    }

    if (this.props.decisions.length > 0) {
      return this.props.decisions.map((decision) =>
        <Button
          key={decision.id}
          onClick={() => {
            this.props.onDecide(decision);}
          }
          value={decision.shortText}
        >
          {decision.shortText}
        </Button>
      );
    }
  }

  render() {
    return (
      <ButtonGroup className={"decision"}>
        {this.generateAnswerButtons()}
      </ButtonGroup>
    );
  }
}


export default Decision;