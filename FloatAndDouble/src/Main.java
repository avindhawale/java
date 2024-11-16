
public class Main {
    public static void main(String[] args) {

        // int has a width of 32 (4 bytes)
        int intValue = 5;

        // float has a width of 32 (4 bytes)
        float floatValue = 5f;

        // double has a width of 64 (8 bytes)
        double doubleValue = 5d;

        System.out.println("intValue : "+ intValue);
        System.out.println("floatValue : "+ floatValue);
        System.out.println("doubleValue : "+ doubleValue);


        int newIntValue = intValue / 3;
        float newFloatValue = floatValue / 3f;
        double newDoubleValue = doubleValue / 3d;

        System.out.println("newIntValue : "+ newIntValue);
        System.out.println("newFloatValue : "+ newFloatValue);
        System.out.println("newDoubleValue : "+ newDoubleValue);


        int pounds = 200;
        double POUND = 0.45359237d;
        double kg = POUND * pounds;

        System.out.println("KG : "+ kg);
    }
}