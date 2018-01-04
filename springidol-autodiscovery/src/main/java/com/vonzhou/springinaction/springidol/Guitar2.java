package com.vonzhou.springinaction.springidol;

import org.springframework.stereotype.Component;

@Component("Guitar2")
public class Guitar2 implements Instrument {
  public void play() {
    System.out.println("Guitar2 strum strum");
  }
}