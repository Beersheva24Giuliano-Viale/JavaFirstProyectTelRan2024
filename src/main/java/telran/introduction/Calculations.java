package telran.introduction;

public class Calculations {
    public static int sum(int op1, int op2) {
        int res = op1 + op2;
        return res;
    }

    public static int multiply(int op1, int op2) {
        int res = op1 * op2;
        return res;
    }

    public static int divide(int op1, int op2) {
        if (op2==0) {
            throw new IllegalArgumentException("the denominator cant be 0");

        }
        int res = op1 / op2;
        return res;
    }

    public static int substract(int op1, int op2) {
        int res = op1 - op2;
        return res;
    }

    public static int sumOfDigits(int number) {
        // i convert the number to a string so i can use the string method that counts
        // de value of it
        String numberStr = String.valueOf(number);
        return numberStr.length();
    }

    public static int maxDigit(int number) {
        number = Math.abs(number);/* converting the number into positive in case that is negative */
        int biggestDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            biggestDigit = Math.max(digit, biggestDigit);
            number = number / 10;
        }
        return biggestDigit;
    }

    public static boolean isDividedOn(int number, int divider) {
       if (number%divider==0) {
            return true;
       }else return false;
    }
}
