package Codility;

import java.util.*;

public class BankAccountTransaction {
    public static void main(String[] args){
        int[] A = {100, 100, 100, -10};
        String[] D = {"2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29"};

        int[] A1 = {180, -50, -25, -25};
        String[] D1 = {"2020-01-01", "2020-01-01", "2020-01-01", "2020-01-31"};

        int[] A2 = {1, -1, 0, -105, 1};
        String[] D2 = {"2020-12-31", "2020-04-04", "2020-04-04", "2020-04-14", "2020-07-12"};

        calculateBankBalance(A, D);
        calculateBankBalance(A1, D1);
        calculateBankBalance(A2, D2);
    }

    private static void calculateBankBalance(int[] a, String[] d) {
        int balance = 0;
        Map<String, List<Integer>> cardPayments = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int amount = a[i];
            String data = d[i];
            balance += amount;
            if(amount < 0){ //-negative
                String month = data.substring(0,7);
                cardPayments.put(month, new ArrayList<>());
                cardPayments.get(month).add(-amount);
            }
        }
        Set<String> allMonths = new HashSet<>();
        for(int m = 1; m<=12;m++){
            allMonths.add(String.format("2020-%02d",m));
        }
        for(String month : allMonths){
            List<Integer> payments = cardPayments.getOrDefault(month, new ArrayList<>());
            int num = payments.size();
            int totalSpent = payments.stream().mapToInt(Integer::intValue).sum();

            if(num < 3 || totalSpent <100){
                balance -= 5;
            }
        }
        System.out.println(balance);
    }
}
