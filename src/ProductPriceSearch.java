import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class ProductPriceSearch {
    public static void main(String[] args) {
        String[] products = {"абрикос", "ананас", "алыча", "айва", "вишня", "слива", "яблоко"};
        Integer[] price = {25, 40, 10, 50, 25, 15, 8};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Make your choice: ");
        System.out.println("1. Enter price to find a product.");
        System.out.println("2. Enter price diapason to search product .");
        System.out.println("3. Enter product name to search product and price.");
        System.out.println("4. Enter product's name first letter to search product and price.");



        int choice = scanner.nextInt();
        int productPrice = 0;
        String productName;


        switch (choice) {

            case (1):

                System.out.println("Enter price, to search product: ");
                int check = -1;// проверка выхода из цикла
                while(check <0) {
                    try {
                        productPrice = Integer.parseInt(scanner.next());
                        check = 1;

                    } catch (Exception e) {
                        System.out.println("Enter correct price.");
                    }
                }

                int s = 0;

                for (int i = 0; i < price.length; i++) {

                    if (productPrice == price[i]) {

                        System.out.println("Product found: " + products[i]);
                        s = 1;
                        break;
                    }
                    else s = -1;


                }

                if (s == -1) {
                    System.out.println("Product is not found.");
                }

                break;

            case (2):

                   System.out.println("Enter min price: ");
                   int minPrice = -1;
                   while (minPrice <0) {
                       try {
                           minPrice = Integer.parseInt(scanner.next());


                       } catch (Exception e) {
                           System.out.println("price is not correct. Try again.");
                       }

                   }

                   System.out.println("Enter max price");

                   int maxPrice=-1;

                   while (maxPrice < 0 ) {

                       try{
                           maxPrice = Integer.parseInt(scanner.next());
                       }catch (Exception e) {
                           System.out.println("Price is not correct. Try again.");
                       }
                   }

                   int x = -1;
                   for(int i =0; i<products.length; i++) {

                       if(price[i] >= minPrice && price[i] <= maxPrice ) {
                           System.out.println(price[i] +": " +products[i]);

                       } else x = 2;
                   }
                   if(x==2) System.out.println("Found no product.");


                   break;

            case(3) :

                System.out.println("Enter product name");



                 productName = scanner.next();

                int z = 0;

                for (int i =0; i < products.length; i++) {

                    if(productName.equals(products[i])) {

                        System.out.println(products[i] +": " +price[i] );
                        break;

                    }else z = 1;
                }

                if (z==1) System.out.println("Product is not found.");

                break;

            case(4) :
                System.out.println("Enter first letter.");


            char firstLetter = scanner.next().charAt(0);

                boolean sameChar = false;

                for (int i = 0; i < products.length; i++) {

                    if(products[i].charAt(0) == firstLetter){
                        sameChar = true;
                        System.out.println("Found: " +products[i]);
                        continue;
                    }

                }

                if (!sameChar) System.out.println("Product not found");

                break;

            default:
                System.out.println("No choice.");

        }

    }

    }





