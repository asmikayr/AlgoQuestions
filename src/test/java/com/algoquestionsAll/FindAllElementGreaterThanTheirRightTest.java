package com.algoquestionsAll;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindAllElementGreaterThanTheirRightTest {


    @ParameterizedTest
    @MethodSource("generateTestData")
    void find(List<Integer> expected, int[] input) {
        Object[] expectedResult = expected.toArray();
        Object[] actual = FindAllElementGreaterThanTheirRight.find(input).toArray();

        assertArrayEquals(expectedResult,actual);
    }

    public static Stream<Arguments> generateTestData() {
        return Stream.of(
                Arguments.arguments(Arrays.asList(10, 6, 5), new int[]{10, 4, 6, 3, 5}),
                Arguments.arguments(Arrays.asList(12, 9, 8), new int[]{11, 3, 4, 12, 9, 8}),
                Arguments.arguments(Arrays.asList(2, 1), new int[]{1, 2, 1, 1})
        );
    }


}