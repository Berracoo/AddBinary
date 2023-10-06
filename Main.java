import java.util.Scanner;


public class Main {
    public static boolean isValidBinary(String binaryString){
        return binaryString.matches("^(?!0[1-9])[01]+$");
    }
    public static String sumToBinaryString(String a,String b){
        int binary1 = Integer.parseInt(a);
        int binary2 = Integer.parseInt(b);
        int sum = binary1 + binary2;
        String sumOfBinarySt = Integer.toBinaryString(sum);
        return sumOfBinarySt;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = null;
        String b = null;
        boolean validA = false;
        boolean validB = false;

        while (!validA) {
            System.out.print("Please choose a string value for a which only contains 0 and 1: ");
            a = input.nextLine();

            validA = (a.length() >= 1 && a.length() <= (int)Math.pow(10, 4)) && isValidBinary(a);

            if (!validA) {
                System.out.println("Invalid input for 'a'. Please check the following:");

                if (!(a.length() >= 1 && a.length() <= (int)Math.pow(10, 4))) {
                    System.out.println(" The binary string length should be in the defined range (1 <= a < 10000).");
                }

                if (!isValidBinary(a)) {
                    System.out.println(" Please make sure that 'a' contains only '0' or '1' as a number, and there is no leading zero other than zero itself.");
                }
            }
        }

        while (!validB) {
            System.out.print("Please choose a string value for b which only contains 0 and 1: ");
            b = input.nextLine();

            validB = (b.length() >= 1 && b.length() <= (int)Math.pow(10, 4)) && isValidBinary(b);

            if (!validB) {
                System.out.println("Invalid input for 'b'. Please check the following:");

                if (!(b.length() >= 1 && b.length() <= (int)Math.pow(10, 4))) {
                    System.out.println("The binary string length should be in the defined range (1 <= b < 10000).");
                }

                if (!isValidBinary(b)) {
                    System.out.println("Please make sure that 'b' contains only '0' or '1' as a number, and there is no leading zero other than zero itself.");
                }
            }
        }

        System.out.println("The sum of 2 binary strings in a binary String format is : " + sumToBinaryString(a,b));



    }
}