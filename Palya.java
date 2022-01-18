package DSL;
import java.util.Random;

public class Palya {

    // Konstalsok (elemek számra fordítása)

    public static final int fold = 0;
    public static final int fa =6;
    public static final int ko = 2;
    public static final int fu = 3;
    public static final int gally = 4;
    public static final int virag = 5;
    public static final int viz =1;



    private int map[][];
    private boolean nappal;    //True: Nappal

    public Palya(int[][] map, boolean nappal) {
        this.map = map;
        this.nappal = nappal;
    }

    public Palya() {
        this.map[100][100] =0;
        this.nappal = true;
        int a =map.length;
    }

    public int[][] getMap() {
        return map;
    }


    public boolean isNappal() {
        return nappal;
    }

    public void setNapszak(boolean napszak) {
        this.nappal = napszak;
    }




    public void palyageneral(){

        Random random = new Random();

        for (int i = 1; i <= 6; i++) {               // minden anyagon végighaladva feltöltöm a pályát. seged fv a gen
            switch (i){                             // switch minden elemet random helyre dob
                case viz:
                            //TODO vizet helyfoglal
                    int vizX = random.nextInt(map[0].length);       //kezdopont
                    int vizY = random.nextInt(map[1].length);
                    int areaX =   random.nextInt(20);       //terület magassag szeressege kezdopontol
                    int areaY =   random.nextInt(20);

                    for (int j = vizX; j < areaX; j++) {
                        for (int k = vizY; k < areaY; k++) {
                            map[j][k] = viz;

                        }
                    }

                    break;
                case fa:
                    gen(fa,25,40);
                    break;

                case ko:
                    gen(ko,5,15);
                    break;

                case fu:
                    gen(fu,15,30);
                    break;

                case gally:
                    gen(gally,15,30);
                    break;
                case virag:
                    gen(virag,5,15);
                    break;

                default:break;
            }

        }



    }
    private void gen(int anyag, int tol, int ig){
        Random random = new Random();

        int darab = tol +random.nextInt(ig-tol);   // aranyokat betartujk

        for (int i = 0; i < darab; i++) {
            int x = random.nextInt(map[0].length); 
            int y = random.nextInt(map[1].length);


            while ( map[x][y] != 0 ){                       // csak ures helyre rakom le
                x = random.nextInt(map[0].length);
                y = random.nextInt(map[1].length);
            }

            map[x][y] = anyag;
        }



    }


}


