/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lootfiltergenerator;

import java.util.Objects;

/**
 *
 * @author Bruce
 */    
public class Condition {


    private Target target;
    private Comparator comp;
    private String value;
     
    public Condition(Target t, Comparator c, String v) {
	this.target = t;
	this.comp = c;
	this.value = v;
    }    
   
    private boolean isIntegerTarget()
    {
	switch(getTarget())
	{
	    case ANY:
	    case RARITY:
	    case SOCKETGROUP:
		return false;
		
	    default:
		return true;
	}
    }
  
    @Override
    public String toString() {
	if(isIntegerTarget())
	    return "" + getTarget() + getComp() + " " + getValue();
	else
	    return "" + getTarget() + getValue();
    }

    @Override
    public boolean equals(Object other)
    {
	if((other == null) || !(other instanceof Condition))
	    return false;
	Condition b = (Condition)other;
	return	b.getComp().equals(getComp()) &&
		b.getTarget().equals(getTarget()) &&
		b.getValue().equals(getValue());
    }
    
    //Encapsulating fields here, allows for future modification of these mthods without disrupting other code
    public Target getTarget() { return target; }
    public void setTarget(Target target) { this.target = target; }

    public Comparator getComp() { return comp; }
    public void setComp(Comparator comp) { this.comp = comp; }

    public String getValue() { return value; }   
    public void setValue(String value) { this.value = value; }
}
