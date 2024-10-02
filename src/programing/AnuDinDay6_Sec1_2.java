package programing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * AnuDinDay6_Sec1_2
 */
//

// reviser given list of string 
public class AnuDinDay6_Sec1_2 {
    public static void main(String[] args) {
        List<String> stringsAre=Arrays.asList("sid","sid2","sid3");
       
        // for revising charter 
       //stringsAre.stream().map(str->new StringBuilder(str).reverse()).toList().forEach(System.out::println);

       // for reviciing string 
        // stringsAre.stream().sorted(Comparator.reverseOrder()).toList().forEach(System.out::println);
    }
}