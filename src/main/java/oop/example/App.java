package oop.example;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int feetLen;
        int feetWid;
        int area;
        double areaInMeters;
        double conversion = 0.09290304;



        System.out.printf("What is the length of the room in feet? ");
        feetLen = Integer.parseInt(input.nextLine());

        System.out.printf("What is the width of the room in feet? ");
        feetWid = Integer.parseInt(input.nextLine());

        System.out.printf("You entered dimensions of %d feet and %d feet.\n", feetLen, feetWid);

        area = feetLen*feetWid;
        areaInMeters = area * conversion;

        System.out.printf("The area is\n%d square feet\n%f square meters\n", area, areaInMeters);
    }
}
