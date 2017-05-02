package Offline1_Magic_Square;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Dmytro on 02.05.2017.
 */
public class MagicSquareTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size1.");
        int sizeArray1 = scanner.nextInt();

        System.out.println("Enter array size 2");
        int sizeArray2 = scanner.nextInt();


        Square newSquare = new Square(sizeArray1, sizeArray2);



        newSquare.fillArray();

        newSquare.printArray();



    }
}
