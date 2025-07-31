package stringcalculator;

public class StringCalculator {


    static int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        String[] strArr = numbers.split(",");
        if (strArr.length == 1) {
            return Integer.parseInt(numbers);
        }
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        return calculateSum(intArr);
    }

    private static int calculateSum(int[] intArr) {
        int sum = 0;

        for (int i = 0; i < intArr.length; i++) {
            sum = sum + intArr[i];
        }
        return sum;
    }

}
