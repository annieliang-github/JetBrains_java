import java.util.function.Function;

class Predicate {

    @FunctionalInterface
    public interface TernaryIntPredicate {
        // Write a method here
        boolean test(int j, int k, int i);
    }

    public static final TernaryIntPredicate allValuesAreDifferentPredicate = (x, y, z) -> {
        return x != y && y != z && x != z;
    };
}


