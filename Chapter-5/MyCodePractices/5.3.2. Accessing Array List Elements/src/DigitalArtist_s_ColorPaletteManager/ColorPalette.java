package DigitalArtist_s_ColorPaletteManager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ColorPalette implements Serializable {
    private String paletteName;
    private ArrayList<Color> colors;

    public ColorPalette(String name) {
        this.paletteName = name;
        this.colors = new ArrayList<>();
    }

    public String getPaletteName() {
        return paletteName;
    }

    public void addColor(Color c){
        colors.add(c);
    }

    public void removeColor(int index){
        if (index >= 0 && index < colors.size()){
            colors.remove(index);
        }
    }

    public ArrayList<Color> getColors(){
        return colors;
    }
    public String getName() {
        return paletteName;
    }

    @Override
    public String toString() {
        return "🎨 Palette: " + paletteName + "{" + colors.size() + "colors}";
    }

    public double[] averageRGB(){
        int totalR = 0, totalG = 0, totalB = 0;
        for (Color c : colors){
            totalR += c.getRed();
            totalG += c.getGreen();
            totalB += c.getBlue();
        }
        int size = colors.size();
        if (size == 0) return new double[]{0,0,0};
        return new double[]{(double) totalR/size, (double) totalG/size, (double) totalB/size};
    }

    public List<Color> search(String keyword){
        List<Color> result = new ArrayList<>();
        for (Color c: colors){
            if (c.getName().toLowerCase().contains(keyword.toLowerCase()) || c.getRGB().contains(keyword))
            {
                result.add(c);
            }
        }
        return result;
    }
}
