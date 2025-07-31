package stringcalculator;

public class StringCalculator {


    static int add(String input) {
        if (input.isEmpty()) return 0;
        if (!input.contains(",")) return Integer.parseInt(input);
        String[] strArr = input.split(",");
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
