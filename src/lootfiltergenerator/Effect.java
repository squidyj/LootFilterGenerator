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
public class Effect {
    public class Color
    {
	public int r,g,b,a;
    }
    public enum Sound {
	
    }
    
    Color borderColor, backgroundColor, textColor;
    int fontSize;
    Sound sound;
}
