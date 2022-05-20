/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buysharessimulation;

/**
 *
 * @author HPP
 */
/**
 *
 * @author Harshilkumar Vaghela
 * @date October 8,2020(Assignment1)
 */
public class Account {

    // instance variables - replace the example below with your own
    private final Queue<Integer> shares;
    private int totalShares;
    private int totalValue;

    public Account() {
        shares = new ArrayQueue<>();
        totalShares = 0;
        totalValue = 0;
    }

    public void buyShares(int numOfShares, int price) {
        // adds shares as price to the queue 
        totalShares = totalShares + numOfShares;
        totalValue = totalValue + numOfShares * price;
        for (int i = 0; i < numOfShares; i++) {
            shares.enqueue(price);
        }
    }

    public void sellShares(int numToSell, int price) {
        int boughtOn = 0;
        totalShares = totalShares - numToSell;
        for (int i = 0; i < numToSell; i++) {
            boughtOn = boughtOn + shares.dequeue();
        }

        int soldOn = numToSell * price;
        int gOrS = soldOn - boughtOn;
        if (gOrS < 0) {
            System.out.println("Capital Loss: " + gOrS);
        } else {
            System.out.println("Capital gain: " + gOrS);
        }
        totalValue = totalValue - boughtOn;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public int getTotalShares() {
        return totalShares;
    }
}
