public class Main {
    public static void buborekRendez(Diak[] tomb){
        int n = 1;
        for (int j = 0; j < tomb.length - 1; j++) {
            for (int i = 0; i < tomb.length - 1-j; i++) {
                if (tomb[i].getNev().compareTo(tomb[i + 1].getNev())>0) {
                    Diak tmp;
                    tmp = tomb[i];
                    tomb[i] = tomb[i+1];
                    tomb[i+1] = tmp;

                }
            }
        }
    }
    public static void main(String[] args) {
        // int[] szamok = new int[2]
        int maxP = 100;
        Diak[] diakok = new Diak[5];

        Diak d1 = new Diak("Béla", 89);
        d1.osztalyoz(maxP);
        System.out.println(d1.getNev()+ "jegye: " + d1.getJegy());


        Diak d2 = new Diak("Eszter", 67,maxP);

        InformatikusDiak idiak1 = new InformatikusDiak("Bill Gates",12,"C#");
        idiak1.osztalyoz(maxP);
       // idiak1.kiir();

        diakok[0] = d1;
        diakok[1] = d2;
        diakok[2] = idiak1;
        diakok[3] = new Diak("Péter", 63, maxP);
        diakok[4] = new Diak("Juci", 87, maxP);

       /* for (Diak d:diakok) {
            d.kiir();
        }*/
      /*  for (int i = 0; i < diakok.length; i++) {
            diakok[i].kiir();
        }*/
       // System.out.println(d1.nev +"jegye: " +d1.jegy+ " ("+ d1.elertPont+ "pont)" );
        //System.out.println(d2.nev +"jegye: " +d2.jegy+ " ("+ d2.elertPont+ "pont)" );
        buborekRendez(diakok);
        for (int i = 0; i < diakok.length; i++) {
            diakok[i].kiir();
        }
    }
}