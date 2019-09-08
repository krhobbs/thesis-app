package com.thesisapp.game.model;

public class Game {

  private Decision[] emptyDecisions = {};

  public Decision[] getEmptyDecisions() {
    return emptyDecisions;
  }

  public void setEmptyDecisions(Decision[] emptyDecisions) {
    this.emptyDecisions = emptyDecisions;
  }

  public Game() {}

  public Node buildFullStoryTree() {
    //Act 1
    Node n0 = new Node(0, "pinging...\nacquired signal\nstatus...connected", emptyDecisions, 0, true);

    Decision n1d1 = new Decision("n1d1", "Who is this?", 0, 0);
    Decision n1d2 = new Decision("n1d1", "What the hell yourself.", 1, 0);
    Decision[] n1d = {n1d1, n1d2};
    Node n1 = new Node(1, "Ah-- what the hell? Stupid thing.", n1d, 1, false);

    Decision n2d1 = new Decision("n2d1", "I can read you. This is showing up on my computer. Who is this?", 0, 0);
    Decision[] n2d = {n2d1};
    Node n2 = new Node(2, "No way. Is this thing receiving? Can you hear me?", n2d, 1, false);

    Node n3 = new Node(3, "This is... I can't believe it. I thought this thing was fried, but if it accepted a signal from you...", emptyDecisions, 1, false);

    Decision n4d1 = new Decision("n2d1", "Maybe you could tell me who you are first? I shouldn't even have connectivity on this thing.", 0, 0);
    Decision n4d2 = new Decision("n2d1", "Total stranger talking through computer? I'm pretty sure my parents said something disapproving about this type of scenario.", 0, 0);
    Decision[] n4d = {n4d1, n4d2};
    Node n4 = new Node(4, "Okay. This is on your computer, you said? What computer?", n4d, 1, false);

    Node n5 = new Node(5, "Fair enough. Let's trade that info. I'm Prosper.", emptyDecisions, 1, false);

    Decision n6d1 = new Decision("n6d1", "A dinosaur computer. It's a load of scrap I pulled together from old junk and thrift stores. Just messing around. I can't even hitch it up to the internet, so I have no idea how I'm receiving you.", 0, 0);
    Decision[] n6d = {n6d1};
    Node n6 = new Node(6, "What are you seeing this on?", n6d, 1, false);

    Node n7 = new Node(7, "Yeah, I'd like to know that too.", emptyDecisions, 1, false);

    Decision n8d1 = new Decision("n8d1", "The States.", 0, 0);
    Decision n8d2 = new Decision("n8d2", "Earth.", 1, 1);
    Decision[] n8d = {n8d1, n8d2};
    Node n8 = new Node(8, "Well, you're speaking English. Where are you, regionally?", n8d, 1, false);

    Node n9 = new Node(9, "I'm out of the country, in Greenland. I suppose it's not so unbelievable that we're communicating somehow.", emptyDecisions, 1, false);

    Node n10 = new Node(10, "Wild. Me too. I'm pretty far north, in Greenland. I suppose it's not so unbelieveable that we're communicating somehow.", emptyDecisions, 1, false);

    Decision n11d1 = new Decision("n11d1", "My name is Simon.", 0, 0);
    Decision n11d2 = new Decision("n11d2", "I'm pretty sure not providing personal info to strangers on the web is the first rule of the modern age.", 1, 0);
    Decision[] n11d = {n11d1, n11d2};
    Node n11 = new Node(11, "What do I call you, then?", n11d, 1, false);

    Decision n12d1 = new Decision("n12d1", "True. My name is [Simon].", 0, 0);
    Decision n12d2 = new Decision("n12d2", "Is \"Prosper\" an honest given name?", 1, 0);
    Decision[] n12d = {n12d1, n12d2};
    Node n12 = new Node(12,"You know me now, don't you?", n12d,1,false);

    Decision n13d1 = new Decision("n14d1", "My name is [Simon].", 0, 0);
    Decision[] n13d = {n13d1};
    Node n13 = new Node(13, "Yes. It's exceptionally ironic, but it's mine. And yours is...", n13d,1,false);

    Node n14 = new Node(14,"Pleased to meet you, Simon.", emptyDecisions,1,false);

    Decision n15d1 = new Decision("n13d1", "He",0,0);
    Decision n15d2 = new Decision("n13d2", "She",0,0);
    Decision n15d3 = new Decision("n13d3", "They",0,0);
    Decision[] n15d = {n15d1, n15d2, n15d3};
    Node n15 = new Node(15, "I don't want to assume anything. What are your pronouns?", n15d, 1, false);

    Decision n16d1 = new Decision("n16d1", "Wait, you lost me. Do you see this as text, too? I'm typing.", 0, 0);
    Decision n16d2 = new Decision("n16d2", "Not a fan of that nickname. Do you see this as text, too? I'm typing.", 0, 0);
    Decision[] n16d = {n16d1, n16d2};
    Node n16 = new Node(16, "You're connected to my chip somehow. It's a communicator in my head.", n16d, 1, false);






    n0.addChild(n1);
    n1.addChild(n2);
    n2.addChild(n3);
    n3.addChild(n4);
    n4.addChild(n5);
    n5.addChild(n6);
    n6.addChild(n7);
    n7.addChild(n8);

    n8.addChild(n9);
    n8.addChild(n10);

    n9.addChild(n11);
    n10.addChild(n11);

    n11.addChild(n14);
    n11.addChild(n12);

    n12.addChild(n14);
    n12.addChild(n13);

    n13.addChild(n14);

    n14.addChild(n15);

    n15.addChild(n16);

    return n0;
  }

}
