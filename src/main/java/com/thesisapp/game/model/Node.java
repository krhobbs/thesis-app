package com.thesisapp.game.model;

import java.util.ArrayList;

public class Node {

  private int id;
  private String text;
  private Decision[] decisions;
  private ArrayList<Node> children = new ArrayList<>();
  private int speaker;
  private boolean checkpoint;

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
