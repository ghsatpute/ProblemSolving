/*

https://www.hackerrank.com/challenges/grading/problem

At HackerLand University, a passing grade is any grade 40 points or higher on a 100 point scale. Sam is a professor at the university and likes to round each student’s grade according to the following rules:

If the difference between the grade and the next higher multiple of 5 is less than 3, round to the next higher multiple of 5
If the grade is less than 38, don’t bother as it’s still a failing grade
Automate the rounding process then round a list of grades and print the results.

Input Format

The first line contains a single integer denoting  (the number of students). 
Each line  of the  subsequent lines contains a single integer, , denoting student 's grade.

Constraints

Output Format

For each  of the  grades, print the rounded grade on a new line.

Sample Input 0

4
73
67
38
33
Sample Output 0

75
67
40
33
Explanation 0

The first grade,  is two below the next higher multiple of , so it rounds to . 
 is  points less than the next higher multiple of  so it doesn’t round. 
, like , rounds up to next higher multiple of , or  in this case. 
 is less than , so it does not round.

*/ 


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int[] output = grades.clone();
        
        
        for (int i = 0; i < grades.length; i++) {
            
            if(grades[i] < 38) continue;
            
            int nextCeil = ((grades[i] + 5) / 5) * 5;
            
            if((nextCeil - grades[i]) < 3) {
                output[i] = nextCeil;
            }
        }
        return output;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
