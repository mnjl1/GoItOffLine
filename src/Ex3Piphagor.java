import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 * Created by Dmytro on 29.04.2017.
 */
public class Ex3Piphagor {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        //Random random = new Random();
        int minA = 10;
        int minB = 20;
        int maxA = 20;
        int maxB = 40;



        for (int i = 0 ; i < a.length;i++) {

            a[i] = minA + (int)(Math.random()*(maxA - minA)+1);


            //System.out.println("a[i]: " +a[i] );

        }

        for (int i =0; i < b.length; i++) {
            b[i] = minB + (int)(Math.random()*(maxB - minB)+1);
            //System.out.println("b[i]: " +b[i] );
        }

        double[] c = new double[10];

        for (int i = 0; i<c.length; i++) {

            c[i] = Math.sqrt(a[i] * a[i] + b[i]*b[i]);
          //  BigDecimal c[i] = new BigDecimal(c[i].setScale(2, RoundingMode.HALF_UP)) ;
            //System.out.println(c[i]);
        }
        System.out.println("a  " +"b  " +"c  ");
        for (int i =0; i<a.length; i++) {
            System.out.println(a[i] +" " + b[i] +" " +c[i]);
        }


    }
}
