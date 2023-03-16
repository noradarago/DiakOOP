public class InformatikusDiak extends Diak {
    private String kedvencNyelv;

    public InformatikusDiak() {
    }

    @Override
    public void kiir() {
        System.out.println(getNev() + " jegye: " + getJegy() + " (" + getElertPont() +
                " pont), kedvenc nyelve " + kedvencNyelv);
    }

    @Override
    public void osztalyoz(int maxPont) {
        super.osztalyoz(getElertPont());
    }

    public InformatikusDiak(String nev, int elertPont, String kedvencNyelv) {
        super(nev, elertPont);
        this.kedvencNyelv = kedvencNyelv;

    }
    public void windowsSzid(){
        System.out.println("Ejnye bejnye, már megint lewfagyott...");
    }
}
