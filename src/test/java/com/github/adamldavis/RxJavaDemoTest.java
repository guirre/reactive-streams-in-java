package com.github.adamldavis;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class RxJavaDemoTest {

    final List<Integer> squares = asList(1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121,
            144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576,
            625, 676, 729, 784, 841, 900, 961, 1024, 1089, 1156, 1225, 1296,
            1369, 1444, 1521, 1600, 1681, 1764, 1849, 1936, 2025, 2116, 2209,
            2304, 2401, 2500, 2601, 2704, 2809, 2916, 3025, 3136, 3249, 3364,
            3481, 3600, 3721, 3844, 3969, 4096);

    RxJavaDemo demo = new RxJavaDemo();

    @Test
    public void testDoSquares() {
        assertArrayEquals(squares.toArray(), demo.doSquares().toArray());
    }

    @Test
    public void testDoParallelSquares() {
        List result = demo.doParallelSquares()
                .stream().sorted().collect(Collectors.toList());
                
        assertArrayEquals(squares.toArray(), result.toArray());
    }

}
