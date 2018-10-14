package triangle.runner;

import triangle.exception.NotTriangle;
import triangle.lenght.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны треугольника: ");
        try {
            Triangle Triange1 = new Triangle(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Triange1.PrintTriangle();
            Triange1.Perimetr();
            Triange1.Square();
            } catch (NotTriangle ex) {
            ex.printStackTrace();}
            catch (InputMismatchException ex) {
                ex.printStackTrace();
            }

        }







    }



