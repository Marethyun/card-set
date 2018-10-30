package fr.marethyun.ghjuca.cardset;

public final class FrenchCard implements Card {

    private final Color color;
    private final Type type;

    public FrenchCard(Color color, Type type) {
        this.color = color;
        this.type = type;
    }

    public FrenchCard() {
        this(Color.NONE, Type.NONE);
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {

        if (this.type == Type.JOKER){
            return this.getType().toString();
        }

        return "" + this.color + this.type;
    }

    public enum Color {
        NONE("#"),
        CLUBS("♣"),
        SPADES("♠"),
        DIAMONDS("♦"),
        HEARTS("♥");

        private final String color;

        Color(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return getColor();
        }
    }

    public enum Type {
        NONE(0, "#"),
        ACE(1, "A"),
        TWO(2, "2"),
        THREE(3, "3"),
        FOUR(4, "4"),
        FIVE(5, "5"),
        SIX(6, "6"),
        SEVEN(7, "7"),
        EIGHT(8, "8"),
        NINE(9, "9"),
        TEN(10, "10"),
        JACK(11, "V"),
        QUEEN(12, "Q"),
        KING(13, "K"),
        JOKER(14, "J");

        private final int type;
        private final String descriptor;

        // TODO Add a descriptor char
        Type(int type, String descriptor) {
            this.type = type;
            this.descriptor = descriptor;
        }

        public int getType() {
            return type;
        }

        public String getDescriptor() {
            return descriptor;
        }

        @Override
        public String toString() {
            return Integer.toString(getType());
        }
    }
}
