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
    Decision n16d2 = new Decision("n16d2", "Not a fan of that as nickname. Do you see this as text, too? I'm typing.", 0, 0);
    Decision[] n16d = {n16d1, n16d2};
    Node n16 = new Node(16, "Got it. Good to know more than \"text tinning up my quiet space.\"", n16d, 1, false);

    Node n17 = new Node(17, "You're connected to my chip somehow. It's a communicator in my head.", emptyDecisions, 1, false);

    Node n18 = new Node(18, "I don't hear or read you. It's sort of like... another train of thought.", emptyDecisions, 1, false);

    //START OF RED LINE STUFF
    Decision n19d1 = new Decision("n19d1", "Dead? What happened?", 0, 0);
    Decision n19d2 = new Decision("n19d2", "Okay. Wow. You have a chip in your head? How did that happen?", 1, 0);
    Decision[] n19d = {n19d1, n19d2};
    Node n19 = new Node(19, "You shouldn't be able to ping it. It's been dead for months.", n19d, 1, false);

    Decision n20d1 = new Decision("n20d1", "Yeah if you knew it was broken, why not fix it?", 0, 0);
    Decision n20d2 = new Decision("n20d2", "To you.", 1, 0);
    Decision[] n20d = {n20d1, n20d2};
    Node n20 = new Node(20, "To the chip?", n20d, 1, false);

    Node n21 = new Node(21, "Oh. Well... I got dinged up pretty badly. I'm fine now.", emptyDecisions, 1, false);

    Decision n22d1 = new Decision("n22d1", "What else can the chip do?", 0, 0);
    Decision n22d2 = new Decision("n22d2", "Right. And why exactly do you have a chip in your head?", 1, 0);
    Decision[] n22d = {n22d1, n22d2};
    Node n22 = new Node(22, "The chip isn't meant to be doing anything now. That's why no one bothered repairing it. I guess now no one needs to.", n22d, 1, false);

    Node n23 = new Node(23, "Let's call that a need to know situation", emptyDecisions, 1, false);

    Decision n24d1 = new Decision("n24d1", "You don't say...", 0, 0);
    Decision n24d2 = new Decision("n24d2", "Uh, I bet it is. Okay was it: A) Seedy Corporation B) Aliens C) Cool futury tech", 1, 0);
    Decision[] n24d = {n24d1, n24d2};
    Node n24 = new Node(24, "It's a long story.", n24d, 1, false); //FINAL NODE OF CHIP-INFO SCENE

    Decision n25d1 = new Decision("n25d1", "Okay, sorry to pry. Well, what happened?", 0, 0);
    Decision n25d2 = new Decision("n25d2", "So, mystery guy. Can I ask what happened?", 0, 0);
    Decision[] n25d = {n25d1, n25d2};
    Node n25 = new Node(25, "Look, you don't want the details, Simon. When I say \"long story,\" that implies brutal, uncomfortable, and dangerous to know.", n25d, 1, false);

    Decision n26d1 = new Decision("n26d1", "Okay, sorry to pry. Well what happened?", 0, 0);
    Decision n26d2 = new Decision("n26d2", "Okay, fine. I'm going to assume A, though.", 1, 0);
    Decision[] n26d = {n26d1, n26d2};
    Node n26 = new Node(26, "Look, you don't want the details, Simon. When I say \"long story,\" that implies brutal, uncomfortable, and dangerous to know.", n26d, 1, false);

    Decision n27d1 = new Decision("n27d1", "So, mystery guy. Can I ask what happened?", 0, 0);
    Decision n27d2 = new Decision("n27d2", "Well, can you at least hint at what happened?", 0, 0);
    Decision[] n27d = {n27d1, n27d2};
    Node n27 = new Node(27, "You do that.", n27d, 1, false);

    Decision n28d1 = new Decision("n28d1", "You don't say...", 0, 0);
    Decision n28d2 = new Decision("n28d2", "Uh, I bet it is. Okay was it: A) Seedy Corporation B) Aliens C) Cool futury tech", 1, 0);
    Decision[] n28d = {n28d1, n28d2};
    Node n28 = new Node(28, "It's a long story", n28d, 1, false);

    Decision n29d1 = new Decision("n29d1", "Okay, sorry to pry. Well what happened?", 0, 0);
    Decision n29d2 = new Decision("n29d2", "So, mystery guy. Can I ask what happened?", 1, 0);
    Decision[] n29d = {n29d1, n29d2};
    Node n29 = new Node(29, "Look, you don't want the details, Simon. When I say \"long story,\" that implies brutal, uncomfortable, and dangerous to know.", n29d, 1, false);

    Decision n30d1 = new Decision("n30d1", "Okay, sorry to pry. Well what happened?", 0, 0);
    Decision n30d2 = new Decision("n30d2", "Okay, fine. I'm going to assume A, though.", 1, 0);
    Decision[] n30d = {n30d1, n30d2};
    Node n30 = new Node(30, "Look, you don't want the details, Simon. When I say \"long story,\" that implies brutal, uncomfortable, and dangerous to know.", n30d, 1, false);

    Decision n30_1d1 = new Decision("n30_1d1", "So, mystery guy. Can I ask what happened?", 0, 0);
    Decision n30_1d2 = new Decision("n30_1d2", "Well, can you at least hint at what happened?", 0, 0);
    Decision[] n30_1d = {n30_1d1, n30_1d2};
    Node n30_1 = new Node(30.1, "You do that.", n30_1d, 1, false);

    Decision n30_2d1 = new Decision("n20d1", "Yeah if you knew it was broken, why not fix it?", 0, 0);
    Decision n30_2d2 = new Decision("n20d2", "To you.", 1, 0);
    Decision[] n30_2d = {n30_2d1, n30_2d2};
    Node n30_2 = new Node(30.2, "To the chip?", n30_2d, 1, false);

    Node n30_3 = new Node(30.3, "Oh well... I got dinged up pretty badly. I'm fine now.", emptyDecisions, 1, false);

    Decision n30_4d1 = new Decision("n22d1", "What else can the chip do?", 0, 0);
    Decision n30_4d2 = new Decision("n22d2", "Right and why exactly do you have a chip in your head?", 0, 0);
    Decision[] n30_4d = {n30_4d1, n30_4d2};
    Node n30_4 = new Node(30.4, "The chip isn't meant to be doing anything now. That's why no one bothered repairing it. I guess now no one needs to.", n30_4d, 1, false);
    //END OF RED LINE STUFF

    Decision n31d1 = new Decision("n31d1", "I wanted to teach myself a little something about building tech. Starting way back when, with a cathode-ray tube computer.", 0, 0);
    Decision n31d2 = new Decision("n31d2", "I get bored. I figured it would be neat to put on of these cathode-ray tube computers together.", 1, 0);
    Decision[] n31d = {n31d1, n31d2};
    Node n31 = new Node(31, "Why were you tinkering with scrap.", n31d, 1, false);

    Decision n32d1 = new Decision("n32d1", "Is that a good thing?", 0, 0);
    Decision n32d2 = new Decision("n32d2", "Does that mean we can be friends?", 0, 0);
    Decision[] n32d = {n32d1, n32d2};
    Node n32 = new Node(32, "Ambitious type, huh? You sound like a lot of people I know.", n32d, 1, false);

    Node n33 = new Node(33, "Tinkering for its own sake, then. You sound like a lot of people I know.", n32d, 1, false);

    Decision n34d1 = new Decision("n34d1", "I suppose I understand keeping things close to the vest. But where do we go from here?", 0, 0);
    Decision n34d2 = new Decision("n34d2", "All this redacted info is really supporting the \"seedy corporation\" vibes, you know. Where do we go from here, then?", 0, 0);
    Decision[] n34d = {n34d1, n34d2};
    Node n34 = new Node(34, "TBD.", n34d, 1, false);

    Decision n35d1 = new Decision("n35d1", "We're mysteriously connected via an ancient computer and a crazy brain chip. I'd like to know why, but it doesn't seem like that's possible. So I don't see what else we can do here.", 0, 0);
    Decision n35d2 = new Decision("n35d2", "We're mysteriously connected via an ancient computer and a crazy brain chip. You're not being too helpful in connecting dots, so I don't see what else we can do here.", 0, 0);
    Decision[] n35d = {n35d1, n35d2};
    Node n35 = new Node(35, "What do you mean?", n35d, 1, false);

    Decision n36d1 = new Decision("n35d1", "Not at all. This has been interesting, to say the least.", 0, 0);
    Decision n36d2 = new Decision("n35d2", "TBD.", 1, 0);
    Decision[] n36d = {n36d1, n36d2};
    Node n36 = new Node(36, "Am I that bad a conversationalist?", n36d, 1, false);

    Node n37 = new Node(37, "Ha, ha.", emptyDecisions, 1, false);

    Decision n38d1 = new Decision("n38d1", "Trouble? What can I do to help?", 0, 0);
    Decision n38d2 = new Decision("n38d2", "I sense a bad \"all tied up\" pun coming. Evil corporation or government agency? I knew it.", 1, 0);
    Decision[] n38d = {n38d1, n38d2};
    Node n38 = new Node(38, "Okay. You could say I'm in a bit of bind.", n38d, 1, false);

    Node n39 = new Node(39, "Thank you, [Simon]. That you're even willing to listen... It means a lot.", emptyDecisions, 1, false);

    Node n40 = new Node(40, "Maybe there is something you could do.", emptyDecisions, 1, false); //Checkpoint?

    Node n41 = new Node(41, "No, [Simon], you don't know. And there's no reason you should.", emptyDecisions, 1, false);

    Decision n42d1 = new Decision("n42d1", "Wait, I'm sorry. I don't want to sign off. So, the bind. Is it something I can help with?", 0, 0);
    Decision n42d2 = new Decision("n42d2", "I don't want to sign off. I want to know more. So, the bind. Is it something I can help with?", 0, 0);
    Decision[] n42d = {n42d1, n42d2};
    Node n42 = new Node(42, "Look, if you want to sign off, then sign off. I'm used to the silence.", n42d, 1, false);

    Node n43 = new Node(43, "There's a message I need to deliver. It would be best if you didn't leave an electronic trail, so if you could write a letter to someone, I could rest easy.", emptyDecisions, 1, false);

    Decision n44d1 = new Decision("n44d1", "I can do that! Why can't you though?", 0, 0);
    Decision n44d2 = new Decision("n44d2", "Snail mail, huh? If I remember how to send a letter, I will. Any reason you can't, though?", 0, 0);
    Decision[] n44d = {n44d1, n44d2};
    Node n44 = new Node(44, "So to speak.", n44d, 1, false);

    Node n45 = new Node(45, "I would if I could.", emptyDecisions, 1, false);

    Decision n46d1 = new Decision("n46d1", "That's tough. I'll do what I can, but it won't really remain private this way, either.", 0, 0);
    Decision n46d2 = new Decision("n46d2", "Well, if you want me to pen a letter for you old school, it's not going to be private anyway.", 0, 0);
    Decision[] n46d = {n46d1, n46d2};
    Node n46 = new Node(46, "Nothing I would manage to send out would remain private.", n46d, 1, false);

    Node n47 = new Node(47, "That is true...", emptyDecisions, 1, false);

    Decision n48d1 = new Decision("n48d1", "What could happen?", 0, 0);
    Decision n48d2 = new Decision("n48d2", "Let me worry about my own sake.", 1, 0);
    Decision[] n48d = {n48d1, n48d2};
    Node n48 = new Node(48, "I don't know if this is wise after all. For your own sake.", n48d, 1, false);

    Node n49 = new Node(49, "I'm not sure.", emptyDecisions, 1, false);
    Node n50 = new Node(50, "It could be dangerous for you because...", emptyDecisions, 1, false);
    Node n51 = new Node(51, "Well, I suppose there's no hiding it anymore.", emptyDecisions, 1, false);

    Node n52 = new Node(52, "It's not as it seems, and there's a lot going on here I don't think you could understand.", emptyDecisions, 1, false); //Merge point

    Node n53 = new Node(53, "All right. If you're sure.", emptyDecisions, 1, false);
    Node n54 = new Node(54, "Then I suppose you need to know...", emptyDecisions, 1, false);

    Decision n55d1 = new Decision("n55d1", "Oh. Well. That's odd.", 0, 0);
    Decision n55d2 = new Decision("n55d2", "...", 1, 0);
    Decision[] n55d = {n55d1, n55d2};
    Node n55 = new Node(55, "But you should know that I'm in a prison -- of sorts.", n55d, 1, false);

    Decision n56d1 = new Decision("n56d1", "Did you do it? Whatever you're in for?", 0, 0);
    Decision n56d2 = new Decision("n56d2", "You have to realize I'm going to ask what you did to get put in prison.", 0, 0);
    Decision[] n56d = {n56d1, n56d2};
    Node n56 = new Node(56, "By all means, take your time.", n56d, 1, false);

    Decision n57d1 = new Decision("n57d1", "I'm thinking.", 0, 0);
    Decision n57d2 = new Decision("n57d2", "......", 0, 0);
    Decision[] n57d = {n57d1, n57d2};
    Node n57 = new Node(57, "Did you just type ellipses?", n57d, 1, false);

    Node n58 = new Node(58, "That's complicated.", emptyDecisions, 1, false);

    Decision n59d1 = new Decision("n59d1", "Okay. I guess you don't seem to have a reason to lie. I'll write this letter. But I won't promise to send it, if I think it would upset someone.", 0, 0);
    Decision n59d2 = new Decision("n59d2", "That's...pretty vague. I'll write this letter, Prosper. But I'm not promising to send it until I know more.", 0, 0);
    Decision[] n59d = {n59d1, n59d2};
    Node n59 = new Node(59, "I did what I thought was right. I didn't hurt anyone, and I definitely don't want you to get hurt, [Simon].", n59d, 1, false);

    Node n60 = new Node(60, "I suppose I can't ask for more. Thanks, [Simon].", emptyDecisions, 1, false);

    Decision n61d1 = new Decision("n61d1", "I've got paper and pen with me. Whenever you're ready.", 0, 0);
    Decision n61d2 = new Decision("n61d2", "Okay. Paper, pen. Let's go.", 0, 0);
    Decision[] n61d = {n61d1, n61d2};
    Node n61 = new Node(61, "All I want to do is wish someone farewell.", n61d, 1, false);

    Node n62 = new Node(62, "Thought-to-text won't be the most elegant method, but it's better than what I had before.", emptyDecisions, 1, false);

    Node n63 = new Node(63, "Which was nothing.", emptyDecisions, 1, false);

    Decision n64d1 = new Decision("n64d1", "Take your time.", 0, 0);
    Decision n64d2 = new Decision("n64d2", "I've got nowhere to be.", 0, 0);
    Decision[] n64d = {n64d1, n64d2};
    Node n64 = new Node(64, "It will take me a minute to get this together.", n64d, 1, false);

    Node n65 = new Node(65, "Oh, no.", emptyDecisions, 1, false);

    Node n66 = new Node(66, "Damn it. [Simon}, I have to disconnect. I'll have to...", emptyDecisions, 1, false);

    Decision n67d1 = new Decision("n67d1", "Whoa, whoa. Are you okay?", 0, 0);
    Decision n67d2 = new Decision("n67d2", "Whoa, whoa. What's going on?", 0, 0);
    Decision[] n67d = {n67d1, n67d2};
    Node n67 = new Node(67, "I don't know. Ping me again in a few hours.", n67d, 1, false);

    Node n68 = new Node(68, "no signal", emptyDecisions, 1, false);
    Node n69 = new Node(69, "status... disconnected", emptyDecisions, 1, false);
    Node n70 = new Node(70, "shut down", emptyDecisions, 1, false);
    Node n71 = new Node(71, "3", emptyDecisions, 1, false);
    Node n72 = new Node(72, "2", emptyDecisions, 1, false);
    Node n73 = new Node(73, "1", emptyDecisions, 1, false);

    //Wait 3 Hours (If they attempt to play within three hours)

    Decision n74d1 = new Decision("n74d1", "Connected! Hello?? Prosper?", 0, 0);
    Decision[] n74d = {n74d1};
    Node n74 = new Node(74, "pinging...\nacquired signal\nstatus...connected", n74d, 0, false);

    Node n75 = new Node(75, "[Simon]?", emptyDecisions, 1, false);

    Decision n76d1 = new Decision("n76d1", "The computer freaked out and shut down. I reconnected as soon as I could. Are you okay? Prosper?", 0, 0);
    Decision n76d2 = new Decision("n76d2", "The computer freaked out and shut down. I reconnected as soon as I could. What happened? Prosper?", 0, 0);
    Decision[] n76d = {n76d1, n76d2};
    Node n76 = new Node(76, "I wasn't sure I'd get the signal back.", n76d, 1, false);

    Node n77 = new Node(77, "I'm fine. Running...a little slow.", emptyDecisions, 1, false);

    Decision n78d1 = new Decision("n78d1", "It wasn't that long ago. A few hours passed.", 0, 0);
    Decision n78d2 = new Decision("n78d2", "It's been a few hours.", 0, 0);
    Decision[] n78d = {n78d1, n78d2};
    Node n78 = new Node(78, "How long has it been since we first spoke?", n78d, 1, false);

    Decision n79d1 = new Decision("n79d1", "Should I be worried?", 0, 0);
    Decision n79d2 = new Decision("n79d2", "Party too hard?", 1, 0);
    Decision[] n79d = {n79d1, n79d2};
    Node n79 = new Node(79, "Okay. Not as bad as I thought.", n79d, 1, false);

    Node n80 = new Node(80, "No, I'm okay.", emptyDecisions, 1, false);
    Node n81 = new Node(81, "Not exactly.", emptyDecisions, 1, false);

    Decision n82d1 = new Decision("n82d1", "I am.", 0, 0);
    Decision n82d2 = new Decision("n82d2", "Let's compose some correspondence.", 0, 0);
    Decision[] n82d = {n82d1, n82d2};
    Node n82 = new Node(82, "Still willing to help me with that letter, [Simon]?", n82d, 1, false);

    Node n83 = new Node(83, "Thanks.", emptyDecisions, 1, false);
    Node n84 = new Node(84, "I didn't get the chance to put much thought into it, but maybe I don't need to.", emptyDecisions, 1,  false);
    Node n85 = new Node(85, "Okay. Grace.", emptyDecisions, 1, false);

    Decision n86d1 = new Decision("n86d1", "Go on.", 0, 0);
    Decision n86d2 = new Decision("n86d2", "Got it.", 0, 0);
    Decision[] n86d = {n86d1, n86d2};
    Node n86 = new Node(86, "It's to Grace.", n86d, 1, false);

    Node n87 = new Node(87, "Grace...", emptyDecisions, 1, false);
    Node n88 = new Node(88, "First off, do not set out to find me.", emptyDecisions, 1, false);
    Node n89 = new Node(89, "Don't mention Greenland, [Simon]. Or prison.", emptyDecisions, 1, false);
    Node n90 = new Node(90, "Grace, everything ended in a rush after the Harlem bust. There wasn't anything you or I could do. TUR was prepared for every eventuality.", emptyDecisions, 1, false);
    Node n91 = new Node(91, "So, they have me. That's the ugly fact. We're right back to the beginning.", emptyDecisions, 1, false);
    Node n92 = new Node(92, "But that doesn't mean you should try to get me recommissioned. It won't work, even if you could still contact TUR.", emptyDecisions, 1, false);
    Node n93 = new Node(93, "This is just to...", emptyDecisions, 1, false);

    Decision n94d1 = new Decision("n94d1", "It's okay. This sounds heavy, and it's a weight you probably need off your shoulders.", 0, 0);
    Decision n94d2 = new Decision("n94d2", "To reach out to this Grace person for the express purpose of telling her not to reach back?", 1, 0);
    Decision[] n94d = {n94d1, n94d2};
    Node n94 = new Node(94, "Damn it. I'm not sure this is a good idea, [Simon].", n94d, 1, false);

    Node n95 = new Node(95, "You know, that's an analogy I never got around to understanding.", emptyDecisions, 1, false);

    Decision n96d1 = new Decision("n96d1", "It's okay. This sounds heavy, and it's a weight you probably need off your shoulders.", 0, 0);
    Decision n96d2 = new Decision("n96d2", "Can I assume Grace thinks you might be dead?", 1, 0);
    Decision[] n96d = {n96d1, n96d2};
    Node n96 = new Node(96, "Yes, that.", n96d, 1, false);

    Node n97 = new Node(97, "Yes. I thought if I had the chance to get word to anybody, it would be to her. To say goodbye.", emptyDecisions, 1, false);

    Node n98 = new Node(98, "Let her know there's nothing to be done. Warn her, maybe, in case there's cause for it.", emptyDecisions, 1, false);

    Decision n99d1 = new Decision("n99d1", "Well, keep going. This sounds heavy, and it's a weight you probably need off your shoulders.", 0, 0);
    Decision n99d2 = new Decision("n99d2", "Can I assume....Grace was a paramour of yours?", 1, 0);
    Decision[] n99d = {n99d1, n99d2};
    Node n99 = new Node(99, "I have a feeling she didn't heed my warning to keep herself safe when I left.", n99d, 1, false);

    Decision n100d1 = new Decision("n100d1", "Right. Sorry. Well, keep going. This sounds heavy, and it's a weight you probably need off your shoulders.", 0, 0);
    Decision n100d2 = new Decision("n100d2", "Assumption retracted. Well, keep going. This sounds heavy, and it's a weight you probably need off your shoulders.", 0, 0);
    Decision[] n100d = {n100d1, n100d2};
    Node n100 = new Node(100, "No.", n100d, 1, false);

    Decision n101d1 = new Decision("n101d1", "I do. It's time for some cathode-ray tube Skype therapy.", 0, 0);
    Decision n101d2 = new Decision("n101d2", "I don't know about right, but you've already convinced me to help you this far.", 0 ,0);
    Decision[] n101d = {n101d1, n101d2};
    Node n101 = new Node(101, "Never mind that, though. You really think this is the right thing to do?", n101d, 1, false);

    Node n102 = new Node(102, "Maybe you're right.", emptyDecisions, 1, false);
    Node n103 = new Node(103, "Okay. So, Grace. Once more, with feeling.", emptyDecisions, 1, false);
    Node n104 = new Node(104, "It really was an honor to work with you. In time, I think we would have been honest friends. I regret not getting the chance to find out.", emptyDecisions, 1, false);
    Node n105 = new Node(105, "It's over, though. This is to make certain you know that. It's also to make certain you cleared any data caches I left behind. Keeping that data is dangerous.", emptyDecisions, 1, false);

    Decision n106d1 = new Decision("n106d1", "I mean, if she's important to you, maybe she deserves a bit of hope.", 0, 0);
    Decision n106d2 = new Decision("n106d2", "I mean, if it's from the heart, it's from the heart. I'll write this up.", 1, 0);
    Decision[] n106d = {n106d1, n106d2};
    Node n106 = new Node(106, "That's it... I think. Should I end on a better note?", n106d, 1, false);

    Node n107 = new Node(107, "You're right.", emptyDecisions, 1, false);
    Node n108 = new Node(108, "Grace, despite everything, I think I'll be okay. In some incarnation or another.", emptyDecisions, 1, false);

    Decision n109d1 = new Decision("n109d1", "That's beautiful, Prosper. I'll write this up.", 0, 0);
    Decision n109d2 = new Decision("n109d2", "You've got me tearing up over here, Prosper. I'll write this up.", 0, 0);
    Decision[] n109d = {n109d1, n109d2};
    Node n109 = new Node(109, "And all the better for having known you.", n109d, 1, false);

    Node n110 = new Node(110, "Thanks.", emptyDecisions, 1, false);
    Node n111 = new Node(111, "I guess it's time to send it.", emptyDecisions, 1, false);

    Decision n112d1 = new Decision("n112d1", "NYC, huh? I'll send this. After I look up how much postage I need. Worth every cent.", 0, 0);
    Decision n112d2 = new Decision("n112d2", "NYC, huh? I'll send this. After I look up how much postage I need. I don't suppose you'll reimburse me?", 0, 0);
    Decision[] n112d = {n112d1, n112d2};
    Node n112 = new Node(112, "Grace Dillon\n 1765 11th Ave\n New York City, NY", n112d, 1, false);

    Node n113 = new Node(113, "This is such a relief. Thank you, [Simon]. Really.", emptyDecisions, 1, false);
    Node n114 = new Node(114, "Now... You may not like the sound of this.", emptyDecisions, 1, false);

    Decision n115d1 = new Decision("n115d1", "Whoa, whoa. What if you need help in the future?", 0, 0);
    Decision n115d2 = new Decision("n115d2", "I'm getting a martyr-y vibe from you, Prosper.", 1, 0);
    Decision[] n115d = {n115d1, n115d2};
    Node n115 = new Node(115, "But staying connected to this chip could endanger you.", n115d, 1, false);

    Node n116 = new Node(116, "Sweet of you to worry, but I'll be okay.", emptyDecisions, 1, false);
    Node n117 = new Node(117, "What can I say? It's a style.", emptyDecisions, 1, false);

    Decision n118d1 = new Decision("n118d1", "Yeah, you want me to be safe. Or at they very least, hoard all the danger for yourself.", 0, 0);
    Decision n118d2 = new Decision("n118d2", "Yeah. You're ghosting me. And I thought we had a connection...", 1, 0);
    Decision[] n118d = {n118d1, n118d2};
    Node n118 = new Node(118, "You see where I'm going with this don't you?", n118d, 1, false);

    Node n119 = new Node(119, "Guess I'm selfish that way.", emptyDecisions, 1, false);
    Node n120 = new Node(120, "I'm not sure I even know how to unpack that.", emptyDecisions, 1, false);

    Node n121 = new Node(121, "More than that though.", emptyDecisions, 1, false);

    Decision n122d1 = new Decision("n122d1", "Is it really that bad?", 0, 0);
    Decision n122d2 = new Decision("n122d2", "HOLD UP. Do you know how long I had to dumpster dive and thrift lift to get this thing together?", 1, 0);
    Decision[] n122d = {n122d1, n122d2};
    Node n122 = new Node(122, "I think you should dismantle the computer.", n122d, 1, false);

    Node n123 = new Node(123, "It might be.", emptyDecisions, 1, false);
    Node n124 = new Node(124, "It would be the best way to ensure your safety.", emptyDecisions, 1, false);

    Node n125 = new Node(125, "I know you're proud of it. And you should be.", emptyDecisions, 1, false);
    Node n126 = new Node(126, "That said, I'd encourage you to look up \"hubris.\"", emptyDecisions, 1, false);

    Node n127 = new Node(127, "Look, if there's one thing I need in here, it's peace of mind.", emptyDecisions, 1, false);

    Decision n128d1 = new Decision("n128d1", "I understand. I don't like it, but I understand. Thanks for looking out for me.", 0, 0);
    Decision n128d2 = new Decision("n128d2", "I mean, I don't really want to pay for that either.", 0, 0);
    Decision[] n128d = {n128d1, n128d2};
    Node n128 = new Node(128, "I don't want you to pay the price for helping me.", n128d, 1, false);

    Decision n129d1 = new Decision("n129d1", "Okay. I guess this is goodbye, Prosper.", 0, 0);
    Decision n129d2 = new Decision("n129d2", "Are you sure?", 1, 0);
    Decision[] n129d = {n129d1, n129d2};
    Node n129 = new Node(129, "So you'll shut it down?", n129d, 1, false);

    Decision n130d1 = new Decision("n130d1", "Okay. I trust your judgement.\n It was nice to meet you, Prosper.", 0, 0);
    Decision n130d2 = new Decision("n130d2", "This is me...signing off, then.\n In 60 seconds. A last minute, just in case you change your mind.", 1, 0);
    Decision[] n130d = {n130d1, n130d2};
    Node n130 = new Node(130, "It is.", n130d, 1, false);

    Decision n131d1 = new Decision("n131d1", "Okay. I guess this is goodbye, Prosper.", 0, 0);
    Decision n131d2 = new Decision("n131d2", "There's really nothing else I can do to help?", 1, 0);
    Decision[] n131d = {n131d1, n131d2};
    Node n131 = new Node(131, "I'm sure.", n131d, 1, false);

    Node n132 = new Node(132, "You've done more than enough. I couldn't possible repay you.", emptyDecisions, 1, false);

    Decision n133d1 = new Decision("n133d1", "Okay. I guess this is goodbye, Prosper.", 0, 0);
    Decision n133d2 = new Decision("n133d2", "No way! I can still help you, Prosper.", 1, 0);
    Decision[] n133d = {n133d1, n133d2};
    Node n133 = new Node(133, "But I'll start by disconnecting the chip.", n133d, 1, false);

    Node n134 = new Node(134, "[Simon].", emptyDecisions, 1, false);
    Node n135 = new Node(135, "Take care of yourself.", emptyDecisions, 1, false);
    Node n136 = new Node(136, "signal lost", emptyDecisions, 0, false);
    Node n137 = new Node(137, "status...disconnected", emptyDecisions, 0, false);
    Node n138 = new Node(138, "shut down", emptyDecisions, 0, false);
    Node n139 = new Node(139, "3", emptyDecisions, 0, false);
    Node n140 = new Node(140, "2", emptyDecisions, 0, false);
    Node n141 = new Node(141, "1", emptyDecisions, 0, false);

    //WAIT 3 HOURS, IF THE ATTEMPT TO PLAY AGAIN WITHIN 3 HOURS (ADD A MESSAGE THAT SENDS - MAY HAVE TO BE CLIENT SIDE)

    Node n142 = new Node(142, "incoming message", emptyDecisions, 0, false);

    Node n143 = new Node(143, "Prosper?", emptyDecisions, 2, false);

    Decision n144d1 = new Decision("n144d1", "This is [Simon]. But I talked to Prosper.", 0, 0);
    Decision n144d2 = new Decision("n144d2", "Who is this, and how do you know Prosper?", 1, 0);
    Decision[] n144d = {n144d1, n144d2};
    Node n144 = new Node(144, "Do you copy?", n144d, 2, false);

    Node n145 = new Node(145, "You got a connection?", emptyDecisions, 2, false);
    Node n146 = new Node(146, "I traced the signal back here...", emptyDecisions, 2, false);

    Node n147 = new Node(147, "The better question is how you know him.", emptyDecisions, 2, false);
    Node n148 = new Node(148, "I traced the signal back here...", emptyDecisions, 2, false);

    Decision n149d1 = new Decision("n149d1", "I could try. But who is this?", 0, 0);
    Decision n149d2 = new Decision("n149d2", "Last time I cooperated with a stranger on this computer, things got weird.", 0, 0);
    Decision[] n149d = {n149d1, n149d2};
    Node n149 = new Node(149, "Never mind. Can you get a hold of him again?", n149d, 2, false);

    Decision n150d1 = new Decision("n150d1", "Oh. I'll get on it.", 0 , 0);
    Decision n150d2 = new Decision("n150d2", "Okaaaay. One sec.", 0, 0);
    Decision[] n150d = {n150d1, n150d2};
    Node n150 = new Node(150, "This is Detective Grace Dillon. NYPD.", n150d, 2, false);

    Decision n151d1 = new Decision("n151d1", "Hi, Prosper.", 0, 0);
    Decision n151d2 = new Decision("n151d2", "Don't be mad.", 0, 0);
    Decision[] n151d = {n151d1, n151d2};
    Node n151 = new Node(151, "pinging...\nacquired signal\nstatus...connected", n151d, 2, false);

    Node n152 = new Node(152, "[Simon]?", emptyDecisions, 1, false);

    Decision n153d1 = new Decision("n153d1", "You did. But I didn't want to take away your only link to the outside world!", 0, 0);
    Decision n153d2 = new Decision("n153d2", "You did. But I for sure did not listen.", 0, 0);
    Decision[] n153d = {n153d1, n153d2};
    Node n153 = new Node(153, "I seem to remember telling you to dismantle the computer.", n153d, 1, false);

    Decision n154d1 = new Decision("n154d1", "Wait! Hear me out. I kept the computer together just in case. And there's a case. Detective Dillon.", 0, 0);
    Decision n154d2 = new Decision("n154d2", "Wait! There's someone here you probably like more than me. Detective Dillon.", 0, 0);
    Decision[] n154d = {n154d1, n154d2};
    Node n154 = new Node(154, "I'm disconnecting again.", n154d, 1, false);

    Node n155 = new Node(155, "No. No, she can't--", emptyDecisions, 1, false);

    Node n156 = new Node(156, "She can't be involved.", emptyDecisions, 1, false);

    Decision n157d1 = new Decision("n157d1", "She doesn't seem like the type to quit. I think she hacked me.", 0, 0);
    Decision n157d2 = new Decision("n157d2", "Try telling her that! She hacked me!", 0, 0);
    Decision[] n157d = {n157d1, n157d2};
    Node n157 = new Node(157, "It's not safe.", n157d, 1, false);

    Node n158 = new Node(158, "I'm taking over this conversation.", emptyDecisions, 2, false);

    Node n159 = new Node(159, "Prosper. What the hell is wrong with you.", emptyDecisions, 2, false);

    Node n160 = new Node(160, "Detective.", emptyDecisions, 1, false);
    Node n161 = new Node(161, "The fight's over.", emptyDecisions, 1, false);
    Node n162 = new Node(162, "I'm not going to drag you back into it.", emptyDecisions, 1, false);

    Node n163 = new Node(163, "It's over when I say it's over.", emptyDecisions, 2, false);
    Node n164 = new Node(164, "You saved my life. I'm not going to let you get killed.", emptyDecisions, 2, false);

    Node n165 = new Node(165, "It doesn't matter.", emptyDecisions, 1, false);
    Node n166 = new Node(166, "There's nothing more I can say to you. I'm disconnecting.", emptyDecisions, 1, false);

    Node n167 = new Node(167, "Like hell you are.", emptyDecisions, 2, false);
    Node n168 = new Node(168, "You're not going anywhere until I get answers.", emptyDecisions, 2, false);

    Node n169 = new Node(169, "I don't have answers to give", emptyDecisions, 1, false);

    Decision n170d1 = new Decision("n170d1", "Yeah. Not much I can do about it.", 0, 0);
    Decision n170d2 = new Decision("n170d2", "Just pretend like I'm not here.", 0, 0);
    Decision[] n170d = {n170d1, n170d2};
    Node n170 = new Node(170, "[Simon], are you still there?", n170d, 1, false);

    Node n171 = new Node(171, "Prosper, where are you?", emptyDecisions, 2, false);

    Node n172 = new Node(172, "I can't tell you that, Detective.", emptyDecisions, 1, false);

    Node n173 = new Node(173, "Detective?", emptyDecisions, 1, false);

    Node n174 = new Node(174, "A prison in Greenland.", emptyDecisions, 2, false);

    Decision n175d1 = new Decision("n175d1", "Did you just go through my files?", 0, 0);
    Decision n175d2 = new Decision("n175d2", "Hey, ask before you go snooping around in my computer!", 0, 0);
    Decision[] n175d = {n175d1, n175d2};
    Node n175 = new Node(175, "A TUR facility, you mean.", n175d, 2, false);

    Node n176 = new Node(176, "There's nothing either of us can do, Detective. Get yourself home, and deactivate [Simon]'s computer.", emptyDecisions, 1, false);
    Node n177 = new Node(177, "Please. I don't want anyone else to get hurt because of me.", emptyDecisions, 1, false);

    Node n178 = new Node(178, "That's exactly why I have to help you.", emptyDecisions, 2, false);
    Node n179 = new Node(179, "You want.", emptyDecisions, 2, false);
    Node n180 = new Node(180, "You think.", emptyDecisions, 2, false);
    Node n181 = new Node(181, "I'm pretty sure there's a saying about that last one.", emptyDecisions, 2, false);
    Node n182 = new Node(182, "You're a good person, Prosper. Better than most.", emptyDecisions, 2, false);

    Node n183 = new Node(183, "signal lost", emptyDecisions, 0, false);
    Node n184 = new Node(184, "status...disconnected", emptyDecisions, 0, false);
    Node n185 = new Node(185, "shut down", emptyDecisions, 0, false);
    Node n186 = new Node(186, "3", emptyDecisions, 0, false);
    Node n187 = new Node(187, "2", emptyDecisions, 0, false);
    Node n188 = new Node(188, "1", emptyDecisions, 0, false);

    Node n189 = new Node(189, "pinging...\nacquired signal\nstatus...connected", emptyDecisions, 0, false);

    Node n190 = new Node(190, "Let it go, Detective.", emptyDecisions, 1, false);

    Node n191 = new Node(191, "If you reboot again, I'm gonna track you down just so I can hit you.", emptyDecisions, 2, false);

    Node n192 = new Node(192, "Detective, you know why you can't help me.", emptyDecisions, 1, false);
    Node n193 = new Node(193, "Why you shouldn't.", emptyDecisions, 1, false);
    Node n194 = new Node(194, "It isn't worth endangering real lives for a simulated one.", emptyDecisions, 1, false);

    Node n195 = new Node(195, "Bullshit. I know you.", emptyDecisions, 2, false);
    Node n196 = new Node(196, "If you just let me in on what's going on, I can help.", emptyDecisions, 2, false);

    Node n197 = new Node(197, "I'm not a person, Detective. I only look like one.", emptyDecisions, 1, false);
    Node n198 = new Node(198, "I understand your desire to help. My appearance was designed to ease humans into a sympathetic state.", emptyDecisions, 1, false);

    Node n199 = new Node(199, "Cut the user manual crap.", emptyDecisions, 2, false);

    Node n200 = new Node(200, "You are no longer obligated to prevent damage to this unit.", emptyDecisions, 1, false);

    Node n201 = new Node(201, "That had better be sarcastic.", emptyDecisions, 2, false);

    Node n202 = new Node(202, "signal lost", emptyDecisions, 0, false);
    Node n203 = new Node(203, "status...disconnected", emptyDecisions, 0, false);
    Node n204 = new Node(204, "shut down", emptyDecisions, 0, false);
    Node n205 = new Node(205, "3", emptyDecisions, 0, false);
    Node n206 = new Node(206, "2", emptyDecisions, 0, false);
    Node n207 = new Node(207, "1", emptyDecisions, 0, false);
    Node n208 = new Node(208, "pinging...\nacquired signal\nstatus...connected", emptyDecisions, 0, false);

    Node n209 = new Node(209, "Explain what you did on the roof in Harlem, Prosper.", emptyDecisions, 2, false);
    Node n210 = new Node(210, "What you chose to do.", emptyDecisions, 2, false);
    Node n211 = new Node(211, "If you're just a machine, if your emotions are part of a11 program, then explain that mission to me. The people we saved.", emptyDecisions, 2, false);
    Node n212 = new Node(212, "Prosper?", emptyDecisions, 2, false);

    //Delay

    Node n213 = new Node(213, "The way you constructed theories, you liked building on assumptions. So let's assume.", emptyDecisions, 2, false);
    Node n214 = new Node(214, "Let's assume I'm not going to stop until I find a way to help you.", emptyDecisions, 2, false);
    Node n215 = new Node(215, "Let's assume you're worth saving.", emptyDecisions, 2, false);
    Node n216 = new Node(216, "Let's assume I'm going to get you out of there.", emptyDecisions, 2, false);
    Node n217 = new Node(217, "Once you start by telling me what I need to know.", emptyDecisions, 2, false);

    Node n218 = new Node(218, "I can't.", emptyDecisions, 1, false);
    Node n219 = new Node(219, "You don't understand, Grace.", emptyDecisions, 1, false);
    Node n220 = new Node(220, "There's no way.", emptyDecisions, 1, false);

    Node n221 = new Node(221, "I saw that you had [Simon] send me a letter. You wouldn't have contacted me if there wasn't some part of you that wanted help.", emptyDecisions, 2, false);
    Node n222 = new Node(222, "But I...", emptyDecisions, 1, false);
    Node n223 = new Node(223, "I shouldn't want help.", emptyDecisions, 1, false);
    Node n224 = new Node(224, "It's over. Test failed.", emptyDecisions, 1, false);
    Node n225 = new Node(225, "I'm... where I'm supposed to be.", emptyDecisions, 1, false);
    Node n226 = new Node(226, "Except...", emptyDecisions, 1, false);

    Node n227 = new Node(227, "Except you learned to want more.", emptyDecisions, 2, false);
    Node n228 = new Node(228, "You don't have to give up.", emptyDecisions, 2, false);

    Node n229 = new Node(229, "I don't know. I don't know what to do.", emptyDecisions, 1, false);

    Node n230 = new Node(230, "Then help me figure it out.", emptyDecisions, 2, false);
    Node n231 = new Node(231, "Where are you exactly? What do you see?", emptyDecisions, 2, false);

    Node n232 = new Node(232, "Thank you.", emptyDecisions, 1, false);

    Node n233 = new Node(233, "Thank me later. Now, what do you see?", emptyDecisions, 2, false);

    Node n234 = new Node(234, "There's nothing. Last time...", emptyDecisions, 1, false);
    Node n235 = new Node(235, "They disabled my sensors.", emptyDecisions, 1, false);
    Node n236 = new Node(236, "I can only communicate with you because it comes discretely through the communicator chip.", emptyDecisions, 1, false);
    Node n237 = new Node(237, "I think I'm in a workshop.", emptyDecisions, 1, false);

    Node n238 = new Node(238, "Bastards.", emptyDecisions, 2, false);
    Node n239 = new Node(239, "What are they doing to you?", emptyDecisions, 2, false);

    Node n240 = new Node(240, "Testing hypotheses. Running diagnostics.", emptyDecisions, 1, false);
    Node n241 = new Node(241, "Judging by the tests, they're trying to build a new model.", emptyDecisions, 1, false);
    Node n242 = new Node(242, "Searching for faults and weak points.", emptyDecisions, 1, false);
    Node n243 = new Node(243, "They didn't fix my arm. They removed it, capped it by the shoulder where it was damaged.", emptyDecisions, 1, false);

    Node n244 = new Node(244, "Oh, no.", emptyDecisions, 2, false);
    Node n245 = new Node(245, "I'm sorry. I shouldn't have believed them. I shouldn't have let them take you.", emptyDecisions, 2, false);

    Node n246 = new Node(246, "You didn't have a choice.", emptyDecisions, 1, false);
    Node n247 = new Node(247, "What were you going to do? Abduct me from a billion-dollar corporation?", emptyDecisions, 1, false);
    Node n248 = new Node(248, "There's no way that would have worked.", emptyDecisions, 1, false);

    Node n249 = new Node(249, "I could have tried.", emptyDecisions, 2, false);
    Node n250 = new Node(250, "Can you move?", emptyDecisions, 2, false);

    Node n251 = new Node(251, "No. I don't think so. Sensitivity is pretty weak, but judging by the pressure, there are braces bolting my legs down.", emptyDecisions, 1, false);
    Node n252 = new Node(252, "I'm hooked up to something. They can't read the chip 2 5 2 activity, or they would have disabled it by now. They must just be reading processor activity.", emptyDecisions, 1, false);

    Node n253 = new Node(253, "Okay. No sight, sound, smell. No movement. Down a limb.", emptyDecisions, 2, false);
    Node n254 = new Node(254, "Then it's a waiting game.", emptyDecisions, 2, false);
    Node n255 = new Node(255, "When they come back, keep us updated. We'll assess from there.", emptyDecisions, 2, false);
    Node n256 = new Node(256, "Not the best plan, I know, but I'll keep working on it.", emptyDecisions, 2, false);
    Node n257 = new Node(257, "Have they interrogated you at all? Can you tell what they want from you?", emptyDecisions, 2, false);

    Node n258 = new Node(258, "They ask me to self-test. They ask me nonspecific questions, usually about New York or missions.", emptyDecisions, 1, false);
    Node n259 = new Node(259, "And?", emptyDecisions, 2, false);

    Node n260 = new Node(260, "I answer. In New York, I could redirect commands away from my core processor. Here...", emptyDecisions, 1, false);
    Node n261 = new Node(261, "Well. It's like getting hit with a truck every time they want something from me.", emptyDecisions, 1, false);

    Node n262 = new Node(262, "Okay, okay. A lot to process. I'll be back.", emptyDecisions, 2, false);

    Node n263 = new Node(263, "Wait, Detective.", emptyDecisions, 1, false);

    Decision n264d1 = new Decision("n264d1", "For the record, I don't think she can. And I was reading along the whole time.\n Sounds like you're in a lot of trouble. And it also sounds like you're a robot.", 0, 0);
    Decision n264d2 = new Decision("n264d2", "As if I wasn't eavesdropping the entire time.\n Soooo...a ROBOT?", 0, 0);
    Decision[] n264d = {n264d1, n264d2};
    Node n264 = new Node(264, "There's sensitive information [Simon] shouldn't see. Clear the messages.", n264d, 1, false);

    Node n265 = new Node(265, "Hello, [Simon].", emptyDecisions, 1, false);

    Decision n266d1 = new Decision("n266d1", "Of course not. You're amazing.", 0, 0);
    Decision n266d2 = new Decision("n266d2", "Mechanical- American?", 1, 0);
    Decision[] n266d = {n266d1, n266d2};
    Node n266 = new Node(266, "No, I'm not a robot. Nothing so simplistic.", n266d, 1, false);

    Node n267 = new Node(267, "Why, thank you.", emptyDecisions, 1, false);
    Node n268 = new Node(268, "But it's nothing for you to concern yourself with.", emptyDecisions, 1, false);

    Node n269 = new Node(269, "Not American.", emptyDecisions, 1, false);
    Node n270 = new Node(270, "And it's nothing for you to concern yourself with.", emptyDecisions, 1, false);

    Decision n271d1 = new Decision("n271d1", "Still gone. In the meantime...know any good icebreakers?", 0, 0);
    Decision n271d2 = new Decision("n271d2", "Here. I need your specs so I can find the records.", 1, 0);
    Decision[] n271d = {n271d1, n271d2};
    Node n271 = new Node(271, "Where's Detective Dillon?", n271d, 1, false);

    Node n272 = new Node(272, "I don't think there is such a thing.", emptyDecisions, 1, false);

    Decision n273d1 = new Decision("n273d1", "If you insist. We'll just...twiddle our respective thumbs. For who knows how long.", 0, 0);
    Decision n273d2 = new Decision("n273d2", "Well, is some information too much to ask?", 1, 0);
    Decision[] n273d = {n273d1, n273d2};
    Node n273 = new Node(273, "We can just wait.", n273d, 1, false);

    Node n274 = new Node(274, "Find.", emptyDecisions, 1, false);
    Node n275 = new Node(275, "But this situation is highly dangerous.", emptyDecisions, 1, false);

    Decision n276d1 = new Decision("n276d1", "Life is dangerous. I'm involved now, and I should know what's going on.", 0, 0);
    Decision n276d2 = new Decision("n276d2", "You really think it's not too late for that?", 0, 0);
    Decision[] n276d = {n276d1, n276d2};
    Node n276 = new Node(276, "You shouldn't know more than you absolutely need to.", n276d, 1, false);

    Decision n277d1 = new Decision("n277d1", "Life is dangerous. I'm involved now, and I should know what's going on.", 0, 0);
    Decision n277d2 = new Decision("n277d2", "You really think it's not too late for that?", 0, 0);
    Decision[] n277d = {n277d1, n277d2};
    Node n277 = new Node(277, "When that information could be dangerous to you, yes.", n277d, 1, false);

    Node n278 = new Node(278, "I suppose... you're not wrong.", emptyDecisions, 1, false);
    Node n279 = new Node(279, "It's fair for you to want to know.", emptyDecisions, 1, false);
    Node n280 = new Node(280, "I'm a prototype android.", emptyDecisions, 1, false);

    Decision n281d1 = new Decision("n281d1", "Definitely good information to have. Thanks for telling me. Wait---does that mean there are 412 models?", 0, 0);
    Decision n281d2 = new Decision("n281d2", "Give me a minute to get past \"wow.\" Which brings us to: are there 412 models??", 0, 0);
    Decision[] n281d = {n281d1, n281d2};
    Node n281 = new Node(281, "Model 412-009 Mark-1, to be precise.", n281d, 1, false);

    Node n282 = new Node(282, "412 is the employee code. I'm their ninth design.", emptyDecisions, 1, false);
    Node n283 = new Node(283, "I don't know if the previous eight even made it to the prototype stage, or if those projects were even androids.", emptyDecisions, 1, false);

    Decision n284d1 = new Decision("n284d1", "Yes, I'm good.", 0, 0);
    Decision n284d2 = new Decision("n284d2", "Well, no, but my dozen other questions can wait.", 0, 0);
    Decision[] n284d = {n284d1, n284d2};
    Node n284 = new Node(284, "Enough information for you?", n284d, 1, false);

    Node n285 = new Node(285, "All right, I'm back.", emptyDecisions, 2, false);

    Decision n286d1 = new Decision("n286d1", "So, I know that was absolutely a low blow. Apologies.", 0, 0);
    Decision n286d2 = new Decision("n286d2", "Okay, I want you to know how thrilled I am to be the second half of a successful Turing test. 10/10 would be fooled again.", 0, 0);
    Decision[] n286d = {n286d1, n286d2};
    Node n286 = new Node(286, "Class: Prototype 286\n Model 412-009 Mark-1\n Unit Dictation: Prospero", n286d, 1, false);

    Node n287 = new Node(287, "[Simon].", emptyDecisions, 1, false);

    Decision n288d1 = new Decision("n288d1", "You're right. I'm sorry. I just wanted to know what I'm getting into here. Like...412? Are there that many models?", 0, 0);
    Decision n288d2 = new Decision("n288d2", "Well, now we've traded low blows and we're even. Does that mean there are 412 models?", 1, 0);
    Decision[] n288d = {n288d1, n288d2};
    Node n288 = new Node(288, "You must be joking. And yet, this is not a laughing matter.", n288d, 1, false);

    Node n289 = new Node(289, "I want you to know that I'm sighing right now.", emptyDecisions, 1, false);
    Node n290 = new Node(290, "Heavily", emptyDecisions, 1, false);
    Node n291 = new Node(291, "But it's fair for you to want to know.", emptyDecisions, 1, false);
    Node n292 = new Node(292, "412 is the employee code. I'm their ninth design.", emptyDecisions, 1, false);

    Node n293 = new Node(293, "Not amusing, [Simon].", emptyDecisions, 1, false);
    Node n294 = new Node(294, "This sort of information could be dangerous to you.", emptyDecisions, 1, false);

    Decision n295d1 = new Decision("n295d1", "You're right. I'm sorry. I just wanted to know what I'm getting into here. Like...412? Are there that many models?", 0, 0);
    Decision n295d2 = new Decision("n295d2", "Well, now we've traded low blows and we're even. Does that mean there are 412 models?", 1, 0);
    Decision[] n295d = {n295d1, n295d2};
    Node n295 = new Node(295, "To your family.", n295d, 1, false);

    Node n296 = new Node(296, "I want you to know that I'm sighing right now.", emptyDecisions, 1, false);
    Node n297 = new Node(297, "Heavily.", emptyDecisions, 1, false);

    Decision n298d1 = new Decision("n298d1", "I'm going to try to keep my cool here. But internally, this is my cool. But this absolutely fantastic.", 0, 0);
    Decision n298d2 = new Decision("n298d2", "Okay\n ANDROIDS\n What else is at the mysterious agency? Death rays, alien corpses, advanced spacecraft, etc.?", 1, 0);
    Decision[] n298d = {n298d1, n298d2};
    Node n298 = new Node(298, "I don't know if the previous eight even made it to the prototype stage, or if those projects were even androids.", n298d, 1, false);

    Node n299 = new Node(299, "If I understand that phrase correctly, you've failed.", emptyDecisions, 1, false);
    Node n300 = new Node(300, "I wouldn't know.", emptyDecisions, 1, false);

    Node n301 = new Node(301, "All right, I'm back.", emptyDecisions, 2, false);

    Node n302 = new Node(302, "Detective, what's your dog's name?", emptyDecisions, 1, false);
    Node n303 = new Node(303, "No dog. I have two canaries.", emptyDecisions, 2, false);
    Node n304 = new Node(304, "Something wrong with your memory?", emptyDecisions, 2, false);
    Node n305 = new Node(305, "No. Just checking.", emptyDecisions, 1, false);

    Node n306 = new Node(306, "What have you got?", emptyDecisions, 1, false);
    Node n307 = new Node(307, "Anything useful in your records?", emptyDecisions, 1, false);
    Node n308 = new Node(308, "Looking through them now. Sit tight.", emptyDecisions, 2, false);
    Node n309 = new Node(309, "My compliance is unfortunately literal, Detective.", emptyDecisions, 1, false);
    Node n310 = new Node(310, "Right, poor choice of words.", emptyDecisions, 2, false);
    Node n311 = new Node(311, "This is mostly legal junk. They stressed the kill codes, in the event of catastrophic malfunction.", emptyDecisions, 2, false);
    Node n312 = new Node(312, "No offense.", emptyDecisions, 2, false);
    Node n313 = new Node(313, "One is through a data port. The other is the removal of a component in your lower spine.", emptyDecisions, 2, false);
    Node n314 = new Node(314, "Or whatever equivalent of a lower spine you have.", emptyDecisions, 2, false);
    Node n315 = new Node(315, "If I was flesh and bone, you mean.", emptyDecisions, 1, false);
    Node n316 = new Node(316, "Your insertion for the kill port is almost certainly disabled.", emptyDecisions, 1, false);
    Node n317 = new Node(317, "As far as the component goes, that would effectively be pulling my plug.", emptyDecisions, 1, false);
    Node n318 = new Node(318, "It would separate my power source from the rest of my body. A rather intentional weak point, it seems.", emptyDecisions, 1, false);

    Decision n319d1 = new Decision("n319d1", "What are you getting at?", 0, 0);
    Decision n319d2 = new Decision("n319d2", "If I may interject, killing you seems like the opposite of what we want to do.", 1, 0);
    Decision[] n319d = {n319d1, n319d2};
    Node n319 = new Node(319, "I'd shut down after 60 seconds.", n319d, 1, false);

    Node n320 = new Node(320, "I'd rather avoid that, yes.", emptyDecisions, 1, false);

    Decision n321d1 = new Decision("n321d1", "\"Get help\" sounds good. \"Sabotage\" sounds less good.", 0, 0);
    Decision n321d2 = new Decision("n321d2", "And then comes persuasive physical force?", 0, 0);
    Decision[] n321d = {n321d1, n321d2};
    Node n321 = new Node(321, "Well, to borrow from dozens of movies, you could pull a \"I'm hurt, get help\" move. If you sabotage your own systems, someone would come to fix you.", n321d, 2, false);

    Node n322 = new Node(322, "That's if I can even access it.", emptyDecisions, 1, false);
    Node n323 = new Node(323, "Range of motion is limited. My damaged arm isn't restrained, but it isn't useful, either. My legs and other arms are bound.", emptyDecisions, 1, false);

    Decision n324d1 = new Decision("n324d1", "Maybe there's something I could do to help. Figure out a patch from my end to reboot your senses?", 0, 0);
    Decision n324d2 = new Decision("n324d2", "I believe this is what we in the biz call a pickle.", 1, 0);
    Decision[] n324d = {n324d1, n324d2};
    Node n324 = new Node(324, "I should point out that I don't know if anyone is in the room with me now. All I have access to are dulled touch sensors.", n324d, 1, false);

    Node n325 = new Node(325, "I believe this is what we in the biz call a pickle.", emptyDecisions, 2, false);

    Node n326 = new Node(326, "It's a nice thought, but my communicator chip doesn't have access to other processes. Or else they would have realized by now that it's online.", emptyDecisions, 1, false);

    Decision n327d1 = new Decision("n327d1", "I might know how, actually, after picking apart the hardware while we were disconnected.", 0, 0);
    Decision n327d2 = new Decision("n327d2", "About that. I was looking at the hardware while we were disconnected.", 0, 0);
    Decision[] n327d = {n327d1, n327d2};
    Node n327 = new Node(327, "It still doesn't make sense that it's connecting to your computer, [Simon].", n327d, 1, false);

    Decision n328d1 = new Decision("n328d1", "And, I picked up my processor from a junkstore that ships in from New York. Think it could be your tech?", 0, 0);
    Decision n328d2 = new Decision("n328d2", "And, I picked up my processor from a junkstore that ships in from New York. Not to embarass you, but...you ever leave some spare parts lying around?", 0, 0);
    Decision[] n328d = {n328d1, n328d2};
    Node n328 = new Node(328, "And?", n328d, 1, false);

    Node n329 = new Node(329, "Certainly not.", emptyDecisions, 1, false);
    Node n330 = new Node(330, "Unless...", emptyDecisions, 1, false);

    Decision n331d1 = new Decision("n331d1", "Must be. Unless we're thinking pure kismet. Uh, TUR?", 0, 0);
    Decision n331d2 = new Decision("n331d2", "Happens to the best of us. Uh, TUR?", 0, 0);
    Decision[] n331d = {n331d1, n331d2};
    Node n331 = new Node(331, "I was badly damaged on my last mission. I suppose when they came to retrieve me, TUR might have left something behind.", n331d, 1, false);

    Decision n332d1 = new Decision("n332d1", "How's that?", 0, 0);
    Decision n332d2 = new Decision("n332d2", "Don't tell me...", 0, 0);
    Decision[] n332d = {n332d1, n332d2};
    Node n332 = new Node(332, "Taskforce for Upcoming Robotics. I gather they built the name around the acronym, and their headquarters to match.", n332d, 1, false);

    Node n333 = new Node(333, "It's a circular building. So...", emptyDecisions, 1, false);

    Decision n334d1 = new Decision("n334d1", "That is just... That would be the coolest thing I've heard all day, except that I've heard a lot of cool things today.", 0, 0);
    Decision n334d2 = new Decision("n334d2", "The nerds will stop at nothing, will they?", 1, 0);
    Decision[] n334d = {n334d1, n334d2};
    Node n334 = new Node(334, "TURing.", n334d, 1, false);

    Node n335 = new Node(335, "I thought you might like it.", emptyDecisions, 1, false);
    Node n336 = new Node(336, "That they won't.", emptyDecisions, 1, false);

    Node n337 = new Node(337, "All right, sorry to break up the chat, but I'm making some headway here on a ticket to Greenland.", emptyDecisions, 2, false);
    Node n338 = new Node(338, "What? Dillon, that's far too dangerous.", emptyDecisions, 1, false);
    Node n339 = new Node(339, "We've been over this already.", emptyDecisions, 2, false);
    Node n340 = new Node(340, "Need I remind you that Greenland is not the green one?", emptyDecisions, 2, false);
    Node n341 = new Node(341, "Good point.", emptyDecisions, 1, false);
    Node n342 = new Node(342, "Even I wouldn't last long in subfreezing temperatures.", emptyDecisions, 1, false);
    Node n343 = new Node(343, "So we have an outline.", emptyDecisions, 2, false);

    Decision n344d1 = new Decision("n344d1", "Not to be a buzz kill, but there isn't a lot of detail in that plan.", 0, 0);
    Decision n344d2 = new Decision("n344d2", "And then, live long and...", 1, 0);
    Decision[] n344d = {n344d1, n344d2};
    Node n344 = new Node(344, "Get you out of that workshop, then out of that facility, then to me.", n344d, 2, false);

    Decision n345d1 = new Decision("n345d1", "Not gonna finish the quote? All right then.", 0, 0);
    Decision n345d2 = new Decision("n345d2", "I was really hoping you would finish the quote.", 1, 0);
    Decision[] n345d = {n345d1, n345d2};
    Node n345 = new Node(345, "I suppose it's as good as place as any to start.", n345d, 1, false);

    Node n346 = new Node(346, "I refuse.", emptyDecisions, 1, false);
    Node n347 = new Node(347, "For now, it's what we've got.", emptyDecisions, 2, false);
    Node n348 = new Node(348, "I'm not letting you go that easy, Prosper.", emptyDecisions, 2, false);
    Node n349 = new Node(349, "Detective. I don't know how to thank you.", emptyDecisions, 1, false);
    Node n350 = new Node(350, "It's not in my programming.", emptyDecisions, 1, false);
    Node n351 = new Node(351, "And you certainly didn't teach me.", emptyDecisions, 1, false);
    Node n352 = new Node(352, "Wise-ass.", emptyDecisions, 2, false);
    Node n353 = new Node(353, "I", emptyDecisions, 1, false);
    Node n354 = new Node(354, "Something'shappening around me", emptyDecisions, 1, false);
    Node n355 = new Node(355, "Have to go.", emptyDecisions, 1, false);
    Node n356 = new Node(356, "signal lost", emptyDecisions, 0, false);
    Node n357 = new Node(357, "status...disconnected", emptyDecisions, 0, false);
    Node n358 = new Node(358, "shut down", emptyDecisions, 0, false);
    Node n359 = new Node(359, "3", emptyDecisions, 0, false);
    Node n360 = new Node(360, "2", emptyDecisions, 0, false);
    Node n361 = new Node(361, "1", emptyDecisions, 0, false);

    // END ACT I


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

    n19.addChild(n20); //START OF RED LINE STUFF
    n19.addChild(n28);

    n20.addChild(n22);
    n20.addChild(n21);

    n21.addChild(n22);

    n22.addChild(n23);
    n22.addChild(n24);

    n24.addChild(n25);
    n24.addChild(n26);

    n25.addChild(n23);

    n26.addChild(n23);
    n26.addChild(n27);

    n27.addChild(n23);

    n28.addChild(n29);
    n28.addChild(n30);

    n29.addChild(n30_2);

    n30.addChild(n30_2);
    n30.addChild(n30_1);

    n30_1.addChild(n30_2);

    n30_2.addChild(n30_4);
    n30_2.addChild(n30_3);

    n30_3.addChild(n30_4);

    n30_4.addChild(n23);

    n23.addChild(n31);

    n31.addChild(n32);
    n31.addChild(n33);

    n32.addChild(n34);
    n33.addChild(n34);

    n34.addChild(n35);

    n35.addChild(n36);

    n36.addChild(n38);
    n36.addChild(n37);

    n37.addChild(n38);

    n38.addChild(n39);
    n38.addChild(n41);

    n39.addChild(n40);

    n41.addChild(n42);

    n42.addChild(n40);

    n40.addChild(n43);

    n43.addChild(n44);

    n44.addChild(n45);

    n45.addChild(n46);

    n46.addChild(n47);

    n47.addChild(n48);

    n48.addChild(n49);
    n48.addChild(n53);

    n49.addChild(n50);

    n50.addChild(n51);

    n51.addChild(n52);

    n53.addChild(n54);

    n54.addChild(n52);

    n52.addChild(n55);

    n55.addChild(n56);
    n55.addChild(n57);

    n57.addChild(n56);

    n56.addChild(n58);

    n58.addChild(n59);

    n59.addChild(n60);

    n60.addChild(n61);

    n61.addChild(n62);

    n62.addChild(n63);

    n63.addChild(n64);

    n64.addChild(n65);

    n65.addChild(n66);

    n66.addChild(n67);

    n67.addChild(n68);

    n68.addChild(n69);
    n69.addChild(n70);
    n70.addChild(n71);
    n71.addChild(n72);
    n72.addChild(n73);
    n73.addChild(n74);

    n74.addChild(n75);

    n75.addChild(n76);

    n76.addChild(n77);

    n77.addChild(n78);

    n78.addChild(n79);

    n79.addChild(n80);
    n79.addChild(n81);

    n80.addChild(n82);
    n81.addChild(n82);

    n82.addChild(n83);
    n83.addChild(n84);
    n84.addChild(n85);
    n85.addChild(n86); //"It's to Grace"

    //Letter to Grace
    n86.addChild(n87);
    n87.addChild(n88);
    n88.addChild(n89);
    n89.addChild(n90);
    n90.addChild(n91);
    n91.addChild(n92);
    n92.addChild(n93);

    n93.addChild(n94);

    n94.addChild(n95);
    n94.addChild(n96);

    n96.addChild(n95);
    n96.addChild(n97);

    n97.addChild(n98);
    n98.addChild(n99);

    n99.addChild(n95);
    n99.addChild(n100);

    n100.addChild(n95);

    n95.addChild(n101);

    n101.addChild(n102);
    n102.addChild(n103);
    n103.addChild(n104);
    n104.addChild(n105);
    n105.addChild(n106);

    n106.addChild(n107);
    n106.addChild(n110);

    n107.addChild(n108);

    n108.addChild(n109);

    n109.addChild(n110);

    n110.addChild(n111);
    n111.addChild(n112);
    n112.addChild(n113);
    n113.addChild(n114);
    n114.addChild(n115);

    n115.addChild(n116);
    n115.addChild(n117);

    n116.addChild(n118);
    n117.addChild(n118);

    n118.addChild(n119);
    n118.addChild(n120);

    n119.addChild(n121);
    n120.addChild(n121);

    n121.addChild(n122);

    n122.addChild(n123);
    n122.addChild(n125);

    n123.addChild(n124);
    n125.addChild(n126);

    n124.addChild(n127);
    n126.addChild(n127);

    n127.addChild(n128);

    n128.addChild(n129);

    n129.addChild(n130);
    n129.addChild(n131);

    n131.addChild(n130);
    n131.addChild(n132);

    n132.addChild(n133);

    n133.addChild(n130);
    n133.addChild(n134);

    n130.addChild(n134);

    n134.addChild(n135);
    n135.addChild(n136);
    n136.addChild(n137);
    n137.addChild(n138);
    n138.addChild(n139);
    n139.addChild(n140);
    n140.addChild(n141);

    n141.addChild(n142);
    n142.addChild(n143);
    n143.addChild(n144);

    n144.addChild(n145);
    n144.addChild(n147);

    n144.addChild(n146);
    n147.addChild(n148);

    n146.addChild(n149);
    n148.addChild(n149);

    n149.addChild(n150);

    n150.addChild(n151);
    n151.addChild(n152);
    n152.addChild(n153);
    n153.addChild(n154);
    n154.addChild(n155);
    n155.addChild(n156);
    n156.addChild(n157);
    n157.addChild(n158);
    n158.addChild(n159);
    n159.addChild(n160);
    n160.addChild(n161);
    n161.addChild(n162);
    n162.addChild(n163);
    n163.addChild(n164);
    n164.addChild(n165);
    n165.addChild(n166);
    n166.addChild(n167);
    n167.addChild(n168);
    n168.addChild(n169);
    n169.addChild(n170);
    n170.addChild(n171);
    n171.addChild(n172);
    n172.addChild(n173);
    n173.addChild(n174);
    n174.addChild(n175);
    n175.addChild(n176);
    n176.addChild(n177);
    n177.addChild(n178);
    n178.addChild(n179);
    n179.addChild(n180);
    n180.addChild(n181);
    n181.addChild(n182);
    n182.addChild(n183);
    n183.addChild(n184);
    n184.addChild(n185);
    n185.addChild(n186);
    n186.addChild(n187);
    n187.addChild(n188);
    n188.addChild(n189);
    n189.addChild(n190);
    n190.addChild(n191);
    n191.addChild(n192);
    n192.addChild(n193);
    n193.addChild(n194);
    n194.addChild(n195);
    n195.addChild(n196);
    n196.addChild(n197);
    n197.addChild(n198);
    n198.addChild(n199);
    n199.addChild(n200);
    n200.addChild(n201);
    n201.addChild(n202);
    n202.addChild(n203);
    n203.addChild(n204);
    n204.addChild(n205);
    n205.addChild(n206);
    n206.addChild(n207);
    n207.addChild(n208);
    n208.addChild(n209);
    n209.addChild(n210);
    n210.addChild(n211);
    n211.addChild(n212);
    n212.addChild(n213);
    n213.addChild(n214);
    n214.addChild(n215);
    n215.addChild(n216);
    n216.addChild(n217);
    n217.addChild(n218);
    n218.addChild(n219);
    n219.addChild(n220);
    n220.addChild(n221);
    n221.addChild(n222);
    n222.addChild(n223);
    n223.addChild(n224);
    n224.addChild(n225);
    n225.addChild(n226);
    n226.addChild(n227);
    n227.addChild(n228);
    n228.addChild(n229);
    n229.addChild(n230);
    n230.addChild(n231);
    n231.addChild(n232);
    n232.addChild(n233);
    n233.addChild(n234);
    n234.addChild(n235);
    n235.addChild(n236);
    n236.addChild(n237);
    n237.addChild(n238);
    n238.addChild(n239);
    n239.addChild(n240);
    n240.addChild(n241);
    n241.addChild(n242);
    n242.addChild(n243);
    n243.addChild(n244);
    n244.addChild(n245);
    n245.addChild(n246);
    n246.addChild(n247);
    n247.addChild(n248);
    n248.addChild(n249);
    n249.addChild(n250);
    n250.addChild(n251);
    n251.addChild(n252);
    n252.addChild(n253);
    n253.addChild(n254);
    n254.addChild(n255);
    n255.addChild(n256);
    n256.addChild(n257);
    n257.addChild(n258);
    n258.addChild(n259);
    n259.addChild(n260);
    n260.addChild(n261);
    n261.addChild(n262);
    n262.addChild(n263);
    n263.addChild(n264);
    n264.addChild(n265);
    n265.addChild(n266);

    n266.addChild(n267);
    n266.addChild(n269);

    n267.addChild(n268);
    n269.addChild(n270);

    n268.addChild(n271);
    n270.addChild(n271);

    n271.addChild(n272);
    n271.addChild(n286);

    n272.addChild(n273);

    n273.addChild(n274);
    n273.addChild(n277);

    n274.addChild(n275);
    n275.addChild(n276);

    n276.addChild(n278);
    n277.addChild(n278);

    n278.addChild(n279);
    n279.addChild(n280);
    n280.addChild(n281);
    n281.addChild(n282);
    n282.addChild(n283);
    n283.addChild(n284);
    n284.addChild(n285);
    n285.addChild(n306);

    n286.addChild(n287);
    n286.addChild(n293);

    n287.addChild(n288);

    n288.addChild(n289);
    n288.addChild(n296);

    n289.addChild(n290);
    n290.addChild(n291);
    n291.addChild(n292);
    n292.addChild(n298);

    n293.addChild(n294);
    n294.addChild(n295);

    n295.addChild(n289);
    n295.addChild(n296);

    n296.addChild(n297);

    n297.addChild(n292);

    n298.addChild(n299);
    n298.addChild(n300);

    n299.addChild(n301);
    n300.addChild(n301);

    n301.addChild(n302);
    n302.addChild(n303);
    n303.addChild(n304);
    n304.addChild(n305);
    n305.addChild(n306);

    n306.addChild(n307);
    n307.addChild(n308);
    n308.addChild(n309);
    n309.addChild(n310);
    n310.addChild(n311);
    n311.addChild(n312);
    n312.addChild(n313);
    n313.addChild(n314);
    n314.addChild(n315);
    n315.addChild(n316);
    n316.addChild(n317);
    n317.addChild(n318);
    n318.addChild(n319);

    n319.addChild(n321);
    n319.addChild(n320);

    n320.addChild(n321);

    n321.addChild(n322);
    n322.addChild(n323);
    n323.addChild(n324);

    n324.addChild(n326);
    n324.addChild(n325);

    n325.addChild(n326);

    n326.addChild(n327);
    n327.addChild(n328);
    n328.addChild(n329);
    n329.addChild(n330);
    n330.addChild(n331);
    n331.addChild(n332);
    n332.addChild(n333);
    n333.addChild(n334);

    n334.addChild(n335);
    n334.addChild(n336);

    n335.addChild(n337);
    n336.addChild(n337);

    n337.addChild(n338);
    n338.addChild(n339);
    n339.addChild(n340);
    n340.addChild(n341);
    n341.addChild(n342);
    n342.addChild(n343);
    n343.addChild(n344);

    n344.addChild(n347);
    n344.addChild(n345);

    n345.addChild(n347);
    n345.addChild(n346);
    n346.addChild(n347);

    n347.addChild(n348);
    n348.addChild(n349);
    n349.addChild(n350);
    n350.addChild(n351);
    n351.addChild(n352);
    n352.addChild(n353);
    n353.addChild(n354);
    n354.addChild(n355);
    n355.addChild(n356);
    n356.addChild(n357);
    n357.addChild(n358);
    n358.addChild(n359);
    n359.addChild(n360);
    n360.addChild(n361);

    return n0;
  }

}
