import java.util.ArrayList;
import java.util.List;

public class SuiteCase {
    private double totalWeight;
    private List<Item> items;
    private final int MAX_SUITE_WEIGHT;


    SuiteCase(int maxWeight) {
        this.MAX_SUITE_WEIGHT = maxWeight;
        totalWeight = 0;
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return List.copyOf(items);
    }

    public void add(Item item) {
        boolean isValidWeight = item.weight() + totalWeight <= MAX_SUITE_WEIGHT;

        if (!isValidWeight) {
            throw new WeightLimitExceededException(item);
        }

        items.add(item);
        totalWeight += item.weight();
    }

    public void remove(String id) {
        items.stream()
                .filter(item -> item.id().equals(id))
                .findFirst()
                .ifPresent(found -> {
                    items.remove(found);
                    totalWeight -= found.weight();
                });
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
