package programing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.

public class AnuDinDay6_Sec1_1 {
    public static void main(String[] args) {
        List<Integer> arrInt=new ArrayList<>(Arrays.asList(1,2,5,7,9));

        arrInt.stream().filter(n-> n%2==0).reduce(Integer::sum).ifPresent(sum->System.out.println(sum));
        
    }
}
