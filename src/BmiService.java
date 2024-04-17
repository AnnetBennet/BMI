public class BmiService {
    int calculate(double meters, int kilograms) {
        double result;
        result = kilograms / (meters * meters);
        return (int) result;
    }
}
