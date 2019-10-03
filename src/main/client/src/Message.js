import React, { Component } from 'react';

class Message extends Component {

  render() {
    return (
      <div className={"dialogue"} id={"speaker" + this.props.speaker}>
        <p>
          {this.props.text}
        </p>
      </div>
    );
  }
}

export default Message;