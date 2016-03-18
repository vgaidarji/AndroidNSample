package com.vgaidarji.androidn;

import android.util.Log;
import java.util.ArrayList;

/**
 * Created by vgaidarji on 3/18/16.
 */
public class ForEach {
    void initObjects() {
        ArrayList<Person> s1 = new ArrayList<>(5);
        s1.add(new Person());
        s1.add(new Person());
        s1.add(new Person());
        s1.add(new Person());
        s1.add(new Person());

        s1.forEach(p -> p.name = "New Person");
        s1.forEach(person -> Log.d("ForEach", person.name));
    }
}
