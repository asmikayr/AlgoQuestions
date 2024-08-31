package com.algoquestionsAll;
/*
Question-2 Calculate Distance
You have (x, y) coordinates for 2 points and need to find the distance between them.
Input:
Your program should read lines from the file. Each line contains two coordinate pairs which are space-delimited.
All x and y values are integers between -100 and 100.
Output:
Return the list of distance between the points. You do not need to round the results you receive.
Test 1
        (25, 4) (1, -6)
Expected Output 26.0
Test 2
        (47, 43) (-25, -11)
Expected Output 90.0
Constraints: Input file will have at least one line with valid coordinates.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalculateDistanceBTWTwoPoints {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Asmik\\IdeaProjects\\AlgoQuestions\\src\\main\\resources\\coordinates.txt");
        Scanner input = new Scanner(file);

        while(input.hasNextLine()){

            String line = input.nextLine();

            String[] coordinates = line.split(" ");

            int x1 = Integer.parseInt(coordinates[0]);
            int y1 = Integer.parseInt(coordinates[1]);
            int x2 = Integer.parseInt(coordinates[2]);
            int y2 = Integer.parseInt(coordinates[3]);

            System.out.println(calculateDistanceBtwTwoPoints(x1, y1, x2, y2));

        }

        input.close();

    }

    public static double calculateDistanceBtwTwoPoints(int x, int y, int x2, int y2){

        return Math.sqrt((x2-x)*(x2-x)+(y2-y)*(y2-y));
    }

}
