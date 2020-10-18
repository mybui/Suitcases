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

public class Hold {
    private int weight;
    private ArrayList<Suitcase> holds;
    
    public Hold(int weight_) {
        this.holds = new ArrayList();
        this.weight = weight_;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int sum = 0;
        for (Suitcase i: this.holds) {
            sum += i.totalWeight();
        }
        sum += suitcase.totalWeight();
        
        if (sum <= this.weight) {
            this.holds.add(suitcase);
        }
    }
    
    public String toString() {
        int sum = 0;
        for (Suitcase i: this.holds) {
            sum += i.totalWeight();
        }
        return (this.holds.size() + " suitcases " + "(" + sum + " kg)");
    }
    
    public void printItems() {
        for (Suitcase i: this.holds) {
            i.printItems();
        }
    }
}
