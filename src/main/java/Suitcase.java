/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxW;
    
    public Suitcase(int max) {
        this.items = new ArrayList();
        this.maxW = max;
    }
    
    public void addItem(Item item) {
        int sum = totalWeight();
        sum += item.getWeight();
        
        if (sum <= this.maxW) {
            this.items.add(item);
        }
    }
    
    public String toString() {
        int sum = totalWeight();
        
        if (this.items.size() > 1) {
            if (sum <= this.maxW) {
                return (this.items.size() + " items " + "(" + sum + " kg)");
            } else {
                return (this.items.size() + " items " + "(" + this.maxW + " kg)");
            }  
        } else if (this.items.size() == 1) {
            if (sum <= this.maxW) {
                return (this.items.size() + " item " + "(" + sum + " kg)");
            } else {
                return (this.items.size() + " item " + "(" + this.maxW + " kg)");
            }  
        } else {
            return ("no items (0 kg)");
        }
    }
    
    public void printItems() {
        for (Item i: this.items) {
            System.out.println(i.toString());
        }
    }
    
    public int totalWeight() {
        int sum = 0;
        for (Item i: this.items) {
            sum += i.getWeight();
        }
        return sum;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item holder = this.items.get(0);
        for (Item i: this.items) {
            if (i.getWeight() > holder.getWeight()) {
                holder = i;
            }
        }
        return holder;
    }
}
