import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Operator {

    public static UnaryOperator<List<String>> unaryOperator = x -> {

        return x.stream().distinct().collect(Collectors.toList());
    };
}