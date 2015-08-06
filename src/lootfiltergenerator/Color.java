/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lootfiltergenerator;

public class Color
{
    private int r;
    private int b;
    private int a;
    private int g;

    Color(int r, int g, int b, int a) {
        setColor(r, g, b ,a);
    }

    @Override
    public String toString() {
        return  String.format("%03d ", r) + String.format("%03d ", g) + 
                String.format("%03d ", b) + String.format("%03d", a);
    }

    private int clamp(int in)
    {
        int out = in < 0 ? 0 : in;
        out = out > 255 ? 255 : out;
        return out;
    }
    
    public static boolean equal(Object a, Object b)
    {
            if(a != null ^ b != null)
                return false;
            if(a == null)
                return true;
            if(!(a instanceof Color && b instanceof Color))
                return false;
            Color c = (Color)a;
            return c.equals(b);
    }
    
    @Override
    public boolean equals(Object other)
    {
        if(other == null || !(other instanceof Color))
            return false;
        Color c = (Color)other;
        return c.getR() == getR() &&
               c.getG() == getG() &&
               c.getB() == getB() &&
               c.getA() == getA();
    }
    
    public final void setColor(int r, int g, int b, int a)    {
        setR(r); setG(g); setB(b); setA(a);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = clamp(r);
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = clamp(b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = clamp(a);
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = clamp(g);
    }

        
        
    }
