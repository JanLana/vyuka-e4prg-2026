package cz.gyarab.prg.e4.s1.hodina09;

import java.util.Iterator;

public class SudaCislaIterator implements Iterator<Integer> {
    SudaCisla sudaCisla;
    int aktualniCislo;

    public SudaCislaIterator(SudaCisla sudaCisla) {
        this.sudaCisla = sudaCisla;

        //if (sudaCisla.min % 2 == 0) {
        //    aktualniCislo = sudaCisla.min;
        //} else {
        //    aktualniCislo = sudaCisla.min + 1;
        //}
        aktualniCislo = sudaCisla.min + (sudaCisla.min % 2);
    }

    @Override
    public boolean hasNext() {
        return aktualniCislo <= sudaCisla.max;
    }

    @Override
    public Integer next() {
        int s = aktualniCislo;
        aktualniCislo = aktualniCislo + 2;

        return s;
    }
}
