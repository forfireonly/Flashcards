import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int numberOfCompanies = scn.nextInt();
        int indexMaxCompany = 0;
        int maxTaxes = 0;
        int[]yearlyIncome = new int[numberOfCompanies];
        for (int i = 0; i < numberOfCompanies; i++) {
            yearlyIncome[i] = scn.nextInt();
        }
        int[]taxes = new int[numberOfCompanies];
        for (int i = 0; i < numberOfCompanies; i++) {
            taxes[i] = scn.nextInt();
            if (taxes[i] * yearlyIncome[i] > maxTaxes) {
                maxTaxes = taxes[i] * yearlyIncome[i];
                indexMaxCompany = i + 1;

            }
        }
        System.out.println(indexMaxCompany);



    }
}