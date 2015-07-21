/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lootfiltergenerator;

/**
 *
 * @author Bruce
 */
public enum Comparator {
    LESSTHAN("<"), LESSEQUAL("<="), GREATERTHAN(">"),
    GREATEREQUAL(">="), EQUAL("=");
    private final String name;
    
    Comparator(String s) {name = s;}
    @Override
    public String toString() { return name; }    
}