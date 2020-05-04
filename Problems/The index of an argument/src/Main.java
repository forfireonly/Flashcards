class Problem {
    public static void main(String[] args) {
        int myIndex = -1;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("test")) {
                myIndex = i;
            }
        }
        System.out.println(myIndex);

    }
}