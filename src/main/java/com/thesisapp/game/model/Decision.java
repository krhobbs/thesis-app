package com.thesisapp.game.model;

public class Decision {

  private String id;
  private String text;
  private int whichChild;
  private int attitude;

  public Decision() {}

  public Decision(String id, String text, int whichChild, int attitude) {
    this.id = id;
    this.text = text;
    this.whichChild = whichChild;
    this.attitude = attitude;
  }

}
