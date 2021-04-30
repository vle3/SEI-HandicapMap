package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class AllUserCanvas extends JPanel {
    
    private AllUserPanel panel;

    public AllUserCanvas(AllUserPanel panel)
    {
        this.panel = panel;
        setBackground(Color.black);
        setPreferredSize(new Dimension(900,500));
    }
}
