package exception.runner.exception.runner.entity;

import exeption.ColorEyesException;
import exeption.CountEyesException;

public class Cat {
    private int countEyes;
    private String colorEyes;

    public Cat (int countEyes, String colorEyes) {
        this.countEyes=countEyes;
        this.colorEyes=colorEyes;
    }
    public void printCountEyes () throws IndexOutOfBoundsException {
        if(countEyes!=2) {
            throw new IndexOutOfBoundsException();
        }
        System.out.println(countEyes);
    }
    public  void printColourEyes () throws ColorEyesException, CountEyesException {
        if (!colorEyes.equals("Green")) { //не равно для строк
            throw new ColorEyesException(); //создаем исключение для класса ColorEyesException
        }
        if (countEyes!=2){
            throw new CountEyesException();
        }
        System.out.println("вет глаз у котика = "+colorEyes);
    }
}
