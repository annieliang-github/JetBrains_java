import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;


class FutureUtils {

    public static int executeCallableObjects(List<Future<Callable<Integer>>> items) {
        // write your code here
        int sum = 0;
        Collections.reverse(items);

        for (Future<Callable<Integer>> future : items) {
            try {
                Callable<Integer> callable = future.get();
                sum += callable.call();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return sum;
    }

}
