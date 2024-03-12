package com.ezyfoxserver.service;

import com.tvd12.ezyfox.bean.annotation.EzySingleton;

@EzySingleton
public class Greeting {

  public String greet(String who) {
    return "Greet " + who + "!";
  }
}
