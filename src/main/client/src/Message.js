import React, { Component } from 'react';

class Message extends Component {

  newText = this.props.text.replace("[]", this.props.name);

  render() {
    return (
      <div className={"dialogue"} id={"speaker" + this.props.speaker}>
        <p>
          {this.newText}
        </p>
      </div>
    );
  }
}

export default Message;