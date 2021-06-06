package ex07;

/*
Exercise 7 - Area of a Rectangular Room

When working in a global environment, you’ll have to present information in both metric and Imperial units. And you’ll need to know when to do the conversion to ensure the most accurate results.

Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet. Then display the area in both square feet and square meters.

Example Output

What is the length of the room in feet? 15
What is the width of the room in feet? 20
You entered dimensions of 15 feet by 20 feet.
The area is
300 square feet
27.871 square meters

The formula for this conversion is m2 = f2 × 0.09290304

Constraints

Keep the calculations separate from the output.
Use a constant to hold the conversion factor.

 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Base {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Base myBase = new Base();

        String inputLength = inputLength();
        String inputWidth = inputWidth();

        int length = Integer.parseInt(inputLength);
        int width = Integer.parseInt(inputWidth);

        myBase.calculateArea(length, width);
    }

    private void calculateArea(int length, int width) {
        System.out.println("You entered dimension of " + length + " by " + width + " feet ");

        int area = length * width;
        final double conversionFormula = area * 0.092_903_04;
        DecimalFormat roundOff = new DecimalFormat("##.000");

        System.out.println("The area is ");
        System.out.println(area + " square feet ");
        System.out.println(roundOff.format(conversionFormula) + " square meters ");
    }

    private static String inputWidth() {
        System.out.print("What is the width of the room in feet? ");
        String width = input.nextLine();
        return width;
    }

    private static String inputLength() {
        System.out.print("What is the length of the room in feet? ");
        String length = input.nextLine();
        return length;
    }

}
