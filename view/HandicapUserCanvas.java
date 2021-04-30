package view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.IRender;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class HandicapUserCanvas extends JPanel{
    private HandicapUserPanel panel;
    private IRender pictures;
    private ImageIcon image;
    private String imagePath;

    public HandicapUserCanvas(HandicapUserPanel panel)
    {
        this.panel = panel;
        setBackground(Color.black);
        setPreferredSize(new Dimension(900,800));
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        // pictures.render(g2);
        // g2.draw(pictures.getBoundingBox());
        // image= new ImageIcon("model/images/defaultMap.PNG");
        image= new ImageIcon(imagePath);
        image.paintIcon(this, g, 0, 0);
    }

    public IRender getPictures() {
        return pictures;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    
    
}
