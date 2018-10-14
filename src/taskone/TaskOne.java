package taskone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        int[] array = new int[3];
        for (int i=0; i<array.length; i++) {
            System.out.println("Введите число");
           try{ array[i] = sc1.nextInt();}
           catch (InputMismatchException ex) {
               ex.printStackTrace();
               array[i]=0;
           }


        }


    }
}
