package com.thesisapp.game.controller;

import com.thesisapp.game.model.Decide;
import com.thesisapp.game.model.SimpleNode;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DecideController {

  //@CrossOrigin(origins = "https://localhost:3000")
  @RequestMapping(value="/decide", method= RequestMethod.POST)
  public ResponseEntity<SimpleNode> decide(@RequestBody Decide decide) {
    SimpleNode currentNode = decide.getNode();
    return new ResponseEntity<SimpleNode>(currentNode, HttpStatus.OK);
  }
}
