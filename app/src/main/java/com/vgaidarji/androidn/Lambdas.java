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

        printPersons(array,
                person -> person.age > 5
                && !person.name.isEmpty());
    }
}
