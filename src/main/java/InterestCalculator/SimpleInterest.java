package InterestCalculator;

public class SimpleInterest{
    double time;
    double principal;
    double rate;
    public SimpleInterest(double principal,double rate,double time)
    {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }
    public double interest()
    {
        double si = principal * rate * time;
        si = si/100;
        return  si;
    }
}
