package InnerClasses.Interface;

import java.awt.print.Book;

public class PrintableDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        Printable newspaper = new Printable() {
            @Override
            public void print() {
                System.out.println("Print illustrate");
            }
        };
        Printable[] printables = {newspaper};
        for (Printable p:printables){
            p.print();
        }
    }
}
