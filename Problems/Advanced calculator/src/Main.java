import java.util.Arrays;

/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        // write your code here
        int[] differentArray = new int[args.length - 1];
        for (int i = 0; i < differentArray.length; i++) {
            differentArray[i] = Integer.parseInt(args[i + 1]);
        }
        Arrays.sort(differentArray);

        switch (operator) {
            case "MAX":
                System.out.println(differentArray[differentArray.length - 1]);
                break;
            case "MIN":
                System.out.println(differentArray[0]);
                break;
            case "SUM":
                int sum = 0;
                for (int each : differentArray) {
                    sum += each;
                }
                System.out.println(sum);
                break;
            default:
        }

    }
}