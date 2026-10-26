package cz.gyarab.prg.e4.s1.hodina06;

public class Prvek implements Iterable<Prvek> {
    int cislo;
    Prvek dalsi;

    public Prvek(int cislo, Prvek dalsi) {
        this.cislo = cislo;
        this.dalsi = dalsi;
    }

    @Override
    public String toString() {
        return "Prvek{" +
                "cislo=" + cislo +
                ", dalsi=" + dalsi +
                '}';
    }

    public void setDalsi(Prvek dalsi) {
        this.dalsi = dalsi;
    }

    public MojeUkazovatko iterator() {
        /* vytvor iterator */
        return new MojeUkazovatko(this);
    }
}