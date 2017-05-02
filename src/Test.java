import java.util.Scanner;

/**
 * Created by Dmytro on 30.04.2017.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут ?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("My name is " +name);


    }
}
