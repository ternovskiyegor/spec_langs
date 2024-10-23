public class Calculator {
    public static final double INCH_TO_SM = 2.54;
    public static final double SM_TO_INCH = 0.393701;

    public static double convertInchToSm(double inch) {
        return inch * INCH_TO_SM;
    }

    public static double convertSmToInch(double sm) {
        return sm * SM_TO_INCH;
    }
}
