import java.util.function.Predicate;

public interface Utils {
    static <T> boolean isOperationValid(Predicate<T> predicate, T t){
        return predicate.test(t);
    }
}
