/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buysharessimulation;

import java.util.Scanner;

/**
 *
 * @author HPP
 */
public class BuySharesSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    
        Account buyer = new Account();
        Scanner kb = new Scanner(System.in);
        int k = 0;
        while (k != 3) {
            System.out.println("Make a selection: \n1.Buy shares\n2.Sell Shares\n3.Exit");
            k = kb.nextInt();
            switch (k) {
                case 1 -> {
                    System.out.println("Enter the number of shares to buy: ");
                    int buy = kb.nextInt();
                    System.out.println("Enter the purchase price per share: ");
                    int price = kb.nextInt();
                    buyer.buyShares(buy, price);

                    System.out.println("Total Shares: " + buyer.getTotalShares() + "\nTotal Value: " + buyer.getTotalValue());
                    System.out.println("\n-------------------------\n");
                }
                case 2 -> {
                    System.out.println("Enter the number of shares to sell: ");
                    int sell = kb.nextInt();
                    System.out.println("Enter the selling price per share: ");
                    int sellPrice = kb.nextInt();
                    buyer.sellShares(sell, sellPrice);

                    System.out.println("Total Shares: " + buyer.getTotalShares() + "\nTotal Value: " + buyer.getTotalValue());
                    System.out.println("\n-------------------------\n");
                }
                case 3 -> System.out.print("");
                default -> System.out.println("Not valid");
            }
        }
        System.out.println("***End of the program***");

    }

}
