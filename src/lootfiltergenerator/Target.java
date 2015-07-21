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
    	ITEMLEVEL, DROPLEVEL, QUALITY,
	RARITY, SOCKETS, LINKEDSOCKETS,
	SOCKETGROUP, HEIGHT, WIDTH, ANY;

    @Override
    public String toString()
    {
	String out = "Invalid target selected.";
	switch(this)
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

}
