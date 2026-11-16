package cz.gyarab.prg.e4.s1.hodina09;

public class Main {

    static void main() {
        SudaCisla s = new SudaCisla(2,10);

        for(var x : s) {
            for (var y : s) {
                System.out.println(x + " + " + y + " = " + (x + y));
            }
        }
    }
}
