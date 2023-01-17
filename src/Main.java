public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 58;
        double height = 1.69;
        double Bmi = service.calculate(weight, height);
        System.out.println(Bmi);

        double weight1 = 55;
        double height1 = 1.70;
        double Bmi1 = service.calculate(weight1, height1);
        System.out.println(Bmi1);

        double weight2 = 78;
        double height2 = 1.70;
        double Bmi2 = service.calculate(weight2, height2);
        System.out.println(Bmi2);
    }
}

