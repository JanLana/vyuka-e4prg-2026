package cz.gyarab.prg.e4.s1.hodina09;

import lombok.ToString;

import java.util.Iterator;

@ToString
public class SudaCisla implements Iterable<Integer> {
    // suda cisla od <min do max-1> 1..6 -> 2,4,6
    int min;
    int max;

    public SudaCisla(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SudaCislaIterator(this);
    }
}
