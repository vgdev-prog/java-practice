import java.util.Objects;

public record Item(String id, String name, double weight) {
    public Item {
        Objects.requireNonNull(name, "Name cannot be null");

        if (id.isBlank()) {
            throw new IllegalArgumentException("ID cannot be blank");
        }

        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }

        if (weight <= 0) {
            throw new IllegalArgumentException("Weight cannot be negative or zero");
        }

    }
}
