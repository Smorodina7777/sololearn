package lambda.function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Double, Long> function1 = d -> Math.round(d);
        System.out.println(function1.apply(5.7));

        Function<Integer, String> function = i -> {
            String str = "Ноль";
            if (i > 0) {
                str = "положительное";
            } else if(i<0){
                str = "отрицательное";
            }
            return str;
        };
        System.out.println(function.apply(-3));
        System.out.println(function.apply(3));
        System.out.println(function.apply(0));
    }

}