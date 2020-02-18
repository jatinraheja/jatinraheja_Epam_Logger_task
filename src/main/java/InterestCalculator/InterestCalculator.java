package InterestCalculator;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double principal;
        double rate;
        double time;
        String type;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount on which to find the interest");
        principal = sc.nextDouble();
        System.out.println("Enter the interest rate to calculate the interest");
        rate  = sc.nextDouble();
        System.out.println("Enter the time period in years for which to find the interest");
        time = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the type of interest Simple or Compound");
        type = sc.nextLine();
        if(type=="Simple")
        {
            SimpleInterest simpleInterest = new SimpleInterest(principal,rate,time);
           double interest = simpleInterest.interest();
           double amount = interest + principal;
            System.out.println("Total interest to be paid "+interest);
            System.out.println("Total amount to be paid after "+time+" years is "+amount);
        }
        else
        {
            CompoundInterest compoundInterest = new CompoundInterest(principal,rate,time);
            double interest = compoundInterest.interest();
            double amount = interest + principal;
            System.out.println("Total interest to be paid "+interest);
            System.out.println("Total amount to be paid after "+time+" years is "+amount);
        }
    }
}
