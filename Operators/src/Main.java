public class Main {
    public static void main(String[] args) {

        double firstValue = 20d;
        double secondValue = 80d;
        double newValue = (firstValue + secondValue) * 25;
        System.out.println("newValue : "+ newValue);

        int result = (int) (newValue % 40);
        System.out.println("result : "+ result);

        if(result <= 20)
            System.out.println("Total was over the limit!");
    }
}