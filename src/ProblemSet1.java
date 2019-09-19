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

//Packages
import java.text.NumberFormat;

public class ProblemSet1 {

    public static void main(String[] args) {

        //Dimensions in Inches
        final double lengthInInches = 8.5d;
        final int heightInInches = 11;

        /*
         * Exercise 1.
         * 
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

        //Convert Dimensions to Millimeters
        final double inchesToMillimeters = 25.4d;
        double lengthInMillimeters = lengthInInches*inchesToMillimeters;
        double heightInMillimeters = heightInInches*inchesToMillimeters;
        
        //Calculate + Format Area
        double area = lengthInMillimeters*heightInMillimeters;
        double areaRounded = Math.round(area * 100.0)/100.0d;
        System.out.printf("\n%,.2f square millimeters.\n", area);
        
        /*
         * Exercise 2.
         * 
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
        
        //Convert Dimensions to Centimeters
        final double inchesToCentimeters = 2.54d;
        double lengthInCentimeters = lengthInInches*inchesToCentimeters;
        double heightInCentimeters = heightInInches*inchesToCentimeters;
        
        //Calculate + Format Perimeter
        double perimeter = 2*lengthInCentimeters + 2*heightInCentimeters;
        System.out.printf("\n%.2f centimeters.\n", perimeter);

        /*
         * Exercise 3.
         * 
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
        
         double diagonalLength = Math.hypot(lengthInInches, heightInInches);
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
        
        //Weight Scales
        final double homeworkWeight = 0.15;
        final double quizWeight = 0.35;
        final double testWeight = 0.50;


        //WRONG OUTPUT -- 80.15% when 80.48% expected
        //Calculate Grade
        double grade = (((double) homework1+homework2+homework3)/3)*homeworkWeight +
            (((double) quiz1+quiz2+quiz3)/3)*quizWeight+(((double) test1+test2+test3)/3)*testWeight;
        System.out.printf("\n%.2f%%\n", grade);
        
        /*
         * Exercise 5.
         * 
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

        //Wage Values        
        final double wage = 12.50d;

        //Schedule
        double mondayHours = 7.5d;
        double tuesdayHours = 8d;
        double wednesdayHours = 10.5d;
        double thursdayHours = 9.5d;
        double fridayHours = 6d;
        double saturdayHours = 11.5d;
        double sundayHours = 0d;

        //Calculate Pay
        double pay = wage*mondayHours+wage*tuesdayHours+wage*wednesdayHours+wage*thursdayHours
            +wage*fridayHours+wage*saturdayHours+wage*sundayHours;
        System.out.printf("\n$%.2f.\n", pay);



        /*
         * Exercise 6.
         * 
         * What is my take-home pay each check?
         */
        
        //Initializing constants
        final double salary = 117000;
        final double incomeTaxFed = 0.24;
        final double incomeTaxState = 0.0637;
        final double income401kContribution = 0.07;

        //Calculate Pay
        double bimonthlyPay = salary/24;
        bimonthlyPay -= bimonthlyPay*income401kContribution;
        bimonthlyPay -= bimonthlyPay*incomeTaxFed;
        bimonthlyPay -= bimonthlyPay*incomeTaxState;
        System.out.printf("\n$%,.2f.\n", bimonthlyPay);
        
        /*
         * Exercise 7.
         * 
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
        
        //Initialize Constants
        final double students = 273;
        final double teachers = 28;
        final double capacity = 54;

        //Calculations
        double buses = Math.ceil((students+teachers)/capacity);
        double extraPeople = (students+teachers)%capacity;
        System.out.printf("\n%.0f buses are needed, with %.0f passengers on the last bus.\n", buses, extraPeople);
        
        /*
         * Exercise 8.
         * 
         * What is the surface area of a standard Cornhole board?
         */
        
        //Initialize Constants
        final double boardLength = 48;
        final double boardWidth = 24;
        final double diameter = 6;

        //Calculations
        double boardArea = boardLength*boardWidth - Math.PI*Math.pow(diameter/2, 2);
        System.out.printf("\n%,.2f square inches.\n", boardArea);
        
        /*
         * Exercise 9.
         * 
         * Are the years 2020, 2100, and 2400 leap years?
         */
        
        //Initialize Year Variables
        // double year1 = 2020;
        // double year2 = 2100;
        // int year3 = 2400;

        //Calculations
        // boolean isLeap1 = ((year1%4 != 0) && ((year1%100 == 0) && (year1%400 == 0)));
        // boolean isLeap2 = ;
        // boolean isLeap3 = ;
        // System.out.printf("\n%.0f is a leap year...%f", year1, isLeap1);


        /*
         * Exercise 10.
         * 
         * What is the wind chill?
         */
        
        
        
    }
}