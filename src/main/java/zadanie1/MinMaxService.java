package zadanie1;

import java.util.Collections;
import java.util.List;

public class MinMaxService {
    public static <T extends Comparable> MinMax<T> getMinAndMax(List<T> elements){

        Collections.sort(elements);

        return new MinMax(Collections.max(elements), Collections.min(elements));
    }

}
