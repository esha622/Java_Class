package Thirdweek;

public class MethodFunction {
    static double calculateTotal(double[] prices, int discountAmt) {
        double totalsum = 0;
        for (double price : prices) {
            totalsum += price;
        }
        double discountVal = totalsum * discountAmt / 100;
        return totalsum - discountVal;
    }
        public static void main (String[]args){
            double[] itemPrices = {1.2, 2.5, 5.7, 8.9};
            int discount = 10;
            double res = calculateTotal(itemPrices, discount);
            System.out.println("Total after discount: " + res);
        }
        }