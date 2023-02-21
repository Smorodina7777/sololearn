package lambda.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> negative = i -> i < 0;
        System.out.println(negative.test(-6));
        System.out.println(negative.test(4));
        System.out.println(negative.test(0));

        Predicate<String> predicate1 = s -> s != null;
        Predicate<String> predicate2 = s -> !s.isEmpty();
        Predicate<String> predicate3 = predicate1.and(predicate2);

        System.out.println(predicate1.test(null));
        System.out.println(predicate1.test(""));
        System.out.println(predicate1.test("str"));

        System.out.println(predicate2.test(""));
        System.out.println(predicate2.test("str"));

        Predicate<String> containA = t -> t.contains("A");
        Predicate<String> containB = t -> t.contains("B");
        System.out.println(containA.and(containB).test("ABCD"));

        Predicate<String> pr1 = s -> s.startsWith("J");
        Predicate<String> pr2 = s -> s.startsWith("N");
        Predicate<String> pr3 = s -> s.endsWith("A");
        Predicate<String> pr4 = pr1.or(pr2).and(pr3);
        System.out.println(pr4.test("Java"));
    }
}
