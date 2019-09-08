package com.thesisapp.game.model;

import java.io.Serializable;
import java.util.Arrays;

public class Decide implements Serializable {

  private int[] decisionList;

  //Getters and Setters
  public int[] getDecisionList() {
    return decisionList;
  }

  public void setDecisionList(int[] decisionList) {
    this.decisionList = decisionList;
  }

  public Decide() { this.decisionList = new int[0]; }

  public Decide(int[] decisionList) { this.decisionList = decisionList; }

  //Method which returns a SimpleNode object that is sent to the server
  public SimpleNode getNode() {
    //Use the Game class to get the root node for the entire story tree
    Node rootNode = (new Game()).buildFullStoryTree();

    //Traverse the story tree using the decisionList to get to the current node
    Node currentNode = rootNode;
    for (int whichChild : this.decisionList) {
      currentNode = currentNode.getChild(whichChild);
    }

    return new SimpleNode(currentNode);
  }

}
