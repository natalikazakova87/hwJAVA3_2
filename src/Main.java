public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.87; // рост человека в метрах
        int weight = 98; // вес человека в килограммах
        double bmi = service.calculate(height, weight);
        System.out.println((int)bmi + " ИМТ вашего тела");
    }
}