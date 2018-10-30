package fr.marethyun.ghjuca.cardset;

import fr.marethyun.ghjuca.Shuffleable;

import java.util.ArrayList;
import java.util.Random;

public class Pick extends ArrayList<Card> implements Shuffleable {
    @Override
    public void shuffle() {
        Random random = new Random();
        for (int i = this.size(); i > 1; i--){
            swap(i - 1, random.nextInt(i));
        }
    }

    public final void swap(int firstIndex, int secondIndex){
        Card first = this.get(firstIndex);
        Card second = this.get(secondIndex);

        this.set(firstIndex, second);
        this.set(secondIndex, first);
    }
}
