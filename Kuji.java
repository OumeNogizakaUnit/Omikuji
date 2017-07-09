import java.util.Random;

class Kuji{
    int type;
    String[] typeStr = { "大吉", "中吉", "凶", "中井りかちゃん"};
    
    void shuffle(){
        Random rnd = new Random();
        this.type = rnd.nextInt(typeStr.length);
    }
    String getResult() {
        return this.typeStr[this.type];
    }
}
