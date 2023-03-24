/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.itc538.task1;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author kayle
 */
/* This program requests a series of inputs from a user, like client's name, deposit
amount, and term, and then work out the interest earned and final balance.
*/

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###,###.00");
        
        //Named constants to represent important values in the program.
        double FIRST_TIER = .02;
        double SECOND_TIER = .025;
        double THIRD_TIER = .03;
        double FOURTH_TIER = .035;
        double FIFTH_TIER = .04;
        double MONTHS = 12;
        
        //Declare variables and assign initial values.
        double interestEarned = 0;
        double finalBalance = 0;
        
        //Program heading.
        System.out.println("------------------------------------------");
        System.out.println("                 ABC Bank                 ");
        System.out.println("       Return on Bank Term Deposits       ");
        System.out.println("------------------------------------------");
        
        //Prompt the user to input their name, deposit amount, and ter, in months.
        System.out.println("");
        System.out.println("Please enter the client's full name:");
        String clientName = input.nextLine();
        System.out.println("Please enter the deposit amount:");
        double depositAmount = input.nextDouble();
        System.out.println("Please enter the term of deposit in months:");
        double term = input.nextInt();
        
        //Determine the interest rate and calculate the interest earned and final balance.
        if (depositAmount >= 0 && depositAmount <= 1000) {
            interestEarned = (depositAmount * FIRST_TIER / MONTHS) * term;
        }
        else if (depositAmount > 1000 && depositAmount <= 5000) {
            interestEarned = (depositAmount * SECOND_TIER / MONTHS) * term;
        }
        else if (depositAmount > 5000 && depositAmount <= 10000) {
            interestEarned = (depositAmount * THIRD_TIER / MONTHS) * term;
        }   
        else if (depositAmount > 10000 && depositAmount <= 20000) {
            interestEarned = (depositAmount * FOURTH_TIER / MONTHS) * term;
        }
        else {
            interestEarned = (depositAmount * FIFTH_TIER / MONTHS) * term;
        }
        
        //Declare and calculate final balance.
        finalBalance = depositAmount + interestEarned;
        
        //Display output to user.
        System.out.println("------------------------------------------");
        System.out.println("");
        System.out.println("Client: " + clientName);
        System.out.println("");
        System.out.println("Deposit Amount: $" + df.format(depositAmount));
        System.out.println("");
        System.out.println("Term : " + term + " months");
        System.out.println("");
        System.out.println("Interest Earned: $" + df.format(interestEarned));
        System.out.println("");
        System.out.println("Final balance: $" + df.format(finalBalance));
        System.out.println("");
        System.out.println("------------------------------------------");
    }
}
