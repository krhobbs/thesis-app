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
    Decision n30d2 = new Decision("n30d2", "Well, can you at least hint at what happened?", 0, 0);
    Decision[] n30d = {n30d1, n30d2};
    Node n30 = new Node(30, "You do that.", n30d, 1, false);

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
    Node n84 = new Node(84, "I didn't get the change to put much thought into it, but maybe I don't need to.", emptyDecisions, 1,  false);
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
    Node n92 = new Node(92, "But that doesn't mean you should try to get my recommissioned. It won't work, even if you could still contact TUR.", emptyDecisions, 1, false);
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
    Decision n100d2 = new Decision("n100d2", "Assumption retracted. Well, keep going. This sounds heavy, and it's a weight you probably need off your shoulders.", 1, 0);
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
    Decision[] n129d = {n129d1, n129d1};
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
    Node n136 = new Node(136, "signal lost", emptyDecisions, 1, false);
    Node n137 = new Node(137, "status...disconnected", emptyDecisions, 1, false);
    Node n138 = new Node(138, "shut down", emptyDecisions, 1, false);
    Node n139 = new Node(139, "3", emptyDecisions, 1, false);
    Node n140 = new Node(140, "2", emptyDecisions, 1, false);
    Node n141 = new Node(141, "1", emptyDecisions, 1, false);

    //WAIT 3 HOURS, IF THE ATTEMPT TO PLAY AGAIN WITHIN 3 HOURS (ADD A MESSAGE THAT SENDS - MAY HAVE TO BE CLIENT SIDE)

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

    n24.addChild(n31);

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

    n42.addChild(n43);

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

    return n0;
  }

}
