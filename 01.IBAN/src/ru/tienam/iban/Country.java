package ru.tienam.iban;

public enum Country {
    DE("DE", 22),
    UA("UA", 29 ),
    PL("PL", 28);

    private final int length;

    private Country(String code, int length) {
    this.length = length;
    }

    public int getLength() {
        return this.length;
    }
}
