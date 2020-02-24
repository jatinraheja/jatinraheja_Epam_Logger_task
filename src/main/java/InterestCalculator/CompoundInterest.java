package InterestCalculator;

public class CompoundInterest extends Interest{

    protected   CompoundInterest(double principal,float time,float rate)
    {
        super(principal,time,rate);
    }
    protected double interestCalculate()
    {
        double ci = principal*(Math.pow(1+rate/100,time));
        return ci;
    }

}
