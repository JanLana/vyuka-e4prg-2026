package cz.gyarab.prg.e4.s1.hodina07;

import java.util.Iterator;

public class Prvocisla implements Iterable<Integer>,Iterator<Integer> {
    int maximum;
    int dalsiPrvocisloVRade;


    public Prvocisla(int maximum) {
        this.maximum = maximum;
        this.dalsiPrvocisloVRade = 2;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return dalsiPrvocisloVRade <= maximum;
    }

    @Override
    public Integer next() {
        int p = dalsiPrvocisloVRade;

        int i = dalsiPrvocisloVRade +1;
        while (true) {
            if (jePrvocislo(i)) {
                dalsiPrvocisloVRade = i;
                break;
            }
            i++;
        }

        return p;
    }

    private static boolean jePrvocislo(int x) {
        for (int j = 2; j < x; j++) {
            if (x % j == 0)
                return false;
        }
        return true;
    }
}
