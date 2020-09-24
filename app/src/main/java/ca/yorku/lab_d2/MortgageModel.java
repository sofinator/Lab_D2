//Student Name: Sophia Nguyen
//This project was done individually
package ca.yorku.lab_d2;

public class MortgageModel
{
    double r;
    double P;
    double n;

    public MortgageModel(String p, String a, String i) {
        r = Double.parseDouble(i)/100/12;
        P = Double.parseDouble(p);
        n = Double.parseDouble(a)*12;
    }
    public String computePayment() {
        double payment = (r * P) / (1 - Math.pow((1 + r),-n));
        return String.format("$%,.2f", payment);
        }
}
