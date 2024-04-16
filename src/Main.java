public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BMI = service.calculate(1.65, 57);
        System.out.println("Индекс массы тела=" + BMI);
    }
}