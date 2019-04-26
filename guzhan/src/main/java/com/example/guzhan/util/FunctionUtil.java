package com.example.guzhan.util;

import java.math.BigInteger;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * <p>create at 2019/4/22</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public final class FunctionUtil {

//    private static <T> Predicate<T> notEqual(T t) {
//        return (v) -> !Objects.equals(v, t);
//    }

//    public static void main(String[] args) {
////        List<Integer> list = Arrays.asList(1, 2, 3);
////                list
////                .stream()
////                .filter(notEqual(1))
////                .forEach(System.out::println);
//        Stream.of(1, 2, 3)
//                .filter(notEqual(1))
//                .forEach(System.out::println);
//    }


//    private static  <T, U, R> Function<U, R> partialLeft(BiFunction<T, U, R> biFunction, T t) {
//        return (u) -> biFunction.apply(t, u);
//    }
//
//    private static  <T, U, R> Function<T, R> partialRight(BiFunction<T, U, R> biFunction, U u) {
//        return (t) -> biFunction.apply(t, u);
//    }
//
//
//    public static void main(String[] args) {
//        BiFunction<Integer, Integer, Integer> biFunction = (v1, v2) -> v1 - v2;
//        Function<Integer, Integer> subtractFrom10 = partialLeft(biFunction, 10);
//        Function<Integer, Integer> subtractBy10 = partialRight(biFunction, 10);
//        System.out.println(subtractFrom10.apply(5)); // 5
//        System.out.println(subtractBy10.apply(5));   // -5
//    }


//    public static void main(String[] args) {
//        System.out.println(fib(40));
//    }
//
//    private static BigInteger fib(int n) {
//        if (n == 0) {
//            return BigInteger.ZERO;
//        } else if (n == 1) {
//            return BigInteger.ONE;
//        }
//        return fib(n - 1).add(fib(n - 2));
//    }


//    public static void main(String[] args) {
//        System.out.println(fib(100));
//    }
//
//    private static Map<Integer, BigInteger> lookupTable = new HashMap<>();
//
//    static {
//        lookupTable.put(0, BigInteger.ZERO);
//        lookupTable.put(1, BigInteger.ONE);
//    }
//
//    private static BigInteger fib(int n) {
//        if (lookupTable.containsKey(n)) {
//            return lookupTable.get(n);
//        } else {
//            BigInteger result = fib(n - 1).add(fib(n - 2));
//            lookupTable.put(n, result);
//            return result;
//        }
//
//
//    }



    public static void main(String[] args) {
        final Map<Character, List<String>> names = Stream.of("Alex", "Bob", "David", "Amy")
                .collect(Collectors.groupingBy(v -> v.charAt(0)));
        System.out.println(names);

        String str = Stream.of("a", "b", "c")
                .collect(Collectors.joining(", "));
        System.out.println(str);

        int sum = Arrays.stream(new int[] {1, 2, 3})
                .reduce((a, b) -> a + b)
                .orElse(0);
        System.out.println(sum);

        int total = Stream.of("1", "2", "3").mapToInt(Integer::parseInt).sum();
//                .collect(Collectors.summingInt(s -> Integer.parseInt(s)));
        System.out.println(total);

        Optional<String> a = Optional.of("a");
        System.out.println("a".equals(a.get()));
        System.out.println("a".equals(a.orElse("a")));
        Optional empty = Optional.empty();
        Optional empty2 = Optional.ofNullable(null);
        System.out.println(empty == empty2);

        List<String> list1 = Stream.of("aa", "1wew", "333sadf").collect(toList());
        String min = list1.stream().min(Comparator.comparing(String::length)).orElse(null);
        System.out.println(min);
        System.out.println(list1);
        List<String> list2 = Arrays.asList("111", "222", "333");
        System.out.println(list2);
        List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(n -> n.stream())
                .collect(toList());
        System.out.println(together);

    }

}
