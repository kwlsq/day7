package org.vincent;

import java.util.List;

public class NumberUtils {
    public static String calculateAverage(List<Integer> inputNumbers){
        return inputNumbers.stream().reduce(0, Integer::sum) / inputNumbers.size() + "";
    }
}
