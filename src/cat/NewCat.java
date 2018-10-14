package cat;

import exception.runner.exception.runner.entity.Cat;
import exeption.ColorEyesException;
import exeption.CountEyesException;

public class NewCat {
    public static void main(String[] args) {
        Cat catOne = new Cat (2, "Red");
        catOne.printCountEyes();
        Cat catTwo = new Cat(2, "Gray");
        catTwo.printCountEyes();
        try {
            Cat catThree = new Cat(2, "Green");
            catThree.printColourEyes();
            Cat catFour = new Cat (2, "Blue");
            catFour.printColourEyes();
        }catch (CountEyesException ex) {
            ex.printStackTrace();
        }catch (ColorEyesException ex) {
            ex.printStackTrace();
        }

    }
}
