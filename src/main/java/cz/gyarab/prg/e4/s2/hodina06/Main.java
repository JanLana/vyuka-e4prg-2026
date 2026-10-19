package cz.gyarab.prg.e4.s2.hodina06;

public class Main {
    static void main() {
        //Prvek p4 = new Prvek(7, null);
        //Prvek p3 = new Prvek(5, p4);
        //Prvek p2 = new Prvek(3, p3);
        //Prvek p1 = new Prvek(2, p1);
        //p1.setDalsi(p2);

        Prvek seznam = new Prvek(2,
                new Prvek(3,
                        new Prvek(5,
                                new Prvek(7, null))));

        MojeUkazovatko u = seznam.iterator();

        while(u.hasNext()) {
            Prvek p = u.next();
            System.out.println(p);
        }

    }
}
