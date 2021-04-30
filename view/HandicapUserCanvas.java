package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;

public class HandicapUserCanvas extends JPanel{
    private HandicapUserPanel panel;

    public HandicapUserCanvas(HandicapUserPanel panel)
    {
        this.panel = panel;
        setBackground(Color.black);
        setPreferredSize(new Dimension(600,500));
    }

    // @Override
    // protected void paintComponent(Graphics g)
    // {
    //     super.paintComponent(g);;
    // }
    
}
