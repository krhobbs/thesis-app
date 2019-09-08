package com.thesisapp.game.model;

public class Decision {

  private String id;
  private String text;
  private int whichChild;
  private int attitude;

  //Getters and Setters
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public int getWhichChild() {
    return whichChild;
  }

  public void setWhichChild(int whichChild) {
    this.whichChild = whichChild;
  }

  public int getAttitude() {
    return attitude;
  }

  public void setAttitude(int attitude) {
    this.attitude = attitude;
  }

  public Decision() {}

  public Decision(String id, String text, int whichChild, int attitude) {
    this.id = id;
    this.text = text;
    this.whichChild = whichChild;
    this.attitude = attitude;
  }

}
