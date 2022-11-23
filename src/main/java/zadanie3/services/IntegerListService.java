package zadanie3.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IntegerListService {

    public List<Integer> getFiveBiggestElements(List<Integer> elements) {
        List<Integer> empty = new ArrayList<>();

        Optional<List<Integer>> elementsOptional = Optional.ofNullable(elements);
        List<Integer> newList = elementsOptional
                .orElse(empty).stream()
                    .filter(x -> !x.equals(null))
                    .distinct()
                    .sorted((x1, x2) -> Integer.compare(x2, x1))
                    .limit(5)
                    .collect(Collectors.toList());

        if(newList.size() < 5)
            return empty;
        else
            return newList;

    }
}
