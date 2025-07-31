package stringcalculator;

public class StringCalculator {


    static int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        String[] strArr = numbers.split(",");
        if (!numbers.contains(",")) return Integer.parseInt(numbers);
        return calculateSum(getInts(strArr));
    }

    private static int[] getInts(String[] strArr) {
        int[] result = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            result[i] = Integer.parseInt(strArr[i]);
        }
        return result;
    }

    private static int calculateSum(int[] intArr) {
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum = sum + intArr[i];
        }
        return sum;
    }

}
