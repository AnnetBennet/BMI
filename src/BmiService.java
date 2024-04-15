public class BmiService {
    double calculate (double meters, double kilograms) {
        double result;
        result = kilograms / (meters * meters);
        return result;
    }
}
