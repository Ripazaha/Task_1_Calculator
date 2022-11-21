public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
//        int b = calc.minus.apply(1,1); // Ошибка "/ by zero" деление на 0
        int b = calc.minus.apply(4, 1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}
