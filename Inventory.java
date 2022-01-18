package DSL;

public class Inventory {
    //nyers anyag
    private int fa;
    private int ko;
    private int fu;
    private int gally;
    private int virag;

    //Kaja

    private int bogyo;            //TODO eh: 10  elet: -5 agy: 1
    private int repa;             //TODO eh: 10  elet: 0 agy: 1
    private int fottBogyo;        //TODO eh: 8  elet: 0 agy: 2
    private int fottRepa;         //TODO eh: 8  elet: 2 agy: 3


    //Eszkoz

    private int fejsze;
    private int csakany;
    private int tabortuz;
    private int viragkoszoru;

//  Getter&setter
    public int getFa() {
        return fa;
    }
    public void setFa(int fa) {
        this.fa = fa;
    }
    public int getKo() {
        return ko;
    }
    public void setKo(int ko) {
        this.ko = ko;
    }
    public int getFu() {
        return fu;
    }
    public void setFu(int fu) {
        this.fu = fu;
    }
    public int getGally() {
        return gally;
    }
    public void setGally(int gally) {
        this.gally = gally;
    }
    public int getVirag() {
        return virag;
    }
    public void setVirag(int virag) {
        this.virag = virag;
    }
    public int getFejsze() {
        return fejsze;
    }
    public void setFejsze(int fejsze) {
        this.fejsze = fejsze;
    }
    public int getCsakany() {
        return csakany;
    }
    public void setCsakany(int csakany) {
        this.csakany = csakany;
    }
    public int getTabortuz() {
        return tabortuz;
    }
    public void setTabortuz(int tabortuz) {
        this.tabortuz = tabortuz;
    }
    public int getViragkoszoru() {
        return viragkoszoru;
    }
    public void setViragkoszoru(int viragkoszoru) {
        this.viragkoszoru = viragkoszoru;
    }
    public int getBogyo() {
        return bogyo;
    }
    public void setBogyo(int bogyo) {
        this.bogyo = bogyo;
    }

    public int getRepa() {
        return repa;
    }
    public void setRepa(int repa) {
        this.repa = repa;
    }
    public int getFottBogyo() {
        return fottBogyo;
    }
    public void setFottBogyo(int fottBogyo) {
        this.fottBogyo = fottBogyo;
    }
    public int getFottRepa() {
        return fottRepa;
    }
    public void setFottRepa(int fottRepa) {
        this.fottRepa = fottRepa;
    }
    //2 constructor

    public Inventory() {
        this.fa = 0;
        this.ko = 0;
        this.fu = 0;
        this.gally = 0;
        this.virag = 0;
        this.bogyo = 0;
        this.repa = 0;
        this.fottBogyo = 0;
        this.fottRepa = 0;
        this.fejsze = 0;
        this.csakany = 0;
        this.tabortuz = 0;
        this.viragkoszoru = 0;
    }


    // Eszkoz keszites
    // TODO  atkerul Action class ba

    public void makeFejsze(){           //TODO elettartam 10  ; 1ktg
        if (fu >=2 && gally >= 3 ){
            fejsze++;
            fu = fu - 2;
            gally = gally -3;
        }
        System.err.println("Nincs eleg nyersanyag!");
    }

    public void makeCsakany(){          //TODO elettartam 7   ; 1ktg
        if (fa >=2 && fu >= 2 ){
            csakany++;
            fa = fa - 2;
            fu = fu - 2;
        }
        System.err.println("Nincs eleg nyersanyag!");
    }

    public void makeTuz(){                      //TODO tuz paramteri + constructor elettertem 1 ejszaka  ; 1ktg
        if (fa >=2 && fu >= 2 && ko >=4 ){

            fa = fa - 2;
            fu = fu - 2;
            ko = ko - 4;
        }
        System.err.println("Nincs eleg nyersanyag!");
    }

    public void makeKoszoru(){              //TODO elettartam 15 nap ; 1ktg
        if (virag>=10 ){
            viragkoszoru++;
            virag = virag -10;
        }
        System.err.println("Nincs eleg nyersanyag!");
    }

    public void fozBogyo(){              //TODO ha tuz van ? ; 1ktg
        if (bogyo>=1 ){
            fottBogyo++;
            bogyo--;
        }
        System.err.println("Nincs eleg nyersanyag!");
    }

    public void fozRepa(){              //TODO ha tuz van?  ; 1ktg
        if (repa>=1 ){
            fottRepa++;
            repa--;
        }
        System.err.println("Nincs eleg nyersanyag!");
    }



}
