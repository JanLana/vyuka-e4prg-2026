package cz.gyarab.prg.e4.s1.hodina07;

import java.util.Iterator;

public class PrvocislaIterator implements Iterator<Integer> {
    int dalsiPrvocislo;

    public PrvocislaIterator() {
        dalsiPrvocislo = 2;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return 0;
    }
}
