package o.nikolaieva;

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
                equation.resolve();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Некоректні дані вводу. Будь ласка, спробуйте ще раз.");
                scanner.nextLine();
            }
        }
    }
}
