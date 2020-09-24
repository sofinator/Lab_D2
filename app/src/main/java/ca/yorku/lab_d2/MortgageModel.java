package ca.yorku.lab_d2;

public class MortgageModel
{
    public MortgageModel(String p, String a, String i) {
        double P = Double.parseDouble(p);
        double r = Double.parseDouble(i);
        double n = Double.parseDouble(a);
    }
    public String computePayment() {
        double payment = (r * P) / (1 - Math.pow((1 + r),-n));
        return String.format("$%,.2f", payment);
        }
}
