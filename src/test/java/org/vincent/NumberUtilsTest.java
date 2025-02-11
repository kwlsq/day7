package org.vincent;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class NumberUtilsTest {

    @Test
    void calculateAverage() {
        List<Integer> inputNumbers = new ArrayList<>(Arrays.asList( 1, 2, 3, 4, 5));
        assertEquals("3", NumberUtils.calculateAverage(inputNumbers));
    }
}