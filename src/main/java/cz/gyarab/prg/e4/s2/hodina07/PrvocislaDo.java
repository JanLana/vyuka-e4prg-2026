package cz.gyarab.prg.e4.s2.hodina07;

import java.util.Iterator;

public class PrvocislaDo implements Iterable<Integer>, Iterator<Integer> {
    int maximum;
    int aktualniPrvocislo;

    public PrvocislaDo(int maximum) {
        this.maximum = maximum;
    }

    @Override
    public Iterator<Integer> iterator() {
        aktualniPrvocislo = 2;

        return this;
    }

    @Override
    public boolean hasNext() {
        return aktualniPrvocislo < maximum;
    }

    @Override
    public Integer next() {
        int i = aktualniPrvocislo;
        aktualniPrvocislo = vetsiPrvocislo(aktualniPrvocislo);
        return i;
    }



    public static boolean jePrvocislo(int x) {
        for (int i = 2; i < Math.sqrt(x)+1; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int vetsiPrvocislo(int x) {
        while(true) {
            x = x +1;
            if (jePrvocislo(x)) {
                return x;
            }
        }

    }


}
