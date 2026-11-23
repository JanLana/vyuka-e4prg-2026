package cz.gyarab.prg.e4.s2.hodina08;

public class Pivo implements Jidlo {

    @Override
    public int dejCenu() {
        return 70;
    }

    @Override
    public String vyrobTo() {
        return "pivo: natoc pul litru piva do sklenice";
    }
}
