package com.vgaidarji.androidn;

import android.util.Log;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Created by vgaidarji on 3/18/16.
 */
public class Lambdas {

    private void printPersons(ArrayList<Person> array, Predicate<Person> predicate) {
        for (Person p : array) {
            if (predicate.test(p)) {
                Log.d("printPersons", p.toString());
            }
        }
    }

    public void doWork() {
        ArrayList<Person> array = new ArrayList<>(5);
        array.add(new Person("P", 12));
        array.add(new Person("E", 22));
        array.add(new Person("R", 5));
        array.add(new Person("S", 56));
        array.add(new Person("O", 3));

        // without lambda
        printPersons(array, new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.age > 5 && !person.name.isEmpty();
            }
        });

        // with lambda
        printPersons(array, person -> person.age > 5 && !person.name.isEmpty());
    }

    private static class Calculator {

        @FunctionalInterface
        interface IntegerMath {
            int operation(int a, int b);
        }

        public int operateBinary(int a, int b, IntegerMath op) {
            return op.operation(a, b);
        }

        public static void main(String... args) {


            // What's lambda:
            // special syntax for functional objects declaration
            // easy way of anonymous functions declaration
            // e.g. Interface instance = (a) -> a * 2;




            // lambdas are backward compatible with FunctionalInterfaces
            // Runnable is a FunctionalInterface
            new Thread(new Runnable() {
                @Override
                public void run() {
                    // do work in background
                }
            });



            new Thread(() -> {
                // do work in background
            });

            // without lambda
            IntegerMath additionWithoutLambda = new IntegerMath() {
                @Override
                public int operation(int a, int b) {
                    return a + b;
                }
            };

            // using lambda
            Calculator calculator = new Calculator();
            final int x = 13;
            // operations
            IntegerMath addition = (a, b) -> a + b;
            IntegerMath subtraction = (a, b) -> a - b;
            IntegerMath formula = (a, b) ->  {
                int result;
                result = a * a + b - 2;
                result += x;
                return result;
            };
            // usage
            System.out.println("40 + 2 = " +
                    calculator.operateBinary(40, 2, addition));
            System.out.println("20 - 10 = " +
                    calculator.operateBinary(20, 10, subtraction));
        }
    }
}
