package InterestCalculator;



public class SimpleInterest extends Interest{


    protected SimpleInterest(double principal,float time,float rate)
    {
            super(principal,time,rate);

    }
    protected double interestCalculate()
    {
        double si = principal * rate * time;
        si = si/100;
        return si;
    }
}
