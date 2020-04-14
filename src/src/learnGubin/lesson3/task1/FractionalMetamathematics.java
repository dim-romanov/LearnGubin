package src.learnGubin.lesson3.task1;

public class FractionalMetamathematics {
    public static RightFractions sumFractions(RightFractions fractionOne, RightFractions fractionTwo) {
        RightFractions rightFractions = new RightFractions();
        double oneNumber = fractionOne.getNumerator() / fractionOne.getDenominator() * 100;
        double twoNumber = fractionTwo.getNumerator() / fractionTwo.getDenominator() * 100;
        double sum = oneNumber + twoNumber;

        return rightFractions;
    }
}
