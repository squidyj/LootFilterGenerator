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

    private Color borderColor;
    private Color backgroundColor;
    private Color textColor;
    private int fontSize;
    private int volume;
    private int sound;
    private boolean useFont, useVolume, useSound;
    private boolean useBorder, useBackground, useText;
    
    public Effect()
    {
        setUseFont(false);
        setUseVolume(false);
        setUseSound(false);
        setUseBorder(false);
        setUseBackground(false);
        setUseText(false);
    }
    
    @Override
    public boolean equals(Object other)
    {
        if(other == null || !(other instanceof Effect))
            return false;
        
        Effect e = (Effect)other;
        boolean out = true;
        if(isUseBorder() && e.isUseBorder())
             out = out && Color.equal(getBorderColor(), e.getBorderColor());
        if(isUseBackground() && e.isUseBackground())
             out = out && Color.equal(getBackgroundColor(), e.getBackgroundColor());
        if(isUseText() && e.isUseText())
             out = out && Color.equal(getTextColor(), e.getTextColor());
        if(isUseFont() && e.isUseFont())
             out = out && (getFontSize() == e.getFontSize());
        if(isUseVolume() && e.isUseVolume())
             out = out && (getVolume() == e.getVolume());
        if(isUseSound() && e.isUseSound())
             out = out && (getSound() == e.getSound());    
        return  !(isUseFont() ^ e.isUseFont() ||
                isUseVolume() ^ e.isUseVolume() ||
                isUseSound() ^ e.isUseSound() ||
                isUseBorder() ^ e.isUseBorder() ||
                isUseBackground() ^ e.isUseBackground() ||
                isUseText() ^ e.isUseText()) && out;                
    }
    
    @Override
    public String toString()
    {
        String out = "";
        if(isUseBackground())
            out += "SetBackgroundColor " + getBackgroundColor() + "\r\n";
        if(isUseBorder())
            out += "SetBorderColor " + getBorderColor() + "\r\n";
        if(isUseText())
            out += "SetTextColor " + getTextColor() + "\r\n";
        if(isUseFont())
            out += "SetFontSize " + getFontSize() + "\r\n";
        if(isUseSound())
        {
            out+= "PlayAlertSound " + getSound();
            if(isUseVolume())
                out += " " + getVolume();
            out += "\r\n";
        }        
        //remove the final line break from the string
        if(out.length() > 1)
            out = out.substring(0, out.length() - 2);
        return out;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }

    public boolean isUseFont() {
        return useFont;
    }

    public void setUseFont(boolean useFont) {
        this.useFont = useFont;
    }

    public boolean isUseVolume() {
        return useVolume;
    }

    public void setUseVolume(boolean useVolume) {
        this.useVolume = useVolume;
    }

    public boolean isUseSound() {
        return useSound;
    }

    public void setUseSound(boolean useSound) {
        this.useSound = useSound;
    }

    public boolean isUseBorder() {
        return useBorder;
    }

    public void setUseBorder(boolean useBorder) {
        this.useBorder = useBorder;
    }

    public boolean isUseBackground() {
        return useBackground;
    }

    public void setUseBackground(boolean useBackground) {
        this.useBackground = useBackground;
    }

    public boolean isUseText() {
        return useText;
    }

    public void setUseText(boolean useText) {
        this.useText = useText;
    }
}
