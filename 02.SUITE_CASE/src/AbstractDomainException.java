import java.util.Map;

public abstract class AbstractDomainException extends RuntimeException {
    public AbstractDomainException(String message) {
        super(message);
    }

    public abstract String getDomainErrorCode();

    public Map<String,String> getPublicContext() {
        return Map.of();
    }
}
