package Offline1_Magic_Square;

import java.util.Scanner;

/**
 * Created by Dmytro on 02.05.2017.
 */


public class Square {
    private int[][] squareArray;
    int sizeArray1;
    int sizeArray2;

    Scanner scanner = new Scanner(System.in);

    public Square(int sizeArray1, int sizeArray2) {

        this.sizeArray1 = sizeArray1;
        this.sizeArray2 = sizeArray2;
        this.squareArray = new int[sizeArray1][sizeArray2];
    }

    public int[][] getSquareArray() {
        return squareArray;
    }

    public void setSquareArray(int[][] squareArray) {
        this.squareArray = squareArray;
    }


    public void addSize() {
        System.out.println("Enter array size1.");
        sizeArray1 = scanner.nextInt();

        System.out.println("Enter array size2");
        sizeArray2 = scanner.nextInt();
    }

    public void fillArray() {

        for (int i = 0; i < sizeArray1; i++) {
            for (int j = 0; j < sizeArray2; j++) {

                System.out.println("Enter next element:");
                squareArray[i][j] = scanner.nextInt();

            }


        }


    }

    public void printArray() {

        System.out.println("New array: ");

        for (int i[] : squareArray) {
            for (int j : i) {
                System.out.println(j + "\t");
            }
            System.out.println("\n");

        }

    }

}
