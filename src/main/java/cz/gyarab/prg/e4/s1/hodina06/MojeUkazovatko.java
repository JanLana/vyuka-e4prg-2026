package cz.gyarab.prg.e4.s1.hodina06;

import java.util.Iterator;

public class MojeUkazovatko implements Iterator<Prvek> {
    Prvek prvek;

    public MojeUkazovatko(Prvek prvek) {
        this.prvek = prvek;
    }

    public boolean hasNext() {
        //if (prvek.dalsi == null)
        //    return false;
        //else0
        //    return true;

        return prvek != null;
    }

    public Prvek next() {
        Prvek pomocna = prvek;

        prvek = prvek.dalsi;
        return pomocna;

    }

    @Override
    public String toString() {
        return "MojeUkazovatko{" +
                "prvek=" + prvek +
                '}';
    }
}
