import java.util.Random;
/**
* -*- coding: utf-8 -*-
* vi: set expandtab sw=4 ts=4 :
*/

class Kuji{
    int type;
    String[] typeStr = { "大吉", "中吉", "凶"};
    
    void shuffle(){
        Random rnd = new Random();
        this.type = rnd.nextInt(typeStr.length);
        //System.out.println(this.type);
    }
    String display() {
        return "大吉";
    }
}
