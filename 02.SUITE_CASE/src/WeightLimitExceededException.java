import java.util.HashMap;
import java.util.Map;

public final class WeightLimitExceededException extends AbstractDomainException {
    private final Item item;

    public WeightLimitExceededException(Item item)
    {
        super("The maximum allowed weight has been exceeded.");
        this.item = item;
    }

    @Override
    public String getDomainErrorCode(){
        return ErrorCode.MAXIMUM_WEIGHT_LIMIT_EXCEEDED.name();
    }

    @Override
    public Map<String, String> getPublicContext() {
        return Map.of(
                "id", String.valueOf(this.item.id()),
                "weight", String.valueOf(this.item.weight())
        );
    }
}
