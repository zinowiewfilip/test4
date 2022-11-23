package zadanie1.app;

import zadanie1.services.MinMaxService;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {


        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(10);
        integers.add(4);
        strings.add("Kamil");
        strings.add("asdasdd");
        strings.add("aksdla");

        //Zwracanie max'a z integers
        System.out.println(MinMaxService.getMinAndMax(integers).getMax());
        //Zwracanie min'a z integers
        System.out.println(MinMaxService.getMinAndMax(integers).getMin());
        //Zwracanie min'a z strings
        System.out.println(MinMaxService.getMinAndMax(strings).getMin());
        //Zwracanie max'a z strings
        System.out.println(MinMaxService.getMinAndMax(strings).getMax());


    }
}
