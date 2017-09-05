/**
* -*- coding: utf-8 -*-
* vi: set expandtab sw=4 ts=4 :
*/
import java.util.Random;

public class Kuji{
    int type;
    String[] typeStr = { "大吉", "中吉", "凶", "中井りかちゃん"};
    
    public void shuffle(){
        Random rnd = new Random();
        this.type = rnd.nextInt(typeStr.length);
    }
    public String getResult() {
        return this.typeStr[this.type];
    }
}
