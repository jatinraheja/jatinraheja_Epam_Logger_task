package HouseCostCalculator;

import java.util.Scanner;

public class HouseConstructionCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quality of material standard,above standard or high standard to be used.");
        String materialstandard = sc.nextLine();

        System.out.println("Enter total area of the house");
        double totalarea = sc.nextDouble();

        System.out.println("Type yes if you want fully automated house with high standard material else type no");
        String automatedhouse = sc.next();
        //System.out.println(automatedhouse);
        CostCalculator costCalculate = new CostCalculator(materialstandard,totalarea,automatedhouse);
        double totalcost = costCalculate.costCalculate();
        System.out.println("Total cost for the house construction is : "+totalcost);

    }
}
