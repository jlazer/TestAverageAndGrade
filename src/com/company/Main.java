//  Justin Lazarski
//  CIS3090.04
//  3/15/19
//  inClassActivity4

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double testScore1 = 0.0;
        double testScore2 = 0.0;
        double testScore3 = 0.0;
        double testScore4 = 0.0;
        double testScore5 = 0.0;
        int i;


        for (i = 0; i < 5; ++i) {
            System.out.println("Please input your scores.");
            if (i == 0) {
                testScore1 = input.nextDouble();
            }
            else if (i == 1){
                testScore2 = input.nextDouble();
            }
            else if (i == 2) {
                testScore3 = input.nextDouble();
            }
            else if (i == 3) {
                testScore4 = input.nextDouble();
            }
            else if (i == 4) {
                testScore5 = input.nextDouble();
            }
        }

        double average = 0.0;

        average = calcAverage(testScore1, testScore2, testScore3, testScore4, testScore5, average);

        calcAverage(testScore1, testScore2, testScore3, testScore4, testScore5, average);

        determineGrade(average);
    }

    public static double calcAverage(double testScore1, double testScore2, double testscore3, double testScore4, double testScore5, double average) {

        double sumOfTestScores;

        sumOfTestScores = (testScore1 + testScore2 + testscore3 + testScore4 + testScore5);
        average = (sumOfTestScores/5);

        System.out.println("Sum of Test Scores: " + sumOfTestScores);
        System.out.println("Average: " + average);

        return average;

    }

    public static double determineGrade(double average) {
        System.out.println(average);

        if (average>90)
        {
            System.out.println("You got an A");
        }
        else if (average>=80)
        {
            System.out.println("You got a B");
        }
        else if (average>=70)
        {
            System.out.println("You got a C");
        }
        else if (average>=60)
        {
            System.out.println("You got a D");
        }
        else if (average<60)
        {
            System.out.println("You got an F");
        }
        return 0;
    }
}
