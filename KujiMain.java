/**
* -*- coding: utf-8 -*-
* vi: set expandtab sw=4 ts=4 :
*/

public  class KujiMain{
  public static void main(String[] args) {
    Kuji k = new Kuji();
    k.shuffle();
    System.out.println(k.getResult());
  }
}
