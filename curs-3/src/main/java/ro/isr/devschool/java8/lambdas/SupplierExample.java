package ro.isr.devschool.java8.lambdas;

import java.util.function.Supplier;

/**
 * Created by Mucefix on 04/04/17.
 */
public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> suplier = () -> "java2s.com";
        System.out.println(suplier.get());

    }

}
