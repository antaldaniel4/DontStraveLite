package DSL;

public class Karakter {
    private int HP;
    private int Ehseg;
    private int Agy;

    public Karakter(int HP, int ehseg, int agy) {
        this.HP = ertekHatar(HP);
        this.Ehseg = ertekHatar(ehseg);
        this.Agy = ertekHatar(agy);
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = ertekHatar(HP);
    }

    public int getEhseg() {
        return Ehseg;
    }

    public void setEhseg(int ehseg) {
        Ehseg = ertekHatar(ehseg);
    }

    public int getAgy() {
        return Agy;
    }

    public void setAgy(int agy) {
        Agy = ertekHatar(agy);
    }

    public int ertekHatar(int szam){        // 0...100 közé kerül minden esetben
        if (szam < 100 ){
            return szam;
        }else if (szam < 0){
            return 0;
        }
        return 100;
    }
}
