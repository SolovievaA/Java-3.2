public class BmiService {
    public double calculate(int weight, double height) {
        double doubleBmi = weight / (height * height);
        return doubleBmi;
    }
}
