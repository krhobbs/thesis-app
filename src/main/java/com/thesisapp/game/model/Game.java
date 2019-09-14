package com.thesisapp.game.model;

public class Game {

  private Decision blankDecision = new Decision("", "", 0, -1);
  private Decision[] emptyDecisions = {blankDecision};

  public Decision[] getEmptyDecisions() {
    return emptyDecisions;
  }
  public void setEmptyDecisions(Decision[] emptyDecisions) {
    this.emptyDecisions = emptyDecisions;
  }
  public Decision getBlankDecision() {
    return blankDecision;
  }
  public void setBlankDecision(Decision blankDecision) {
    this.blankDecision = blankDecision;
  }

  Game() {}

  Node buildFullStoryTree() {
    //Act 1
    Node n0 = new Node(0, "pinging...\nacquired signal\nstatus...connected", emptyDecisions, 0, true);

    Decision n1d1 = new Decision("n1d1", "Who is this?", 0, 0);
    Decision n1d2 = new Decision("n1d1", "Whoa-- is this an actual person?", 0, 0);
    Decision[] n1d = {n1d1, n1d2};
    Node n1 = new Node(1, "Ah-- what the hell?", emptyDecisions, 1, false);
    Node n1_5 = new Node(1.5, "Stupid thing.", n1d, 1, false);

    Decision n2d1 = new Decision("n2d1", "I can read you. This is showing up on my computer. Who is this?", 0, 0);
    Decision n2d2 = new Decision("n2d2", "I can read you. This is showing up on my computer. Are you real?", 0, 0);
    Decision[] n2d = {n2d1, n2d2};
    Node n2 = new Node(2, "No way. Is this thing receiving? Can you hear me?", n2d, 1, false);

    Node n3 = new Node(3, "This is... I can't believe it.", emptyDecisions, 1, false);
    Node n3_5 = new Node(3.5, "I thought I was out of anyone's range, but if it accepted a signal from you...", emptyDecisions, 1, false);

    Decision n4d1 = new Decision("n4d1", "Maybe you could tell me who you are first? I shouldn't even have connectivity on this thing.", 0, 0);
    Decision n4d2 = new Decision("n4d2", "Total stranger talking through computer? I'm pretty sure my parents said something disapproving about this type of scenario.", 0, 0);
    Decision[] n4d = {n4d1, n4d2};
    Node n4 = new Node(4, "Okay. This is on your computer, you said? What computer?", n4d, 1, false);

    Node n5 = new Node(5, "Fair enough. Let's trade that info.", emptyDecisions, 1, false);
    Node n5_5 = new Node(5.5, " I'm Prosper.", emptyDecisions, 1, false);

    Decision n6d1 = new Decision("n6d1", "A dinosaur computer. It's a load of scrap I pulled together from old junk and thrift stores. Just messing around. I can't even hitch it up to the internet, so I have no idea how I'm receiving you.", 0, 0);
    Decision n6d2 = new Decision("n6d2", "A dinosaur computer. It's a project I put together from old junk and thrift stores. Just tinkering. I can't even hitch it up to the internet, so I have no idea how I'm receiving you.", 0, 0);
    Decision[] n6d = {n6d1, n6d2};
    Node n6 = new Node(6, "What are you seeing this on?", n6d, 1, false);

    Node n7 = new Node(7, "Yeah, I'd like to know that too.", emptyDecisions, 1, false);

    Decision n8d1 = new Decision("n8d1", "The States.", 0, 0);
    Decision n8d2 = new Decision("n8d2", "Earth.", 1, 1);
    Decision[] n8d = {n8d1, n8d2};
    Node n8 = new Node(8, "Well, you're speaking English. Where are you, regionally?", n8d, 1, false);

    Node n9 = new Node(9, "I'm out of the country, in Greenland. I suppose it's not so unbelievable that we're communicating somehow.", emptyDecisions, 1, false);

    Node n10 = new Node(10, "Wild. Me too. I'm pretty far north, in Greenland. I suppose it's not so unbelievable that we're communicating somehow. That's what the chip was made for, after all.", emptyDecisions, 1, false);

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
    Node n16 = new Node(16, "Got it. Good to know more than \"text tinning up my quiet space\"", n16d, 1, false);

    Node n17 = new Node(17, "You're connected to my chip somehow. It's a communicator in my head.", emptyDecisions, 1, false);

    Node n18 = new Node(18, "I don't hear or read you. It's sort of like... Another train of thought.", emptyDecisions, 1, false);

    Decision n19d1 = new Decision("n19d1", "Dead? What happened?", 0, 0);
    Decision n19d2 = new Decision("n19d2", "Okay. Wow. You have a chip in your head? How did that happen?", 1, 0);
    Decision[] n19d = {n19d1, n19d2};
    Node n19 = new Node(19, "You shouldn't be able to ping it. It's been dead for months.", n19d, 1, false);

    Decision n20d1 = new Decision("n20d1", "Yeah if you knew it was broken, why not fix it?", 0, 0);
    Decision n20d2 = new Decision("n20d2", "To you.", 1, 0);
    Decision[] n20d = {n20d1, n20d2};
    Node n20 = new Node(20, "To the chip?", n20d, 1, false);

    Node n21 = new Node(21, "Oh well... I got dinged up pretty badly. I'm fine now.", emptyDecisions, 0, false);

    Decision n22d1 = new Decision("n22d1", "What else can the chip do?", 0, 0);
    Decision n22d2 = new Decision("n22d2", "Right and why exactly do you have a chip in your head?", 1, 0);
    Decision[] n22d = {n22d1, n22d2};
    Node n22 = new Node(22, "The chip isn't meant to be doing anything now. That's why no one bothered repairing it. I guess now no one needs to.", n22d, 0, false);

    Node n23 = new Node(23, "Let's call that a need to know situation", emptyDecisions, 1, false);

    Node n24 = new Node(24, "Why were you tinkering with scrap?", emptyDecisions, 1, false); //FINAL NODE OF CHIP-INFO SCENE

    Decision n25d1 = new Decision("n25d1", "You don't say...", 0, 0);
    Decision n25d2 = new Decision("n25d2", "Uh, I bet it is. Okay was it: A) Seedy Corporation B) Aliens C) Cool futury tech", 1, 0);
    Decision[] n25d = {n25d1, n25d2};
    Node n25 = new Node(25, "It's a long story", n25d, 1, false);

    Decision n26d1 = new Decision("n26d1", "Okay, sorry to pry. Well what happened?", 0, 0);
    Decision n26d2 = new Decision("n26d2", "Okay, fine. I'm going to assume A, though.", 1, 0);
    Decision[] n26d = {n26d1, n26d2};
    Node n26 = new Node(26, "Look, you don't want the details, Simon. When I say \"long story,\" that implies brutal, uncomfortable, and dangerous to know.", n26d, 1, false);

    Decision n27d1 = new Decision("n27d1", "So, mystery guy. Can I ask what happened?", 0, 0);
    Decision[] n27d = {n27d1};
    Node n27 = new Node(27, "You do that.", n27d, 1, false);

    Decision n28d1 = new Decision("n28d1", "Okay well what happened?", 0, 0);
    Decision n28d2 = new Decision("n28d2", "Uh, I bet it is. Okay was it: A) Seedy Corporation B) Aliens C) Cool futury tech", 1, 0);
    Decision[] n28d = {n28d1, n28d2};
    Node n28 = new Node(28, "It's a long story", n28d, 1, false);

    Decision n29d1 = new Decision("n29d1", "Okay, sorry to pry. Well what happened?", 0, 0);
    Decision n29d2 = new Decision("n29d2", "Okay, fine. I'm going to assume A, though.", 1, 0);
    Decision[] n29d = {n29d1, n29d2};
    Node n29 = new Node(29, "Look, you don't want the details, Simon. When I say \"long story,\" that implies brutal, uncomfortable, and dangerous to know.", n29d, 1, false);

    Decision n30d1 = new Decision("n30d1", "So, mystery guy. Can I ask what happened?", 0, 0);
    Decision[] n30d = {n30d1};
    Node n30 = new Node(30, "You do that.", n30d, 1, false);





    n0.addChild(n1);
    n1.addChild(n1_5);
    n1_5.addChild(n2);
    n2.addChild(n3);
    n3.addChild(n3_5);
    n3_5.addChild(n4);
    n4.addChild(n5);
    n5.addChild(n5_5);
    n5_5.addChild(n6);
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

    n16.addChild(n17);

    n17.addChild(n18);

    n18.addChild(n19);

    n19.addChild(n20);
    n19.addChild(n28);

    n20.addChild(n22);
    n20.addChild(n21);

    n21.addChild(n22);

    n22.addChild(n23);
    n22.addChild(n25);

    n23.addChild(n24); //FINAL NODE OF CHIP-INFO SCENE

    n25.addChild(n26);

    n26.addChild(n23);
    n26.addChild(n27);

    n27.addChild(n23);

    n28.addChild(n20);
    n28.addChild(n29);

    n29.addChild(n20);
    n29.addChild(n30);

    n30.addChild(n20);


    return n0;
  }

}
