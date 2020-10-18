/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */
public class Item {
    private String name;
    private int weight;
    
    public Item(String name_, int weight_) {
        this.name = name_;
        this.weight = weight_;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public String toString() {
        return (this.name + "(" + this.weight + " kg)");
    }
}
