package lambda.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");

        Consumer<String> printLowerCase = str -> System.out.println(str.toLowerCase());
        printLowerCase.accept("Hello World");

        Consumer<Phone> consumer1 = phone -> System.out.println("Продали телефон"+phone);
        Consumer<Phone> consumer2 = phone -> System.out.println("Отгрузили телефон"+phone);
        consumer1.andThen(consumer2).accept(new Phone("Iphone", 142));
    }
}
