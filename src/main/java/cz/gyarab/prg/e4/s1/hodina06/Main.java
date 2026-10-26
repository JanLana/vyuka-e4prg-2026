package cz.gyarab.prg.e4.s1.hodina06;

public class Main {
    static void main() {
        //Prvek p3 = new Prvek(5, null);
        //Prvek p2 = new Prvek(3, p3);
        //Prvek p1 = new Prvek(2, p2);
        //...
        //p1.setDalsi(p2);

        Prvek seznam = new Prvek(2,
                new Prvek(3,
                        new Prvek(5,
                                new Prvek(7,
                                        new Prvek(11, null)))));

        //System.out.println(seznam);

        //MojeUkazovatko u = seznam.iterator();
        //while(u.hasNext()) {
        //    Prvek p = u.next();
        //    System.out.println(p.cislo);
        //}

        for (Prvek p : seznam) {
            for (Prvek k : seznam) {
                System.out.println(p.cislo + " " + k.cislo);
            }
        }
    }

}
