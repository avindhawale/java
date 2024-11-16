public class Main {
    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        // byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;

        // short has a width of 16
        short myShortValue = 32767;

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;


        byte byteValue = 30;
        short shortValue = 100;
        int intValue = 1000;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);

        System.out.println("My total : "+ longTotal);
    }
}
