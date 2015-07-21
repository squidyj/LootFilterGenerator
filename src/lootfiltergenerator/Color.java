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

    public final void setColor(int r, int g, int b, int a)    {
        setR(r); setG(g); setB(b); setA(a);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r > 255 ? 255 : r;
        this.r = this.r < 0 ? 0 : this.r;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b > 255 ? 255 : b;
        this.b = this.b < 0 ? 0 : this.b;    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

        
        
    }
