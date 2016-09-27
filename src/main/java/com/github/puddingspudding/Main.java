package com.github.puddingspudding;

/**
 * Created by pudding on 26.09.16.
 */
public class Main {

    public static void main(String[] args) {

        SomeClass someClass = new SomeClass(new Id(1), new Name("test"));

        for (int x = 0; x < 100_000; x++) {
            SomeOtherClass someOtherClass = new SomeOtherClass(new Id(2), new SpecificName("super long name"));
        }


        System.out.println(someClass.id.get());
        System.out.println(someClass.name.get());

        /*System.out.println(someOtherClass.id.get());
        System.out.println(someOtherClass.name.get());*/

    }
}
