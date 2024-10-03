package programing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnuDInDAy8_q3 {
    public static void main(String[] args) {
        // Create a Map to store cricketer names and their scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Adding cricketer names and their scores to the Map
        cricketerScores.put("Virat Kohli", 12000);
        cricketerScores.put("Sachin Tendulkar", 18426);
        cricketerScores.put("Rohit Sharma", 9000);
        cricketerScores.put("Brian Lara", 11953);

        // Create a Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a cricketer's name to search for their score
        System.out.print("Enter the cricketer's name to find their score: ");
        String cricketerName = scanner.nextLine();

        // Search for the cricketer's score in the Map
        if (cricketerScores.containsKey(cricketerName)) {
            Integer score = cricketerScores.get(cricketerName);
            System.out.println(cricketerName + "'s score: " + score);
        } else {
            System.out.println("Cricketer not found.");
        }

        
        
    }
}
