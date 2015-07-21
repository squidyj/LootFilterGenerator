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
public enum Target {
    ITEMLEVEL("ItemLevel"), 
    DROPLEVEL("Droplevel"), 
    QUALITY("Quality"),
    RARITY("Rarity"), 
    SOCKETS("Sockets"), 
    LINKEDSOCKETS("LinkedSockets"),
    SOCKETGROUP("SocketGroup"), 
    HEIGHT("Height"), 
    WIDTH("Width"), 
    ANY("");
    
    private final String name;
    
    Target(String s) { name = s; }
        
    @Override
    public String toString(){ return name; }

}
