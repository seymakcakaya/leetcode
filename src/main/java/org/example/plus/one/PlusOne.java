package org.example.plus.one;

//66 Plus One
public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
//9876543211
        int[] digits = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        plusOne.plusOne(digits);
    }

    public int[] plusOne(int[] digits) {
        int arrayLength = digits.length - 1;//TODO:change variable Name;
        Long sumOfDigit = 0L;

        for (int i = 0; i < digits.length; i++) {
            sumOfDigit = sumOfDigit +Long.valueOf((long) (Math.pow(10, arrayLength) * digits[i]));
            arrayLength--;

        }
        sumOfDigit += 1;
        int length = String.valueOf(sumOfDigit).toCharArray().length;
        int[] aa = new int[length];
        int s = 0;
        for (char a : String.valueOf(sumOfDigit).toCharArray()
        ) {
            aa[s] = Integer.parseInt(String.valueOf(a));
            s++;

        }


        return aa;
    }
}
