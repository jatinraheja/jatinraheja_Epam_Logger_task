package InterestCalculator;

public class CompoundInterest {
    double time;
    double principal;
    double rate;
    CompoundInterest(double principal,double rate,double time)
    {
        this.time = time;
        this.principal = principal;
        this.rate = rate;
    }
    public double interest()
    {
        double ci = principal*(Math.pow(1+rate/100,time));
        return ci;
    }

}
