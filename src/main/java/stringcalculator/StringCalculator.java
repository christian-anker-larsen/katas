package stringcalculator;

public class StringCalculator {


    static int add(String input) {
        if (input.isEmpty()) return 0;
        if (!input.contains(",")) return Integer.parseInt(input);
        String transformedInput = input.replace("\n", ",");
        String[] numbers = transformedInput.split(",");
        return sumOf(valuesFrom(numbers));
    }

    private static int[] valuesFrom(String[] strArr) {
        int[] result = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            result[i] = Integer.parseInt(strArr[i]);
        }
        return result;
    }

    private static int sumOf(int[] intArr) {
        int result = 0;
        for (int addend : intArr) {
            result += addend;
        }
        return result;
    }

}
