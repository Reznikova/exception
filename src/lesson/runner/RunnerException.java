package lesson.runner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunnerException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int result=-1;
        try {
            result = sc.nextInt();
            System.out.println("Код который идет после ввода");
            int[] array = new int[3];
            array[3] = result;
        } catch (InputMismatchException ex) {
            System.out.println("Сработала секция catch" );
            ex.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Сработала секция catch2" );
            ex.printStackTrace();
        }
        finally {
            System.out.println("Сработала секция finally");
        }

        System.out.println("Вы ввели: "+result);
    }
}
