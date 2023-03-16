public class Diak {
    private String nev;
    private int elertPont;
    private int jegy;

    public Diak() {
    }

    public Diak(String nev, int elertPont) {
        this.nev = nev;
        this.elertPont = elertPont;

    }
     public Diak(String nev, int elertPont, int maxP) {
        this.nev = nev;
        this.elertPont = elertPont;
        osztalyoz(maxP);

    }

    public void kiir() {
        System.out.println(nev + " jegye: " + jegy + " (" + elertPont + " pont)");
    }

    public void osztalyoz(int maxPont) {
        double szazalek = elertPont / (double) maxPont * 100;
        jegy = 5;
        if (szazalek < 20) {
            jegy = 1;
        } else if (szazalek < 40) {
            jegy = 2;
        } else if (szazalek < 60) {
            jegy = 3;
        } else if (szazalek < 80) {
            jegy = 4;
        }
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getElertPont() {
        return elertPont;
    }

    public void setElertPont(int elertPont) {
        this.elertPont = elertPont;
    }

    public int getJegy() {
        return jegy;
    }

}
