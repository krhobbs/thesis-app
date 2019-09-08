package com.thesisapp.game.model;

import java.util.ArrayList;

public class Node {

  public int id;
  public String text;
  public Decision[] decisions;
  public ArrayList<Node> children = new ArrayList<>();
  public int speaker;
  public boolean checkpoint;

  //Getters and Setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
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

  public ArrayList<Node> getChildren() {
    return children;
  }

  public void setChildren(ArrayList<Node> children) {
    this.children = children;
  }

  public int getSpeaker() {
    return speaker;
  }

  public void setSpeaker(int speaker) {
    this.speaker = speaker;
  }

  public boolean getCheckpoint() {
    return checkpoint;
  }

  public void setCheckpoint(boolean checkpoint) {
    this.checkpoint = checkpoint;
  }

  public Node() {}

  public Node(int id, String text, Decision[] decisions, int speaker, boolean checkpoint) {
    this.id = id;
    this.text = text;
    this.decisions = decisions;
    this.speaker = speaker;
    this.checkpoint = checkpoint;
  }

  public void addChild(Node child) { this.children.add(child); }

  public Node getChild(int whichChild) { return this.children.get(whichChild); }

}
