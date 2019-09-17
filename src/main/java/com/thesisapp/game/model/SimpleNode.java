package com.thesisapp.game.model;

//This is the same as the Node class but with out the children member, so a simpler object can be passed to the client
public class SimpleNode {

  private double id;
  private String text;
  private Decision[] decisions;
  private int speaker;
  private boolean checkpoint;

  //Getters and Setters (required for Jackson)
  public double getId() {
    return id;
  }

  public void setId(double id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Decision[] getDecisions() {
    return decisions;
  }

  public void setDecisions(Decision[] decisions) {
    this.decisions = decisions;
  }

  public int getSpeaker() {
    return speaker;
  }

  public void setSpeaker(int speaker) {
    this.speaker = speaker;
  }

  public boolean isCheckpoint() {
    return checkpoint;
  }

  public void setCheckpoint(boolean checkpoint) {
    this.checkpoint = checkpoint;
  }

  public SimpleNode() {}

  public SimpleNode(Node node) {
    this.id = node.id;
    this.text = node.text;
    this.decisions = node.decisions;
    this.speaker = node.speaker;
    this.checkpoint = node.checkpoint;
  }

}
