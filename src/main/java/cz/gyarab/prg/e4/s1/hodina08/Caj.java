package cz.gyarab.prg.e4.s1.hodina08;

public class Caj implements Jidlo {
    private String typ;

    public Caj(String typ) {
        this.typ = typ;
    }

    @Override
    public int dejCenu() {
        return 50;
    }

    @Override
    public String vyrobTo() {
        return typ + " caj: horka voda a " + typ + " caj";
    }
}
