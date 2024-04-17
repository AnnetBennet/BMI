public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BMI = service.calculate(1.71, 76);
        int BMII = (int) BMI;
        System.out.println("Индекс массы тела=" + BMII);
    }
}