package com.example.guzhan.generics;

/**
 * <p>create at 2019/5/28</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class GenericMethodTest {

    public static <E> void printArray(E[] inputArray) {
        for (E e : inputArray) {
            System.out.print("    " + e);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        printArray(doubleArray);
    }
}
