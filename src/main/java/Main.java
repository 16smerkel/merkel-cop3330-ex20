import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double theOrder = scanner.nextDouble();
        while (theOrder < 0) {
            System.out.println("Please input a positive number.");
            theOrder = scanner.nextDouble();
        }
        String theState = scanner.nextLine();
        System.out.println("What state do you live in?");
        String theSta2te = scanner.nextLine();
        while (theSta2te.length() < 0) {
            System.out.println("Please input a real state name.");
            theSta2te = scanner.nextLine();
        }
        String finalAnswer = String.format("$%.2f", theOrder);
        if(theSta2te.equals("Wisconsin"))
        {
            double theTax = 0.05;
            System.out.println("What county do you live in?");
            String theCounty = scanner.nextLine();
            double theFinalTax = (theOrder * theTax);
            if(theCounty.equals("Eau Claire"))
            {
                theFinalTax = theFinalTax + 0.005;
            }
            else if(theCounty.equals("Dunn"))
            {
                theFinalTax = theFinalTax + 0.004;
            }
            System.out.println("The tax is $" + theFinalTax);
            double theAnswer = theFinalTax + theOrder;
            double roundDollar = Math.round(theAnswer * 100.0) / 100.0;
            finalAnswer = String.format("$%.2f", roundDollar);
        }
        else if(theSta2te.equals("Illinois"))
        {
            double theTax = 0.08;
            double theFinalTax = (theOrder * theTax);
            System.out.println("The tax is $" + theFinalTax);
            double theAnswer = theFinalTax + theOrder;
            double roundDollar = Math.round(theAnswer * 100.0) / 100.0;
            finalAnswer = String.format("$%.2f", roundDollar);
        }
        System.out.println("The total is " + finalAnswer);
    }
}
