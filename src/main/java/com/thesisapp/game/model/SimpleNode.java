package com.thesisapp.game.model;

//This is the same as the Node class but with out the children member, so a simpler object can be passed to the client
public class SimpleNode {

  private int id;
  private String text;
  private Decision[] decisions;
  private int speaker;
  private boolean checkpoint;

  public SimpleNode() {}

  public SimpleNode(Node node) {
    this.id = node.id;
    this.text = node.text;
    this.decisions = node.decisions;
    this.speaker = node.speaker;
    this.checkpoint = node.checkpoint;
  }
}
