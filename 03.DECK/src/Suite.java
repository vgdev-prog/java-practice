public enum Suite {
    SPADES("♠️"),
    HEARTS("♥️"),
    DIAMONDS("♦️"),
    CLUBS("♣️");

    private final String symbol;

    Suite(String symbol) {          // конструктор enum всегда private (можно не писать private)
        this.symbol = symbol;
    }

    public String symbol() {
        return symbol;
    }
}
