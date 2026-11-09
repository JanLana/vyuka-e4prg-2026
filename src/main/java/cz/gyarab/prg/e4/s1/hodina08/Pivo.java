package cz.gyarab.prg.e4.s1.hodina08;

public class Pivo implements Jidlo {
    private int objem;   // v mililitrech

    public Pivo(int objem) {
        this.objem = objem;
    }

    @Override
    public int dejCenu() {
        return (int)(0.7 + objem);
    }

    @Override
    public String vyrobTo() {
        return "Pivo: nacepuj " + objem + " ml do sklenice";
    }
}
