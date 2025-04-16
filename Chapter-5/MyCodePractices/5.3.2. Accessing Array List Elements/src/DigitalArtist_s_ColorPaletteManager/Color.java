package DigitalArtist_s_ColorPaletteManager;

import java.io.Serializable;

public class Color implements Serializable {
    private String name;
    private int red, green, blue;

    public Color(String name, int red, int green, int blue) {
        this.name = name;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

   public String getName(){
        return name;
   }

   public int getRed(){return red;}
    public int getGreen(){return green;}
    public int getBlue(){return blue;}

    public void setRGB(int r, int g, int b){
        this.red = r;
        this.green = g;
        this.blue = b;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getRGB(){
      return   "(" + red + ", " + green + ", " + blue + ")";

    }
    public String toString(){
        return name + " _ RGB: "+ getRGB();
    }
}
