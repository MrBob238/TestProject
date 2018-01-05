import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.math.BigInteger.valueOf;

/**
 * Created by Vladimir on 18.04.2017.
 */
public class Bool {
    public static void main(String[] args) {
       int[] a1 = {};
       int[] a2 = {};
       int[] result = new int [a1.length+a2.length];
        System.out.println(result.length);
       for (int i = 0, ia1 = 0, ia2 = 0; i < result.length; i++){
           if (ia1 == a1.length) {
               result[i] = a2[ia2];
               ia2++;
               System.out.println(result[i]+" - " + i + "й элемент, взят из 2 массива");
               continue;
           }
           if (ia2 == a2.length) {
               result[i] = a1[ia1];
               ia1++;
               System.out.println(result[i]+" - " + i + "й элемент, взят из 1 массива");
               continue;
           }

           if (a1[ia1] <= a2[ia2]) {
               result[i] = a1[ia1];
               System.out.println(result[i]+" - " + i + "й элемент, взят из 1 массива" + " ia1= "+ia1+" ia2= "+ia2 );
               ia1++;
           } else {
               result[i] = a2 [ia2];
               System.out.println(result[i]+" - " + i + "й элемент, взят из 2 массива");
               ia2++;

               //continue;
           }
       }
    }
}
