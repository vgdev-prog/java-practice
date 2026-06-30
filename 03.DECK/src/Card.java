import java.util.Objects;

public record Card(Rank rank, Suite suite) {
    public Card {
        Objects.requireNonNull(rank, "Rank cannot be null");
        Objects.requireNonNull(suite, "Suite cannot be null");
    }

    public String label() {
       return String.format("%s of %s", rank.label(), suite.symbol());
    }
}
