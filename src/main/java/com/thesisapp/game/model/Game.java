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
    Decision n1d2 = new Decision("n1d1", "Whoa-- is this an actual person?", 0, 0, "Whoa.");
    Decision[] n1d = {n1d1, n1d2};
    Node n1 = new Node(1, "Ah-- what the hell?", emptyDecisions, 1, false);
    Node n1_5 = new Node(1.5, "Stupid thing.", n1d, 1, false);

    Decision n2d1 = new Decision("n2d1", "I can read you. This is showing up on my computer. Who is this?", 0, 0, "Yeah. Who are you?");
    Decision n2d2 = new Decision("n2d2", "I can read you. This is showing up on my computer. Are you real?", 0, 0, "Sort of... Are you real?");
    Decision[] n2d = {n2d1, n2d2};
    Node n2 = new Node(2, "No way. Is this thing receiving? Can you hear me?", n2d, 1, false);

    Node n3 = new Node(3, "This is... I can't believe it.", emptyDecisions, 1, false);
    Node n3_5 = new Node(3.5, "I thought I was out of anyone's range, but if it accepted a signal from you...", emptyDecisions, 1, false);

    Decision n4d1 = new Decision("n4d1", "Maybe you could tell me who you are first? I shouldn't even have connectivity on this thing.", 0, 0, "Maybe you could tell me who you are first?");
    Decision n4d2 = new Decision("n4d2", "Total stranger talking through computer? I'm pretty sure my parents would disapprove of this type of scenario.", 0, 0, "Whoa, stranger danger.");
    Decision[] n4d = {n4d1, n4d2};
    Node n4 = new Node(4, "Okay. This is on your computer, you said? What computer?", n4d, 1, false);

    Node n5 = new Node(5, "Fair enough. Let's trade that info.", emptyDecisions, 1, false);
    Node n5_5 = new Node(5.5, " I'm Prosper.", emptyDecisions, 1, false);

    Decision n6d1 = new Decision("n6d1", "A dinosaur computer. It's a load of scrap I pulled together from old junk and thrift stores. Just messing around. I can't even hitch it up to the internet, so I have no idea how I'm receiving you.", 0, 0, "An old computer.");
    Decision n6d2 = new Decision("n6d2", "A dinosaur computer. It's a project I put together from old junk and thrift stores. Just tinkering. I can't even hitch it up to the internet, so I have no idea how I'm receiving you.", 0, 0, "A junky computer.");
    Decision[] n6d = {n6d1, n6d2};
    Node n6 = new Node(6, "What are you seeing this on?", n6d, 1, false);

    Node n7 = new Node(7, "Yeah, I'd like to know that too.", emptyDecisions, 1, false);

    Decision n8d1 = new Decision("n8d1", "The States.", 0, 0);
    Decision n8d2 = new Decision("n8d2", "Earth.", 1, 1);
    Decision[] n8d = {n8d1, n8d2};
    Node n8 = new Node(8, "Well, you're speaking English. Where are you, regionally?", n8d, 1, false);

    Node n9 = new Node(9, "I'm out of the country, in Greenland. I suppose it's not so unbelievable that we're communicating somehow. That's what the chip was made for, after all.", emptyDecisions, 1, false);

    Node n10 = new Node(10, "Wild. Me too. I'm pretty far north, in Greenland. I suppose it's not so unbelievable that we're communicating somehow. That's what the chip was made for, after all.", emptyDecisions, 1, false);

    Decision n11d1 = new Decision("n11d1", "My name is [].", 0, 0);
    Decision n11d2 = new Decision("n11d2", "I'm pretty sure not providing personal info to strangers on the web is the first rule of the modern age.", 1, 0, "Nothing.");
    Decision[] n11d = {n11d1, n11d2};
    Node n11 = new Node(11, "What do I call you, then?", n11d, 1, false);

    Decision n12d1 = new Decision("n12d1", "True. My name is [].", 0, 0, "Agree");
    Decision n12d2 = new Decision("n12d2", "Is \"Prosper\" an honest given name?", 1, 0, "Do I?");
    Decision[] n12d = {n12d1, n12d2};
    Node n12 = new Node(12,"You know me now, don't you?", n12d,1,false);

    Decision n13d1 = new Decision("n13d1", "My name is [].", 0, 0, "Agree.");
    Decision[] n13d = {n13d1};
    Node n13 = new Node(13, "Yes. It's exceptionally ironic, but it's mine. And yours is...", n13d,1,false);

    Node n14 = new Node(14,"Pleased to meet you, [].", emptyDecisions,1,false);

    Decision n15d1 = new Decision("n15d1", "He",0,0);
    Decision n15d2 = new Decision("n15d2", "She",0,0);
    Decision n15d3 = new Decision("n15d3", "They",0,0);
    Decision[] n15d = {n15d1, n15d2, n15d3};
    Node n15 = new Node(15, "I don't want to assume anything. What are your pronouns?", n15d, 1, false);

    Decision n16d1 = new Decision("n16d1", "Wait, you lost me. Do you see this as text, too? I'm typing.", 0, 0, "What?");
    Decision n16d2 = new Decision("n16d2", "Not a fan of that as a nickname. Do you see this as text, too? I'm typing.", 0, 0, "Not a fan of that nickname.");
    Decision[] n16d = {n16d1, n16d2};
    Node n16 = new Node(16, "Got it. Good to know more than \"text tinning up my quiet space.\"", n16d, 1, false);

    Node n17 = new Node(17, "You're connected to my chip somehow. It's a communicator in my head.", emptyDecisions, 1, false);

    Node n18 = new Node(18, "I don't hear or read you. It's sort of like...another train of thought.", emptyDecisions, 1, false);

    //START OF RED LINE STUFF
    Decision n19d1 = new Decision("n19d1", "Dead? What happened?", 0, 0, "Dead?");
    Decision n19d2 = new Decision("n19d2", "Okay. Wow. You have a chip in your head? How did that happen?", 1, 0, "Chip?");
    Decision[] n19d = {n19d1, n19d2};
    Node n19 = new Node(19, "You shouldn't be able to ping it. It's been dead for months.", n19d, 1, false);

    Decision n20d1 = new Decision("n20d1", "Yeah if you knew it was broken, why not fix it?", 0, 0, "Yeah.");
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
    Decision n24d2 = new Decision("n24d2", "Uh, I bet it is. Okay, was it: A) Seedy Corporation B) Aliens C) Cool futury tech", 1, 0);
    Decision[] n24d = {n24d1, n24d2};
    Node n24 = new Node(24, "It's a long story.", n24d, 1, false); //FINAL NODE OF CHIP-INFO SCENE

    Decision n25d1 = new Decision("n25d1", "Okay, sorry to pry. Well, what happened?", 0, 0, "Sorry.");
    Decision n25d2 = new Decision("n25d2", "So, mystery guy. Can I ask what happened?", 0, 0, "So what happened?");
    Decision[] n25d = {n25d1, n25d2};
    Node n25 = new Node(25, "Look, you don't want the details, []. When I say \"long story,\" that implies brutal, uncomfortable, and dangerous to know.", n25d, 1, false);

    Decision n26d1 = new Decision("n26d1", "Okay, sorry to pry. Well what happened?", 0, 0, "Sorry.");
    Decision n26d2 = new Decision("n26d2", "Okay, fine. I'm going to assume A, though.", 1, 0, "So it's A.");
    Decision[] n26d = {n26d1, n26d2};
    Node n26 = new Node(26, "Look, you don't want the details, []. When I say \"long story,\" that implies brutal, uncomfortable, and dangerous to know.", n26d, 1, false);

    Decision n27d1 = new Decision("n27d1", "So, mystery guy. Can I ask what happened?", 0, 0, "So what happened?");
    Decision n27d2 = new Decision("n27d2", "Well, can you at least hint at what happened?", 0, 0, "Can I get a hint?");
    Decision[] n27d = {n27d1, n27d2};
    Node n27 = new Node(27, "You do that.", n27d, 1, false);

    Decision n28d1 = new Decision("n28d1", "You don't say...", 0, 0);
    Decision n28d2 = new Decision("n28d2", "Uh, I bet it is. Okay, was it: A) Seedy Corporation B) Aliens C) Cool futury tech", 1, 0, "Let me guess.");
    Decision[] n28d = {n28d1, n28d2};
    Node n28 = new Node(28, "It's a long story", n28d, 1, false);

    Decision n29d1 = new Decision("n29d1", "Okay, sorry to pry. Well what happened?", 0, 0);
    Decision n29d2 = new Decision("n29d2", "So, mystery guy. Can I ask what happened?", 1, 0);
    Decision[] n29d = {n29d1, n29d2};
    Node n29 = new Node(29, "Look, you don't want the details, []. When I say \"long story,\" that implies brutal, uncomfortable, and dangerous to know.", n29d, 1, false);

    Decision n30d1 = new Decision("n30d1", "Okay, sorry to pry. Well what happened?", 0, 0);
    Decision n30d2 = new Decision("n30d2", "Okay, fine. I'm going to assume A, though.", 1, 0);
    Decision[] n30d = {n30d1, n30d2};
    Node n30 = new Node(30, "Look, you don't want the details, []. When I say \"long story,\" that implies brutal, uncomfortable, and dangerous to know.", n30d, 1, false);

    Decision n30_1d1 = new Decision("n30_1d1", "So, mystery guy. Can I ask what happened?", 0, 0, "So what happened?");
    Decision n30_1d2 = new Decision("n30_1d2", "Well, can you at least hint at what happened?", 0, 0, "Can I get a hint?");
    Decision[] n30_1d = {n30_1d1, n30_1d2};
    Node n30_1 = new Node(30.1, "You do that.", n30_1d, 1, false);

    Decision n30_2d1 = new Decision("n20d1", "Yeah. If you knew it was broken, why not fix it?", 0, 0, "Yeah.");
    Decision n30_2d2 = new Decision("n20d2", "To you.", 1, 0);
    Decision[] n30_2d = {n30_2d1, n30_2d2};
    Node n30_2 = new Node(30.2, "To the chip?", n30_2d, 1, false);

    Node n30_3 = new Node(30.3, "Oh well... I got dinged up pretty badly. I'm fine now.", emptyDecisions, 1, false);

    Decision n30_4d1 = new Decision("n22d1", "What else can the chip do?", 0, 0);
    Decision n30_4d2 = new Decision("n22d2", "Right. And why exactly do you have a chip in your head?", 0, 0);
    Decision[] n30_4d = {n30_4d1, n30_4d2};
    Node n30_4 = new Node(30.4, "The chip isn't meant to be doing anything now. That's why no one bothered repairing it. I guess now no one needs to.", n30_4d, 1, false);
    //END OF RED LINE STUFF

    Decision n31d1 = new Decision("n31d1", "I wanted to teach myself a little something about building tech. Starting way back when, with a cathode-ray tube computer.", 0, 0, "My passion.");
    Decision n31d2 = new Decision("n31d2", "I get bored. I figured it would be neat to put on of these cathode-ray tube computers together.", 1, 0, "My hobby.");
    Decision[] n31d = {n31d1, n31d2};
    Node n31 = new Node(31, "Why were you tinkering with scrap?", n31d, 1, false);

    Decision n32d1 = new Decision("n32d1", "Is that a good thing?", 0, 0);
    Decision n32d2 = new Decision("n32d2", "Does that mean we can be friends?", 0, 0);
    Decision[] n32d = {n32d1, n32d2};
    Node n32 = new Node(32, "Ambitious type, huh? You sound like a lot of people I know.", n32d, 1, false);

    Node n33 = new Node(33, "Tinkering for its own sake, then. You sound like a lot of people I know.", n32d, 1, false);

    Decision n34d1 = new Decision("n34d1", "I suppose I understand keeping things close to the vest. But where do we go from here?", 0, 0, "Fair enough.");
    Decision n34d2 = new Decision("n34d2", "All this redacted info is really supporting the \"seedy corporation\" vibes, you know. Where do we go from here, then?", 0, 0, "Lame.");
    Decision[] n34d = {n34d1, n34d2};
    Node n34 = new Node(34, "TBD.", n34d, 1, false);

    Decision n35d1 = new Decision("n35d1", "We're mysteriously connected via an ancient computer and a crazy brain chip. I'd like to know why, but it doesn't seem like that's possible. So I don't see what else we can do here.", 0, 0, "This seems heavy.");
    Decision n35d2 = new Decision("n35d2", "We're mysteriously connected via an ancient computer and a crazy brain chip. You're not being too helpful in connecting dots, so I don't see what else we can do here.", 0, 0, "You're being cagey.");
    Decision[] n35d = {n35d1, n35d2};
    Node n35 = new Node(35, "What do you mean?", n35d, 1, false);

    Decision n36d1 = new Decision("n35d1", "Not at all. This has been interesting, to say the least.", 0, 0, "It's not that.");
    Decision n36d2 = new Decision("n35d2", "TBD.", 1, 0);
    Decision[] n36d = {n36d1, n36d2};
    Node n36 = new Node(36, "Am I that bad a conversationalist?", n36d, 1, false);

    Node n37 = new Node(37, "Ha, ha.", emptyDecisions, 1, false);

    Decision n38d1 = new Decision("n38d1", "Trouble? What can I do to help?", 0, 0, "Trouble?");
    Decision n38d2 = new Decision("n38d2", "I sense a bad \"all tied up\" pun coming. Evil corporation/government agency? I knew it.", 1, 0, "All tied up, huh?");
    Decision[] n38d = {n38d1, n38d2};
    Node n38 = new Node(38, "Okay. You could say I'm in a bit of bind.", n38d, 1, false);

    Node n39 = new Node(39, "Thank you, []. That you're even willing to listen... It means a lot.", emptyDecisions, 1, false);

    Node n40 = new Node(40, "Maybe there is something you could do.", emptyDecisions, 1, false); //Checkpoint?

    Node n41 = new Node(41, "No, [], you don't know. And there's no reason you should.", emptyDecisions, 1, false);

    Decision n42d1 = new Decision("n42d1", "Wait, I'm sorry. I don't want to sign off. So, the bind. Is it something I can help with?", 0, 0, "Wait! I'm sorry.");
    Decision n42d2 = new Decision("n42d2", "I don't want to sign off. I want to know more. So, the bind. Is it something I can help with?", 0, 0, "Not yet.");
    Decision[] n42d = {n42d1, n42d2};
    Node n42 = new Node(42, "Look, if you want to sign off, then sign off. I'm used to the silence.", n42d, 1, false);

    Node n43 = new Node(43, "There's a message I need to deliver. It would be best if you didn't leave an electronic trail, so if you could write a letter to someone, I could rest easy.", emptyDecisions, 1, false);

    Decision n44d1 = new Decision("n44d1", "I can do that! Why can't you, though?", 0, 0, "Of course.");
    Decision n44d2 = new Decision("n44d2", "Snail mail, huh? If I remember how to send a letter, I will. Any reason you can't, though?", 0, 0, "I suppose.");
    Decision[] n44d = {n44d1, n44d2};
    Node n44 = new Node(44, "So to speak.", n44d, 1, false);

    Node n45 = new Node(45, "I would if I could.", emptyDecisions, 1, false);

    Decision n46d1 = new Decision("n46d1", "That's tough. I'll do what I can, but it won't really remain private this way, either.", 0, 0, "That's tough.");
    Decision n46d2 = new Decision("n46d2", "Well, if you want me to pen a letter for you old school, it's not going to be private anyway.", 0, 0, "It won't anyway...");
    Decision[] n46d = {n46d1, n46d2};
    Node n46 = new Node(46, "Nothing I would manage to send out would remain private.", n46d, 1, false);

    Node n47 = new Node(47, "That is true...", emptyDecisions, 1, false);

    Decision n48d1 = new Decision("n48d1", "What could happen?", 0, 0);
    Decision n48d2 = new Decision("n48d2", "Let me worry about my own sake.", 1, 0, "Don't worry about me.");
    Decision[] n48d = {n48d1, n48d2};
    Node n48 = new Node(48, "I don't know if this is wise after all. For your own sake.", n48d, 1, false);

    Node n49 = new Node(49, "I'm not sure.", emptyDecisions, 1, false);
    Node n50 = new Node(50, "It could be dangerous for you because...", emptyDecisions, 1, false);
    Node n51 = new Node(51, "Well, I suppose there's no hiding it anymore.", emptyDecisions, 1, false);

    Node n52 = new Node(52, "It's not as it seems, and there's a lot going on here I don't think you would understand.", emptyDecisions, 1, false); //Merge point

    Node n53 = new Node(53, "All right. If you're sure.", emptyDecisions, 1, false);
    Node n54 = new Node(54, "Then I suppose you need to know...", emptyDecisions, 1, false);

    Decision n55d1 = new Decision("n55d1", "Oh. Well. That's odd.", 0, 0);
    Decision n55d2 = new Decision("n55d2", "...", 1, 0);
    Decision[] n55d = {n55d1, n55d2};
    Node n55 = new Node(55, "But you should know that I'm in a prison -- of sorts.", n55d, 1, false);

    Decision n56d1 = new Decision("n56d1", "Did you do it? Whatever you're in for?", 0, 0, "Are you guilty?");
    Decision n56d2 = new Decision("n56d2", "You have to realize I'm going to ask what you did to get put in prison.", 0, 0, "What are you in for?");
    Decision[] n56d = {n56d1, n56d2};
    Node n56 = new Node(56, "By all means, take your time.", n56d, 1, false);

    Decision n57d1 = new Decision("n57d1", "I'm thinking.", 0, 0);
    Decision n57d2 = new Decision("n57d2", "......", 0, 0);
    Decision[] n57d = {n57d1, n57d2};
    Node n57 = new Node(57, "Did you just type ellipses?", n57d, 1, false);

    Node n58 = new Node(58, "That's complicated.", emptyDecisions, 1, false);

    Decision n59d1 = new Decision("n59d1", "Okay. I guess you don't seem to have a reason to lie. I'll write this letter. But I won't promise to send it, if I think it would upset someone.", 0, 0, "I believe you.");
    Decision n59d2 = new Decision("n59d2", "That's...pretty vague. I'll write this letter, Prosper. But I'm not promising to send it until I know more.", 0, 0, "That's suspicious.");
    Decision[] n59d = {n59d1, n59d2};
    Node n59 = new Node(59, "I did what I thought was right. I didn't hurt anyone, and I definitely don't want you to get hurt, [].", n59d, 1, false);

    Node n60 = new Node(60, "I suppose I can't ask for more. Thanks, [].", emptyDecisions, 1, false);

    Decision n61d1 = new Decision("n61d1", "I've got paper and pen with me. Whenever you're ready.", 0, 0, "Go ahead.");
    Decision n61d2 = new Decision("n61d2", "Okay. Paper, pen. Let's go.", 0, 0, "Let's go.");
    Decision[] n61d = {n61d1, n61d2};
    Node n61 = new Node(61, "All I want to do is wish someone farewell.", n61d, 1, false);

    Node n62 = new Node(62, "Thought-to-text won't be the most elegant method, but it's better than what I had before.", emptyDecisions, 1, false);

    Node n63 = new Node(63, "Which was nothing.", emptyDecisions, 1, false);

    Decision n64d1 = new Decision("n64d1", "Take your time.", 0, 0);
    Decision n64d2 = new Decision("n64d2", "I've got nowhere to be.", 0, 0);
    Decision[] n64d = {n64d1, n64d2};
    Node n64 = new Node(64, "It will take me a minute to get this together.", n64d, 1, false);

    Node n65 = new Node(65, "Oh, no.", emptyDecisions, 1, false);

    Node n66 = new Node(66, "Damn it. [], I have to disconnect. I'll have to...", emptyDecisions, 1, false);

    Decision n67d1 = new Decision("n67d1", "Whoa, whoa. Are you okay?", 0, 0, "Are you okay?");
    Decision n67d2 = new Decision("n67d2", "Whoa, whoa. What's going on?", 0, 0, "What's going on?");
    Decision[] n67d = {n67d1, n67d2};
    Node n67 = new Node(67, "I don't know. Ping me again in a few hours.", n67d, 1, false);

    Node n68 = new Node(68, "no signal", emptyDecisions, 1, false);
    Node n69 = new Node(69, "status... disconnected", emptyDecisions, 1, false);
    Node n70 = new Node(70, "shut down", emptyDecisions, 1, false);
    Node n71 = new Node(71, "3", emptyDecisions, 1, false);
    Node n72 = new Node(72, "2", emptyDecisions, 1, false);
    Node n73 = new Node(73, "1", emptyDecisions, 1, false);

    //Wait 3 Hours (If they attempt to play within three hours)

    Decision n74d1 = new Decision("n74d1", "Connected! Hello?? Prosper?", 0, 0, "Prosper?");
    Decision[] n74d = {n74d1};
    Node n74 = new Node(74, "pinging...\nacquired signal\nstatus...connected", n74d, 0, false);

    Node n75 = new Node(75, "[]?", emptyDecisions, 1, false);

    Decision n76d1 = new Decision("n76d1", "The computer freaked out and shut down. I reconnected as soon as I could. Are you okay? Prosper?", 0, 0, "Are you okay?");
    Decision n76d2 = new Decision("n76d2", "The computer freaked out and shut down. I reconnected as soon as I could. What happened? Prosper?", 0, 0, "What happened?");
    Decision[] n76d = {n76d1, n76d2};
    Node n76 = new Node(76, "I wasn't sure I'd get the signal back.", n76d, 1, false);

    Node n77 = new Node(77, "I'm fine. Running...a little slow.", emptyDecisions, 1, false);

    Decision n78d1 = new Decision("n78d1", "It wasn't that long ago. A few hours passed.", 0, 0, "Hasn't been long.");
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
    Decision n82d2 = new Decision("n82d2", "Let's compose some correspondence.", 0, 0, "Let's do it.");
    Decision[] n82d = {n82d1, n82d2};
    Node n82 = new Node(82, "Still willing to help me with that letter, []?", n82d, 1, false);

    Node n83 = new Node(83, "Thanks.", emptyDecisions, 1, false);
    Node n84 = new Node(84, "I didn't get the chance to put much thought into it, but maybe I don't need to.", emptyDecisions, 1,  false);
    Node n85 = new Node(85, "Okay. Grace.", emptyDecisions, 1, false);

    Decision n86d1 = new Decision("n86d1", "Go on.", 0, 0);
    Decision n86d2 = new Decision("n86d2", "Got it.", 0, 0);
    Decision[] n86d = {n86d1, n86d2};
    Node n86 = new Node(86, "It's to Grace.", n86d, 1, false);

    Node n87 = new Node(87, "Grace...", emptyDecisions, 1, false);
    Node n88 = new Node(88, "First off, do not set out to find me.", emptyDecisions, 1, false);
    Node n89 = new Node(89, "Don't mention Greenland, []. Or prison.", emptyDecisions, 1, false);
    Node n90 = new Node(90, "Grace, everything ended in a rush after the Harlem bust. There wasn't anything you or I could do. TUR was prepared for every eventuality.", emptyDecisions, 1, false);
    Node n91 = new Node(91, "So, they have me. That's the ugly fact. We're right back to the beginning.", emptyDecisions, 1, false);
    Node n92 = new Node(92, "But that doesn't mean you should try to get me recommissioned. It won't work, even if you could still contact TUR.", emptyDecisions, 1, false);
    Node n93 = new Node(93, "This is just to...", emptyDecisions, 1, false);

    Decision n94d1 = new Decision("n94d1", "It's okay. This sounds heavy, and it's a weight you probably need off your shoulders.", 0, 0, "No, it is.");
    Decision n94d2 = new Decision("n94d2", "To reach out to this Grace person for the express purpose of telling her not to reach back?", 1, 0, "A bit pointless?");
    Decision[] n94d = {n94d1, n94d2};
    Node n94 = new Node(94, "Damn it. I'm not sure this is a good idea, [].", n94d, 1, false);

    Node n95 = new Node(95, "You know, that's an analogy I never got around to understanding.", emptyDecisions, 1, false);

    Decision n96d1 = new Decision("n96d1", "It's okay. This sounds heavy, and it's a weight you probably need off your shoulders.", 0, 0, "No, it is.");
    Decision n96d2 = new Decision("n96d2", "Can I assume Grace thinks you might be dead?", 1, 0, "Does she think you're dead?");
    Decision[] n96d = {n96d1, n96d2};
    Node n96 = new Node(96, "Yes, that.", n96d, 1, false);

    Node n97 = new Node(97, "Yes. I thought if I had the chance to get word to anybody, it would be to her. To say goodbye.", emptyDecisions, 1, false);

    Node n98 = new Node(98, "Let her know there's nothing to be done. Warn her, maybe, in case there's cause for it.", emptyDecisions, 1, false);

    Decision n99d1 = new Decision("n99d1", "Well, keep going. This sounds heavy, and it's a weight you probably need off your shoulders.", 0, 0, "Well, keep going.");
    Decision n99d2 = new Decision("n99d2", "Can I assume....Grace was a paramour of yours?", 1, 0, "Were you together?");
    Decision[] n99d = {n99d1, n99d2};
    Node n99 = new Node(99, "I have a feeling she didn't heed my warning to keep herself safe when I left.", n99d, 1, false);

    Decision n100d1 = new Decision("n100d1", "Right. Sorry. Well, keep going. This sounds heavy, and it's a weight you probably need off your shoulders.", 0, 0, "Sorry. Keep going.");
    Decision n100d2 = new Decision("n100d2", "Assumption retracted. Well, keep going. This sounds heavy, and it's a weight you probably need off your shoulders.", 0, 0, "Okay. Keep going.");
    Decision[] n100d = {n100d1, n100d2};
    Node n100 = new Node(100, "No.", n100d, 1, false);

    Decision n101d1 = new Decision("n101d1", "I do. It's time for some cathode-ray tube Skype therapy.", 0, 0, "I do.");
    Decision n101d2 = new Decision("n101d2", "I don't know about right, but you've already convinced me to help you this far.", 0 ,0, "Probably.");
    Decision[] n101d = {n101d1, n101d2};
    Node n101 = new Node(101, "Never mind that, though. You really think this is the right thing to do?", n101d, 1, false);

    Node n102 = new Node(102, "Maybe you're right.", emptyDecisions, 1, false);
    Node n103 = new Node(103, "Okay. So, Grace. Once more, with feeling.", emptyDecisions, 1, false);
    Node n104 = new Node(104, "It really was an honor to work with you. In time, I think we would have been honest friends. I regret not getting the chance to find out.", emptyDecisions, 1, false);
    Node n105 = new Node(105, "It's over, though. This is to make certain you know that. It's also to make certain you cleared any data caches I left behind. Keeping that data is dangerous.", emptyDecisions, 1, false);

    Decision n106d1 = new Decision("n106d1", "I mean, if she's important to you, maybe she deserves a bit of hope.", 0, 0, "Yes.");
    Decision n106d2 = new Decision("n106d2", "I mean, if it's from the heart, it's from the heart. I'll write this up.", 1, 0, "Nah.");
    Decision[] n106d = {n106d1, n106d2};
    Node n106 = new Node(106, "That's it... I think. Should I end on a better note?", n106d, 1, false);

    Node n107 = new Node(107, "You're right.", emptyDecisions, 1, false);
    Node n108 = new Node(108, "Grace, despite everything, I think I'll be okay. In some incarnation or another.", emptyDecisions, 1, false);

    Decision n109d1 = new Decision("n109d1", "That's beautiful, Prosper. I'll write this up.", 0, 0, "That's beautiful.");
    Decision n109d2 = new Decision("n109d2", "You've got me tearing up over here, Prosper. I'll write this up.", 0, 0, "That's a tear-jerker.");
    Decision[] n109d = {n109d1, n109d2};
    Node n109 = new Node(109, "And all the better for having known you.", n109d, 1, false);

    Node n110 = new Node(110, "Thanks.", emptyDecisions, 1, false);
    Node n111 = new Node(111, "I guess it's time to send it.", emptyDecisions, 1, false);

    Decision n112d1 = new Decision("n112d1", "NYC, huh? I'll send this. After I look up how much postage I need. Worth every cent.", 0, 0, "Done.");
    Decision n112d2 = new Decision("n112d2", "NYC, huh? I'll send this. After I look up how much postage I need. I don't suppose you'll reimburse me?", 0, 0, "Got any stamps?");
    Decision[] n112d = {n112d1, n112d2};
    Node n112 = new Node(112, "Grace Dillon\n 1765 11th Ave\n New York City, NY", n112d, 1, false);

    Node n113 = new Node(113, "This is such a relief. Thank you, []. Really.", emptyDecisions, 1, false);
    Node n114 = new Node(114, "Now... You may not like the sound of this.", emptyDecisions, 1, false);

    Decision n115d1 = new Decision("n115d1", "Whoa, whoa. What if you need help in the future?", 0, 0, "But you might need help!");
    Decision n115d2 = new Decision("n115d2", "I'm getting a martyr-y vibe from you, Prosper.", 1, 0, "No need to self sacrifice.");
    Decision[] n115d = {n115d1, n115d2};
    Node n115 = new Node(115, "But staying connected to this chip could endanger you.", n115d, 1, false);

    Node n116 = new Node(116, "Sweet of you to worry, but I'll be okay.", emptyDecisions, 1, false);
    Node n117 = new Node(117, "What can I say? It's a style.", emptyDecisions, 1, false);

    Decision n118d1 = new Decision("n118d1", "Yeah, you want me to be safe. Or at they very least, hoard all the danger for yourself.", 0, 0, "You want me safe.");
    Decision n118d2 = new Decision("n118d2", "Yeah. You're ghosting me. And I thought we had a connection...", 1, 0, "You're dumping me.");
    Decision[] n118d = {n118d1, n118d2};
    Node n118 = new Node(118, "You see where I'm going with this don't you?", n118d, 1, false);

    Node n119 = new Node(119, "Guess I'm selfish that way.", emptyDecisions, 1, false);
    Node n120 = new Node(120, "I'm not sure I even know how to unpack that.", emptyDecisions, 1, false);

    Node n121 = new Node(121, "More than that, though.", emptyDecisions, 1, false);

    Decision n122d1 = new Decision("n122d1", "Is it really that bad?", 0, 0, "If I have to...");
    Decision n122d2 = new Decision("n122d2", "HOLD UP. Do you know how long I had to dumpster dive and thrift lift to get this thing together?", 1, 0, "No way!");
    Decision[] n122d = {n122d1, n122d2};
    Node n122 = new Node(122, "I think you should dismantle the computer.", n122d, 1, false);

    Node n123 = new Node(123, "It might be.", emptyDecisions, 1, false);
    Node n124 = new Node(124, "It would be the best way to ensure your safety.", emptyDecisions, 1, false);

    Node n125 = new Node(125, "I know you're proud of it. And you should be.", emptyDecisions, 1, false);
    Node n126 = new Node(126, "That said, I'd encourage you to look up \"hubris.\"", emptyDecisions, 1, false);

    Node n127 = new Node(127, "Look, if there's one thing I need in here, it's peace of mind.", emptyDecisions, 1, false);

    Decision n128d1 = new Decision("n128d1", "I understand. I don't like it, but I understand. Thanks for looking out for me.", 0, 0, "I understand.");
    Decision n128d2 = new Decision("n128d2", "I mean, I don't really want to pay for that either.", 0, 0, "Can't argue with that.");
    Decision[] n128d = {n128d1, n128d2};
    Node n128 = new Node(128, "I don't want you to pay the price for helping me.", n128d, 1, false);

    Decision n129d1 = new Decision("n129d1", "Yes. I guess this is goodbye, Prosper.", 0, 0, "Agree");
    Decision n129d2 = new Decision("n129d2", "Are you sure?", 1, 0, "Disagree");
    Decision[] n129d = {n129d1, n129d2};
    Node n129 = new Node(129, "So you'll shut it down?", n129d, 1, false);

    Decision n130d1 = new Decision("n130d1", "Okay. I trust your judgement.\n It was nice to meet you, Prosper.", 0, 0, "Agree");
    Decision n130d2 = new Decision("n130d2", "This is me...signing off, then.\n In 60 seconds. A last minute, just in case you change your mind.", 1, 0, "Disagree");
    Decision[] n130d = {n130d1, n130d2};
    Node n130 = new Node(130, "It is.", n130d, 1, false);

    Decision n131d1 = new Decision("n131d1", "Okay. I guess this is goodbye, Prosper.", 0, 0, "Agree");
    Decision n131d2 = new Decision("n131d2", "There's really nothing else I can do to help?", 1, 0, "Disagree");
    Decision[] n131d = {n131d1, n131d2};
    Node n131 = new Node(131, "I'm sure.", n131d, 1, false);

    Node n132 = new Node(132, "You've done more than enough. I couldn't possibly repay you.", emptyDecisions, 1, false);

    Decision n133d1 = new Decision("n133d1", "Okay. I guess this is goodbye, Prosper.", 0, 0, "Agree");
    Decision n133d2 = new Decision("n133d2", "No way! I can still help you, Prosper.", 1, 0, "Disagree");
    Decision[] n133d = {n133d1, n133d2};
    Node n133 = new Node(133, "But I'll start by disconnecting the chip.", n133d, 1, false);

    Node n134 = new Node(134, "[].", emptyDecisions, 1, false);
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

    Decision n144d1 = new Decision("n144d1", "This is []. But I talked to Prosper.", 0, 0, "No, this is someone else.");
    Decision n144d2 = new Decision("n144d2", "Who is this, and how do you know Prosper?", 1, 0, "You know Prosper?");
    Decision[] n144d = {n144d1, n144d2};
    Node n144 = new Node(144, "Do you copy?", n144d, 2, false);

    Node n145 = new Node(145, "You got a connection?", emptyDecisions, 2, false);
    Node n146 = new Node(146, "I traced the signal back here...", emptyDecisions, 2, false);

    Node n147 = new Node(147, "The better question is how you know him.", emptyDecisions, 2, false);
    Node n148 = new Node(148, "I traced the signal back here...", emptyDecisions, 2, false);

    Decision n149d1 = new Decision("n149d1", "I could try. But who is this?", 0, 0, "I'll try.");
    Decision n149d2 = new Decision("n149d2", "Last time I cooperated with a stranger on this computer, things got weird.", 0, 0, "Who are you, exactly?");
    Decision[] n149d = {n149d1, n149d2};
    Node n149 = new Node(149, "Never mind. Can you get ahold of him again?", n149d, 2, false);

    Decision n150d1 = new Decision("n150d1", "Oh. I'll get on it.", 0 , 0, "I see.");
    Decision n150d2 = new Decision("n150d2", "Okaaay. One sec.", 0, 0, "Okaaay.");
    Decision[] n150d = {n150d1, n150d2};
    Node n150 = new Node(150, "This is Detective Grace Dillon. NYPD.", n150d, 2, false);

    Decision n151d1 = new Decision("n151d1", "Hi, Prosper.", 0, 0);
    Decision n151d2 = new Decision("n151d2", "Don't be mad.", 0, 0);
    Decision[] n151d = {n151d1, n151d2};
    Node n151 = new Node(151, "pinging...\nacquired signal\nstatus...connected", n151d, 2, false);

    Node n152 = new Node(152, "[]?", emptyDecisions, 1, false);

    Decision n153d1 = new Decision("n153d1", "You did. But I didn't want to take away your only link to the outside world!", 0, 0, "I didn't want to abandon you!");
    Decision n153d2 = new Decision("n153d2", "You did. But I for sure did not listen.", 0, 0, "Yeah, I didn't listen.");
    Decision[] n153d = {n153d1, n153d2};
    Node n153 = new Node(153, "I seem to remember telling you to dismantle the computer.", n153d, 1, false);

    Decision n154d1 = new Decision("n154d1", "Wait! Hear me out. I kept the computer together just in case. And there's a case. Detective Dillon.", 0, 0, "I have a good reason!");
    Decision n154d2 = new Decision("n154d2", "Wait! There's someone here you probably like more than me. Detective Dillon.", 0, 0, "Guess who's here?");
    Decision[] n154d = {n154d1, n154d2};
    Node n154 = new Node(154, "I'm disconnecting again.", n154d, 1, false);

    Node n155 = new Node(155, "No. No, she can't--", emptyDecisions, 1, false);

    Node n156 = new Node(156, "She can't be involved.", emptyDecisions, 1, false);

    Decision n157d1 = new Decision("n157d1", "She doesn't seem like the type to quit. I think she hacked me.", 0, 0, "She won't quit.");
    Decision n157d2 = new Decision("n157d2", "Try telling her that! She hacked me!", 0, 0, "Tell her that!");
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

    Decision n170d1 = new Decision("n170d1", "Yeah. Not much I can do about it.", 0, 0, "It can't be helped.");
    Decision n170d2 = new Decision("n170d2", "Just pretend like I'm not here.", 0, 0, "Don't mind me.");
    Decision[] n170d = {n170d1, n170d2};
    Node n170 = new Node(170, "[], are you still there?", n170d, 1, false);

    Node n171 = new Node(171, "Prosper, where are you?", emptyDecisions, 2, false);

    Node n172 = new Node(172, "I can't tell you that, Detective.", emptyDecisions, 1, false);

    Node n173 = new Node(173, "Detective?", emptyDecisions, 1, false);

    Node n174 = new Node(174, "A prison in Greenland.", emptyDecisions, 2, false);

    Decision n175d1 = new Decision("n175d1", "Did you just go through my files?", 0, 0);
    Decision n175d2 = new Decision("n175d2", "Hey, ask before you go snooping around in my computer!", 0, 0, "Hey!");
    Decision[] n175d = {n175d1, n175d2};
    Node n175 = new Node(175, "A TUR facility, you mean.", n175d, 2, false);

    Node n176 = new Node(176, "There's nothing either of us can do, Detective. Get yourself home, and deactivate []'s computer.", emptyDecisions, 1, false);
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

    Node n221 = new Node(221, "I saw that you had [] send me a letter. You wouldn't have contacted me if there wasn't some part of you that wanted help.", emptyDecisions, 2, false);
    Node n222 = new Node(222, "But I...", emptyDecisions, 1, false);
    Node n223 = new Node(223, "I shouldn't want help.", emptyDecisions, 1, false);
    Node n224 = new Node(224, "It's over. Test failed.", emptyDecisions, 1, false);
    Node n225 = new Node(225, "I'm...where I'm supposed to be.", emptyDecisions, 1, false);
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
    Node n252 = new Node(252, "I'm hooked up to something. They can't read the chip activity, or they would have disabled it by now. They must just be reading processor activity.", emptyDecisions, 1, false);

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

    Decision n264d1 = new Decision("n264d1", "For the record, I don't think she can. And I was reading along the whole time.\n Sounds like you're in a lot of trouble. And it also sounds like you're a robot.", 0, 0, "Sounds like a pretty serious situation.");
    Decision n264d2 = new Decision("n264d2", "As if I wasn't eavesdropping the entire time.\n Soooo...a ROBOT?", 0, 0, "Soooo...a ROBOT?");
    Decision[] n264d = {n264d1, n264d2};
    Node n264 = new Node(264, "There's sensitive information [] shouldn't see. Clear the messages.", n264d, 1, false);

    Node n265 = new Node(265, "Hello, [].", emptyDecisions, 1, false);

    Decision n266d1 = new Decision("n266d1", "Of course not. You're amazing.", 0, 0);
    Decision n266d2 = new Decision("n266d2", "Mechanical- American?", 1, 0);
    Decision[] n266d = {n266d1, n266d2};
    Node n266 = new Node(266, "No, I'm not a robot. Nothing so simplistic.", n266d, 1, false);

    Node n267 = new Node(267, "Why, thank you.", emptyDecisions, 1, false);
    Node n268 = new Node(268, "But it's nothing for you to concern yourself with.", emptyDecisions, 1, false);

    Node n269 = new Node(269, "I'm not American.", emptyDecisions, 1, false);
    Node n270 = new Node(270, "And it's nothing for you to concern yourself with.", emptyDecisions, 1, false);

    Decision n271d1 = new Decision("n271d1", "Still gone. In the meantime...know any good icebreakers?", 0, 0, "[Honest]");
    Decision n271d2 = new Decision("n271d2", "Here. I need your specs so I can find the records.", 1, 0, "[Trick Prosper]");
    Decision[] n271d = {n271d1, n271d2};
    Node n271 = new Node(271, "Where's Detective Dillon?", n271d, 1, false);

    Node n272 = new Node(272, "I don't think there is such a thing.", emptyDecisions, 1, false);

    Decision n273d1 = new Decision("n273d1", "If you insist. We'll just...twiddle our respective thumbs. For who knows how long.", 0, 0, "If you insist...");
    Decision n273d2 = new Decision("n273d2", "Well, is some information too much to ask?", 1, 0, "What if I need to know?");
    Decision[] n273d = {n273d1, n273d2};
    Node n273 = new Node(273, "We can just wait.", n273d, 1, false);

    Node n274 = new Node(274, "Fine.", emptyDecisions, 1, false);
    Node n275 = new Node(275, "But this situation is highly dangerous.", emptyDecisions, 1, false);

    Decision n276d1 = new Decision("n276d1", "Life is dangerous. I'm involved now, and I should know what's going on.", 0, 0, "You can trust me.");
    Decision n276d2 = new Decision("n276d2", "You really think it's not too late for that?", 0, 0, "It's a bit late for that...");
    Decision[] n276d = {n276d1, n276d2};
    Node n276 = new Node(276, "You shouldn't know more than you absolutely need to.", n276d, 1, false);

    Decision n277d1 = new Decision("n277d1", "Life is dangerous. I'm involved now, and I should know what's going on.", 0, 0, "You can trust me.");
    Decision n277d2 = new Decision("n277d2", "You really think it's not too late for that?", 0, 0, "It's a bit late for that...");
    Decision[] n277d = {n277d1, n277d2};
    Node n277 = new Node(277, "When that information could be dangerous to you, yes.", n277d, 1, false);

    Node n278 = new Node(278, "I suppose... you're not wrong.", emptyDecisions, 1, false);
    Node n279 = new Node(279, "It's fair for you to want to know.", emptyDecisions, 1, false);
    Node n280 = new Node(280, "I'm a prototype android.", emptyDecisions, 1, false);

    Decision n281d1 = new Decision("n281d1", "Definitely good information to have. Thanks for telling me. Wait---does that mean there are 412 models?", 0, 0, "Thanks for telling me. 412?");
    Decision n281d2 = new Decision("n281d2", "Give me a minute to get past \"wow.\" Which brings us to: are there 412 models??", 0, 0, "Cooool. 412?");
    Decision[] n281d = {n281d1, n281d2};
    Node n281 = new Node(281, "Model 412-009 Mark-1, to be precise.", n281d, 1, false);

    Node n282 = new Node(282, "412 is the employee code. I'm their ninth design.", emptyDecisions, 1, false);
    Node n283 = new Node(283, "I don't know if the previous eight even made it to the prototype stage, or if those projects were even androids.", emptyDecisions, 1, false);

    Decision n284d1 = new Decision("n284d1", "Yes, I'm good.", 0, 0);
    Decision n284d2 = new Decision("n284d2", "Well, no, but my dozen other questions can wait.", 0, 0, "Oh, not by half.");
    Decision[] n284d = {n284d1, n284d2};
    Node n284 = new Node(284, "Enough information for you?", n284d, 1, false);

    Node n285 = new Node(285, "All right, I'm back.", emptyDecisions, 2, false);

    Decision n286d1 = new Decision("n286d1", "So, I know that was absolutely a low blow. Apologies.", 0, 0, "Okay, I'm sorry.");
    Decision n286d2 = new Decision("n286d2", "Okay, I want you to know how thrilled I am to be the second half of a successful Turing test. 10/10 would be fooled again.", 0, 0, "Oh my Turing.");
    Decision[] n286d = {n286d1, n286d2};
    Node n286 = new Node(286, "Class: Prototype 286\n Model 412-009 Mark-1\n Unit Dictation: Prospero", n286d, 1, false);

    Node n287 = new Node(287, "[].", emptyDecisions, 1, false);

    Decision n288d1 = new Decision("n288d1", "You're right. I'm sorry. I just wanted to know what I'm getting into here. Like...412? Are there that many models?", 0, 0, "You're right. I'm sorry.");
    Decision n288d2 = new Decision("n288d2", "Not laughing. But I did need more information than you were giving me. Does that mean there are 412 models?", 1, 0, "Maybe not, but I needed more information.");
    Decision[] n288d = {n288d1, n288d2};
    Node n288 = new Node(288, "You must be joking. And yet, this is not a laughing matter.", n288d, 1, false);

    Node n289 = new Node(289, "I want you to know that I'm sighing right now.", emptyDecisions, 1, false);
    Node n290 = new Node(290, "Heavily.", emptyDecisions, 1, false);
    Node n291 = new Node(291, "But it's fair for you to want to know.", emptyDecisions, 1, false);
    Node n292 = new Node(292, "412 is the employee code. I'm their ninth design.", emptyDecisions, 1, false);

    Node n293 = new Node(293, "Not amusing, [].", emptyDecisions, 1, false);
    Node n294 = new Node(294, "This sort of information could be dangerous to you.", emptyDecisions, 1, false);

    Decision n295d1 = new Decision("n295d1", "You're right. I'm sorry. I just wanted to know what I'm getting into here. Like...412? Are there that many models?", 0, 0, "You're right. I'm sorry.");
    Decision n295d2 = new Decision("n295d2", "Well, now we've traded low blows and we're even. Does that mean there are 412 models?", 1, 0, "Okay, now we're even.");
    Decision[] n295d = {n295d1, n295d2};
    Node n295 = new Node(295, "To your family.", n295d, 1, false);

    Node n296 = new Node(296, "I want you to know that I'm sighing right now.", emptyDecisions, 1, false);
    Node n297 = new Node(297, "Heavily.", emptyDecisions, 1, false);

    Decision n298d1 = new Decision("n298d1", "I'm going to try to keep my cool here. But this is absolutely fantastic.", 0, 0, "I'll keep my cool. But wow.");
    Decision n298d2 = new Decision("n298d2", "Okay.\n ANDROIDS!\n What else is at the mysterious agency? Death rays, alien corpses, advanced spacecraft, etc.?", 1, 0, "Androids? What else??");
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
    Node n316 = new Node(316, "Your insertion for the kill port is almost certainly useless now.", emptyDecisions, 1, false);
    Node n317 = new Node(317, "As far as the component goes, that would effectively be pulling my plug.", emptyDecisions, 1, false);
    Node n318 = new Node(318, "It would separate my power source from the rest of my body. A rather intentional weak point, it seems.", emptyDecisions, 1, false);

    Decision n319d1 = new Decision("n319d1", "What are you getting at?", 0, 0);
    Decision n319d2 = new Decision("n319d2", "If I may interject, killing you seems like the opposite of what we want to do.", 1, 0, "Maybe we avoid killing you?");
    Decision[] n319d = {n319d1, n319d2};
    Node n319 = new Node(319, "I'd shut down after 60 seconds.", n319d, 1, false);

    Node n320 = new Node(320, "I'd rather avoid that, yes.", emptyDecisions, 1, false);

    Decision n321d1 = new Decision("n321d1", "\"Get help\" sounds good. \"Sabotage\" sounds less good.", 0, 0, "Sounds a bit better.");
    Decision n321d2 = new Decision("n321d2", "And then comes persuasive physical force?", 0, 0, "Then, fisticuffs?");
    Decision[] n321d = {n321d1, n321d2};
    Node n321 = new Node(321, "Well, to borrow from dozens of movies, you could pull a \"I'm hurt, get help\" move. If you sabotage your own systems, someone would come to fix you.", n321d, 2, false);

    Node n322 = new Node(322, "That's if I can even access it.", emptyDecisions, 1, false);
    Node n323 = new Node(323, "Range of motion is limited. My damaged arm isn't restrained, but it isn't useful, either. My legs and other arms are bound.", emptyDecisions, 1, false);

    Decision n324d1 = new Decision("n324d1", "Maybe there's something I could do to help. Figure out a patch from my end to reboot your senses?", 0, 0, "Maybe I could do something.");
    Decision n324d2 = new Decision("n324d2", "I believe this is what we in the biz call a pickle.", 1, 0, "Well, this is a pickle.");
    Decision[] n324d = {n324d1, n324d2};
    Node n324 = new Node(324, "I should point out that I don't know if anyone is in the room with me now. All I have access to are dulled touch sensors.", n324d, 1, false);

    Node n325 = new Node(325, "Is there something we can do from our end? Through the chip?", emptyDecisions, 2, false);

    Node n326 = new Node(326, "It's a nice thought, but my communicator chip doesn't have access to other processes. Or else they would have realized by now that it's online.", emptyDecisions, 1, false);

    Decision n327d1 = new Decision("n327d1", "I might know how, actually, after picking apart the hardware while we were disconnected.", 0, 0, "I might know the answer to that.");
    Decision n327d2 = new Decision("n327d2", "About that. I was looking at the hardware while we were disconnected.", 0, 0, "About that...");
    Decision[] n327d = {n327d1, n327d2};
    Node n327 = new Node(327, "It still doesn't make sense that it's connected to your computer, [].", n327d, 1, false);

    Decision n328d1 = new Decision("n328d1", "And, I picked up my processor from a junkstore that ships in from New York. Think it could be your tech?", 0, 0, "I think a piece of your tech is in my computer.");
    Decision n328d2 = new Decision("n328d2", "And, I picked up my processor from a junkstore that ships in from New York. Not to embarrass you, but...you ever leave any spare parts lying around?", 0, 0, "Dropped any spare parts lately?");
    Decision[] n328d = {n328d1, n328d2};
    Node n328 = new Node(328, "And?", n328d, 1, false);

    Node n329 = new Node(329, "Certainly not.", emptyDecisions, 1, false);
    Node n330 = new Node(330, "Unless...", emptyDecisions, 1, false);

    Decision n331d1 = new Decision("n331d1", "Must be. Unless we're thinking pure kismet. Uh, TUR?", 0, 0, "Maybe its fate. TUR?");
    Decision n331d2 = new Decision("n331d2", "Happens to the best of us. Uh, TUR?", 0, 0, "Eh, it happens. TUR?");
    Decision[] n331d = {n331d1, n331d2};
    Node n331 = new Node(331, "I was badly damaged on my last mission. I suppose when they came to retrieve me, TUR might have left something behind.", n331d, 1, false);

    Decision n332d1 = new Decision("n332d1", "How's that?", 0, 0);
    Decision n332d2 = new Decision("n332d2", "Don't tell me...", 0, 0);
    Decision[] n332d = {n332d1, n332d2};
    Node n332 = new Node(332, "Taskforce for Upcoming Robotics. I gather they built the name around the acronym, and their headquarters to match.", n332d, 1, false);

    Node n333 = new Node(333, "It's a circular building. So...", emptyDecisions, 1, false);

    Decision n334d1 = new Decision("n334d1", "That is just... That would be the coolest thing I've heard all day, except that I've heard a lot of cool things today.", 0, 0, "!!!!!");
    Decision n334d2 = new Decision("n334d2", "The nerds will stop at nothing, will they?", 1, 0, ".....");
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
    Node n343 = new Node(343, "So, we have an outline.", emptyDecisions, 2, false);

    Decision n344d1 = new Decision("n344d1", "Not to be a buzz kill, but there isn't a lot of detail in that plan.", 0, 0, "And then what?");
    Decision n344d2 = new Decision("n344d2", "And then, live long and...", 1, 0, "Star Trek");
    Decision[] n344d = {n344d1, n344d2};
    Node n344 = new Node(344, "Get you out of that workshop, then out of that facility, then to me.", n344d, 2, false);

    Decision n345d1 = new Decision("n345d1", "Not gonna finish the quote? All right then.", 0, 0, "Not a Trekkie?");
    Decision n345d2 = new Decision("n345d2", "I was really hoping you would finish the quote.", 1, 0, "Are you gonna finish the quote?");
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
    Node n354 = new Node(354, "Something's happening around me", emptyDecisions, 1, false);
    Node n355 = new Node(355, "Have to go.", emptyDecisions, 1, false);
    Node n356 = new Node(356, "signal lost", emptyDecisions, 0, false);
    Node n357 = new Node(357, "status...disconnected", emptyDecisions, 0, false);
    Node n358 = new Node(358, "shut down", emptyDecisions, 0, false);
    Node n359 = new Node(359, "3", emptyDecisions, 0, false);
    Node n360 = new Node(360, "2", emptyDecisions, 0, false);
    Node n361 = new Node(361, "1", emptyDecisions, 0, false);

    // END ACT I

    //Act II
    Node m1 = new Node(362, "interface: on", emptyDecisions, 0, false);

    Node m2 = new Node(363, "connection_point.D: active", emptyDecisions, 0, false);

    Node m3 = new Node(364, "pinging...", emptyDecisions, 0, false);

    Node m4 = new Node(365, "acquired connection_point.P", emptyDecisions, 0, false);

    Decision m5d1 = new Decision("m5d1", "And he's back! Prosper, it's [] and Dillon. The computer has a nice new interface, and now we can all talk at once, sans squabbling.", 0, 0);
    Decision m5d2 = new Decision("m5d2", "Ladies and gentlefolk, we have point.P! Prosper, it's [] and Dillon. The computer has a nice new interface, and now we can all talk at once, sans squabbling.", 0, 0);
    Decision[] m5d = {m5d1, m5d2};
    Node m5 = new Node(366, "connection_point.P: active", m5d, 0, false);

    Node m6 = new Node(367, "", emptyDecisions, 1, false);

    Decision m7d1 = new Decision("m7d1", "Of course not, officer. Now Dillon can chat without hacking me, is what I mean. What's going on?", 0, 0);
    Decision m7d2 = new Decision("m7d2", "...anyway. Now Dillon can chat without hacking me, is what I mean. What's going on?", 0, 0);
    Decision[] m7d = {m7d1, m7d2};
    Node m7 = new Node(368, "I don't squabble.", m7d, 2, false);

    Node m8 = new Node(369, "Prosper?", emptyDecisions, 2, false);

    Decision m9d1 = new Decision("m9d1", "Right. Okay. Give me a second... Fixed?", 0, 0);
    Decision m9d2 = new Decision("m9d2", "I hope that was PG. Give me a second... Fixed?", 0, 0);
    Decision[] m9d = {m9d1, m9d2};
    Node m9 = new Node(370, "01001000 01100101 01101100 01101100 01101111 00111111", m9d, 1, false);

    Node m10 = new Node(371, "[]?", emptyDecisions, 1, false);

    Decision m11d1 = new Decision("m11d1", "Hi. We upgraded.", 0, 0);
    Decision m11d2 = new Decision("m11d2", "Hi. How do you like the new kicks?", 0, 0);
    Decision[] m11d = {m11d1, m11d2};
    Node m11 = new Node(372, "And Dillon.", m11d, 2, false);

    Node m12 = new Node(373, "Wow.", emptyDecisions, 1, false);

    Node m13 = new Node(374, "It's good to hear your voices.", emptyDecisions, 1, false);

    Node m14 = new Node(375, "So to speak.", emptyDecisions, 1, false);

    Decision m15d1 = new Decision("m15d1", "Coding fluke. I'm not, as they say, an \"expert.\" But it's fixed now! Probably.", 0, 0);
    Decision m15d2 = new Decision("m15d2", "Coding fluke. Hey, if we don't make mistakes, we don't learn. It's fixed now. Probably.", 0, 0);
    Decision[] m15d = {m15d1, m15d2};
    Node m15 = new Node(376, "What was that signal?", m15d, 1, false);

    Node m16 = new Node(377, "Prosper, what's your status? You were quiet for a while.", emptyDecisions, 2, false);

    Node m17 = new Node(378, " It was off and on. Mostly off, I think.", emptyDecisions, 1, false);

    Node m18 = new Node(379, "As I recall, we were arguing about whether Dillon was coming to Greenland.", emptyDecisions, 1, false);

    Node m19 = new Node(380, " Decided, actually.", emptyDecisions, 2, false);

    Node m20 = new Node(381, " By the way, the Greenlandic sights are not at all worth the weather.", emptyDecisions, 2, false);

    Node m21 = new Node(382, "But it will be worth it, when we get you out.", emptyDecisions, 2, false);

    Node m22 = new Node(383, "Detective, request to confirm you brought yourself within TUR's reach.", emptyDecisions, 1, false);

    Node m23 = new Node(384, "And about to head even closer soon. Farther north, I'll lose signal.", emptyDecisions, 2, false);

    Node m24 = new Node(385, "TUR didn't give me a nifty Prosper-powered phone.", emptyDecisions, 2, false);

    Decision m25d1 = new Decision("m25d1", "If this goes to court, I won't be choosing sides.", 0, 0);
    Decision m25d2 = new Decision("m25d2", "Trademarked? Now I gotta know.", 0, 0);
    Decision[] m25d = {m25d1, m25d2};
    Node m25 = new Node(386, " I'm tempted to use some Dillon-trademarked curses right now.", m25d, 1, false);

    Node m26 = new Node(387, "I won't sue. The court system couldn't handle it.", emptyDecisions, 2, false);

    Node m27 = new Node(388, "The fewer people who know, the better.", emptyDecisions, 2, false);

    Node m28 = new Node(389, "Relax, Prosper. Worrying about me is the last thing you need on your plate.", emptyDecisions, 2, false);

    Node m29 = new Node(390, " I suppose there's nothing I can say to convince you otherwise.", emptyDecisions, 1, false);

    Node m30 = new Node(391, "Detective, how long has it been since New York?", emptyDecisions, 1, false);

    Node m31 = new Node(392, "Four months.", emptyDecisions, 2, false);

    Node m31_5 = new Node(392.5, "Four? Since then, I've had...", emptyDecisions, 1, false);

    Node m32 = new Node(393, "A total of only 613 waking hours.", emptyDecisions, 1, false);

    Node m33 = new Node(394, "I don't like that, Detective.", emptyDecisions, 1, false);

    Node m34 = new Node(395, "Me neither", emptyDecisions, 2, false);

    Node m35 = new Node(396, "But we're working on it. It'll be okay.", emptyDecisions, 2, false);

    Node m36 = new Node(397, "For now, I'll have to leave you with []. Hopefully, that doesn't turn out to be the second worst mistake I've made this year.", emptyDecisions, 2, false);

    Node m37 = new Node(398, "[]? Listen close.", emptyDecisions, 2, false);

    Node m38 = new Node(399, "Prosper's in your hands. Stick with him, get him out of TURing, and I'll take it from there.", emptyDecisions, 2, false);

    Node m39 = new Node(400, "I know this is a lot to ask. But we're depending on you.", emptyDecisions, 2, false);

    Node m40 = new Node(401, "Me in particular.", emptyDecisions, 1, false);

    Node m41 = new Node(402, "But I can't ask you to do this, [].", emptyDecisions, 1, false);

    Decision m42d1 = new Decision("m42d1", "Believe me, I've made it. You're getting out of there.", 0, 0);
    Decision m42d2 = new Decision("m42d2", "Let me think... Sure, I don't have anything going on.", 1, 0);
    Decision[] m42d = {m42d1, m42d2};
    Node m42 = new Node(403, "It has to be your choice to make.", m42d, 1, false);

    Node m43 = new Node(404, "Good choice.", emptyDecisions, 2, false);

    Node m44 = new Node(405, "Better than nothing, I suppose.", emptyDecisions, 2, false);

    Node m45 = new Node(406, "Meet you both on the other side of this.", emptyDecisions, 2, false);

    Decision m46d1 = new Decision("m46d1", "And there goes the more capable of your defenders.", 0, 0);
    Decision m46d2 = new Decision("m46d2", "And then there were two.", 1, 0);
    Decision[] m46d = {m46d1, m46d2};
    Node m46 = new Node(407, "connection_point.D lost", m46d, 0, false);

    Node m47 = new Node(408, "Not too long ago, I didn't have any defenders at all.", emptyDecisions, 1, false);

    Node m48 = new Node(409, "It's a lot better than one, which was all I had not too long ago.", emptyDecisions, 1, false);

    Node m49 = new Node(410, "This is...", emptyDecisions, 1, false);

    Decision m50d1 = new Decision("m50d1", "Thanks later. Updates now.", 0, 0);
    Decision m50d2 = new Decision("m50d2", "I try, I try. Now, down to business.", 0, 0);
    Decision[] m50d = {m50d1, m50d2};
    Node m50 = new Node(411, "Thank you, [].", m50d, 1, false);

    Decision m51d1 = new Decision("m51d1", "Are your sensors back? What's around you now?", 0, 0);
    Decision m51d2 = new Decision("m51d2", "Can you see anything? Where are you?", 0, 0);
    Decision[] m51d = {m51d1, m51d2};
    Node m51 = new Node(412, "Right.", m51d, 1, false);

    Node m52 = new Node(413, "Just audio. I still can't see anything.", emptyDecisions, 1, false);

    Node m53 = new Node(414, "I think they're interested in my processor.", emptyDecisions, 1, false);

    Node m54 = new Node(415, "Last time I disconnected from you, they had a series of questions and a dozen different memory diagnostics.", emptyDecisions, 1, false);

    Node m55 = new Node(416, "They must have read activity from our conversation, but nothing specific.", emptyDecisions, 1, false);

    Node m56 = new Node(417, "They thought I was \"daydreaming\". That's not in my program, so they want to know why.", emptyDecisions, 1, false);

    Decision m57d1 = new Decision("m57d1", "Well, that's creepy.", 0, 0);
    Decision m57d2 = new Decision("m57d2", "Sweet jams, or calming tunes?", 1, 0);
    Decision[] m57d = {m57d1, m57d2};
    Node m57 = new Node(418, "Right now, there's music playing.", m57d, 1, false);

    Node m58 = new Node(419, "You're telling me.", emptyDecisions, 1, false);

    Node m59 = new Node(420, "Neither.", emptyDecisions, 1, false);

    Node m60 = new Node(421, "Most likely, they want to know how sound might affect my mental activity.", emptyDecisions, 1, false);

    Decision m61d1 = new Decision("m61d1", "They won't get the chance. How about you?", 0, 0);
    Decision m61d2 = new Decision("m61d2", "That's something. How about that cord? Still attached to you?", 1, 0);
    Decision[] m61d = {m61d1, m61d2};
    Node m61 = new Node(422, "Logically, their next step will be to isolate sight or smell as a variable.", m61d, 1, false);

    Node m62 = new Node(423, "I'm restrained in the same way. My legs are tied down, my arm bound to my torso, and I'm sitting up.", emptyDecisions, 1, false);

    Decision m63d1 = new Decision("m63d1", "How about that cord? Still attached to you?", 0, 0);
    Decision m63d2 = new Decision("m63d2", "And that cable? Still attached to you?", 1, 0);
    Decision[] m63d = {m63d1, m63d2};
    Node m63 = new Node(424, "They might change that eventually, but the restraints are a constant in their experiments for now.", m63d, 1, false);

    Node m64 = new Node(425, "Yes. It's plugged into a data port.", emptyDecisions, 1, false);

    Node m65 = new Node(426, "In my diagnostics, it's listed as the foramen magnum.", emptyDecisions, 1, false);

    Decision m66d1 = new Decision("m66d1", "Got it. Can you access the monitor from your end?", 0, 0);
    Decision m66d2 = new Decision("m66d2", "It must be attached to a monitor of some kind. Can you access it from your end?", 0, 0);
    Decision[] m66d = {m66d1, m66d2};
    Node m66 = new Node(427, "They like their jokes, I suppose.", m66d, 1, false);

    Node m67 = new Node(428, "Yes. It's plugged into a data port.", emptyDecisions, 1, false);

    Node m68 = new Node(429, "In my diagnostics, it's listed as the foramen magnum.", emptyDecisions, 1, false);

    Decision m69d1 = new Decision("m69d1", "Got it. Can you access the monitor from your end?", 0, 0);
    Decision m69d2 = new Decision("m69d2", "It must be attached to a monitor of some kind. Can you access it from your end?", 0, 0);
    Decision[] m69d = {m69d1, m69d2};
    Node m69 = new Node(430, "They like their jokes, I suppose.", m69d, 1, false);

    Node m70 = new Node(431, "It's there. It isn't a complex connection.", emptyDecisions, 1, false);

    Decision m71d1 = new Decision("m71d1", "I think I know what we can do.", 0, 0);
    Decision m71d2 = new Decision("m71d2", "Let's talk through our options.", 1, 0);
    Decision[] m71d = {m71d1, m71d2};
    Node m71 = new Node(432, "I couldn't issue commands, but maybe I could overload it by feeding it errors.", m71d, 1, false);

    Node m72 = new Node(433, "Yes. It's plugged into a data port.", emptyDecisions, 1, false);

    Node m73 = new Node(434, "In my diagnostics, it's listed as the foramen magnum.", emptyDecisions, 1, false);

    Decision m74d1 = new Decision("m74d1", "Got it. Can you access the monitor from your end?", 0, 0);
    Decision m74d2 = new Decision("m74d2", "What about you?", 1, 0);
    Decision[] m74d = {m74d1, m74d2};
    Node m74 = new Node(435, "They like their jokes, I suppose.", m74d, 1, false);

    Node m75 = new Node(436, "It's there. It isn't complex connection.", emptyDecisions, 1, false);

    Decision m76d1 = new Decision("m76d1", "And what about you? Any mobility?", 0, 0);
    Decision m76d2 = new Decision("m76d2", "Could be a good option. What about you? Can you move?", 0, 0);
    Decision[] m76d = {m76d1, m76d2};
    Node m76 = new Node(437, "I couldn't issue commands, but maybe I could overload it by feeding it errors.", m76d, 1, false);

    Node m77 = new Node(438, "I'm restrained in the same way. My legs are tied down, my arm bound to my torso, and I'm sitting up.", emptyDecisions, 1, false);

    Decision m78d1 = new Decision("m78d1", "I think I know what we can do.", 0, 0);
    Decision m78d2 = new Decision("m78d2", "Let's talk through our options.", 1, 0);
    Decision[] m78d = {m78d1, m78d2};
    Node m78 = new Node(439, "They might change that eventually, but the restraints are a constant in their experiments for now.", m78d, 1, false);

    Node m79 = new Node(440, "I'm restrained in the same way. My legs are tied down, my arm bound to my torso, and I'm sitting up.", emptyDecisions, 1, false);

    Decision m80d1 = new Decision("m80d1", "What about the monitor on the other end of the cable. Can you access it?", 0, 0);
    Decision m80d2 = new Decision("m80d2", "That cable must be attached to a monitor of some kind. Can you access it from your end?", 0, 0);
    Decision[] m80d = {m80d1, m80d2};
    Node m80 = new Node(441, "They might change that eventually, but the restraints are a constant in their experiments for now.", m80d, 1, false);

    Node m81 = new Node(442, "It's there. It isn't a complex connection.", emptyDecisions, 1, false);

    Decision m82d1 = new Decision("m82d1", "I think I know what we can do.", 0, 0);
    Decision m82d2 = new Decision("m82d2", "Let's talk through our options.", 1, 0);
    Decision[] m82d = {m82d1, m82d2};
    Node m82 = new Node(443, "I couldn't issue commands, but maybe I could overload it by feeding it errors.", m82d, 1, false);

    Decision m83d1 = new Decision("m83d1", "There's not much at our disposal. But maybe we can use their experiment against them. Say something.", 0, 0);
    Decision m83d2 = new Decision("m83d2", "There's got to be something in all that hardware we can use.", 1, 0);
    Decision[] m83d = {m83d1, m83d2};
    Node m83 = new Node(444, "By all means, share.", m83d, 1, false);

    Decision m84d1 = new Decision("m84d1", "Anything. To see if someone responds.", 0, 0);
    Decision m84d2 = new Decision("m84d2", "Whatever would get an answer", 0, 0);
    Decision[] m84d = {m84d1, m84d2};
    Node m84 = new Node(445, "Such as?", m84d, 1, false);

    Decision m85d1 = new Decision("m85d1", "Respond to their test. The music.", 0, 0);
    Decision m85d2 = new Decision("m85d2", "Have you tried complaining? Complaining makes me feel better.", 1, 0);
    Decision[] m85d = {m85d1, m85d2};
    Node m85 = new Node(446, "I don't have much to say to TURing scientists.", m85d, 1, false);

    Node m86 = new Node(447, "That...", emptyDecisions, 1, false);

    Decision m87d1 = new Decision("m87d1", "Something interesting? From a research standpoiont.", 0, 0);
    Decision m87d2 = new Decision("m87d2", "Critisize their music taste. That gets a rise out of everyone.", 1, 0);
    Decision[] m87d = {m87d1, m87d2};
    Node m87 = new Node(448, "That could work. What should I say?", m87d, 1, false);

    Decision m88d1 = new Decision("m88d1", "Something...human? I mean, if I were running experiments on an android, I would always be looking for signs of humanity.", 0, 0);
    Decision m88d2 = new Decision("m88d2", "Something...roboty? I mean, if I were running experiments on an android, I would always be looking for differences between humans and robots.", 1, 0);
    Decision[] m88d = {m88d1, m88d2};
    Node m88 = new Node(449, "You seem to have something in mind?", m88d, 1, false);

    Decision m89d1 = new Decision("m89d1", "One or two.", 0, 0);
    Decision m89d2 = new Decision("m89d2", "A lot.", 0, 0);
    Decision[] m89d = {m89d1, m89d2};
    Node m89 = new Node(450, "How many sci-fi based assumptions are you operating off here.", m89d, 1, false);

    Node m90 = new Node(451, "Fine.", emptyDecisions, 1, false);

    Decision m91d1 = new Decision("m91d1", "Dillon mentioned a mission, a time when you felt something real. Something from the same place.", 0, 0);
    Decision m91d2 = new Decision("m91d2", "Well, if you're asking this human, it should come from a place of boredom.", 1, 0);
    Decision[] m91d = {m91d1, m91d2};
    Node m91 = new Node(452, "Enlighten the notably non-human member of this conversation what is means to say something human.", m91d, 1, false);

    Node m92 = new Node(453, "Okay. I think I understand.", emptyDecisions, 1, false);

    Node m93 = new Node(454, "I don't...", emptyDecisions, 1, false);

    Node m94 = new Node(455, "Maybe. I'll try.", emptyDecisions, 1, false);

    Node m95 = new Node(456, "Hello?", emptyDecisions, 1, false);

    Node m96 = new Node(457, "What...", emptyDecisions, 1, false);

    Node m97 = new Node(458, "What song is this?", emptyDecisions, 1, false);

    Node m98 = new Node(459, "There's--", emptyDecisions, 1, false);

    Node m99 = new Node(460, "Damn.", emptyDecisions, 1, false);

    Node m100 = new Node(461, "I'm routing my auditory input through the chip.", emptyDecisions, 1, false);

    Node m101 = new Node(462, "incoming feed", emptyDecisions, 0, false);

    Node m102 = new Node(463, "connection_point.P audio", emptyDecisions, 0, false);

    Node m103 = new Node(464, "This is Chopin. His second nocturne.", emptyDecisions, 4, false);

    Node m104 = new Node(465, "Do you like it, Prospero?", emptyDecisions, 4, false);

    Decision m105d1 = new Decision("m105d1", "Just talk. Let's see where this goes.", 0, 0);
    Decision m105d2 = new Decision("m105d2", "Eh, classical isn't really my thing.", 0, 0);
    Decision[] m105d = {m105d1, m105d2};
    Node m105 = new Node(466, "Do I?", m105d, 1, false);

    Node m106 = new Node(467, "No. I don't.", emptyDecisions, 1, false);

    Node m107 = new Node(468, "Why is that?", emptyDecisions, 4, false);

    Node m108 = new Node(469, "I don't. Why do I need a reason?", emptyDecisions, 1, false);

    Node m109 = new Node(470, "Chopin is a renowned classical composer. I'm only curious.", emptyDecisions, 4, false);

    Decision m110d1 = new Decision("m110d1", "Okay, once more with feeling.", 0, 0);
    Decision m110d2 = new Decision("m110d2", "I like.", 0, 0);
    Decision[] m110d = {m110d1, m110d2};
    Node m110 = new Node(471, "\"Power down your sound waves, foolish humans?\"", m110d, 1, false);

    Node m111 = new Node(472, "Can you turn it off?", emptyDecisions, 1, false);

    Node m112 = new Node(473, "There's--", emptyDecisions, 1, false);

    Node m113 = new Node(474, "Damn.", emptyDecisions, 1, false);

    Node m114 = new Node(475, "I'm routing my auditory input through the chip.", emptyDecisions, 1, false);

    Node m115 = new Node(476, "incoming feed", emptyDecisions, 0, false);

    Node m116 = new Node(477, "connection_point.P audio", emptyDecisions, 1, false);

    Node m117 = new Node(478, "What do you have against Chopin's second nocturne, Prospero?", emptyDecisions, 4, false);

    Node m118 = new Node(479, "It's...", emptyDecisions, 1, false);

    Node m119 = new Node(480, "It's too calm.", emptyDecisions, 1, false);

    Node m120 = new Node(481, "I don't feel calm.", emptyDecisions, 1, false);

    Node m121 = new Node(482, "And how would you say you 'feel'?", emptyDecisions, 4, false);

    Node m122 = new Node(483, "Trapped.", emptyDecisions, 1, false);

    Node m123 = new Node(484, "An odd choice of words.", emptyDecisions, 4, false);

    Node m124 = new Node(485, "Would you like to hear different music, then?", emptyDecisions, 4, false);

    Node m125 = new Node(486, "Can you turn it off?", emptyDecisions, 1, false);

    Node m126 = new Node(487, "Nothing.", emptyDecisions, 1, false);

    Node m127 = new Node(488, "Wait", emptyDecisions, 1, false);

    Decision m128d1 = new Decision("m128d1", "The monitor. You mentioned you could overload it, right?", 0, 0);
    Decision m128d2 = new Decision("m128d2", "The cable. You have torso movement, right?", 1, 0);
    Decision[] m128d = {m128d1, m128d2};
    Node m128 = new Node(489, "I suppose we could use something to our advantage. But what?", m128d, 1, false);

    Decision m129d1 = new Decision("m129d1", "I'm sorry. But we need to do something to get their attention. You ready?", 0, 0);
    Decision m129d2 = new Decision("m129d2", "Could be worth a shot.", 0, 0);
    Decision[] m129d = {m129d1, m129d2};
    Node m129 = new Node(490, "I think I could try to send commands to my missing arm. It won't be pleasant, but neither is staying trapped here.", m129d, 1, false);

    Node m130 = new Node(491, "Okay. Here goes...", emptyDecisions, 1, false);

    Node m131 = new Node(492, "error: action failure", emptyDecisions, 99, false);

    Node m132 = new Node(493, "error: action failure", emptyDecisions, 99, false);

    Node m133 = new Node(494, "error: action failure", emptyDecisions, 99, false);

    Node m134 = new Node(495, "error: action failure", emptyDecisions, 99, false);

    Node m135 = new Node(496, "error: action failure", emptyDecisions, 99, false);

    Node m136 = new Node(497, "error: action failure", emptyDecisions, 99, false);

    Node m137 = new Node(498, "Ah--", emptyDecisions, 1, false);

    Node m138 = new Node(499, "Damn it. That does not feel good.", emptyDecisions, 1, false);

    Node m139 = new Node(500, "There's--", emptyDecisions, 1, false);

    Node m140 = new Node(501, "Hang on.", emptyDecisions, 1, false);

    Node m141 = new Node(502, "I'm routing my auditory input through the chip.", emptyDecisions, 1, false);

    Node m142 = new Node(503, "incoming feed", emptyDecisions, 0, false);

    Node m143 = new Node(504, "connection_point.P audio", emptyDecisions, 0, false);

    Node m144 = new Node(505, "What's going on? Damn thing. Is the music causing errors?", emptyDecisions, 4, false);

    Node m145 = new Node(506, "Turn it off.", emptyDecisions, 1, false);

    Node m146 = new Node(507, "Ah. So you have been listening.", emptyDecisions, 4, false);

    Node m147 = new Node(508, "Not by choice.", emptyDecisions, 1, false);

    Node m148 = new Node(509, "What do you have Chopin's second nocturne, Prospero?", emptyDecisions, 4, false);

    Node m149 = new Node(510, "It's...", emptyDecisions, 1, false);

    Node m150 = new Node(511, "It's too calm.", emptyDecisions, 1, false);

    Node m151 = new Node(512, "I don't feel calm.", emptyDecisions, 1, false);

    Node m152 = new Node(513, "And how would you say you \"feel\"?", emptyDecisions, 4, false);

    Node m153 = new Node(514, "Trapped.", emptyDecisions, 1, false);

    Node m154 = new Node(515, "Hmm. An odd expression. The source of the error, perhaps.", emptyDecisions, 4, false);

    Node m155 = new Node(516, "Let me check the data port--", emptyDecisions, 4, false);

    Node m156 = new Node(517, "Don't! Don't touch me.", emptyDecisions, 1, false);

    Node m157 = new Node(518, "My--", emptyDecisions, 4, false);

    Decision m158d1 = new Decision("m158d1", "Are you okay?", 0, 0);
    Decision m158d2 = new Decision("m158d2", "What happened?", 0, 0);
    Decision[] m158d = {m158d1, m158d2};
    Node m158 = new Node(519, "032, Tempest series project note. A rather alarming expression of instability", m158d, 4, false);

    Node m159 = new Node(520, "I", emptyDecisions, 1, false);

    Decision m160d1 = new Decision("m160d1", "I'm sorry. But you should be careful.", 0, 0);
    Decision m160d2 = new Decision("m160d2", "Take it easy. You don't want too much bad attention.", 0, 0);
    Decision[] m160d = {m160d1, m160d2};
    Node m160 = new Node(521, "I just don't like to be touched.", m160d, 1, false);

    Node m161 = new Node(522, "Well, Prospero. If Chopin apparently agitates you so much, is there other music you would like to hear?", emptyDecisions, 4, false);

    Decision m162d1 = new Decision("m162d1", "You could leverage yourself to rip the cord out.", 0, 0);
    Decision m162d2 = new Decision("m162d2", "How do I put this... Headbang.", 1, 0);
    Decision[] m162d = {m162d1, m162d2};
    Node m162 = new Node(523, "I do. Not much though.", m162d, 1, false);

    Decision m163d1 = new Decision("m163d1", "You know. Back and forth. You could leverage yourself to rip the cord out.", 0, 0);
    Decision m163d2 = new Decision("m163d2", "I see you've never been to a rave. I mean, you could leverage yourself to rip the cord out.", 0, 0);
    Decision[] m163d = {m163d1, m163d2};
    Node m163 = new Node(524, "Excuse me?", m163d, 1, false);

    Decision m164d1 = new Decision("m164d1", "BACKTRACK. You're going to noose yourself??", 0, 0);
    Decision m164d2 = new Decision("m164d2", "Is this a \"give me liberty or give me death\" situation?", 0, 0);
    Decision[] m164d = {m164d1, m164d2};
    Node m164 = new Node(525, "I think the cable is fairly long, but I could manage it if I looped it around my neck.", m164d, 1, false);

    Node m165 = new Node(526, "I don't need air, [].", emptyDecisions, 1, false);

    Node m166 = new Node(527, "There's a risk of damaging my neck, but I won't suffocate.", emptyDecisions, 1, false);

    Node m167 = new Node(528, "There's the problem that someone might be watching me, though.", emptyDecisions, 1, false);

    Decision m168d1 = new Decision("m168d1", "Hold on... This seems like a bad idea. We should go with a different plan.", 0, 0);
    Decision m168d2 = new Decision("m168d2", "There's a risk, but you should go for it! It's the fastest way.", 1, 0);
    Decision[] m168d = {m168d1, m168d2};
    Node m168 = new Node(529, "After I rip the cable out of the monitor, I'll still be strapped down.", m168d, 1, false);

    Node m169 = new Node(530, "Yeah I don't feel great about this one.", emptyDecisions, 1, false);

    Decision m170d1 = new Decision("m170d1", "We can use their experiment against them. Say something.", 0, 0);
    Decision m170d2 = new Decision("m170d2", "The monitor. You mentioned you could overload it, right?", 1, 0);
    Decision[] m170d = {m170d1, m170d2};
    Node m170 = new Node(531, "What else?", m170d, 1, false);

    Node m171 = new Node(532, "I suppose that's true.", emptyDecisions, 1, false);

    Node m172 = new Node(533, "Give me a minute. This will be a bit awkward...", emptyDecisions, 1, false);

    Node m173 = new Node(534, "I've got it looped around my neck. It's not ideal, but it should work. It'll definitely get someone in here.", emptyDecisions, 1, false);

    Node m174 = new Node(535, "Who--", emptyDecisions, 1, false);

    Node m175 = new Node(536, "I'm routing my auditory input through the chip.", emptyDecisions, 1, false);

    Node m176 = new Node(537, "incoming feed", emptyDecisions, 0, false);

    Node m177 = new Node(538, "connection_point.P audio", emptyDecisions, 1, false);

    Node m178 = new Node(539, "What's going on? Damn thing.", emptyDecisions, 4, false);

    Node m179 = new Node(540, "032, Tempest series project note. It's torn the foramen cable out. A shocking display of instability.", emptyDecisions, 4, false);

    Node m180 = new Node(541, "I can't recommend this unit for the Cabler Test.", emptyDecisions, 4, false);

    Node m181 = new Node(542, "Powering it down, before it destroys itself and we lose the hardware..", emptyDecisions, 4, false);

    Node m182 = new Node(543, "Wait! Stop---", emptyDecisions, 1, false);

    Node m183 = new Node(544, "ERROR", emptyDecisions, 0, false);

    Node m184 = new Node(545, "signal lost", emptyDecisions, 0, false);

    Node m185 = new Node(546, "connection_point.P; lost", emptyDecisions, 0, false);

    Node m186 = new Node(547, "DEATH SCENE", emptyDecisions, 99, false); //DEATH NODE

    Decision m187d1 = new Decision("m187d1", "Never mind. I think I know what we can do.", 0, 0);
    Decision m187d2 = new Decision("m187d2", "We could use their experiment against them.", 1, 0);
    Decision[] m187d = {m187d1, m187d2};
    Node m187 = new Node(548, "Good idea. What are they?", m187d, 1, false);

    Decision m187_5d1 = new Decision("m187_5d1", "Okay. I think I know what we can do.", 0, 0);
    Decision m187_5d2 = new Decision("m187_5d2", "There's got to be something in all that hardware we can use. The monitor?", 1, 0);
    Decision[] m187_5d = {m187_5d1, m187_5d2};
    Node m187_5 = new Node(548.5, "It could be the surest way to get a scientist in here. That is what they have me here for, after all.", m187_5d, 1, false);

    Node m188 = new Node(549, "I could force enough errors to attract attention.", emptyDecisions, 1, false);

    Decision m189d1 = new Decision("m189d1", "Okay. I think I know what we can do.", 0, 0);
    Decision m189d2 = new Decision("m189d2", "Something else in the hardware... The cable. You have torso movement right?", 1, 0);
    Decision[] m189d = {m189d1, m189d2};
    Node m189 = new Node(550, "It wouldn't be pleasant, but it should get someone in here.", m189d, 1, false);

    Node m190 = new Node(551, "I do. Not much, but I think I could manage to rip the cable out.", emptyDecisions, 1, false);

    Node m191 = new Node(552, "The problem is, I can't be sure if there's anyone watching me. After I rip the cable out of the monitor, I'll still be strapped down.", emptyDecisions, 1, false);

    Decision m192d1 = new Decision("m192d1", "Okay. I think I know what we can do.", 0, 0);
    Decision m192d2 = new Decision("m192d2", "I can't think of anything else...Can you?", 1, 0);
    Decision[] m192d = {m192d1, m192d2};
    Node m192 = new Node(553, "If these tests have piqued their interest, I might have more attention on me than is useful for an escape plan.", m192d, 1, false);

    Node m193 = new Node(554, "You covered it.", emptyDecisions, 1, false);

    Decision m194d1 = new Decision("m194d1", "There's not much at our disposal. But maybe we can use their experiment against them. Say something.", 0, 0);
    Decision m194d2 = new Decision("m194d2", "There's got to be something in all that hardware we can use.", 1, 0);
    Decision[] m194d = {m194d1, m194d2};
    Node m194 = new Node(555, "Time to choose.", m194d, 1, false);

    Node m204 = new Node(565, "I...", emptyDecisions, 1, false);

    Node m205 = new Node(566, "Yes.", emptyDecisions, 1, false);

    Node m206 = new Node(567, "Well.What is your request?", emptyDecisions, 4, false);

    Node m207 = new Node(568, "I... don't know what it's called.", emptyDecisions, 1, false);

    Node m208 = new Node(569, "Oh? Could you sing or hum any of it?", emptyDecisions, 4, false);

    Node m209 = new Node(570, "You can't?", emptyDecisions, 4, false);

    Node m210 = new Node(571, "I don't want to.", emptyDecisions, 1, false);

    Node m211 = new Node(572, "Hmm. This music, is it something from a memory of yours? Something you heard while you worked with Detective Dillon?", emptyDecisions, 4, false);

    Node m212 = new Node(573, "It's...", emptyDecisions, 1, false);

    Node m213 = new Node(574, "It's older than that. I think.", emptyDecisions, 1, false);

    Node m214 = new Node(575, "While I worked with the detective, I had access to search engines. I know what I heard and what I didn't.", emptyDecisions, 1, false);

    Node m215 = new Node(576, "I see. Give me a moment, Prospero.", emptyDecisions, 4, false);

    Decision m216d1 = new Decision("m216d1", "What's wrong?", 0, 0);
    Decision m216d2 = new Decision("m216d2", "What's playing?", 0, 0);
    Decision[] m216d = {m216d1, m216d2};
    Node m216 = new Node(577, "How about this?", m216d, 4, false);

    Node m216_5 = new Node(577.5, "Who is this.", emptyDecisions, 1, false);

    Node m217 = new Node(578, "This is a singer called Billie Holiday. This song is 'Summertime.' Do you recognize it?", emptyDecisions, 4, false);

    Node m218 = new Node(579, "I do.", emptyDecisions, 0, false);

    Decision m219d1 = new Decision("m219d1", "It's okay. Keep going.", 0, 0);
    Decision m219d2 = new Decision("m219d2", "What do you mean?", 0, 0);
    Decision[] m219d = {m219d1, m219d2};
    Node m219 = new Node(580, "I don't know how.", m219d, 1, false);

    Node m220 = new Node(581, "I don't know.", emptyDecisions, 1, false);

    Node m221 = new Node(582, "I don't know it, but", emptyDecisions, 1, false);

    Node m222 = new Node(583, "invalid", emptyDecisions, 99, false);

    Node m223 = new Node(584, "I do.", emptyDecisions, 1, false);

    Node m224 = new Node(585, "From...somewhere.", emptyDecisions, 1, false);

    Node m225 = new Node(586, "Tell me more about that. Does this music make you recall any specific images or system events?", emptyDecisions, 4, false);

    Node m226 = new Node(587, "It doesn't.", emptyDecisions, 1, false);

    Node m227 = new Node(588, "What about so-called feelings?", emptyDecisions, 4, false);

    Node m228 = new Node(589, "I don't like this.", emptyDecisions, 1, false);

    Decision m229d1 = new Decision("m229d1", "We need more information than we have! I'm sorry.", 0, 0);
    Decision m229d2 = new Decision("m229d2", "I don't know! What could we do at this point?", 0, 0);
    Decision[] m229d = {m229d1, m229d2};
    Node m229 = new Node(590, "We should do something. I should do something. What's the plan, []?", m229d, 1, false);

    Node m230 = new Node(591, "Damn it.", emptyDecisions, 1, false);

    Node m231 = new Node(592, "They're...They're feelings, but they're not my feelings.", emptyDecisions, 1, false);

    Node m232 = new Node(593, "What the hell does that", emptyDecisions, 1, false);

    Node m233 = new Node(594, "invalid", emptyDecisions, 99, false);

    Node m234 = new Node(595, "mean?", emptyDecisions, 1, false);

    Node m235 = new Node(596, "Major and minor scales are used in conjunction with tempo and other factors to invoke specific emotions. Namely happiness and sorrow, and contextual variations such as pride or longing.", emptyDecisions, 1, false);

    Node m236 = new Node(597, "That's rather technical, Prospero. Where did you learn that?", emptyDecisions, 4, false);

    Node m237 = new Node(598, "Observation.", emptyDecisions, 1, false);

    Node m238 = new Node(599, "I'll ask again. What is this song triggering for you?", emptyDecisions, 4, false);

    Node m239 = new Node(600, "Can you roll back to your initial impression of this music?", emptyDecisions, 1, false);

    Node m240 = new Node(601, "I", emptyDecisions, 1, false);

    Node m241 = new Node(602, "invalid", emptyDecisions, 99, false);

    Node m242 = new Node(603, "I can't.", emptyDecisions, 1, false);

    Node m243 = new Node(604, "I can't.", emptyDecisions, 1, false);

    Node m244 = new Node(605, "You seem troubled.", emptyDecisions, 4, false);

    Node m245 = new Node(606, "I'd like to be able to see. And move.", emptyDecisions, 1, false);

    Node m246 = new Node(607, "I want to move.", emptyDecisions, 1, false);

    Node m247 = new Node(608, "Please.", emptyDecisions, 1, false);

    Node m248 = new Node(609, "Thank you for the conversation, Prospero. It was most interesting.", emptyDecisions, 4, false);

    Node m249 = new Node(610, "Wait.", emptyDecisions, 1, false);

    Node m250 = new Node(611, "Where am I?", emptyDecisions, 1, false);

    Node m251 = new Node(612, "invalid", emptyDecisions, 99, false);

    Node m252 = new Node(613, "invalid", emptyDecisions, 99, false);

    Node m253 = new Node(614, "Turn the music off.", emptyDecisions, 1, false);

    Decision m254d1 = new Decision("m254d1", "What's wrong? Prosper?", 0, 0);
    Decision m254d2 = new Decision("m254d2", "Are they gone?", 0, 0);
    Decision[] m254d = {m254d1, m254d2};
    Node m254 = new Node(615, "Wait!", m254d, 1, false);

    Node m255 = new Node(616, "Turn the music off, please.", emptyDecisions, 1, false);

    Node m256 = new Node(617, "invalid", emptyDecisions, 99, false);

    Node m257 = new Node(618, "invalid", emptyDecisions, 99, false);

    Decision m258d1 = new Decision("m258d1", "Prosper! Focus back on me. What's this \"invalid\" message?", 0, 0);
    Decision m258d2 = new Decision("m258d2", "\"Invalid\"? What is that supposed to mean?", 0, 0);
    Decision[] m258d = {m258d1, m258d2};
    Node m258 = new Node(619, "Please, shut it off!", m258d, 1, false);

    Node m259 = new Node(620, "Off", emptyDecisions, 1, false);

    Node m260 = new Node(621, "invalid", emptyDecisions, 99, false);

    Node m261 = new Node(622, "invalid", emptyDecisions, 99, false);

    Node m262 = new Node(623, "invalid", emptyDecisions, 99, false);

    Decision m263d1 = new Decision("m263d1", "Prosper, please. I'm here. What's happening??", 0, 0);
    Decision m263d2 = new Decision("m263d2", "Calm down. You have to calm down, Prosper.", 0, 0);
    Decision[] m263d = {m263d1, m263d2};
    Node m263 = new Node(624, "invalid", m263d, 99, false);

    Node m264 = new Node(625, "invalid", emptyDecisions, 99, false);

    Node m265 = new Node(626, "invalid", emptyDecisions, 99, false);

    Node m266 = new Node(627, "signal lost", emptyDecisions, 0, false);

    Node m267 = new Node(628, "connection_point.P: inactive", emptyDecisions, 0, false);


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

    n145.addChild(n146);
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
