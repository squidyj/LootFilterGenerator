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
public class Condition {


    Target target;
    Comparator comp;
    String value;
     
    public Condition(Target t, Comparator c, String v) {
	this.target = t;
	this.comp = c;
	this.value = v;
    }    

   
    //should we throw an exception?
    private String resolveTarget()
    {
	String out = "Invalid target selected.";
	switch(target)
	{
	    case ITEMLEVEL: 
		out = "ItemLevel ";
		break;
	    case DROPLEVEL: 
		out = "DropLevel ";
		break;
	    case QUALITY: 
		out = "Quality ";
		break;
	    case RARITY: 
		out = "Rarity ";
		break;
	    case SOCKETS: 
		out = "Sockets ";
		break;
	    case LINKEDSOCKETS: 
		out = "LinkedSockets ";
		break;
	    case SOCKETGROUP: 
		out = "SocketGroup ";
		break;
	    case HEIGHT: 
		out = "Height ";
		break;
	    case WIDTH: 
		out = "Width ";
		break;
	    case ANY:
		out = "";
		break;
	    default:
		System.out.println("ERROR");
		break;
	}
	return out;
    }
    
    private boolean isIntegerTarget()
    {
	switch(target)
	{
	    case ANY:
	    case RARITY:
	    case SOCKETGROUP:
		return false;
		
	    default:
		return true;
	}
    }
    
    private String resolveComparator()
    {
	String out;
	switch(comp)
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
    
    @Override
    public String toString() {
	if(isIntegerTarget())
	    return resolveTarget() + resolveComparator() + " " + value;
	else
	    return resolveTarget() + value;
    }
}
