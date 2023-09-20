public class Arrow {
    public static void main(String[] args) {
        String input1 = ">>";
        String input2 = "<<";
        String input3 = "<<<";

        String[] inputs = {input1, input2, input3};
        String maxString = inputs[0];

        for (String input : inputs) {
            if (countOccurrences(input, '<') > countOccurrences(maxString, '<')) {
                maxString = input;
            }
        }

        System.out.println("Sample Output: " + maxString);
    }

    public static int countOccurrences(String str, char target) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}