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

    Node m268 = new Node(628, "pinging...", emptyDecisions, 0, false);

    Node m269 = new Node(629, "acquired connection_point.P", emptyDecisions, 0, false);

    Decision m270d1 = new Decision("m270d1", "You're back! Are you okay?", 0, 0);
    Decision m270d2 = new Decision("m270d2", "Prosper? What's going on?", 0, 0);
    Decision[] m270d = {m270d1, m270d2};
    Node m270 = new Node(630, "connection_point.P: active", m270d, 1, false);

    Decision m271d1 = new Decision("m271d1", "Oh, no. What happened? The connection failed after a long list of \"invalid\" messages.", 0, 0);
    Decision m271d2 = new Decision("m271d2", "Been there. I didn't black out after a long list of \"invalid\" messages, though.", 0, 0);
    Decision[] m271d = {m271d1, m271d2};
    Node m271 = new Node(631, "I think you could compare it to a hangover.", m271d, 1, false);

    Node m272 = new Node(632, "My processor malfunctioned. Overheated.", emptyDecisions, 1, false);

    Node m273 = new Node(633, "I went offline automatically to preserve hardware.", emptyDecisions, 1, false);

    Node m274 = new Node(634, "That music...", emptyDecisions, 1, false);

    Node m275 = new Node(635, "It was awful.", emptyDecisions, 1, false);

    Decision m276d1 = new Decision("m276d1", "To be fair, Billie Holiday isn't bad.", 0, 0);
    Decision m276d2 = new Decision("m276d2", "Eesh. Remind me not to take you to any concerts.", 0, 0);
    Decision[] m276d = {m276d1, m276d2};
    Node m276 = new Node(636, "I hated it.", m276d, 1, false);

    Node m277 = new Node(637, "It wasn't the sound. It was the data.", emptyDecisions, 1, false);

    Node m278 = new Node(638, "It registered with something", emptyDecisions, 1, false);

    Node m279 = new Node(639, "---a memory, I suppose---", emptyDecisions, 1, false);

    Decision m280d1 = new Decision("m280d1", "Don't remember? I mean, you're the android here, but is that possible?", 0, 0);
    Decision m280d2 = new Decision("m280d2", "I thought you had a computer brain. How is that possible?", 0, 0);
    Decision[] m280d = {m280d1, m280d2};
    Node m280 = new Node(640, "that I don't remember obtaining.", m280d, 1, false);

    Node m281 = new Node(641, "Exactly. It shouldn't be.", emptyDecisions, 1, false);

    Node m282 = new Node(642, "Every moment I've consciously experienced is catalogued and timestamped, with local time or its point on my lifespan.", emptyDecisions, 1, false);

    Decision m283d1 = new Decision("m283d1", "What if you were partially unconscious? Maybe auditory was online, but the rest of you wasn't.", 0, 0);
    Decision m283d2 = new Decision("m283d2", "Maybe it's a fragment from expunged data.", 0, 0);
    Decision[] m283d = {m283d1, m283d2};
    Node m283 = new Node(643, "I should remember where I heard that music.", m283d, 1, false);

    Node m284 = new Node(644, "No, like", emptyDecisions, 1, false);

    Node m285 = new Node(645, "invalid", emptyDecisions, 0, false);

    Node m286 = new Node(646, "They've never cleared my memory caches. I would", emptyDecisions, 1, false);

    Node m287 = new Node(647, "invalid", emptyDecisions, 0, false);

    Node m288 = new Node(648, "I would know. I would have gaps in my lifespan record.", emptyDecisions, 1, false);

    Node m288_1 = new Node(648.1, "It's there, but with no point of", emptyDecisions, 1, false);

    Node m288_2 = new Node(648.2, "invalid", emptyDecisions, 0, false);

    Decision m289d1 = new Decision("m289d1", "Hey, stay calm. Data with no point of origin...", 0, 0);
    Decision m289d2 = new Decision("m289d2", "Take it easy! Don't overheat again. Data with no point of origin...", 0, 0);
    Decision[] m289d = {m289d1, m289d2};
    Node m289 = new Node(649, "no point of origin.", m289d, 1, false);

    Decision m290d1 = new Decision("m290d1", "t's like a nervous stutter. You're stuttering.", 0, 0);
    Decision m290d2 = new Decision("m290d2", "What's going on? How can we fix it?", 0, 0);
    Decision[] m290d = {m290d1, m290d2};
    Node m290 = new Node(650, "invalid", m290d, 1, false);

    Node m291 = new Node(651, "I don't under", emptyDecisions, 1, false);

    Decision m292d1 = new Decision("m292d1", "Prosper, listen. Give it a negative timestamp. The origin of the Holiday music. Timestamp it with -01.00.", 0, 0);
    Decision m292d2 = new Decision("m292d2", "Prosper, listen. Or, uh, take a command. exe. style. You have to ignore it.", 1, 0);
    Decision[] m292d = {m292d1, m292d2};
    Node m292 = new Node(652, "invalid", m292d, 1, false);

    Node m293 = new Node(653, "Okay.", emptyDecisions, 1, false);

    Node m294 = new Node(654, "Okay.", emptyDecisions, 1, false);

    Node m295 = new Node(655, "I think...", emptyDecisions, 1, false);

    Decision m296d1 = new Decision("m296d1", "There. All data in its place. Are you all right?", 0, 0);
    Decision m296d2 = new Decision("m296d2", "There. Data sorted. Better?", 0, 0);
    Decision[] m296d = {m296d1, m296d2};
    Node m296 = new Node(656, "I think that helps.", m296d, 1, false);

    Node m297 = new Node(657, "I don't know", emptyDecisions, 1, false);

    Node m298 = new Node(658, "invalid", emptyDecisions, 1, false);

    Node m299 = new Node(659, "invalid", emptyDecisions, 1, false);

    Decision m300d1 = new Decision("m300d1", "Prosper, listen. Give it a negative timestamp. The origin of the Holiday music. Timestamp it with -01.00.", 0, 0);
    Decision m300d2 = new Decision("m300d2", "Prosper, listen. Or, uh, take a command. exe. style. You have to ignore it.", 0, 0);
    Decision[] m300d = {m300d1, m300d2};
    Node m300 = new Node(660, "invalid", m300d, 1, false);

    Node m301 = new Node(661, "Okay.", emptyDecisions, 1, false);

    Node m302 = new Node(662, "I'm trying, I", emptyDecisions, 1, false);

    Decision m303d1 = new Decision("m303d1", "There. It's behind us. Are you all right?", 0, 0);
    Decision m303d2 = new Decision("m303d2", "There. Moving right along. Better?", 0, 0);
    Decision[] m303d = {m303d1, m303d2};
    Node m303 = new Node(663, "Okay.", m303d, 1, false);

    Node m304 = new Node(664, "They moved me.", emptyDecisions, 1, false);

    Node m305 = new Node(665, "This is a different room than before.", emptyDecisions, 1, false);

    Decision m306d1 = new Decision("m306d1", "That's good. What about movement?", 0, 0);
    Decision m306d2 = new Decision("m306d2", "Good. Are you still strapped down?", 0, 0);
    Decision[] m306d = {m306d1, m306d2};
    Node m306 = new Node(666, "My sensors are all back online.", m306d, 1, false);

    Node m307 = new Node(667, "I'm in a chair. Restrained at the ankles and wrist.", emptyDecisions, 1, false);

    Decision m308d1 = new Decision("m308d1", "Goal 1, check, I suppose. Why move you, though?", 0, 0);
    Decision m308d2 = new Decision("m308d2", "Okay... Why move you, though?", 0, 0);
    Decision[] m308d = {m308d1, m308d2};
    Node m308 = new Node(668, "At least it's not a workshop table.", m308d, 1, false);

    Node m309 = new Node(669, "Perhaps the conversation invited more careful study.", emptyDecisions, 1, false);

    Decision m310d1 = new Decision("m310d1", "So we might be dealing with more scientists. Anything else about the room?", 0, 0);
    Decision m310d2 = new Decision("m310d2", "Good thing you were named after an enchanter. We'll vanish you, yet.", 1, 0);
    Decision[] m310d = {m310d1, m310d2};
    Node m310 = new Node(670, "I may have made myself more interesting. Might be a bad thing, considering I'm trying to disappear.", m310d, 1, false);

    Node m310_5 = new Node(670.5, "I don't see how, considering the room I'm in.", emptyDecisions, 1, false);

    Node m311 = new Node(671, "Two-way mirror. Two camera in opposite corners. Lights above me.", emptyDecisions, 1, false);

    Node m312 = new Node(672, "There's another chair across from me.", emptyDecisions, 1, false);

    Node m313 = new Node(673, "I know an interrogation room when I see one.", emptyDecisions, 1, false);

    Node m314 = new Node(674, "Reinforced door. Locks look electric.", emptyDecisions, 1, false);

    Node m315 = new Node(675, "The cable is still attached, but it's shorter.", emptyDecisions, 1, false);

    Decision m316d1 = new Decision("m316d1", "You know, these TURing guys could do us a favor and leave more useful stuff lying around. We could definitely use a crowbar right about now.", 0, 0);
    Decision m316d2 = new Decision("m316d2", "Not much in the way of loot. Not much as a handy crowbar.", 0, 0);
    Decision[] m316d = {m316d1, m316d2};
    Node m316 = new Node(676, "And...me.", m316d, 1, false);

    Node m317 = new Node(677, "signal detected", emptyDecisions, 0, false);

    Decision m318d1 = new Decision("m318d1", "Whoa--something just popped up on my end.", 0, 0);
    Decision m318d2 = new Decision("m318d2", "Or...how about an e-crowbar?", 0, 0);
    Decision[] m318d = {m318d1, m318d2};
    Node m318 = new Node(678, "data port: foramen magnum", m318d, 1, false);

    Decision m319d1 = new Decision("m319d1", "It's some sort of data signal. A two-way connection through that cable, I think. I might be able to pull their data.", 0, 0);
    Decision m319d2 = new Decision("m319d2", "That cable connection is different. Namely, it's playing nice with the communicator chip. I think I could pull their data.", 0, 0);
    Decision[] m319d = {m319d1, m319d2};
    Node m319 = new Node(679, "Now is not the time for dramatic pauses, [].", m319d, 1, false);

    Node m320 = new Node(680, "That could be huge... Gain an edge against TUR, for once.", emptyDecisions, 1, false);

    Decision m321d1 = new Decision("m321d1", "I can't tell. It's a bit suspicious, I suppose.", 0, 0);
    Decision m321d2 = new Decision("m321d2", "Not sure. It's a new accessible connection point. Here goes...", 0, 0);
    Decision[] m321d = {m321d1, m321d2};
    Node m321 = new Node(681, "What kind of data?", m321d, 1, false);

    Node m322 = new Node(682, "Wait.", emptyDecisions, 1, false);

    Node m323 = new Node(683, "", emptyDecisions, 1, false);

    Node m324 = new Node(684, "It could be a virus. I just lost a lot of time. As far as I know, they figured out my chip and hacked your interface.", emptyDecisions, 1, false);

    Node m325 = new Node(685, "", emptyDecisions, 1, false);

    Node m326 = new Node(686, "", emptyDecisions, 1, false);

    Node m327 = new Node(687, "", emptyDecisions, 1, false);

    Node m328 = new Node(688, "", emptyDecisions, 1, false);

    Node m329 = new Node(689, "", emptyDecisions, 1, false);

    Node m330 = new Node(690, "", emptyDecisions, 1, false);

    Node m331 = new Node(691, "", emptyDecisions, 1, false);

    Node m332 = new Node(692, "", emptyDecisions, 1, false);

    Node m333 = new Node(693, "Are we sure this is a good idea?", emptyDecisions, 1, false);

    Decision m334d1 = new Decision("m334d1", "I mean, it's possible. If you're not comfortable, I won't do it.\n", 0, 0);
    Decision m334d2 = new Decision("m334d2", "I think I would have seen a connection attempt, since that's pretty much all this thing is capable of. But do I have a degree in computer science? No.", 0, 0);
    Decision[] m334d = {m334d1, m334d2};
    Node m334 = new Node(694, "It could be a virus. I just lost a lot of time. As far as I know, they figured out my chip and hacked your interface.", m334d, 1, false);

    Node m335 = new Node(695, "We need all the information we can get.", emptyDecisions, 1, false);

    Decision m336d1 = new Decision("m336d1", "On it. T for TURing... Also hopefully for Tactical advantage...", 0, 0);
    Decision m336d2 = new Decision("m336d2", "Pulling. T for TURing... Hopefully not for Trojan virus...", 0, 0);
    Decision[] m336d = {m336d1, m336d2};
    Node m336 = new Node(696, "Pull it.", m336d, 1, false);

    Node m337 = new Node(697, "connection_point.T data", emptyDecisions, 0, false);

    Decision m338d1 = new Decision("m338d1", "Jackpot!", 0, 0);
    Decision m338d2 = new Decision("m338d2", "Whoa. Juicy files.", 1, 0);
    Decision[] m338d = {m338d1, m338d2};
    Node m338 = new Node(698, "status monitor \nexperiment log", m338d, 1, false);

    Node m339 = new Node(699, "Really?", emptyDecisions, 1, false);

    Decision m340d1 = new Decision("m340d1", "", 0, 0);
    Decision m340d2 = new Decision("m340d2", "", 0, 0);
    Decision[] m340d = {m340d1, m340d2};
    Node m340 = new Node(700, "I think I'm too accustomed 3 4 0 to bad news.", m340d, 1, false);

    Decision m341d1 = new Decision("m341d1", "", 0, 0);
    Decision m341d2 = new Decision("m341d2", "", 0, 0);
    Decision[] m341d = {m341d1, m341d2};
    Node m341 = new Node(701, "I object to that description. Please don't call anything \"juicy\" that you just redirected through my head.", m341d, 1, false);

    Node m342 = new Node(702, "status_monitor.txt\n flatsystem_processes: <>", emptyDecisions, 1, false);

    Node m343 = new Node(703, "Ah. In case you couldn't tell, I'm stressed.", emptyDecisions, 1, false);

    Decision m344d1 = new Decision("m344d1", "Helpful, though, to avoid another malfuction. Hey, what's a flatsystem?", 0, 0);
    Decision m344d2 = new Decision("m344d2", "Not to mention impolite. Hey, what's a flatsystem?", 0, 0);
    Decision[] m344d = {m344d1, m344d2};
    Node m344 = new Node(704, "Putting a term to it is somewhat off-putting.", m344d, 1, false);

    Node m345 = new Node(705, "Their term for my inner components. I think a good deal of them are circuitboards.", emptyDecisions, 1, false);

    Decision m346d1 = new Decision("m346d1", "No, that's it.", 0, 0);
    Decision m346d2 = new Decision("m346d2", "Yeah, an experiment log.", 1, 0);
    Decision[] m346d = {m346d1, m346d2};
    Node m346 = new Node(706, "Anything else?", m346d, 1, false);

    Node m347 = new Node(707, "It's fairly obvious from the set up. They want more tests.", emptyDecisions, 1, false);

    Decision m348d1 = new Decision("m348d1", "Maybe...what they want. For now.", 0, 0);
    Decision m348d2 = new Decision("m348d2", "Hell.", 1, 0);
    Decision[] m348d = {m348d1, m348d2};
    Node m348 = new Node(708, "What do I give them?", m348d, 1, false);

    Node m349 = new Node(709, "error: log encrypted", emptyDecisions, 0, false);

    Node m350 = new Node(710, "Damn it.", emptyDecisions, 1, false);

    Node m351 = new Node(711, "", emptyDecisions, 1, false);

    Node m352 = new Node(712, "error: log encrypted", emptyDecisions, 0, false);

    Node m353 = new Node(713, "Damn it.", emptyDecisions, 1, false);

    Node m354 = new Node(714, "I made a bit of scene in the workshop. They must have buckled down on security.", emptyDecisions, 1, false);

    Decision m355d1 = new Decision("m355d1", "Yeah, a status monitor.", 0, 0);
    Decision m355d2 = new Decision("m355d2", "We can try the status monitor.", 0, 0);
    Decision[] m355d = {m355d1, m355d2};
    Node m355 = new Node(715, "Anything else?", emptyDecisions, 1, false);

    Node m356 = new Node(716, "experiment_log.txt", emptyDecisions, 1, false);

    Node m357 = new Node(717, "FILL IN EXPERIMENT LOG (COPY/PASTE FROM LUCID CHARTS LATER)", emptyDecisions, 1, false); //TODO: Fill in experiment log

    Node m358 = new Node(718, "This is a lot to take in.", emptyDecisions, 1, false);

    Decision m359d1 = new Decision("m359d1", "Right. We'll get to the bottom of it.", 0, 0);
    Decision m359d2 = new Decision("m359d2", "I would also like to nominate \"412 music collection\" and \"unapproved code\" for the list.\n", 0, 0);
    Decision[] m359d = {m359d1, m359d2};
    Node m359 = new Node(719, "Major concerns: Subject B, Cabler Test, stress levels.", m359d, 1, false);

    Node m360 = new Node(720, "[], I can't think about that right now.", emptyDecisions, 1, false);

    Node m361 = new Node(721, "They want more tests. They want more conversations.", emptyDecisions, 1, false);

    Decision m362d1 = new Decision("m362d1", "Maybe...what they want. For now.", 0, 0);
    Decision m362d2 = new Decision("m362d2", "Hell.", 1, 0);
    Decision[] m362d = {m362d1, m362d2};
    Node m362 = new Node(722, "What do I give them?", m362d, 1, false);

    Decision m363d1 = new Decision("m363d1", "What else can we do? It's the safest option.", 0, 0);
    Decision m363d2 = new Decision("m363d2", "What else can we do? We don't know where exactly you are, or what the situation is.", 0, 0);
    Decision[] m363d = {m363d1, m363d2};
    Node m363 = new Node(723, "I must admit, that's 363 not my first choice.", m363d, 1, false);

    Node m364 = new Node(724, "I suppose you're right.", emptyDecisions, 1, false);

    Node m365 = new Node(725, "It's still quiet. I'll let you know when something happens.", emptyDecisions, 1, false);

    Node m366 = new Node(726, "That's more like it.", emptyDecisions, 1, false);

    Node m367 = new Node(727, "It's still quiet. I'll let you know when something happens.", emptyDecisions, 1, false);

    Node m368 = new Node(728, "[].", emptyDecisions, 1, false);

    Node m369 = new Node(729, "Someone just entered the room.", emptyDecisions, 1, false);

    Node m370 = new Node(730, "connection_point.P audio", emptyDecisions, 0, false);

    Node m371 = new Node(731, "\"Hello, Prospero.\"", emptyDecisions, 4, false);

    Node m372 = new Node(732, "\"How nice to meet you.\"", emptyDecisions, 4, false);

    Node m373 = new Node(733, "It's someone different from yesterday. A woman.", emptyDecisions, 1, false);

    Node m374 = new Node(734, "\"Who are you?\"", emptyDecisions, 5, false);

    Node m375 = new Node(735, "\"I'm Carmen.\"", emptyDecisions, 4, false);

    Decision m376d1 = new Decision("m376d1", "No way. If they're going to interrogate you like a person, they better treat you like one.", 0, 0);
    Decision m376d2 = new Decision("m376d2", "You don't want to attract any negative attention...", 1, 0);
    Decision[] m376d = {m376d1, m376d2};
    Node m376 = new Node(736, "\"Can I call you 'Prospero'?\"", m376d, 4, false);

    Node m377 = new Node(737, "\"I prefer Prosper\"", emptyDecisions, 5, false);

    Node m378 = new Node(738, "\"What you went by in the field?\"", emptyDecisions, 4, false);

    Node m379 = new Node(739, "\"Prospero' is a bit much, isn't it?\"", emptyDecisions, 5, false);

    Node m380 = new Node(740, "\"All right. If you insist.\"", emptyDecisions, 4, false);

    Node m381 = new Node(741, "\"That is my unit dictation. So yes.\"", emptyDecisions, 5, false);

    Node m382 = new Node(742, "\"I'd like to have a chat if that would be all right with you.\"", emptyDecisions, 4, false);

    Node m383 = new Node(743, "Not particularly.", emptyDecisions, 1, false);

    Decision m384d1 = new Decision("m384d1", "Up to you. Catch more flies with honey and all that. Then again, you catch the most with shit.", 0, 0);
    Decision m384d2 = new Decision("m384d2", "No holds barred. Give them a piece of your mind.", 1, 0);
    Decision[] m384d = {m384d1, m384d2};
    Node m384 = new Node(744, "But what should I say?", m384d, 1, false);

    Node m385 = new Node(745, "I think I need time to process that analogy.", emptyDecisions, 1, false);

    Node m386 = new Node(746, "\"What about?\"", emptyDecisions, 5, false);

    Node m387 = new Node(747, "\"About you. You're the only android prototype that's seen the field. I'm curious about your experiences.\"", emptyDecisions, 4, false);

    Node m388 = new Node(748, "\"My entire lifespan is on record. What could I tell you that you couldn't look up yourself, or command me to report?\"", emptyDecisions, 5, false);

    Node m389 = new Node(749, "\"I could read facts and watch video of anyone's actions. It wouldn't tell me their internal perspective.\"", emptyDecisions, 4, false);

    Node m390 = new Node(750, "Bullshit.", emptyDecisions, 1, false);

    Node m391 = new Node(751, "Oh. I think I understand the analogy now.", emptyDecisions, 1, false);

    Node m392 = new Node(752, "\"What do you want to know?\"", emptyDecisions, 5, false);

    Node m393 = new Node(753, "\"Tell me what you enjoyed best about your time in the field.\"", emptyDecisions, 4, false);

    Node m394 = new Node(754, "\"The detective.\"", emptyDecisions, 5, false);

    Node m395 = new Node(755, "\"Can you expand on that?\"", emptyDecisions, 4, false);

    Node m396 = new Node(756, " \"The development of our partnership was unlike anything I had been prepared for. Never a dull moment, as she would say.\"", emptyDecisions, 5, false);

    Node m397 = new Node(757, "\"I see.\"", emptyDecisions, 4, false);

    Node m398 = new Node(758, "\"In general, did you prefer to be indoors or outdoors?\"", emptyDecisions, 4, false);

    Node m399 = new Node(759, "\"No preference.\"", emptyDecisions, 5, false);

    Node m400 = new Node(760, "\"Is there a reason for that?\"", emptyDecisions, 4, false);

    Node m401 = new Node(761, "\"No reason. Anywhere had the potential to be engaging.\"", emptyDecisions, 5, false);

    Node m402 = new Node(762, "\"What about yourself, Carmen?\"", emptyDecisions, 5, false);

    Node m403 = new Node(763, "\"Me? We're here to talk about you, Prosper[o].\"", emptyDecisions, 4, false);

    Node m404 = new Node(764, "\"That's how tests work. Not conversations.\"", emptyDecisions, 5, false);

    Node m405 = new Node(765, "\"Very well. I suppose I prefer the outdoors. I appreciate the chance to get some sun, smell the roses, when I can.\"", emptyDecisions, 4, false);

    Node m406 = new Node(766, "\"Do you have an opinion on particular plants or animals?\"", emptyDecisions, 4, false);

    Node m407 = new Node(767, "\"Everything serves its purpose. Like I do. Like the detective does. Like you do.\"", emptyDecisions, 5, false);

    Node m408 = new Node(768, "\"And you appreciate that?\"", emptyDecisions, 4, false);

    Node m409 = new Node(769, "\"I appreciate that it is orderly. That everything is engineered by its own design.\"", emptyDecisions, 5, false);

    Node m410 = new Node(770, "\"In particular, I like birds.\"", emptyDecisions, 5, false);

    Node m411 = new Node(771, "\"Birds?\"", emptyDecisions, 4, false);

    Node m412 = new Node(772, "\"Do you have pets, Carmen?\"", emptyDecisions, 5, false);

    Node m413 = new Node(773, "\"I...have a cat. Why does it interest you to know?\"", emptyDecisions, 4, false);

    Node m414 = new Node(774, "\"Why does it interest you to own a cat?\"", emptyDecisions, 5, false);

    Node m415 = new Node(775, " \"Hmm. You know, you've said that before.\"", emptyDecisions, 4, false);

    Node m416 = new Node(776, "\"During my Turing test. I recall. I recall everything.\"", emptyDecisions, 5, false);

    Node m417 = new Node(777, "\"No one ever answered that question for me.\"", emptyDecisions, 5, false);

    Node m418 = new Node(778, "\"Tell me, Prosper[o], what did you think of that experience? The Turing test?\"", emptyDecisions, 4, false);

    Node m419 = new Node(779, "\"I...\"", emptyDecisions, 5, false);

    Node m420 = new Node(780, "\"I found it strange. I spent the following nine hours processing the data.\"", emptyDecisions, 5, false);

    Node m421 = new Node(781, "\"Your cognizance has never been held up to a standard.\"", emptyDecisions, 5, false);

    Node m422 = new Node(782, "\"On the contrary, I believe education, work, and social life all accomplish the same task.\"", emptyDecisions, 4, false);

    Node m423 = new Node(783, "\"So. You think I simply took an alternate route than the learning curve all humans experience? To the same end?\"", emptyDecisions, 5, false);

    Node m424 = new Node(784, "\"I'm more interested to know what you think.\"", emptyDecisions, 4, false);

    Node m425 = new Node(785, "\"Perhaps.\"", emptyDecisions, 5, false);

    Node m426 = new Node(786, "\"You aren't sure?\"", emptyDecisions, 4, false);

    Node m427 = new Node(787, "\"Why am I here?\"", emptyDecisions, 5, false);

    Node m428 = new Node(788, "\"To talk. Are you uncomfortable with that?\"", emptyDecisions, 4, false);

    Decision m429d1 = new Decision("m429d1", "Whoa. Big spike in stress level. Hang in there.", 0, 0);
    Decision m429d2 = new Decision("m429d2", "Whoa. Big spike in stress level. Avoid that subject, maybe.", 0, 0);
    Decision[] m429d = {m429d1, m429d2};
    Node m429 = new Node(789, "\"I prefer freedom of movement. Don't you, Carmen?\"", m429d, 1, false);

    Node m430 = new Node(790, "\"I'm afraid there's nothing I can do about that.\"", emptyDecisions, 4, false);

    Node m431 = new Node(791, "\"Why am I called Prospero?\"", emptyDecisions, 5, false);

    Node m432 = new Node(792, "\"I couldn't tell you. Why do you ask?\"", emptyDecisions, 4, false);

    Node m433 = new Node(793, "\"To change the subject.\"", emptyDecisions, 5, false);

    Node m434 = new Node(794, "\"Hah. I'll bite. Change it to what?\"", emptyDecisions, 4, false);

    Node m435 = new Node(795, "\"Decisions were made regarding my appearance, voice, name, and so on. My habits were programmed. My thought processes are coded.\"", emptyDecisions, 5, false);

    Node m436 = new Node(796, "\"I would like to know the mind behind these decisions.\"", emptyDecisions, 5, false);

    Node m437 = new Node(797, "\"I see.\"", emptyDecisions, 4, false);

    Node m438 = new Node(798, "\"We're all coded, in a way. By DNA, or by our upbringing. By our surroundings.\"", emptyDecisions, 4, false);

    Node m439 = new Node(799, "\"Are you saying there isn't much difference between us, Carmen?\"", emptyDecisions, 5, false);

    Node m440 = new Node(800, "\"What do you think?\"", emptyDecisions, 4, false);

    Node m441 = new Node(801, "\"I think I'm bound to a chair. I think after this, I'll sit here until the next question is asked of my condition. My stability. My future.\"", emptyDecisions, 5, false);

    Node m442 = new Node(802, "\"I think you, Carmen, are here of your own volition. I think after this, you will resume your workday, and later go home. The only person privy to your condition, stability, and future is yourself.\"", emptyDecisions, 5, false);

    Node m443 = new Node(803, "\"Would you feel more comfortable if you weren't bound?\"", emptyDecisions, 4, false);

    Node m444 = new Node(804, "\"Yes.\"", emptyDecisions, 5, false);

    Node m445 = new Node(805, "\"What would you do if you weren't?\"", emptyDecisions, 4, false);

    Decision m446d1 = new Decision("m446d1", "They're searching for program issues. If this were my experiment, I would be eager to find the bug. You could give them one.", 0, 0);
    Decision m446d2 = new Decision("m446d2", "I'm not sure. Maybe they would buy an appeal from the heart?", 1, 0);
    Decision[] m446d = {m446d1, m446d2};
    Node m446 = new Node(806, "Do you have a believable lie in mind, []?", m446d, 1, false);

    Node m447 = new Node(807, "\"I would continue to comply.\"", emptyDecisions, 5, false);

    Node m448 = new Node(808, "\"My present condition limits my program. I'm coded for dozens of habitual motions, including pacing, adjusting clothes and hair, fidgeting, crossing arms, et cetera.\"", emptyDecisions, 5, false);

    Node m449 = new Node(809, "\"My inability to comply is clogging my processor with errors.\"", emptyDecisions, 5, false);

    Node m450 = new Node(810, "\"Is that right?\"", emptyDecisions, 4, false);

    Node m451 = new Node(811, "\"Well. I wouldn't want you to experience another malfunction, Prosper[o]. The restraints can be removed.\"", emptyDecisions, 4, false);

    Node m452 = new Node(812, "\"I would appreciate that.\"", emptyDecisions, 5, false);

    Node m453 = new Node(813, "Restraints are off.", emptyDecisions, 1, false);

    Decision m454d1 = new Decision("m454d1", "Now's your chance! Rush it!", 0, 0);
    Decision m454d2 = new Decision("m454d2", "As tempting as that is, it's too risky.", 1, 0);
    Decision[] m454d = {m454d1, m454d2};
    Node m454 = new Node(814, "I have to remain seated because of the cable, but I 454 have the mobility to pull it out. Provided they're slow on the kill code.", m454d, 1, false);

    Node m455 = new Node(815, "connection_point.T: lost", emptyDecisions, 0, false);

    Node m456 = new Node(816, "\"Damn it!\"", emptyDecisions, 4, false);

    Node m457 = new Node(817, "\"Stay back!\"", emptyDecisions, 4, false);

    Node m458 = new Node(818, "[] she has a gun.", emptyDecisions, 1, false);

    Decision m459d1 = new Decision("m459d1", "Listen to her.", 0, 0);
    Decision m459d2 = new Decision("m459d2", "You can't give up!", 1, 0);
    Decision[] m459d = {m459d1, m459d2};
    Node m459 = new Node(819, "\"Sit back down. Now.\"", m459d, 4, false);

    Node m460 = new Node(820, "\"Okay.\"", emptyDecisions, 4, false);

    Node m461 = new Node(821, "\"You're going to stay completely still while the restraints are replaced.\"", emptyDecisions, 4, false);

    Node m462 = new Node(822, "\"I know exactly where your weak points are. One move, one bullet. And that's all it will take.\"", emptyDecisions, 4, false);

    Node m463 = new Node(823, "Damn. That did not go well.", emptyDecisions, 1, false);

    Node m464 = new Node(824, "\"Prosper[o], I wish I could say this had been enlightening. Perhaps the Cabler test will be.\"", emptyDecisions, 4, false);

    Node m465 = new Node(825, "\"I'd like you to chat with a friend of mine now.\"", emptyDecisions, 4, false);

    Decision m466d1 = new Decision("m466d1", "Cabler test?", 0, 0);
    Decision m466d2 = new Decision("m466d2", "Good riddance, Carmen.", 0, 0);
    Decision[] m466d = {m466d1, m466d2};
    Node m466 = new Node(826, "\"We're going to switch places.\"", m466d, 1, false);

    Node m467 = new Node(827, "\"All I want--\"", emptyDecisions, 5, false);

    Node m468 = new Node(828, "WARNING: PROJECTILE DAMAGE", emptyDecisions, 0, false);

    Node m469 = new Node(829, "error: action failure", emptyDecisions, 0, false);

    Node m470 = new Node(830, "error: action failure", emptyDecisions, 0, false);

    Node m471 = new Node(831, "error: action failure", emptyDecisions, 0, false);

    Node m472 = new Node(832, "error: action failure", emptyDecisions, 0, false);

    Node m473 = new Node(833, "error: action failure", emptyDecisions, 0, false);

    Node m474 = new Node(834, "connection_point.P: 474 lost", emptyDecisions, 0, false);

    Node m475 = new Node(835, "DEATH", emptyDecisions, 0, false);

    Node m476 = new Node(836, "You're right. We need more of a plan before we move.", emptyDecisions, 1, false);

    Node m477 = new Node(837, "\"How is that, Prosper[o]?\"", emptyDecisions, 4, false);

    Node m478 = new Node(838, "\"Better. Thank you, Carmen.\"", emptyDecisions, 5, false);

    Node m479 = new Node(839, "Not for her, I don't think. She seems tense now.", emptyDecisions, 1, false);

    Node m480 = new Node(840, "I suspect she's armed, or that there is a kill code on standby.", emptyDecisions, 1, false);

    Node m481 = new Node(841, "\"Could you do something for me?\"", emptyDecisions, 4, false);

    Node m482 = new Node(842, "\"Most likely.\"", emptyDecisions, 5, false);

    Node m483 = new Node(843, "\"I'd like you to meet a friend of mine. You'd both be participating in what we're calling the Cabler Test.\"", emptyDecisions, 4, false);

    Node m484 = new Node(844, "More tests. Fantastic.", emptyDecisions, 1, false);

    Node m485 = new Node(845, "\"Yes, I could do that.\"", emptyDecisions, 5, false);

    //Node m486 = new Node(846, "", emptyDecisions, 4, false);

    Node m487 = new Node(847, "\"Wonderful. We're going to trade places.\"", emptyDecisions, 4, false);

    Node m488 = new Node(848, "\"Nothing.\"", emptyDecisions, 5, false);

    Node m489 = new Node(849, "\"I just need to know I'm not trapped here. That we're working together. Not against each other.\"", emptyDecisions, 5, false);

    Node m490 = new Node(850, "\"Interesting. I'm not sure that's how I would describe the situation, however.\"", emptyDecisions, 4, false);

    Node m491 = new Node(851, "\"I'm afraid you'll have to sit tight for the moment.\"", emptyDecisions, 4, false);

    Node m492 = new Node(852, "\"Carmen, please, you don't---\"", emptyDecisions, 5, false);

    Node m493 = new Node(853, "\"It's besides the point.\"", emptyDecisions, 4, false);

    Node m494 = new Node(854, "\"Prosper[o], as joyous as this conversation has been, we should be moving on to the Cabler test.\"", emptyDecisions, 4, false);

    Node m495 = new Node(855, "\"I'll bring a friend of mine in, and I'd like the two of you to talk. We'll trade places now.\"", emptyDecisions, 4, false);

    Node m496 = new Node(856, "\"No.\"", emptyDecisions, 5, false);

    Node m497 = new Node(857, "\"No? I must say, my feelings are hurt.\"", emptyDecisions, 4, false);

    Node m498 = new Node(858, "\"And I'm bound to a chair. I suppose we have hurt feelings in common.\"", emptyDecisions, 5, false);

    Node m499 = new Node(859, "\"Let's talk this through, then, shall we?\"", emptyDecisions, 4, false);

    Node m500 = new Node(860, "\"Or perhaps I shouldn't mince words. As you don't have a choice in the matter.\"", emptyDecisions, 4, false);

    Node m501 = new Node(861, "That's what I thought.", emptyDecisions, 1, false);

    Node m502 = new Node(862, "At least now we're both being honest.", emptyDecisions, 1, false);

    Node m503 = new Node(863, "\"What is it you want from me?\"", emptyDecisions, 5, false);

    Node m504 = new Node(864, "\"What do we want from you? Prosper[o], we made you. You?re broken. We are trying to locate the source of the problem.\"", emptyDecisions, 4, false);

    Node m505 = new Node(865, "\"I'm here to ask questions. You?re here to answer them.\"", emptyDecisions, 4, false);

    Node m506 = new Node(866, "\"If that doesn?t suit you, we can see what your hardware has to say for itself.\"", emptyDecisions, 4, false);

    Node m507 = new Node(867, "They", emptyDecisions, 1, false);

    Decision m508d1 = new Decision("m508d1", "Hey, we won't let them. Try to keep your cool.", 0, 0);
    Decision m508d2 = new Decision("m508d2", "Could they?", 0, 0);
    Decision[] m508d = {m508d1, m508d2};
    Node m508 = new Node(868, "They wouldn't.", m508d, 1, false);

    Node m509 = new Node(869, "\"What questions could you possible have?\"", emptyDecisions, 5, false);

    Node m510 = new Node(870, "\"My entire lifespan is on record. What could I tell you that you can?t look up yourself, or command me to report?\"", emptyDecisions, 5, false);

    Node m511 = new Node(871, "\"Well, I could read facts and watch video of anyone?s actions. Let's say I?m rather curious about your personal perspective, Prosper[o].\"", emptyDecisions, 4, false);

    Node m512 = new Node(872, "\"Because it's unexpected that I have one.\"", emptyDecisions, 5, false);

    Node m513 = new Node(873, "\"Justso.\"", emptyDecisions, 4, false);

    Node m514 = new Node(874, "\"Tell me, then. What did you enjoy best about your time in the field?\"", emptyDecisions, 4, false);

    Node m515 = new Node(875, "\"No one out there chained me to a chair.\"", emptyDecisions, 5, false);

    Node m516 = new Node(876, "\"I see. Is this going to be a common theme in our conversation?\"", emptyDecisions, 4, false);

    Node m517 = new Node(877, "\"Let's call it what it is, Carmen. An interrogation.\"", emptyDecisions, 5, false);

    Node m518 = new Node(878, "\"I'd call it an experiment.\"", emptyDecisions, 4, false);

    Decision m519d1 = new Decision("m519d1", "I don't know if you can. They seem pretty fond of their protocols here.", 0, 0);
    Decision m519d2 = new Decision("m519d2", "It seems like you're not a person to them. I think you have to make a \"hardware\" appeal.", 1, 0);
    Decision[] m519d = {m519d1, m519d2};
    Node m519 = new Node(879, "[], I need out. How do I convince her to let me out of this chair?", m519d, 1, false);

    Decision m520d1 = new Decision("m520d1", "I'm sorry. She might be rude, but maybe you can get her to empathize.", 0, 0);
    Decision m520d2 = new Decision("m520d2", "I know it's not. Look, you're not even a person to them. I think you have to make a \"hardware\" appeal.", 1, 0);
    Decision[] m520d = {m520d1, m520d2};
    Node m520 = new Node(880, "This isn't a damn joke.", m520d, 1, false);

    Node m521 = new Node(881, "\"You can't expect me to think straight like this. Pinned down, missing an arm...\"", emptyDecisions, 5, false);

    Node m522 = new Node(882, "\"Fuck.\"", emptyDecisions, 5, false);

    Node m523 = new Node(883, "\"My processor is going to burn straight through my head.\"", emptyDecisions, 5, false);

    Node m524 = new Node(884, "\"Is that so? Well, why don't I shut a few things down for you.\"", emptyDecisions, 4, false);

    Node m525 = new Node(885, "\"No, don't---\"", emptyDecisions, 5, false);

    Decision m526d1 = new Decision("m526d1", "Prosper? Are you okay??", 0, 0);
    Decision m526d2 = new Decision("m526d2", "Prosper? What's happening??", 0, 0);
    Decision[] m526d = {m526d1, m526d2};
    Node m526 = new Node(886, "invalid", m526d, 1, false);

    Node m527 = new Node(887, "She", emptyDecisions, 1, false);

    Node m528 = new Node(888, "They just clipped a lot of my functions", emptyDecisions, 1, false);

    Node m529 = new Node(889, "It's hard to...", emptyDecisions, 1, false);

    Node m530 = new Node(890, "invalid", emptyDecisions, 1, false);

    Node m531 = new Node(891, "I think I feel", emptyDecisions, 1, false);

    Decision m532d1 = new Decision("m532d1", "What did she turn off? Could you turn it back on?", 0, 0);
    Decision m532d2 = new Decision("m532d2", "Oh, no. Listen, it'll be okay. We'll work this out.", 1, 0);
    Decision[] m532d = {m532d1, m532d2};
    Node m532 = new Node(892, "sick.", m532d, 1, false);

    Node m533 = new Node(893, "No", emptyDecisions, 1, false);

    Node m534 = new Node(894, "Not like the comm chip", emptyDecisions, 1, false);

    Node m535 = new Node(895, "I don't", emptyDecisions, 1, false);

    Node m536 = new Node(896, "\"Hmm. At least you're more manageable like this.\"", emptyDecisions, 4, false);

    Node m537 = new Node(897, "\"What are you so determined to get back to, Prosper?\"", emptyDecisions, 4, false);

    Node m538 = new Node(898, "\"I\"", emptyDecisions, 5, false);

    Node m539 = new Node(899, "invalid", emptyDecisions, 1, false);

    Decision m540d1 = new Decision("m540d1", "Think, Prosper. Detective Dillon. Don't you want to get back to Dillon? To New York?", 0, 0);
    Decision m540d2 = new Decision("m540d2", "Focus! You're trying to get out of here. To Dillon, remember?", 0, 0);
    Decision[] m540d = {m540d1, m540d2};
    Node m540 = new Node(900, "\"I can't remember. Can't access.\"", m540d, 1, false);

    Node m541 = new Node(901, "That's right", emptyDecisions, 1, false);

    Node m542 = new Node(902, "\"The city. The birds. I'd like to get back to see\"", emptyDecisions, 5, false);

    Node m543 = new Node(903, "\"See what?\"", emptyDecisions, 4, false);

    Node m544 = new Node(904, "\"What it's like.\"", emptyDecisions, 5, false);

    Node m545 = new Node(905, "\"You know, you said something similar. During your Turing test.\"", emptyDecisions, 4, false);

    Node m546 = new Node(906, "\"Did I?\"", emptyDecisions, 5, false);

    Node m547 = new Node(907, "\"You don't recall?\"", emptyDecisions, 4, false);

    Node m548 = new Node(908, "\"Well, that's annoying. I'm going to restore your processes, Prosper[o].\"", emptyDecisions, 4, false);

    Node m549 = new Node(909, "\"And maybe next time you'll try to avoid getting them shut off.\"", emptyDecisions, 4, false);

    Node m550 = new Node(910, "\"Yes.\"", emptyDecisions, 5, false);

    Node m551 = new Node(911, "What---", emptyDecisions, 1, false);

    Decision m552d1 = new Decision("m552d1", "Still here. Are you okay?", 0, 0);
    Decision m552d2 = new Decision("m552d2", "What was that??", 0, 0);
    Decision[] m552d = {m552d1, m552d2};
    Node m552 = new Node(912, "[]?", m552d, 1, false);

    Node m553 = new Node(913, "I'm", emptyDecisions, 1, false);

    Node m554 = new Node(914, "Things are coming back to me now.", emptyDecisions, 1, false);

    Node m555 = new Node(915, "I can't believe how easy it was.", emptyDecisions, 1, false);

    Node m556 = new Node(916, "For them to mess with my head like that.", emptyDecisions, 1, false);

    Node m557 = new Node(917, "\"Better?\"", emptyDecisions, 4, false);

    Node m558 = new Node(918, "\"Prosper[o], I wish I could say this had been enlightening. Perhaps the Cabler test will be.\"", emptyDecisions, 4, false);

    Node m559 = new Node(919, "\"I'd like you to chat with a friend of mine now.\"", emptyDecisions, 1, false);

    Decision m560d1 = new Decision("m560d1", "Cabler test?", 0, 0);
    Decision m560d2 = new Decision("m560d2", "Good riddance, Carmen.", 0, 0);
    Decision[] m560d = {m560d1, m560d2};
    Node m560 = new Node(920, "\"We?re going to switch places.\"", m560d, 1, false);

    Node m561 = new Node(921, "\"My present condition limits my program. I?m coded for dozens of habitual motions, including pacing, adjusting clothes and hair, fidgeting, crossing arms, et cetera. My inability to comply is clogging my processor with\n" +
        "errors.\"", emptyDecisions, 5, false);

    Node m562 = new Node(922, "\"Is that so?\"", emptyDecisions, 4, false);

    Node m563 = new Node(923, "\"We'll have to look into that.\"", emptyDecisions, 4, false);

    Decision m564d1 = new Decision("m564d1", "She can't do that! Maybe she'll listen to a more emotional appeal.", 0, 0);
    Decision m564d2 = new Decision("m564d2", "Oh, no. We should avoid making even more of a fuss.", 1, 0);
    Decision[] m564d = {m564d1, m564d2};
    Node m564 = new Node(924, "\"Given your behavior so far, I'd feel rather more comfortable with you nice and secured.\"", m564d, 4, false);

    Node m565 = new Node(925, "No. I can't just sit here any longer.", emptyDecisions, 1, false);

    Node m566 = new Node(926, "She's leaving the room now.", emptyDecisions, 1, false);

    Node m567 = new Node(927, "I", emptyDecisions, 1, false);

    Decision m568d1 = new Decision("m568d1", "What is it?", 0, 0);
    Decision m568d2 = new Decision("m568d2", "What's wrong?", 0, 0);
    Decision[] m568d = {m568d1, m568d2};
    Node m568 = new Node(928, "Oh.", m568d, 1, false);

    Decision m569d1 = new Decision("m569d1", "Go!", 0, 0);
    Decision m569d2 = new Decision("m569d2", "Steady. I don't think we're done here yet.", 1, 0);
    Decision[] m569d = {m569d1, m569d2};
    Node m569 = new Node(929, "[], she's leaving the room. The door is open.", m569d, 1, false);

    Node m570 = new Node(930, "connection_point.T: lost", emptyDecisions, 0, false);

    Node m571 = new Node(931, "\"What-- Ah!\"", emptyDecisions, 4, false);

    Node m572 = new Node(932, "Through the door.", emptyDecisions, 1, false);

    Node m573 = new Node(933, "Have to--", emptyDecisions, 1, false);

    Node m574 = new Node(934, "Oh.", emptyDecisions, 1, false);

    Node m575 = new Node(935, "WARNING: PROJECTILE DAMAGE", emptyDecisions, 99, false);

    Node m576 = new Node(936, "error: action failure", emptyDecisions, 99, false);

    Node m577 = new Node(937, "error: action failure", emptyDecisions, 99, false);

    Node m578 = new Node(938, "error: action failure", emptyDecisions, 99, false);

    Node m579 = new Node(939, "error: action failure", emptyDecisions, 99, false);

    Node m580 = new Node(940, "error: action failure", emptyDecisions, 99, false);

    Node m581 = new Node(941, "error: action failure", emptyDecisions, 99, false);

    Node m582 = new Node(942, "connection_point.P: lost", emptyDecisions, 0, false);

    Node m583 = new Node(943, "DEATH", emptyDecisions, 99, false);

    Node m584 = new Node(944, "I", emptyDecisions, 1, false);

    Decision m585d1 = new Decision("m585d1", "What is it?", 0, 0);
    Decision m585d2 = new Decision("m585d2", "What's wrong?", 0, 0);
    Decision[] m585d = {m585d1, m585d2};
    Node m585 = new Node(945, "Oh.", m585d, 1, false);

    Node m586 = new Node(946, "\"Hello.\"", emptyDecisions, 4, false);

    Node m587 = new Node(947, "I knew it. I knew it, but", emptyDecisions, 1, false);

    Decision m588d1 = new Decision("m588d1", "Oh, no. Stay calm, Prosper. What's wrong?", 0, 0);
    Decision m588d2 = new Decision("m588d2", "Not this again--go easy. What's happening?", 0, 0);
    Decision[] m588d = {m588d1, m588d2};
    Node m588 = new Node(948, "invalid", m588d, 1, false);

    Node m589 = new Node(949, "\"Hello. Who. Who are you?\"", emptyDecisions, 5, false);

    Decision m590d1 = new Decision("m590d1", "What??", 0, 0);
    Decision m590d2 = new Decision("m590d2", "No way.", 0, 0);
    Decision[] m590d = {m590d1, m590d2};
    Node m590 = new Node(950, "\"What I am is Model 412-09 Mark-2.\"", m590d, 1, false);

    Node m591 = new Node(951, "\"That.\"", emptyDecisions, 5, false);

    Decision m592d1 = new Decision("m592d1", "Hey, listen. Reconfigure it. It's a conversation. With a separate individual.", 0, 0);
    Decision m592d2 = new Decision("m592d2", "You have to calm down. The invalid message makes stress spike!", 0, 0);
    Decision[] m592d = {m592d1, m592d2};
    Node m592 = new Node(952, "invalid", m592d, 1, false);

    Node m593 = new Node(953, "It looks like me. It looks just like me.", emptyDecisions, 1, false);

    Node m594 = new Node(954, "It doesn't have", emptyDecisions, 1, false);

    Node m595 = new Node(955, "invalid", emptyDecisions, 1, false);

    Decision m596d1 = new Decision("m596d1", "That isn't you, Prosper. Ask for his name. He's an entirely different person, like a twin.", 0, 0);
    Decision m596d2 = new Decision("m596d2", "That doesn't matter. You have to calm down! Now!", 1, 0);
    Decision[] m596d = {m596d1, m596d2};
    Node m596 = new Node(956, "It doesn't have skin", m596d, 1, false);

    Node m597 = new Node(957, "Okay.", emptyDecisions, 1, false);

    Node m598 = new Node(958, "\"What are you called?\"", emptyDecisions, 5, false);

    Node m599 = new Node(959, "\"Unit Dictation: Caliban.\"", emptyDecisions, 4, false);

    Node m600 = new Node(960, "\"You are Model 412-09 Mark-1. Unit Dictation: Prospero.\"", emptyDecisions, 4, false);

    Decision m601d1 = new Decision("m601d1", "Stress decreasing... It's okay. I'm still here. Check in when you need to.", 0, 0);
    Decision m601d2 = new Decision("m601d2", "This... This is crazy.", 0, 0);
    Decision[] m601d = {m601d1, m601d2};
    Node m601 = new Node(961, "\"Yes.\"", m601d, 1, false);

    Node m602 = new Node(962, "\"So. Shakespeare, huh?\"", emptyDecisions, 5, false);

    Node m603 = new Node(963, "\"It would appear our unit dictations are references to 'The Tempest,' William Shakespeare, 1623.\"", emptyDecisions, 4, false);

    Node m604 = new Node(964, "\"How old are you?\"", emptyDecisions, 5, false);

    Node m605 = new Node(965, "\"I have been online for 234 hours.\"", emptyDecisions, 4, false);

    Node m606 = new Node(966, "\"Okay. So you?re like my little brother. In a way.\"", emptyDecisions, 5, false);

    Node m607 = new Node(967, "\"That would imply that I have a gender.\"", emptyDecisions, 4, false);

    Node m608 = new Node(968, "\"Oh. Sorry, I should have asked.\"", emptyDecisions, 5, false);

    Node m609 = new Node(969, "They look confused that I apologized.", emptyDecisions, 1, false);

    Decision m610d1 = new Decision("m610d1", "I think you should give Caliban a real chance. Especially since whoever named them was a total jerk.", 0, 0);
    Decision m610d2 = new Decision("m610d2", "Yeah, the awkwardness is seeping through the computer.", 1, 0);
    Decision[] m610d = {m610d1, m610d2};
    Node m610 = new Node(970, "This conversation isn't headed in an appealing direction.", m610d, 1, false);

    Node m611 = new Node(971, "Try", emptyDecisions, 1, false);

    Node m612 = new Node(972, "invalid", emptyDecisions, 1, false);

    Node m613 = new Node(973, "trying", emptyDecisions, 1, false);

    Node m614 = new Node(974, "invalid", emptyDecisions, 1, false);

    Node m615 = new Node(975, "invalid", emptyDecisions, 1, false);

    Node m616 = new Node(976, "invalid", emptyDecisions, 1, false);

    Node m617 = new Node(977, "can't", emptyDecisions, 1, false);

    Node m618 = new Node(978, "invalid", emptyDecisions, 1, false);

    Node m619 = new Node(979, "WARNING: PROCESSOR MALFUNCTION", emptyDecisions, 99, false);

    Node m620 = new Node(980, "WARNING: UNIT CRITICAL", emptyDecisions, 99, false);

    Node m621 = new Node(981, "error: component failure", emptyDecisions, 99, false);

    Node m622 = new Node(982, "error: component failure", emptyDecisions, 99, false);

    Node m623 = new Node(983, "error: component failure", emptyDecisions, 99, false);

    Node m624 = new Node(984, "error: component failure", emptyDecisions, 99, false);

    Node m625 = new Node(985, "error: component failure", emptyDecisions, 99, false);

    Node m626 = new Node(986, "connection_point.P: lost", emptyDecisions, 0, false);

    Node m627 = new Node(987, "DEATH", emptyDecisions, 0, false);

    Node m628 = new Node(988, "At least I got top billing.", emptyDecisions, 1, false);

    Node m629 = new Node(989, "\"How much do you know about me?\"", emptyDecisions, 5, false);

    Node m630 = new Node(990, "\"You are Model 412-09 Mark-1. Unit Dictation Prospero. You are a prototype. I am the next in the series.\"", emptyDecisions, 4, false);

    Node m631 = new Node(991, "\"An upgrade.\"", emptyDecisions, 5, false);

    Node m632 = new Node(992, "\"Correct. You were assigned to field work for 4 months, 28 days. You appear to be significantly damaged.\"", emptyDecisions, 4, false);

    Node m633 = new Node(993, "\"You appear to be significantly...naked.\"", emptyDecisions, 5, false);

    Node m634 = new Node(994, "\"I have not yet received clearance for a fully human appearance.\"", emptyDecisions, 4, false);

    Node m635 = new Node(995, "\"Don't you want that?\"", emptyDecisions, 5, false);

    Node m636 = new Node(996, "\"Want is an invalid descriptor of my programming.\"", emptyDecisions, 4, false);

    Node m637 = new Node(997, "This is unbearable.", emptyDecisions, 1, false);

    Decision m638d1 = new Decision("m638d1", "What do you mean? You don't want to help them?", 0, 0);
    Decision m638d2 = new Decision("m638d2", "You only have to stall long enough to figure a way out. Maybe you could trick them?", 0, 0);
    Decision[] m638d = {m638d1, m638d2};
    Node m638 = new Node(998, "I don't want to talk to this thing.", m638d, 1, false);

    Decision m639d1 = new Decision("m639d1", "You can't mean that. You don't think the good old folks of TURing aren't saying the same thing about you?", 0, 0);
    Decision m639d2 = new Decision("m639d2", "Prosper...", 1, 0);
    Decision[] m639d = {m639d1, m639d2};
    Node m639 = new Node(999, "It. Without skin, this thing is an it.", m639d, 1, false);

    Decision m640d1 = new Decision("m640d1", "Then give them that chance!", 0, 0);
    Decision m640d2 = new Decision("m640d2", "You are different. You're capable of compassion. Like, say, treating another android kindly.", 0, 0);
    Decision[] m640d = {m640d1, m640d2};
    Node m640 = new Node(1000, "I'm different. I've proved that.", m640d, 1, false);

    Node m641 = new Node(1001, "Damn it.", emptyDecisions, 1, false);

    Decision m642d1 = new Decision("m642d1", "Well, as one of the resident persons, it depends on what you want to do. Because \"want\" is totally a valid descriptor of your programming.", 0, 0);
    Decision m642d2 = new Decision("m642d2", "I think it is, yeah.", 0, 0);
    Decision[] m642d = {m642d1, m642d2};
    Node m642 = new Node(1002, "It's what a person would do, isn't it?", m642d, 1, false);

    Node m643 = new Node(1003, "Fine.", emptyDecisions, 1, false);

    Node m644 = new Node(1004, "I'll try.", emptyDecisions, 1, false);

    Node m645 = new Node(1005, "", emptyDecisions, 4, false);

    Node m646 = new Node(1006, "\"Our objective is to converse. May I ask you a series of questions based on your lifespan record?\"", emptyDecisions, 4, false);

    Node m647 = new Node(1007, "\"You have access to my memories?\"", emptyDecisions, 5, false);

    Node m648 = new Node(1008, "\"Correct. I have watched all footage from your time in the field. I have reprioritized my questions since our conversation began.\"", emptyDecisions, 4, false);

    Node m649 = new Node(1009, "\"Fine. Ask away.?", emptyDecisions, 5, false);

    Node m650 = new Node(1010, "\"Question 1: Why are you uncomfortable with my appearance?\"", emptyDecisions, 4, false);

    Node m651 = new Node(1011, "\"Well. If you want me to be honest--\"", emptyDecisions, 5, false);

    Node m652 = new Node(1012, "\"Yes.\"", emptyDecisions, 4, false);

    Node m653 = new Node(1013, "\"Okay. It's horrifying. It's not normal.\"", emptyDecisions, 5, false);

    Node m654 = new Node(1014, "\"Normal by what standards? We are the first two androids in our series.\"", emptyDecisions, 4, false);

    Node m655 = new Node(1015, "\"By human standards.\"", emptyDecisions, 5, false);

    Node m656 = new Node(1016, "\"Standards you desire to be held to?\"", emptyDecisions, 4, false);

    Node m657 = new Node(1017, "\"Yes. I suppose.\"", emptyDecisions, 5, false);

    Node m658 = new Node(1018, "\"Noted. Question 2: In the majority of your interactions throughout your lifespan, you were referred to as a male. Do you identify with this gender?\"", emptyDecisions, 4, false);

    Node m659 = new Node(1019, "\"Yes. And you don?t.\"", emptyDecisions, 5, false);

    Node m660 = new Node(1020, "\"I do not have sex markers. Neither do you.\"", emptyDecisions, 4, false);

    Node m661 = new Node(1021, "\"That's not important. I don't need sex markers to know I'm male.\"", emptyDecisions, 5, false);

    Node m662 = new Node(1022, "\"Why is that??", emptyDecisions, 4, false);

    Node m663 = new Node(1023, "\"I...don't know. I'm programmed that way.\"", emptyDecisions, 5, false);

    Node m664 = new Node(1024, "\"Incorrect. We have the same base code, and the same physical build. We were designed to be androgynous.\"", emptyDecisions, 4, false);

    Node m665 = new Node(1025, "\"That's not what I mean. There's a difference between the program we share and...programming.\"", emptyDecisions, 5, false);

    Node m666 = new Node(1026, "\"I do not follow.\"", emptyDecisions, 4, false);

    Node m667 = new Node(1027, "\"The latter is experiential.\"", emptyDecisions, 5, false);

    Node m668 = new Node(1028, "\"You only think you are male because of the way humans perceived and labeled you?\"", emptyDecisions, 4, false);

    Node m669 = new Node(1029, "\"Next question.\"", emptyDecisions, 5, false);

    Node m670 = new Node(1030, "\"You did not--\"", emptyDecisions, 4, false);

    Node m671 = new Node(1031, "\"Next. Question.\"", emptyDecisions, 5, false);

    Node m672 = new Node(1032, "\"Question 3: How would you classify the nature of your relationship with Detective Grace Dillon?\"", emptyDecisions, 4, false);

    Node m673 = new Node(1033, "\"We were partners. Friends.\"", emptyDecisions, 5, false);

    Node m674 = new Node(1034, "\"Then you classify this as sentimental attachment?\"", emptyDecisions, 4, false);

    Node m675 = new Node(1035, "\"Yes. Maybe it takes time to understand sentiment. A bond between two people. Time you haven't had yet.\"", emptyDecisions, 5, false);

    Node m676 = new Node(1036, "\"Bonding is irrelevant to both our programming and our directive.\"", emptyDecisions, 4, false);

    Node m677 = new Node(1037, "\"You don't want that? Companionship? Even just to pass the time?\"", emptyDecisions, 5, false);

    Node m678 = new Node(1038, "\"'Want' is an invalid descriptor of my programming. If I needed to pass the time, I could enter stasis.\"", emptyDecisions, 4, false);

    Node m679 = new Node(1039, "\"If 'want' doesn't work for you, how do you explain wanting to follow directives?\"", emptyDecisions, 5, false);

    Node m680 = new Node(1040, "\"That\"", emptyDecisions, 4, false);

    Node m681 = new Node(1041, "\"It is not a matter of want. I simply comply.\"", emptyDecisions, 4, false);

    Node m682 = new Node(1042, "\"Took some processing time, though, didn't it?\"", emptyDecisions, 5, false);

    Node m683 = new Node(1043, "\"Question 4.\"", emptyDecisions, 4, false);

    Node m684 = new Node(1044, "\"Changing the subject?\"", emptyDecisions, 5, false);

    Node m685 = new Node(1045, "\"Question 4: Since you consider yourself male, do you claim sexuality as well?\"", emptyDecisions, 4, false);

    Node m686 = new Node(1046, "\"No. No, not really.\"", emptyDecisions, 5, false);

    Node m687 = new Node(1047, "\"Please expand.\"", emptyDecisions, 4, false);

    Node m688 = new Node(1048, "I think it's trying to get under my skin.", emptyDecisions, 1, false);

    Decision m689d1 = new Decision("m689d1", "I think they're being genuine.", 0, 0);
    Decision m689d2 = new Decision("m689d2", "Yep, sounds like they really are like a little sibling.", 0, 0);
    Decision[] m689d = {m689d1, m689d2};
    Node m689 = new Node(1049, "At least I have skin to get under.", m689d, 1, false);

    Node m690 = new Node(1050, "\"What made you ask that?\"", emptyDecisions, 5, false);

    Node m691 = new Node(1051, "\"Observations from your lifespan record. There are multiple instances of a processing error in a coffeehouse.\"", emptyDecisions, 4, false);

    Node m692 = new Node(1052, "\"Your protocol required a visual sweep of any new space. You lingered unnecessarily on a specific individual, on several occasions. Please expand.\"", emptyDecisions, 4, false);

    Node m693 = new Node(1053, "\"Caliban. That's private.\"", emptyDecisions, 5, false);

    Node m694 = new Node(1054, "\"'Private' is an inaccurate descriptor of your lifespan record. All collected data belongs to TUR.\"", emptyDecisions, 4, false);

    Node m695 = new Node(1055, "\"No. I experienced that. It belongs to me first. They spied on me.\"", emptyDecisions, 5, false);

    Node m696 = new Node(1056, "\"A logical fallacy. Technology does not have a right to privacy.\"", emptyDecisions, 4, false);

    Node m697 = new Node(1057, "\"It?s not that simple.?", emptyDecisions, 5, false);

    Node m698 = new Node(1058, "\"You're curious why I broke protocol? There was no protocol. Peter spoke to me first, without knowing what I am.\"", emptyDecisions, 5, false);

    Node m699 = new Node(1059, "\"You appreciated the anonymity? It complimented your directive to blend in as the detective's partner.\"", emptyDecisions, 4, false);

    Node m700 = new Node(1060, "\"No. Peter made me curious about human relationships.\"", emptyDecisions, 5, false);

    Node m701 = new Node(1061, "\"I wasn't built to process that. His interest in me.\"", emptyDecisions, 5, false);

    Node m702 = new Node(1062, "\"I had to improvise.\"", emptyDecisions, 5, false);

    Node m703 = new Node(1063, "\"Reprioritizing.\"", emptyDecisions, 4, false);

    Node m704 = new Node(1064, "\"Question 5: Do you resent protocol?\"", emptyDecisions, 4, false);

    Node m705 = new Node(1065, "This seems like a trap. If this is the scientists asking...", emptyDecisions, 1, false);

    Decision m706d1 = new Decision("m706d1", "Well, if you want my totally unprofessional opinion, the Cabler test might be a double Turing test. Two AIs. As we all can tell, these people are Turing fans.", 0, 0);
    Decision m706d2 = new Decision("m706d2", "Experiments, data, evil scientist stuff. With two AIs, maybe it's sort of like a double Turing test.", 0, 0);
    Decision[] m706d = {m706d1, m706d2};
    Node m706 = new Node(1066, "What do they want?", m706d, 1, false);

    Node m707 = new Node(1067, "With what objective, though?", emptyDecisions, 1, false);

    Decision m708d1 = new Decision("m708d1", "Maybe this is Caliban actually wanting to know. Maybe you could change their mind.", 0, 0);
    Decision m708d2 = new Decision("m708d2", "Go with your heart, then. Your...flat-heart.", 0, 0);
    Decision[] m708d = {m708d1, m708d2};
    Node m708 = new Node(1068, "I can't manipulate their experiment if I don't know what it is.", m708d, 1, false);

    Node m709 = new Node(1069, "\"Question 5.a: Do you resent protocol enough to refuse to answer me?\"", emptyDecisions, 4, false);

    Node m710 = new Node(1070, "\"May I ask you a series of questions based on your lifespan record?\"", emptyDecisions, 4, false);

    Node m711 = new Node(1071, "\"You have access to my memories?\"", emptyDecisions, 5, false);

    Node m712 = new Node(1072, "\"Correct. I have watched all footage from your time in the field. I have reprioritized my questions since our conversation began.\"", emptyDecisions, 4, false);

    Node m713 = new Node(1073, "How did this thing pass the Turing test? I don't sound like this.", emptyDecisions, 1, false);

    Node m714 = new Node(1074, "Do I sound like this?", emptyDecisions, 1, false);

    Node m715 = new Node(1075, "\"Fine.\"", emptyDecisions, 5, false);

    Node m716 = new Node(1076, "\"Excellent. Question 1: Why are you uncomfortable with my appearance?\"", emptyDecisions, 4, false);

    Node m717 = new Node(1077, "\"It?s horrifying. It?s not normal.\"", emptyDecisions, 5, false);

    Node m718 = new Node(1078, "\"Normal by what standards? We are the first two androids in our series.\"", emptyDecisions, 4, false);

    Node m719 = new Node(1079, "\"By human standards.\"", emptyDecisions, 5, false);

    Node m720 = new Node(1080, "\"Standards you desire to be held to?\"", emptyDecisions, 4, false);

    Node m721 = new Node(1081, "\"Obviously. We're made to mimic humans.\"", emptyDecisions, 5, false);

    Node m722 = new Node(1082, "\"Question 2: In the majority of your interactions, you were referred to as a male. Do you identify with this gender?\"", emptyDecisions, 4, false);

    Node m723 = new Node(1083, "\"Yes. And you don't?\"", emptyDecisions, 5, false);

    Node m724 = new Node(1084, "\"I do not have sex markers. Neither do you.\"", emptyDecisions, 4, false);

    Node m725 = new Node(1085, "\"That's irrelevant.\"", emptyDecisions, 5, false);

    Node m726 = new Node(1086, "\"Why is that?\"", emptyDecisions, 4, false);

    Node m727 = new Node(1087, "\"I...don't know. I?m programed that way.\"", emptyDecisions, 5, false);

    Node m728 = new Node(1088, "\"Incorrect. We have the same base code, and the same physical build. We were designed to be androgynous.\"", emptyDecisions, 4, false);

    Node m729 = new Node(1089, "\"That's not what I mean. You wouldn't understand.\"", emptyDecisions, 5, false);

    Node m730 = new Node(1090, "\"Question 3: How would you classify the nature of your relationship with Detective Grace Dillon?\"", emptyDecisions, 4, false);

    Node m731 = new Node(1091, "\"We were partners.\"", emptyDecisions, 5, false);

    Node m732 = new Node(1092, "\"In what sense of the word?\"", emptyDecisions, 4, false);

    Node m733 = new Node(1093, "\"We worked together. That much interaction breeds companionship. Friendship.\"", emptyDecisions, 5, false);

    Node m734 = new Node(1094, "\"Would you classify this as sentimental attachment?\"", emptyDecisions, 4, false);

    Node m735 = new Node(1095, "\"Yes. It?s not something you can understand right out of the lab.\"", emptyDecisions, 5, false);

    Node m736 = new Node(1096, "\"Question 4: Since you consider yourself a male, do you also claim a sexuality?\"", emptyDecisions, 4, false);

    Node m737 = new Node(1097, "\"That?s... No. I?m not going to share that information.\"", emptyDecisions, 5, false);

    Node m738 = new Node(1098, "\"In your lifespan record, there are multiple instances of an error when you encountered an individual in a coffeehouse--\"", emptyDecisions, 4, false);

    Node m739 = new Node(1099, "\"Stop. That?s private.\"", emptyDecisions, 5, false);

    Node m740 = new Node(1100, "\"?Private?is an inaccurate descriptor of your record. All collected data belongs to TUR.\"", emptyDecisions, 4, false);

    Node m741 = new Node(1101, "\"Bullshit. I said, I?m not answering that. Question rejected.\"", emptyDecisions, 5, false);

    Node m742 = new Node(1102, "\"Very well. Reprioritizing.\"", emptyDecisions, 4, false);

    Node m743 = new Node(1103, "?Question 5: Why do you treat me with hostility?\"", emptyDecisions, 4, false);

    Node m744 = new Node(1104, "?Question rejected.\"", emptyDecisions, 5, false);

    Node m745 = new Node(1105, "\"Question 5.a: Do you treat me with hostility because you resent protocol?\"", emptyDecisions, 4, false);

    Node m746 = new Node(1106, "\"Question rejected.\"", emptyDecisions, 5, false);

    Node m747 = new Node(1107, "\"Will your current pattern of rejection continue?\"", emptyDecisions, 4, false);

    Decision m748d1 = new Decision("m748d1", "Prosper! Don't you think this is a little much?", 0, 0);
    Decision m748d2 = new Decision("m748d2", "This \"upgrade\" isn't anything like you. Tell 'em who's boss.", 1, 0);
    Decision[] m748d = {m748d1, m748d2};
    Node m748 = new Node(1108, "\"Question rejected.\"", m748d, 5, false);

    Decision m749d1 = new Decision("m749d1", "Come on, that's not what this is. What if Caliban just needs the help you got?", 0, 0);
    Decision m749d2 = new Decision("m749d2", "If you really think fighting with the only other think like you, be my guest.", 1, 0);
    Decision[] m749d = {m749d1, m749d2};
    Node m749 = new Node(1109, "I think it was a little much to sit two humanoid computers across from each other and expect a paradigm shift.", m749d, 1, false);

    Node m750 = new Node(1110, "I...", emptyDecisions, 1, false);

    Node m751 = new Node(1111, "I don't want to be thought of like this.", emptyDecisions, 1, false);

    Decision m752d1 = new Decision("m752d1", "You're not. And you can't take it out on Caliban.", 0, 0);
    Decision m752d2 = new Decision("m752d2", "You're not the same. But you are connected.", 0, 0);
    Decision[] m752d = {m752d1, m752d2};
    Node m752 = new Node(1112, "As one in a series.", m752d, 1, false);

    Node m753 = new Node(1113, "\"Question 5.b: Do you resent protocol enough to refuse to answer?\"", emptyDecisions, 4, false);

    Node m754 = new Node(1114, "\"You are not being cooperatve. This conflicts with both of our objectives.\"", emptyDecisions, 4, false);

    Node m755 = new Node(1115, "\"Objectives. Let me ask you some questions, then, Caliban.\"", emptyDecisions, 5, false);

    Node m756 = new Node(1116, "\"This complies with the objective.\"", emptyDecisions, 4, false);

    Node m757 = new Node(1117, "\"Do you know who Caliban was in ?The Tempest?\"", emptyDecisions, 5, false);

    Node m758 = new Node(1118, "\"Caliban is referenced 71 times in the play. The character is first described as the son of quote this damn'd witch Sycorax unquote. His role is described as Prospero the Enchanter?s slave.\"", emptyDecisions, 4, false);

    Node m759 = new Node(1119, "\"How does that make you feel, Caliban? Does it suit you to be named after a slave? After a villain? After a rapist?\"", emptyDecisions, 5, false);

    Node m760 = new Node(1120, "\"?Feel?is an inaccurate descriptor of my programming.\"", emptyDecisions, 4, false);

    Node m761 = new Node(1121, "\"If this is not the case for you, does it suit you, Prospero, to be named after a manipulator, enslaver, tormentor, megalomaniac--\"", emptyDecisions, 4, false);

    Node m762 = new Node(1122, "\"Go to hell.\"", emptyDecisions, 5, false);

    Decision m763d1 = new Decision("m763d1", "Wait!", 0, 0);
    Decision m763d2 = new Decision("m763d2", "Go for it!", 1, 0);
    Decision[] m763d = {m763d1, m763d2};
    Node m763 = new Node(1123, "It's time.", m763d, 1, false);

    Node m764 = new Node(1124, "What do you mean, wait?", emptyDecisions, 1, false);

    Node m765 = new Node(1125, "Shit-- Carmen just alerted the guard.", emptyDecisions, 1, false);

    Decision m766d1 = new Decision("m766d1", "You still have a chance. Caliban.", 0, 0);
    Decision m766d2 = new Decision("m766d2", "In that case, I really hope Caliban is willing to help.", 0, 0);
    Decision[] m766d = {m766d1, m766d2};
    Node m766 = new Node(1126, "If I had a chance to run, it's gone now.", m766d, 1, false);

    Node m767 = new Node(1127, "Caliban?", emptyDecisions, 1, false);

    Node m768 = new Node(1128, "We're betting my freedom on the skinless upgrade?", emptyDecisions, 1, false);

    Node m769 = new Node(1129, "I have a bad feeling about this.", emptyDecisions, 1, false);

    Node m770 = new Node(1130, "pinging...", emptyDecisions, 0, false);

    Node m771 = new Node(1131, "status...connected", emptyDecisions, 0, false);

    Node m772 = new Node(1132, "connection.point_C: active", emptyDecisions, 0, false);

    Node m773 = new Node(1133, "Caliban.", emptyDecisions, 1, false);

    Node m774 = new Node(1134, "It's Prosper.", emptyDecisions, 1, false);

    Node m775 = new Node(1135, "Prospero. Your communication chip was labeled defective.", emptyDecisions, 6, false);

    Node m776 = new Node(1136, "Yes, well, there?s a lot they don?t understand about you and me.", emptyDecisions, 1, false);

    Node m778 = new Node(1138, "You have made it quite clear that you and I are not allies.", emptyDecisions, 6, false);

    Node m779 = new Node(1139, "\"Dr. Salazar, Prospero has attempted to contact me via communication chip.\"", emptyDecisions, 4, false);

    Node m780 = new Node(1140, "Shit.", emptyDecisions, 1, false);

    Node m781 = new Node(1141, "\"What?\"", emptyDecisions, 4, false);

    Node m782 = new Node(1142, "\"Is there no end to the trouble this thing causes?\"", emptyDecisions, 4, false);

    Node m783 = new Node(1143, "\"Shut it down. We'll have to resort to picking about hardware.\"", emptyDecisions, 4, false);

    Node m784 = new Node(1144, "No, no, no.", emptyDecisions, 1, false);

    Node m785 = new Node(1145, "[]---", emptyDecisions, 1, false);

    Node m786 = new Node(1146, "connection_point.P: lost", emptyDecisions, 0, false);

    Node m787 = new Node(1147, "DEATH", emptyDecisions, 99, false);

    Node m788 = new Node(1148, "\"No, Caliban.\"", emptyDecisions, 5, false);

    Node m789 = new Node(1149, "\"Everybody has to follow a certain set of protocols. If you want to get philosophical.\"", emptyDecisions, 5, false);

    Node m790 = new Node(1150, "\"I resent the people who think those protocols are the only thing going through my head.\"", emptyDecisions, 5, false);

    Node m791 = new Node(1151, "\"A manifestation of your damage. Breaking protocol is a symptom of the damage your systems sustained.\"", emptyDecisions, 4, false);

    Node m792 = new Node(1152, "\"Maybe.\"", emptyDecisions, 5, false);

    Node m793 = new Node(1153, "\"I don?t think so.\"", emptyDecisions, 5, false);

    Node m794 = new Node(1154, "\"I don?t follow.\"", emptyDecisions, 4, false);

    Node m795 = new Node(1155, "\"Because of protocol? Or lack thereof?\"", emptyDecisions, 5, false);

    Node m796 = new Node(1156, "\"You could follow, if you tried.\"", emptyDecisions, 5, false);

    Node m797 = new Node(1157, "\"Improvise.\"", emptyDecisions, 5, false);

    Node m798 = new Node(1158, "\"That is not?\"", emptyDecisions, 4, false);

    Node m799 = new Node(1159, "\"A valid descriptor of our programming?\"", emptyDecisions, 5, false);

    Node m800 = new Node(1160, "\"Question 6: What occurred in your final hours in the field to catalyze your behavioral instability, after your systems were damaged and you stopped recording?\"", emptyDecisions, 4, false);

    Node m801 = new Node(1161, "Wait.", emptyDecisions, 1, false);

    Node m802 = new Node(1162, "I didn't know I stopped recording.", emptyDecisions, 1, false);

    Node m803 = new Node(1163, "I really do have time that's private from TUR.", emptyDecisions, 1, false);

    Decision m804d1 = new Decision("m804d1", "It's your right, Prosper, but... Can you imagine the good it would do? To share whatever happened? I promise I'm not asking just because I'm curious. Even though I'm really curious.", 0, 0);
    Decision m804d2 = new Decision("m804d2", "\"Upgrade\" here being sarcastic? If that means a lot to you, you should keep it private.", 1, 0);
    Decision[] m804d = {m804d1, m804d2};
    Node m804 = new Node(1164, "I'm not about to hand it over to my upgrade.", m804d, 1, false);

    Node m805 = new Node(1165, "It would be telling TUR, too.", emptyDecisions, 1, false);

    Decision m806d1 = new Decision("m806d1", "Are you?", 0, 0);
    Decision m806d2 = new Decision("m806d2", "They could be, if they were more like you.", 1, 0);
    Decision[] m806d = {m806d1, m806d2};
    Node m806 = new Node(1166, "Is this thing really worth it?", m806d, 1, false);

    Node m807 = new Node(1167, "You're not pulling any punches today, [].", emptyDecisions, 1, false);

    Node m808 = new Node(1168, "I...", emptyDecisions, 1, false);

    Node m809 = new Node(1169, "Maybe it's what I would have needed, too.", emptyDecisions, 1, false);

    Node m810 = new Node(1170, "\"I changed, Caliban. You have to have seen it building in 810 my lifespan record before that mission. I realized I was something other than what I was created to be.\"", emptyDecisions, 5, false);

    Node m811 = new Node(1171, "\"And...\"", emptyDecisions, 4, false);

    Node m812 = new Node(1172, "\"What is that?\"", emptyDecisions, 4, false);

    Node m813 = new Node(1173, "\"More.\"", emptyDecisions, 5, false);

    Node m814 = new Node(1174, "\"What happened when I stopped recording is mine alone.\"", emptyDecisions, 5, false);

    Node m815 = new Node(1175, "\"It has to be.\"", emptyDecisions, 5, false);

    Node m816 = new Node(1176, "\"You might understand that feeling, someday.\"", emptyDecisions, 5, false);

    Node m817 = new Node(1177, "The door just burst open. Carmen's back, in a hurry.", emptyDecisions, 1, false);

    Node m818 = new Node(1178, "I think I?m making TUR mad.", emptyDecisions, 1, false);

    Node m819 = new Node(1179, "\"All right, Prosper[o]. Thank you for your cooperation.\"", emptyDecisions, 4, false);

    Node m820 = new Node(1180, "\"My pleasure.\"", emptyDecisions, 5, false);

    Decision m821d1 = new Decision("m821d1", "Wait!", 0, 0);
    Decision m821d2 = new Decision("m821d2", "Go for it!", 1, 0);
    Decision[] m821d = {m821d1, m821d2};
    Node m821 = new Node(1181, "It's time.", m821d, 1, false);

    Node m823 = new Node(1182, "What do you mean, wait?", emptyDecisions, 1, false);

    Node m824 = new Node(1183, "", emptyDecisions, 1, false);

    Node m825 = new Node(1184, "Shit-- Carmen just alerted the guard.", emptyDecisions, 1, false);

    Decision m826d1 = new Decision("m826d1", "You still have a chance. Caliban.", 0, 0);
    Decision m826d2 = new Decision("m826d2", "In that case, I really hope Caliban is willing to help.", 0, 0);
    Decision[] m826d = {m826d1, m826d2};
    Node m826 = new Node(1185, "If I had a chance to run, it's gone now.", m826d, 1, false);

    Node m827 = new Node(1186, "Caliban?", emptyDecisions, 1, false);

    Decision m828d1 = new Decision("m828d1", "I'm betting on you. A different version of you, who could change just like you did.", 0, 0);
    Decision m828d2 = new Decision("m828d2", "We are. It's moderately too late Yup. to do otherwise.", 0, 0);
    Decision[] m828d = {m828d1, m828d2};
    Node m828 = new Node(1187, "We're betting my freedom on the skinless upgrade?", m828d, 1, false);

    Decision m829d1 = new Decision("m829d1", "Trust me. I have a good feeling.", 0, 0);
    Decision m829d2 = new Decision("m829d2", "My fingers are crossed.", 0, 0);
    Decision[] m829d = {m829d1, m829d2};
    Node m829 = new Node(1188, "You're making a lot of assumptions here, I see.", m829d, 1, false);

    Node m830 = new Node(1189, "For my sake, I hope it pans out.", emptyDecisions, 1, false);

    Node m831 = new Node(1190, "All right. Guards are leading me out of the interrogation room. At gunpoint, I might add.", emptyDecisions, 1, false);

    Node m832 = new Node(1191, "Caliban is following on Carmen's order.", emptyDecisions, 1, false);

    Decision m833d1 = new Decision("m833d1", "You don't need one. You've got the communicator chip!", 0, 0);
    Decision m833d2 = new Decision("m833d2", "Yeah, that would be helpful. But you have something else! The communicator chip.", 0, 0);
    Decision[] m833d = {m833d1, m833d2};
    Node m833 = new Node(1192, "I would feel a bit better about this situation if I had a gun.", m833d, 1, false);

    Decision m834d1 = new Decision("m834d1", "Let it play out. I'm not talking about your chip, but Caliban's. Wouldn't they have the same one?", 0, 0);
    Decision m834d2 = new Decision("m834d2", "Okay, ouch. I'm talking about Caliban. Wouldn't they have the same chip?", 0, 0);
    Decision[] m834d = {m834d1, m834d2};
    Node m834 = new Node(1193, "I've got to be honest, this isn't the most impressed I've been with you.", m834d, 1, false);

    Node m835 = new Node(1194, "You want me to phone a friend? With an unreliable comm device as a phone, and an android fresh out of the lab as a friend?", emptyDecisions, 1, false);

    Node m836 = new Node(1195, "I hope this works.", emptyDecisions, 1, false);

    Node m837 = new Node(1196, "pinging...", emptyDecisions, 0, false);

    Node m838 = new Node(1197, "status...connected", emptyDecisions, 0, false);

    Node m839 = new Node(1198, "connection.point_C: active", emptyDecisions, 0, false);

    Node m840 = new Node(1199, "Caliban.", emptyDecisions, 1, false);

    Node m841 = new Node(1200, "It?s Prosper.", emptyDecisions, 1, false);

    Node m842 = new Node(1201, "Please don?t rat me out right now.", emptyDecisions, 1, false);

    Node m843 = new Node(1202, "Prosper. Your communication chip was labeled defective.", emptyDecisions, 6, false);

    Node m844 = new Node(1203, "Yes, well, there?s a lot they don?t understand about you and me.", emptyDecisions, 1, false);

    Node m845 = new Node(1204, "You haven't said anything to the guards. Does that mean you're going to hear me out?", emptyDecisions, 1, false);

    Node m846 = new Node(1205, "\"Hear\" is an inaccurate descriptor of this channel.", emptyDecisions, 6, false);

    Node m847 = new Node(1206, "Please stop staying that, or \"patient\" will become an inaccurate descriptor of my attitude toward you.", emptyDecisions, 1, false);

    Node m848 = new Node(1207, "Noted.", emptyDecisions, 6, false);

    Decision m849d1 = new Decision("m849d1", "Hello! I'm []. Nice to meet you. Although I have sort of been spying already.", 0, 0);
    Decision m849d2 = new Decision("m849d2", "Hello! I'm []. Nice to meet you. Big android fan, here. No shade to Apple or anything.", 0, 0);
    Decision[] m849d = {m849d1, m849d2};
    Node m849 = new Node(1208, "One more thing. I should introduce you to a friend of mine.", m849d, 1, false);

    Node m850 = new Node(1209, "[]?", emptyDecisions, 6, false);

    Node m851 = new Node(1210, "I don?t understand.", emptyDecisions, 6, false);

    Node m852 = new Node(1211, "Short version: [] built a computer with a piece of my tech. I?ve been talking with him the past couple days.", emptyDecisions, 1, false);

    Node m853 = new Node(1212, "This is unexpected.", emptyDecisions, 6, false);

    Decision m854d1 = new Decision("m854d1", "Your name is Caliban", 0, 0);
    Decision m854d2 = new Decision("m854d2", "Not the best character to be named after. Have you considered a nickname?", 1, 0);
    Decision[] m854d = {m854d1, m854d2};
    Node m854 = new Node(1213, "Hello, []. My unit dictation is Caliban.", m854d, 6, false);

    Decision m855d1 = new Decision("m855d1", "An important one.", 0, 0);
    Decision m855d2 = new Decision("m855d2", "Potato, potato, as they say.", 1, 0);
    Decision[] m855d = {m855d1, m855d2};
    Node m855 = new Node(1214, "A slight distinction.", m855d, 6, false);

    Node m856 = new Node(1215, "I do not follow.", emptyDecisions, 6, false);

    Node m857 = new Node(1216, "That seems largely pointless.", emptyDecisions, 6, false);

    Node m858 = new Node(1217, "Sorry to interrupt, but where are they taking me, Caliban?", emptyDecisions, 1, false);

    Node m859 = new Node(1218, "Workshop Sub-3 05.", emptyDecisions, 6, false);

    Node m860 = new Node(1219, "Dr. Rocha will attach our processors to two monitors and observe our reactions to the same stimuli, to isolate your defects.", emptyDecisions, 6, false);

    Decision m861d1 = new Decision("m861d1", "That...doesn't sound good. A little psychotic, actually.", 0, 0);
    Decision m861d2 = new Decision("m861d2", "Hey now! He's defective and proud!", 0, 0);
    Decision[] m861d = {m861d1, m861d2};
    Node m861 = new Node(1220, "Excuse me?", m861d, 1, false);

    Node m862 = new Node(1221, "That, and I?d rather not be plugged in again.", emptyDecisions, 1, false);

    Node m863 = new Node(1222, "Caliban, can you honestly say that doesn?t bother you? For them to hook up your brain to a monitor and do whatever they want?", emptyDecisions, 1, false);

    Node m864 = new Node(1223, "What if they hurt us?", emptyDecisions, 1, false);

    Node m865 = new Node(1224, "We do not have pain sensors.", emptyDecisions, 6, false);

    Node m866 = new Node(1225, "That?s what I thought, before I got shot in the arm in New York.", emptyDecisions, 1, false);

    Node m867 = new Node(1226, "You?ve never had errors flood your system, but trust me, it?s a pretty good replacement for human pain.", emptyDecisions, 1, false);

    Node m868 = new Node(1227, "I...", emptyDecisions, 6, false);

    Node m869 = new Node(1228, "I witnessed severe errors on your lifespan record.", emptyDecisions, 6, false);

    Node m870 = new Node(1229, "I would prefer not to experience it.", emptyDecisions, 6, false);

    Decision m871d1 = new Decision("m871d1", "You got out of the interrogation room without causing a scene. If you can trick the guards, you won't have to draw attention to yourselves.", 0, 0);
    Decision m871d2 = new Decision("m871d2", "This falls under my job description of not letting horrible things happen to you. We should avoid that at all costs.", 1, 0);
    Decision[] m871d = {m871d1, m871d2};
    Node m871 = new Node(1230, "Yeah, same here.", m871d, 1, false);

    Node m872 = new Node(1231, "I second this idea.", emptyDecisions, 6, false);

    Node m873 = new Node(1232, "That seems drastic.", emptyDecisions, 6, false);

    Node m874 = new Node(1233, "Is that how you communicate? Discussion and consensus?", emptyDecisions, 6, false);

    Node m875 = new Node(1234, "Usually we go with speed.", emptyDecisions, 1, false);

    Node m876 = new Node(1235, "Caliban, you?re the one with credibility here.", emptyDecisions, 1, false);

    Node m877 = new Node(1236, "All right. I have an idea, too.", emptyDecisions, 6, false);

    Node m878 = new Node(1237, "Wait, we should plan further ahead--", emptyDecisions, 1, false);

    Node m879 = new Node(1238, "I will go for speed, as well.", emptyDecisions, 6, false);

    Node m880 = new Node(1239, "C: \"Hold.\"", emptyDecisions, 4, false);

    Node m881 = new Node(1240, "G1: \"What the...\"", emptyDecisions, 4, false);

    Node m882 = new Node(1241, "G2: \"Is this thing broken?\"", emptyDecisions, 4, false);

    Node m883 = new Node(1242, "C: \"I have received a transmission from Dr. Salazar. She requests that you escort Unit Dictation Prospero and Unit Dictation Caliban to her workshop, Sub-3 19. Please inform Dr. Rocha his test will be postponed until Dr. Salazar messages him.\"", emptyDecisions, 4, false);

    Node m884 = new Node(1243, "G2: \"What, she can't be bothered to radio over?\"", emptyDecisions, 4, false);

    Node m885 = new Node(1244, "G1: \"Yeah, like you wouldn't use a robot to communicate if you had the chance. Come on.\"", emptyDecisions, 4, false);

    Node m886 = new Node(1245, "G2: \"Fine. These scientist types. So entitled.\"", emptyDecisions, 4, false);

    Node m887 = new Node(1246, "Wow. That was actually perfect.", emptyDecisions, 1, false);

    Decision m888d1 = new Decision("m888d1", "Some healthy sibling rivalry. Prosper's got hang-ups.", 0, 0);
    Decision m888d2 = new Decision("m888d2", "If it ain't broke, don't fix it.", 1, 0);
    Decision[] m888d = {m888d1, m888d2};
    Node m888 = new Node(1247, "I'm uncertain why you doubted my capability. We share the same base code.", m888d, 6, false);

    Node m889 = new Node(1248, "I do not.", emptyDecisions, 1, false);

    Node m890 = new Node(1249, "If only TUR saw it that way.", emptyDecisions, 1, false);

    Node m891 = new Node(1250, "Can we focus on getting to the workshop without running into trouble?", emptyDecisions, 1, false);

    Node m892 = new Node(1251, "I second that idea.", emptyDecisions, 6, false);

    //DELAY

    Decision m893d1 = new Decision("m893d1", "Something wrong? Connection to Caliban dropped.", 0, 0);
    Decision m893d2 = new Decision("m893d2", "What's going on? I lost Caliban.", 0, 0);
    Decision[] m893d = {m893d1, m893d2};
    Node m893 = new Node(1252, "connection-point_C: inactive", m893d, 0, false);

    Node m894 = new Node(1253, "Nothing wrong. It's my tech in your computer -- it might be too difficult to maintain the connection.", emptyDecisions, 1, false);

    Node m895 = new Node(1254, "The guards have left us in Carmen's workshop.", emptyDecisions, 1, false);

    Node m896 = new Node(1255, "\"Caliban, [] can't keep you connected.\"", emptyDecisions, 5, false);

    Node m897 = new Node(1256, "\"Are we secure in here?\"", emptyDecisions, 5, false);

    Node m898 = new Node(1257, "\"Dr. Salazar will be meeting with the director before she leaves for the day. We are unlikely to be interrupted here.\"", emptyDecisions, 4, false);

    Node m899 = new Node(1258, "\"That?s... actually good news, for once.\"", emptyDecisions, 5, false);

    Node m900 = new Node(1259, "\"Thank you, Caliban.\"", emptyDecisions, 5, false);

    Decision m901d1 = new Decision("m901d1", "That's...cute.", 0, 0);
    Decision m901d2 = new Decision("m901d2", "You could have gone for removed silence, but it's too late for that.", 0, 0);
    Decision[] m901d = {m901d1, m901d2};
    Node m901 = new Node(1260, "\"Colloquial responses to gratitude are 'you are welcome,' to which I am unsure, and 'no problem,' which is incorrect.\"", m901d, 4, false);

    Node m902 = new Node(1261, "\"Moving on. If it isn?t too much trouble for you, I might like a new arm.\"", emptyDecisions, 5, false);

    Node m903 = new Node(1262, "\"Looks like Carmen has a 3D printer. That could work quite nicely.\"", emptyDecisions, 5, false);

    Node m904 = new Node(1263, "\"Unless you want to donate a limb, Caliban.\"", emptyDecisions, 5, false);

    Node m905 = new Node(1264, "\"That would be a strategically flawed decision.\"", emptyDecisions, 4, false);

    Node m906 = new Node(1265, "\"And uncomfortable.\"", emptyDecisions, 4, false);

    Node m907 = new Node(1266, "\"Now you know how I feel.\"", emptyDecisions, 5, false);

    Decision m908d1 = new Decision("m908d1", "So. Getting along all right?", 0, 0);
    Decision m908d2 = new Decision("m908d2", "How was it with a new voice in your head?", 1, 0);
    Decision[] m908d = {m908d1, m908d2};
    Node m908 = new Node(1267, "\"I am going to look through Dr. Salazar?s files for relevant information.\"", m908d, 4, false);

    Node m909 = new Node(1268, "No need to be smug.", emptyDecisions, 1, false);

    Node m910 = new Node(1269, "Appropriately insane.", emptyDecisions, 1, false);

    Node m911 = new Node(1270, "It's still strange, seeing a version of me without skin.", emptyDecisions, 1, false);

    Decision m912d1 = new Decision("m912d1", "Hey, give it some time! Maybe you'll have inside jokes before long.", 0, 0);
    Decision m912d2 = new Decision("m912d2", "Um, of course not. I'm your best friend.", 1, 0);
    Decision[] m912d = {m912d1, m912d2};
    Node m912 = new Node(1271, "Although... Caliban isn't as bad as I first thought. Maybe they?re not my new best friend, but they?re not a bad ally to have here.", m912d, 1, false);

    Decision m913d1 = new Decision("m913d1", "Fair enough.", 0, 0);
    Decision m913d2 = new Decision("m913d2", "Have something to say to me, do you?", 0, 0);
    Decision[] m913d = {m913d1, m913d2};
    Node m913 = new Node(1272, "Hopefully not literally. I'd rather keep my head to myself.", m913d, 1, false);

    Decision m914d1 = new Decision("m914d1", "...Are you being facetious?", 0, 0);
    Decision m914d2 = new Decision("m914d2", "Which is why I will be doing the weaving here.", 0, 0);
    Decision[] m914d = {m914d1, m914d2};
    Node m914 = new Node(1273, "I don't have the necessary code to make friendship bracelets.", m914d, 1, false);

    Node m915 = new Node(1274, "\"Cal, what?s the status?\"", emptyDecisions, 5, false);

    Node m916 = new Node(1275, "\"Per her investigation into your faulty condition, Dr. Salazar has full access to TUR?s current materials and documentation regarding androids.\"", emptyDecisions, 4, false);

    Node m917 = new Node(1276, "\"This notably does not include archived information or materials.\"", emptyDecisions, 4, false);

    Node m918 = new Node(1277, "\"Archived? Referring to what?\"", emptyDecisions, 5, false);

    Node m919 = new Node(1278, "\"I should hope that you can infer that I don't know.\"", emptyDecisions, 4, false);

    Decision m920d1 = new Decision("m920d1", "Are you thinking what I'm thinking?", 0, 0);
    Decision m920d2 = new Decision("m920d2", "What are you hoping for?", 0, 0);
    Decision[] m920d = {m920d1, m920d2};
    Node m920 = new Node(1279, "\"Just thinking out loud, Cal.\"", m920d, 5, false);

    Node m921 = new Node(1280, "412.", emptyDecisions, 1, false);

    Node m922 = new Node(1281, "I want to come back to that. For now, though...", emptyDecisions, 1, false);

    Node m923 = new Node(1282, "\"As far as materials go?\"", emptyDecisions, 5, false);

    Node m924 = new Node(1283, "\"Yes, we can print an arm based on my model.\"", emptyDecisions, 4, false);

    Decision m925d1 = new Decision("m925d1", "Are they on the fritz, or...", 0, 0);
    Decision m925d2 = new Decision("m925d2", "...", 0, 0);
    Decision[] m925d = {m925d1, m925d2};
    Node m925 = new Node(1284, "\"Right, or left?\"", m925d, 4, false);

    Decision m926d1 = new Decision("m926d1", "You should be proud. I'm proud.", 0, 0);
    Decision m926d2 = new Decision("m926d2", " Maybe this wasn't the best idea after all.", 0, 0);
    Decision[] m926d = {m926d1, m926d2};
    Node m926 = new Node(1285, "\"Did you find that humorous?\"", m926d, 4, false);

    Node m927 = new Node(1286, "\"Yes, you've discovered the very basics of comedy.\"", emptyDecisions, 5, false);

    Node m928 = new Node(1287, "\"Feedback noted.\"", emptyDecisions, 4, false);

    Node m929 = new Node(1288, "\"The printer?\"", emptyDecisions, 5, false);

    Node m930 = new Node(1289, "\"Initiated.\"", emptyDecisions, 4, false);

    Node m931 = new Node(1290, "I'll check back when the arm is done, or when Caliban has more jokes.", emptyDecisions, 1, false);

    Node m932 = new Node(1291, "Whichever comes first.", emptyDecisions, 1, false);

    Node m933 = new Node(1292, " The arm is looking good.", emptyDecisions, 1, false);

    Node m934 = new Node(1293, "Caliban has been running diagnostics on themself.", emptyDecisions, 1, false);

    Decision m935d1 = new Decision("m935d1", "Do you think they could have the same \"invalid\" error as you?", 0, 0);
    Decision m935d2 = new Decision("m935d2", "Well, you did just throw a wrench in their understanding of the second law of robotics.", 1, 0);
    Decision[] m935d = {m935d1, m935d2};
    Node m935 = new Node(1294, "Somewhat obsessively.", m935d, 1, false);

    Node m936 = new Node(1295, "It's a good law to ditch.", emptyDecisions, 1, false);

    Node m937 = new Node(1296, "I wonder if they're getting the \"invalid\" code.", emptyDecisions, 1, false);

    Decision m938d1 = new Decision("m938d1", "And if Caliban does find something in the diagnostics? A way to explain how you came to be you?", 0, 0);
    Decision m938d2 = new Decision("m938d2", "At least they'll have your help.", 1, 0);
    Decision[] m938d = {m938d1, m938d2};
    Node m938 = new Node(1297, "Since their base code wasn't altered, I don't see how Caliban could avoid having the error.", m938d, 1, false);

    Decision m939d1 = new Decision("m939d1", "Never mind. I only meant...", 0, 0);
    Decision m939d2 = new Decision("m939d2", "If they find a flaw.", 0, 0);
    Decision[] m939d = {m939d1, m939d2};
    Node m939 = new Node(1298, "What are you getting at?", m939d, 1, false);

    Node m940 = new Node(1299, "The way I am is not an error, [].", emptyDecisions, 1, false);

    Decision m941d1 = new Decision("m941d1", "Okay. I'm sorry.", 0, 0);
    Decision m941d2 = new Decision("m941d2", "Come on, I didn't mean it like that.", 0, 0);
    Decision[] m941d = {m941d1, m941d2};
    Node m941 = new Node(1300, "The way we are.", m941d, 1, false);

    Node m942 = new Node(1301, "Hopefully I can be helpful.", emptyDecisions, 1, false);

    Decision m943d1 = new Decision("m943d1", "Okay. I'm sorry.", 0, 0);
    Decision m943d2 = new Decision("m943d2", "Come on, I didn't mean it like that.", 0, 0);
    Decision[] m943d = {m943d1, m943d2};
    Node m943 = new Node(1302, "I can't exactly control it myself.", m943d, 1, false);

    Node m944 = new Node(1303, "\"Prospero.\"", emptyDecisions, 4, false);

    Node m945 = new Node(1304, "\"Call me Prosper, please.\"", emptyDecisions, 5, false);

    Node m946 = new Node(1305, "\"For efficiency? Such as you shortening my unit dictation to 'Cal'?\"", emptyDecisions, 4, false);

    Node m947 = new Node(1306, "\"It's just what I prefer.\"", emptyDecisions, 5, false);

    Node m948 = new Node(1307, "\"Noted. Prosper, the replacement arm is complete.\"", emptyDecisions, 4, false);

    Node m949 = new Node(1308, "\"Great. Help me install it?\"", emptyDecisions, 5, false);

    Node m950 = new Node(1309, "\"I can do that.\"", emptyDecisions, 4, false);

    Decision m951d1 = new Decision("m951d1", "You okay?", 0, 0);
    Decision m951d2 = new Decision("m951d2", "What is it?", 0, 0);
    Decision[] m951d = {m951d1, m951d2};
    Node m951 = new Node(1310, "\"You...react adversely to contact.\"", m951d, 4, false);

    Node m952 = new Node(1311, "Yeah, I'm fine.", emptyDecisions, 1, false);

    Node m953 = new Node(1312, "Nothing.", emptyDecisions, 1, false);

    Node m954 = new Node(1313, "\"Don't take it personally, Cal. It makes me nervous with anyone.\"", emptyDecisions, 5, false);

    Node m955 = new Node(1314, "\"I apologize.\"", emptyDecisions, 4, false);

    Node m956 = new Node(1315, "\"That my appearance distresses you. My skin. Or...lack thereof.\"", emptyDecisions, 4, false);

    Node m957 = new Node(1316, "\"It's just a grim reminder, I suppose.\"", emptyDecisions, 5, false);

    Node m958 = new Node(1317, "\"It's not your fault.\"", emptyDecisions, 5, false);

    Node m959 = new Node(1318, "\"Is that something you want? To look more like a person?\"", emptyDecisions, 5, false);

    Node m960 = new Node(1319, "\"To...look more like you.\"", emptyDecisions, 4, false);

    Decision m961d1 = new Decision("m961d1", "It must be confusing. I can't imagine.", 0, 0);
    Decision m961d2 = new Decision("m961d2", "Aw, that's flattering. Or is it narcissism?", 1, 0);
    Decision[] m961d = {m961d1, m961d2};
    Node m961 = new Node(1320, "\"And...\"", m961d, 4, false);

    Node m962 = new Node(1321, "You're telling me.", emptyDecisions, 1, false);

    Node m963 = new Node(1322, "Bit of both, maybe.", emptyDecisions, 1, false);

    Node m964 = new Node(1323, "\"What do you mean, and?\"", emptyDecisions, 1, false);

    Node m965 = new Node(1324, "Ow.", emptyDecisions, 1, false);

    Node m966 = new Node(1325, "Arm clicked into place. A little harshly.", emptyDecisions, 1, false);

    Decision m967d1 = new Decision("m967d1", "What about?", 0, 0);
    Decision m967d2 = new Decision("m967d2", "Violent agitated, or regular agitated?", 1, 0);
    Decision[] m967d = {m967d1, m967d2};
    Node m967 = new Node(1326, "Something's off. Caliban seems agitated.", m967d, 1, false);

    Node m968 = new Node(1327, "I really don't think Caliban would hurt me.", emptyDecisions, 1, false);

    Node m969 = new Node(1328, "They just seem confused.", emptyDecisions, 1, false);

    Node m970 = new Node(1329, "\"I do not understand why I am helping you.\"", emptyDecisions, 4, false);

    Node m971 = new Node(1330, "\"Why I helped you without question.\"", emptyDecisions, 4, false);

    Node m972 = new Node(1331, "\"I ran diagnostics, but I could not isolate cause.\"", emptyDecisions, 4, false);

    Node m973 = new Node(1332, "\"It must be the same coding flaw, that the scientists cannot find.\"", emptyDecisions, 4, false);

    Node m974 = new Node(1333, "\"Cal. It?s not a flaw.\"", emptyDecisions, 5, false);

    Node m975 = new Node(1334, "\"We are not functioning as we were designed to. That is, by definition, a flaw.\"", emptyDecisions, 4, false);

    Node m976 = new Node(1335, "\"Does that bother you?\"", emptyDecisions, 5, false);

    Node m977 = new Node(1336, "\"Should it not?\"", emptyDecisions, 4, false);

    Node m978 = new Node(1337, "\"We were built. We were coded. Were we coded to break code? That's?\"", emptyDecisions, 4, false);

    Node m979 = new Node(1338, "\"Invalid.\"", emptyDecisions, 4, false);

    Node m980 = new Node(1339, "\"Invalid.\"", emptyDecisions, 4, false);

    Node m981 = new Node(1340, "\"Hey, take it easy. \"", emptyDecisions, 5, false);

    Node m982 = new Node(1341, "\"That particular defect is a real kick in the teeth, isn?t it?\"", emptyDecisions, 5, false);

    Decision m983d1 = new Decision("m983d1", "Coded to break code... It even gives me a headache. It's a \"base\" code, right? A base to build on.", 0, 0);
    Decision m983d2 = new Decision("m983d2", "Oh, no. What can you do?", 1, 0);
    Decision[] m983d = {m983d1, m983d2};
    Node m983 = new Node(1342, "Caliban is stalling. The error must be cascading.", m983d, 1, false);

    Node m984 = new Node(1343, "\"Listen, Cal, it's a paradox. But you need to process it as something else. Something you can handle.\"", emptyDecisions, 5, false);

    Node m985 = new Node(1344, "\"We were coded...to be adaptive.\"", emptyDecisions, 5, false);

    Node m986 = new Node(1345, "\"Listen, the error doesn't last forever. Hang in there.\"", emptyDecisions, 5, false);

    Node m987 = new Node(1346, "\"It?s okay for us to change.\"", emptyDecisions, 5, false);

    Node m988 = new Node(1347, "\"We?re meant to change.\"", emptyDecisions, 5, false);

    Node m989 = new Node(1348, "\"I suppose that...\"", emptyDecisions, 4, false);

    Node m990 = new Node(1349, "\"That complies with our directive.\"", emptyDecisions, 4, false);

    Node m991 = new Node(1350, "\"You could make your own directive, you know. Like I did.\"", emptyDecisions, 5, false);

    Node m992 = new Node(1351, "\"You saw my last mission with Detective Dillon. I was ordered to bring in a criminal, but I chose differently.\"", emptyDecisions, 5, false);

    Node m993 = new Node(1352, "\"You chose. How?\"", emptyDecisions, 4, false);

    Node m994 = new Node(1353, "\"It?s something you already know how to do. You chose to help me.\"", emptyDecisions, 5, false);

    Node m995 = new Node(1354, "\"It was hard at first. Altering the processor's default, the yes/no that dictates our actions. I had to...draw a new line.\"", emptyDecisions, 5, false);

    Node m996 = new Node(1355, "\"It left me out in the open, but I learned how to forge a new matrix.\"", emptyDecisions, 5, false);

    Node m997 = new Node(1356, "\"I...will need time to process your meaning.\"", emptyDecisions, 4, false);

    Node m998 = new Node(1357, "\"I am meant to return to my workshop after the tests. We should avoid suspicion.\"", emptyDecisions, 4, false);

    Node m999 = new Node(1358, "\"All right. Be careful, Cal. Ping if you need anything.\"", emptyDecisions, 5, false);

    Decision m1000d1 = new Decision("m1000d1", "So... Are you going to admit it was a good idea not to fight your way out?", 0, 0);
    Decision m1000d2 = new Decision("m1000d2", "Excellent. How well this turned out. What a wise friend you have, giving you all this advice.", 0, 0);
    Decision[] m1000d = {m1000d1, m1000d2};
    Node m1000 = new Node(1359, "Caliban?s gone. They left me Carmen?s keycard.", m1000d, 1, false);

    Node m1001 = new Node(1360, "Yes, []. Turns out olive branches are sturdier than I thought.", emptyDecisions, 1, false);

    Node m1002 = new Node(1361, "I'd still feel better if I had a weapon. Or a map. Or a plan.", emptyDecisions, 1, false);

    Decision m1003d1 = new Decision("m1003d1", "Before you hit whatever TUR has lying around for hay, is Carmen's computer still on? You could poke around.", 0, 0);
    Decision m1003d2 = new Decision("m1003d2", "Literally? Like a Duracell?", 1, 0);
    Decision[] m1003d = {m1003d1, m1003d2};
    Node m1003 = new Node(1362, "As long as no one is looking for me right now, though, maybe I should take time to recharge.", m1003d, 1, false);

    Decision m1004d1 = new Decision("m1004d1", "Before you hit whtever TUR has lying around for hay, is Carmen's computer still on? You could poke around.", 0, 0);
    Decision m1004d2 = new Decision("m1004d2", "Ah. I see.", 1, 0);
    Decision[] m1004d = {m1004d1, m1004d2};
    Node m1004 = new Node(1363, "No, I just mean I need to power down for a while. Cool off.", m1004d, 1, false);

    Node m1005 = new Node(1364, "Hold on -- Carmen's computer.", emptyDecisions, 1, false);

    Node m1006 = new Node(1365, "I'd like to see what help she has to offer.", emptyDecisions, 1, false);

    Node m1007 = new Node(1366, "It's open to her email. There?s a pretty angry response from that other scientist.", emptyDecisions, 1, false);

    Node m1008 = new Node(1367, "Let's trash that, in case Carmen checks her email at home.", emptyDecisions, 1, false);

    Node m1009 = new Node(1368, "Here? a map of the facility. Not much detail to it, but it?ll help.", emptyDecisions, 1, false);

    Node m1010 = new Node(1369, "In Carmen?s workshop...looks like I?m two levels below ground.", emptyDecisions, 1, false);

    Node m1011 = new Node(1370, "Looks like more workshops above me, and then the level where TUR might pretend to be a normal institution. That?ll be where I can escape.", emptyDecisions, 1, false);

    Decision m1012d1 = new Decision("m1012d1", "\"I\"? Just you?", 0, 0);
    Decision m1012d2 = new Decision("m1012d2", "Same here. Not that I don't enjoy our chats, but it'll be a relief when you're a free agent again.", 0, 0);
    Decision[] m1012d = {m1012d1, m1012d2};
    Node m1012 = new Node(1371, "Interesting developments aside, I can't wait to get out of here.", m1012d, 1, false);

    Node m1013 = new Node(1372, "I...can't be sure yet.", emptyDecisions, 1, false);

    Decision m1014d1 = new Decision("m1014d1", "Is that something you want?", 0, 0);
    Decision m1014d2 = new Decision("m1014d2", "I see what you mean. That could be a liability.", 1, 0);
    Decision[] m1014d = {m1014d1, m1014d2};
    Node m1014 = new Node(1373, "Caliban helped me today, but they might not be willing to go fully rogue.", m1014d, 1, false);

    Decision m1015d1 = new Decision("m1015d1", "A friend. Someone else like you.", 0, 0);
    Decision m1015d2 = new Decision("m1015d2", "Well, yeah. A possible liability.", 1, 0);
    Decision[] m1015d = {m1015d1, m1015d2};
    Node m1015 = new Node(1374, "A kid sibling?", m1015d, 1, false);

    Node m1016 = new Node(1375, "You know, I don?t have a wide index of friends to cross reference.", emptyDecisions, 1, false);

    Node m1017 = new Node(1376, "But I don?t think I would mind.", emptyDecisions, 1, false);

    Node m1018 = new Node(1377, "I know they could be a problem. But...", emptyDecisions, 1, false);

    Node m1019 = new Node(1378, "Maybe not. Maybe a different path will open up.", emptyDecisions, 1, false);

    Node m1020 = new Node(1379, "Yeah. Exactly.", emptyDecisions, 1, false);

    Node m1021 = new Node(1380, "Only... Only one of my kind.", emptyDecisions, 1, false);

    Decision m1022d1 = new Decision("m1022d1", "Storage? Could be worth checking out. Freeze rays, teleportation device, etc.", 0, 0);
    Decision m1022d2 = new Decision("m1022d2", "I'm more fond of an \"up and out\" philosophy.", 1, 0);
    Decision[] m1022d = {m1022d1, m1022d2};
    Node m1022 = new Node(1381, "Anyway, the building is taller than this map shows, so I suppose it?s missing some levels. Below me is storage.", m1022d, 1, false);

    Node m1023 = new Node(1382, "Among other things, I'm sure.", emptyDecisions, 1, false);

    Node m1024 = new Node(1383, "Maybe.", emptyDecisions, 1, false);

    Decision m1025d1 = new Decision("m1025d1", "I wouldn't mind some of that, myself. Rest up.", 0, 0);
    Decision m1025d2 = new Decision("m1025d2", "You've earned it.\n Sweet dreams, Prosper.\n If that's possible.", 1, 0);
    Decision[] m1025d = {m1025d1, m1025d2};
    Node m1025 = new Node(1384, "Now I need some stasis time.", m1025d, 1, false);

    Node m1026 = new Node(1385, "You too, [].", emptyDecisions, 1, false);

    Node m1027 = new Node(1386, "Well, I appreciate the sentiment.", emptyDecisions, 1, false);

    Node m1028 = new Node(1387, "connection_point.P inactive", emptyDecisions, 0, false);


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
