package com.vgaidarji.androidn;

import android.util.Log;

/**
 * Created by vgaidarji on 3/18/16.
 */
public class Interfaces {

    public interface BaseInterface {
        void interfaceMethod();

        default void defaultMethod() {
            Log.d("Interfaces", "from default method (base)");
        }
    }

    interface ChildInterface extends BaseInterface {
        @Override
        default void interfaceMethod() {
            Log.d("Interfaces", "interfaceMethod from ChildInterface (we made it default method).");
        }

        @Override
        default void defaultMethod() {
            Log.d("Interfaces", "from default method (child)");
        }

        static void staticMethod() {
            Log.d("Interfaces", "from static method (child)");
        }
    }

    BaseInterface baseInstance = () -> {}; // anonymous class (using lambda)

    ChildInterface childInterface = new ChildInterface() {};


    public void run() {
        baseInstance.interfaceMethod();
        baseInstance.defaultMethod();
        childInterface.interfaceMethod();
        childInterface.defaultMethod();

        ChildInterface.staticMethod();
    }

}
