package zadanie1;

import java.util.List;

public class MinMax<T extends Comparable> {
    private T max;
    private T min;


    public MinMax(T max, T min) {
        this.max = max;
        this.min = min;
    }

    public T getMax() {
        return max;
    }

    public T getMin() {
        return min;
    }

}
