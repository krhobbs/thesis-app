package com.thesisapp.game.model;

import java.util.ArrayList;

public class Node {

  public int id;
  public String text;
  public Decision[] decisions;
  public ArrayList<Node> children = new ArrayList<>();
  public int speaker;
  public boolean checkpoint;

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
