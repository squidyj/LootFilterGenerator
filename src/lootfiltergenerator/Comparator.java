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
    LESSTHAN, LESSEQUAL, GREATERTHAN,
    GREATEREQUAL, EQUAL;
	
    @Override
    public String toString()
    {
	String out;
	switch(this)
	{
	    case LESSTHAN:
		out = "<";
		break;
	    case LESSEQUAL:
		out = "<=";
		break;
	    case EQUAL:
		out = "=";
		break;
	    case GREATEREQUAL:
		out = ">=";
		break;
	    case GREATERTHAN:
		out = ">";
		break;
	    default:
		out = "";
		break;
	}
	return out;
    }
    
}