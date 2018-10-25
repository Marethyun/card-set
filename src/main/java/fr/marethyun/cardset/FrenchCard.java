package fr.marethyun.cardset;

public final class FrenchCard {

    private final Color color;
    private final Type type;

    public FrenchCard(Color color, Type type) {
        this.color = color;
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    public enum Color {
        NONE,
        CLUBS,
        SPADES,
        DIAMONDS,
        HEARTS
    }

    public enum Type {
        NONE,
        ACE,
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        JOKER
    }
}
