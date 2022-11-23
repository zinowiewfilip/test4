package zadanie1.services;

import zadanie1.models.MinMax;

import java.util.Collections;
import java.util.List;

public class MinMaxService {
    public static <T extends Comparable> MinMax<T> getMinAndMax(List<T> elements){

        Collections.sort(elements);

        return new MinMax(Collections.max(elements), Collections.min(elements));
    }

}
