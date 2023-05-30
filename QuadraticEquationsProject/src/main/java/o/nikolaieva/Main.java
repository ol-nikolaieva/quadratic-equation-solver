package o.nikolaieva;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Введіть коефіцієнти квадратного рівняння:");

        while (true) {
            try {
                System.out.print("a: ");
                a = scanner.nextDouble();
                System.out.print("b: ");
                b = scanner.nextDouble();
                System.out.print("c: ");
                c = scanner.nextDouble();

                QuadraticEquation equation = new QuadraticEquation(a, b, c);
                double [] roots = equation.resolve();
                if (roots.length == 0) {
                    System.out.println("Рівняння " + a + "x^2 + " + b + "x + " + c + " = 0 не має дійсних коренів");
                } else if (roots.length == 1){
                    System.out.println("Рівняння " + a + "x^2 + " + b + "x + " + c + " = 0 має один корінь: x = " + Arrays.toString(roots));
                } else {
                    System.out.println("Рівняння " + a + "x^2 + " + b + "x + " + c + " = 0 має корені:" + Arrays.toString(roots));
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Некоректні дані вводу. Будь ласка, спробуйте ще раз.");
                scanner.nextLine();
            }
        }
    }
}
