import java.util.Scanner;

public class homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите свое имя");

        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Вы хотите посчитать площадь окружности?(Y/N)");

        String ask = scanner.nextLine();
        System.out.println("Отлично " + name);

        System.out.println("Введите радиус (Число), ");

        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("The area of a circle with radius " +radius+ " cm: " +area+" cm" );


//        Второй вариан, для подсчета окружности.

        System.out.println("Отлично " + name);
        String next = scanner.nextLine();
        System.out.println("Вам понравилось?");
        System.out.println("Вы хотите посчитать площадь окружности, еще раз?");

        String ask_second_1 = scanner.nextLine();
        System.out.println("Отлично " + name);

        System.out.println("Введите радиус (Число), ");
        double radius_second = scanner.nextDouble();
        double S;
        S= 3.14f * (radius * radius);
        System.out.println("Площадь равна "+S+"см");
    }
}
