package zadanie3.app;

import zadanie3.services.IntegerListService;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> elements = List.of(2, 6, 1, 7, 12, 87, 4, 100, 569, 3);
        List<Integer> elements1 = List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> elements2 = new ArrayList<>();
        elements2.add(null);

        IntegerListService integerListService = new IntegerListService();
        System.out.println(integerListService.getFiveBiggestElements(elements));

    }
}
