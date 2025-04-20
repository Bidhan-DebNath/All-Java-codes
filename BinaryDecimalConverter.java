public class BinaryDecimalConverter {
    public static String decimalToBinary(int number){
        return Integer.toBinaryString(number);
    }
    public static int binaryToDecimal(String binary){
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args){
        int decimalNumber = 13;
        String binaryString = "1101";
        System.out.println("Decimal to Binary: " + decimalToBinary(decimalNumber));
        System.out.println("Binary to Decimal: " + binaryToDecimal(binaryString));
    }
}
