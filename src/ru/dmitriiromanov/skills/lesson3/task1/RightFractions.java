package src.learnGubin.lesson3.task1;

public class RightFractions {
    private int numerator;
    private int denominator;

    public RightFractions() {

    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public RightFractions(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double fractionsInPercent(double numerator, double denominator){
        return (numerator / denominator) * 100;
    }

    public int sumNumeratorAndDenominator(int numerator, int denominator) {
        return numerator + denominator;
    }
}
