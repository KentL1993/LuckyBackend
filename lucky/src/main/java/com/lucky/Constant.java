package com.lucky;

public enum Constant {
  PRIZE_1("prize_1"),
  PRIZE_2("prize_2"),
  PRIZE_3("prize_3"),
  A("a"),
  B("b"),
  C("c"),
  D("d"),
  E("e"),
  F("f"),
  G("g"),
  H("h"),
  I("i"),
  J("j"),
  K("k"),
  L("l"),
  M("m"),
  N("n"),
  O("o"),
  P("p"),
  Q("q"),
  R("r"),
  S("s"),
  T("t"),
  U("u"),
  V("v"),
  W("w");
  
  private final String value;
  
  Constant(String value) {
    this.value = value;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public static Constant getObjByValue(String value) {
    for (Constant obj : values()) {
      if (obj.value.equals(value))
        return obj; 
    } 
    return null;
  }
}