package model;

import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Map implements IRender {
    private final int X = 0;
    private final int Y = 0;
    private String name;
    private BufferedImage image;

    public Map(String name){
        this.name = name;
    }

    
    public String getName() {
        return name;
    }
    public BufferedImage getImage() {
        return image;
    }

    @Override 
    public Rectangle getBoundingBox()
    {
        return null;
        
    }

    @Override
    public void render(Graphics2D g2) {
        g2.drawImage(getImage(), null, X, Y);
        g2.setColor(Color.yellow);
    }
}
