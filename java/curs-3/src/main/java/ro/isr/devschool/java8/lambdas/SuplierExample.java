package ro.isr.devschool.java8.lambdas;

import java.util.function.Supplier;

/**
 * Created by Andrei on 04.04.2017.
 */
public class SuplierExample {
    public static void main(String[] args) {
        Supplier<String> suplier=()->"java2s.com";
        System.out.println(suplier.get());
    }
}
