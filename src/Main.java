package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int standardPriceShirt = 1200;
        int amountShirts = 3;
        int amountShirtsForSales = 4;
        System.out.println("standardPriceShirt = " + standardPriceShirt);
        System.out.println("amountShirts = " + amountShirts);
        System.out.println("amountShirtsForSales = " + amountShirtsForSales);
        int diffAmount = amountShirtsForSales - amountShirts;
        System.out.println("diffAmount = " + diffAmount);
        int summAmountShirts = amountShirts * standardPriceShirt;
        System.out.println("summAmountShirts = " + summAmountShirts);
        int summAmountShirtsForSales = amountShirtsForSales * standardPriceShirt;
        System.out.println("summAmountShirtsForSales = " + summAmountShirtsForSales);
        double saleProcent = 0.35;
        System.out.println("saleProcent = " + saleProcent);
        double saleSummAmountShirtsForSales = summAmountShirtsForSales * (1 - saleProcent);
        System.out.println("saleSummAmountShirtsForSales = " + saleSummAmountShirtsForSales);
        double saleSummOneShirt = standardPriceShirt * (1 - saleProcent);
        System.out.println("saleSummOneShirt = " + saleSummOneShirt);
        double savingMoneyForShirts = summAmountShirtsForSales - saleSummAmountShirtsForSales;
        System.out.println("savingMoneyForShirts = " + savingMoneyForShirts);
        double valueOnSales = savingMoneyForShirts / standardPriceShirt;
        System.out.println("valueOnSales = " + valueOnSales);
    }
}
