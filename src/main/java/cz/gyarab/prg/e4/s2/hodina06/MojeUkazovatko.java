package cz.gyarab.prg.e4.s2.hodina06;

public class MojeUkazovatko {
    private Prvek prvek;
    //int id = 0;

    public MojeUkazovatko(Prvek prvek) {
        this.prvek = prvek;
    }

    public boolean hasNext() {
        //if (prvek.dalsi == null) {
        //    return false;
        //} else {
        //    return true;
        //}

        return prvek != null;
    }

    public Prvek next() {
        Prvek p = prvek;
        prvek = prvek.getDalsi();

        return p;
    }
}
