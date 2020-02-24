package InterestCalculator;

public class App {
    static
    {
        SimpleInterest simpleInterest = new SimpleInterest(10000, 4, 8.5f);
        double simpleinterest = simpleInterest.interestCalculate();

        CompoundInterest compoundInterest = new CompoundInterest(15000, 5, 7);
        double Compoundinterest = compoundInterest.interestCalculate();
    }
    public static void main(String[] args) {


    }
}
