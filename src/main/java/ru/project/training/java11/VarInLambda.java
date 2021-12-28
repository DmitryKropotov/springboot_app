package ru.project.training.java11;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class VarInLambda {

    public static void main(String[] args) {
        test ((var x) -> {
            if (x == null) {
                return "x is null";
            }
            return x>10? "Teenager": "Kid";},
                (var x) -> {
                    System.out.println("I got " + x);
              });
        Predicate<Integer> predicate = age -> age > 10;
        System.out.println(predicate.test(12));
    }

    public static void test(Function<Integer, String> function, Consumer<Integer> consumer) {
        System.out.println(function.apply(1));
        consumer.accept(2);
    }

}
