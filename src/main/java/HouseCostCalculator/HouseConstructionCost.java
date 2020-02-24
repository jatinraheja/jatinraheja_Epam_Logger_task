package HouseCostCalculator;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class HouseConstructionCost {
    static
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quality of material standard,above standard or high standard to be used.");
        String materialstandard = sc.nextLine();
        System.out.println("Enter total area of the house");
        double totalarea = sc.nextDouble();
        String automatedhouse = "no";
        if(materialstandard=="high standard") {
            System.out.println("Type yes if you want fully automated house with high standard material else type no");
            automatedhouse = "yes";
        }
        CostCalculator costCalculate = new CostCalculator(materialstandard, totalarea, automatedhouse);
        double totalcost = costCalculate.costCalculate();
        System.out.println("The total cost of the house is "+totalcost);
    }
    public static void main(String[] args) {


    }
}
