package com.vgaidarji.androidn;

import android.util.Log;
import java.util.ArrayList;

/**
 * Created by vgaidarji on 3/18/16.
 */
public class ForEach {
    void initObjects() {
        ArrayList<Person> persons = new ArrayList<>(5);
        persons.add(new Person());
        persons.add(new Person());
        persons.add(new Person());
        persons.add(new Person());
        persons.add(new Person());

        // old
        for(Person p : persons) {
            p.name = "New Person";
            Log.d("ForEach", p.name);
        }

        // new
        persons.forEach(p -> p.name = "New Person");
        persons.forEach(person -> Log.d("ForEach", person.name));
    }
}
