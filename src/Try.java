import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        double x = s.nextDouble();
        System.out.println("Выберите действие из списка (/,*,+,-,sqrt,%,^): ");
        String z = s.next();
        if (z.equals("/")) {
            System.out.println("Выберите второе число: ");
            double l = s.nextDouble();
            System.out.println("Ответ: " + x / l);
            s.close();
        }
        if (z.equals("*")) {
            System.out.println("Выберите второе число: ");
            double d = s.nextDouble();
            System.out.println("Ответ: " + x * d);
            s.close();
        }
        if (z.equals("+")) {
            System.out.println("Выберите второе число: ");
            double j = s.nextDouble();
            System.out.println("Ответ: " + x + j);
            s.close();
        }
        if (z.equals("-")) {
            System.out.println("Выберите второе число: ");
            double k = s.nextDouble();
            System.out.println("Ответ: " + (x - k));
            s.close();
        }
        if (z.equals("sqrt")) {
            double e = Math.sqrt(x);
            System.out.println("Ответ: " + e);
            s.close();
        }
        if (z.equals("^")) {
            double h = x * x;
            System.out.println("Ответ: " + h);
            s.close();
        }
        if (z.equals("%")) {
            System.out.println("Выберите процент от введенного числа: ");
            double j = s.nextDouble();
            System.out.println("Ответ: " + (x / 100) * j);
            s.close();
        }

    }
}