package extra.lambda;

public interface NumberChecker<T, E> {
    E check(T number) throws Exception;
}
