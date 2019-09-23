/**
 * Problem Set 1.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 * 
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.text.NumberFormat;

public class ProblemSet1 {

    public static void main(String[] args) {


        /*
         * Exercise 1.
         * 
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

        //Initialize Constants
        final double LENGTH_IN_INCHES = 8.5;
        final double WIDTH_IN_INCHES = 11;
        final double INCHES_TO_MILLIMETERS = 25.4;

        //Calculate Conversions 
        double lengthInMillimeters = LENGTH_IN_INCHES*INCHES_TO_MILLIMETERS;
        double widthInMillimeters = WIDTH_IN_INCHES*INCHES_TO_MILLIMETERS;
        
        //Calculate Area & Output
        double area = lengthInMillimeters*widthInMillimeters;
        System.out.printf("\n%,.2f square millimeters.\n", area);
        
        /*
         * Exercise 2.
         * 
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
        
        //Initialize Constants
        //Reused LENGTH_IN_INCHES
        //Reused WIDTH_IN_INCHES
        final double INCHES_TO_CENTIMETERS = 2.54d;

        //Calculate Conversions
        double lengthInCentimeters = LENGTH_IN_INCHES*INCHES_TO_CENTIMETERS;
        double widthInCentimeters = WIDTH_IN_INCHES*INCHES_TO_CENTIMETERS;
        
        //Calculate Perimeter & Output
        double perimeter = 2*lengthInCentimeters + 2*widthInCentimeters;
        System.out.printf("\n%.2f centimeters.\n", perimeter);

        /*
         * Exercise 3.
         * 
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
        
         //Initialized Constants
         //Reused LENGTH_IN_INCHES
         //Reused WIDTH_IN_INCHES

         //Calculate Length & Output
         double diagonalLength = Math.hypot(LENGTH_IN_INCHES, WIDTH_IN_INCHES);
         System.out.printf("\n%.2f inches.\n", diagonalLength);

        /*
         * Exercise 4.
         * 
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */
        
        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;
        
        //Initialize Constants
        final double HOMEWORK_WEIGHT = 0.15;
        final double QUIZ_WEIGHT = 0.35;
        final double TEST_WEIGHT = 0.50;


        //Calculate Grade & Output
        double grade = (((double) homework1+homework2+homework3)/3)*HOMEWORK_WEIGHT +
            (((double) quiz1+quiz2+quiz3)/3)*QUIZ_WEIGHT+(((double) test1+test2+test3)/3)*TEST_WEIGHT;
        System.out.printf("\n%.2f%%.\n", grade);
        
        /*
         * Exercise 5.
         * 
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

        //Initialize Constants        
        final double WAGE = 12.50d;

        //Initialize Variables
        //Initialize Schedule
        double mondayHours = 7.5d;
        double tuesdayHours = 8d;
        double wednesdayHours = 10.5d;
        double thursdayHours = 9.5d;
        double fridayHours = 6d;
        double saturdayHours = 11.5d;
        double sundayHours = 0d;

        //Calculate Pay & Output
        double pay = WAGE*mondayHours+WAGE*tuesdayHours+WAGE*wednesdayHours+WAGE*thursdayHours
            +WAGE*fridayHours+WAGE*saturdayHours+WAGE*sundayHours;
        System.out.printf("\n$%.2f.\n", pay);



        /*
         * Exercise 6.
         * 
         * What is my take-home pay each check?
         */
        
        //Initialize Constants
        final double SALARY = 117000;
        final double INCOME_TAX_FED = 0.24;
        final double INCOME_TAX_STATE = 0.0637;
        final double INCOME_401K_CONTRIBUTION = 0.07;

        //Calculate Pay & Output
        double bimonthlyPay = SALARY/24;
        bimonthlyPay -= bimonthlyPay*INCOME_401K_CONTRIBUTION;
        bimonthlyPay -= bimonthlyPay*INCOME_TAX_FED;
        bimonthlyPay -= bimonthlyPay*INCOME_TAX_STATE;
        System.out.printf("\n$%,.2f.\n", bimonthlyPay);
        
        /*
         * Exercise 7.
         * 
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
        
        //Initialize Constants
        final double STUDENTS = 273;
        final double TEACHERS = 28;
        final double CAPACITY = 54;

        //Calculate Buses, Capacity & Output
        double buses = Math.ceil((STUDENTS+TEACHERS)/CAPACITY);
        double extraPeople = (STUDENTS+TEACHERS)%CAPACITY;
        System.out.printf("\n%.0f buses are needed, with %.0f passengers on the last bus.\n", 
            buses, extraPeople);
        
        /*
         * Exercise 8.
         * 
         * What is the surface area of a standard Cornhole board?
         */
        
        //Initialize Constants
        final double BOARD_LENGTH = 48;
        final double BOARD_WIDTH = 24;
        final double DIAMETER = 6;

        //Calculate Area & Output
        double boardArea = BOARD_LENGTH*BOARD_WIDTH - Math.PI*Math.pow(DIAMETER/2, 2);
        System.out.printf("\n%,.2f square inches.\n", boardArea);
        
        /*
         * Exercise 9.
         * 
         * Are the years 2020, 2100, and 2400 leap years?
         */
        
        //Initialize Variables
        double year2020 = 2020;
        double year2100 = 2100;
        double year2400 = 2400;

        //Calculate Leap Year & Output
        boolean is2020Leap = (year2020%4 == 0) && ((year2020%100 != 0) || (year2020%400 == 0));
        boolean is2100Leap = (year2100%4 == 0) && ((year2100%100 != 0) || (year2100%400 == 0));
        boolean is2400Leap = (year2400%4 == 0) && ((year2400%100 != 0) || (year2400%400 == 0));
        System.out.printf("\n%.0f is a leap year...%b.", year2020, is2020Leap);
        System.out.printf("\n%.0f is a leap year...%b.", year2100, is2100Leap);
        System.out.printf("\n%.0f is a leap year...%b.\n", year2400, is2400Leap);

                


        /*
         * Exercise 10.
         * 
         * What is the wind chill?
         */
        
         //Initialize Variables
        double temperature = 38;
        double windSpeed = 14;

        //Calculate Wind Chill & Output
        double windChill = 35.74 + 0.6215*temperature+
            (0.4275*temperature - 35.75)*Math.pow(windSpeed, 0.16);
        System.out.printf("\n%.1f degrees.\n\n", windChill);
        
    }
    
}