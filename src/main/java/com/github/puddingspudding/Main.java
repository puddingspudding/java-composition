package com.github.puddingspudding;

import java.util.function.Supplier;

/**
 * Created by pudding on 26.09.16.
 */
public class Main {

    public static void main(String[] args) {

        Supplier<SomeClass> someClassSupplier = () -> new SomeClass(new     Id(1), new ShortName("test"));;

        SomeOtherClass someOtherClass = new SomeOtherClass(new Id(2), new LongName("super long name"));

        SomeClass someClass = someClassSupplier.get();

        System.out.println(someClass.id.get());
        System.out.println(someClass.name.get());

        System.out.println(someOtherClass.id.get());
        System.out.println(someOtherClass.name.get());

    }
}
