import React, { Component } from 'react';
import { Card, CardText } from 'reactstrap';

class Message extends Component {

  render() {
    return (
      <Card body className={"dialogue"}>
        <CardText>
          {this.props.text}
        </CardText>
      </Card>
    );
  }
}

export default Message;