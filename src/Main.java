public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 67;
        double height = 1.60;
        double doubleBmi = service.calculate(weight, height);
        int bmi = (int) doubleBmi;
        System.out.printf("Индекс массы тела " + bmi);


    }
}