package fr.marethyun.ghjuca.cardset;

import fr.marethyun.ghjuca.Shuffleable;

import java.util.*;

public class Pick extends ArrayList<Card> implements Shuffleable, Queue<Card> {
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

    public final Card pickRandom(){
        return this.get(new Random().nextInt(this.size()));
    }

    // Queue methods

    @Override
    public boolean offer(Card card) {
        this.add(this.size(), card);
        return true;
    }

    @Override
    public Card remove() {
        Card first = this.firstOrFail(); // Throws a NoSuchElementException if the list is empty

        this.remove(0);
        this.leftShift();

        return first;
    }

    @Override
    public Card poll() {

        Card first;

        try {
            first = remove();
        } catch (NoSuchElementException e){
            first = null;
        }

        return first;
    }

    @Override
    public Card element() {
        return firstOrFail(); // Throws a NoSuchElementException if the list is empty
    }

    @Override
    public Card peek() {
        try {
            return firstOrFail(); // Throws a NoSuchElementException if the list is empty;
        } catch (NoSuchElementException e){
            return null;
        }
    }

    protected final void rightShift(){
        for (int i = 0; i < this.size() - 1; i++){
            this.set(i + 1, this.get(i));
        }
    }

    protected final void leftShift(){
        for (int i = this.size() - 1; i > 1; i--){
            this.set(i - 1, this.get(i));
        }
    }

    protected final Card firstOrFail(){
        Card first;
        try {
            first = this.get(0); // throws IndexOutOfBoundsException if the list is empty
        } catch (IndexOutOfBoundsException e){
            throw new NoSuchElementException(e.getMessage());
        }

        return first;
    }

    protected final Card lastOrFail(){
        Card last;
        try {
            last = this.get(this.size() - 1); // throws IndexOutOfBoundsException if the list is empty
        } catch (IndexOutOfBoundsException e){
            throw new NoSuchElementException(e.getMessage());
        }

        return last;
    }
}
