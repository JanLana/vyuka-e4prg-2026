package cz.gyarab.prg.e4.s2.hodina06;

public class Prvek {
    private int cislo;
    private Prvek dalsi;

    public Prvek(int cislo, Prvek dalsi) {
        this.cislo = cislo;
        this.dalsi = dalsi;
    }

    public String toString() {
        return "" + cislo;
    }

    public MojeUkazovatko iterator() {
        return new MojeUkazovatko(this);
    }

    public Prvek getDalsi() {
        return dalsi;
    }

    public void setDalsi(Prvek dalsi) {
        this.dalsi = dalsi;
    }
}
