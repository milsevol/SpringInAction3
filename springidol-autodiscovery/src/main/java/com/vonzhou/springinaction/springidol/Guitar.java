package com.vonzhou.springinaction.springidol;

import org.springframework.stereotype.Component;

@Component("Guitar")
public class Guitar implements Instrument {
  public void play() {
    System.out.println("Guitar strum strum");
  }
}