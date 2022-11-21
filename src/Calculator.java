import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y; // для математических операций над двумя числами
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply =  (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> y > 0 ? (x / y) : y * -1;

    UnaryOperator<Integer> pow = x -> x * x; // для произведения математических операций над одним числом
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0; // для определения положительное ли число

    Consumer<Integer> println = System.out::println; // для вывода числа в консоль

}
