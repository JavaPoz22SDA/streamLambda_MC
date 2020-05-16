import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Reduce {

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum = sum + number;
        }

        return sum;
    }

    public static void main(String[] args) {
        int count = Stream.of(1, 2, 3, 4).reduce(2, (t, element) -> t + element);
        System.out.println(count);
        List<Integer> list = asList(1, 2, 3, 4);
        Reduce.sum(list);


    }

}



