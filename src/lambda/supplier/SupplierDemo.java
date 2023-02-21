package lambda.supplier;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        String t = "One";
        Supplier<String> supplier = ()-> t.toUpperCase();
        System.out.println(supplier.get());

        Supplier<Integer>supplier1 =()->(int)(Math.random()*10);
        System.out.println(supplier1.get());
        System.out.println(supplier1.get());
        System.out.println(supplier1.get());
    }
}
