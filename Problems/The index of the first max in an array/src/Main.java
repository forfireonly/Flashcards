

class Main {
    public static void main(String[] args) {
        // put your code here
        java.util.Scanner scn = new java.util.Scanner(System.in);
        int numberOfMembers = scn.nextInt();
        int[]integerArray = new int[numberOfMembers];
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < numberOfMembers; i++) {
            integerArray[i] = scn.nextInt();
            if (integerArray[i] > max) {
                max = integerArray[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}