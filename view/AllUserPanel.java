package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class AllUserPanel {
    JFrame window = new JFrame();
    private AllUserCanvas canvas;

    private JRadioButton fCSBuldingButton = new JRadioButton("CS Bulding");
    private JRadioButton fNighButton = new JRadioButton("Night University");
    private JRadioButton fMusicBuldingButton = new JRadioButton("UCO School Music");

    private JRadioButton tCSBuldingButton = new JRadioButton("CS Bulding");
    private JRadioButton tNighButton = new JRadioButton("Night University");
    private JRadioButton tMusicBuldingButton = new JRadioButton("UCO School Music");

    private JButton generateButton = new JButton("Generate");
    private JButton quitButton = new JButton("Quit");


    public AllUserPanel(JFrame window)
    {
        this.window = window;
    }

    public void init()
    {
        Container cp = window.getContentPane();

        canvas = new AllUserCanvas(this);
        cp.add(canvas);
        
        JPanel southPanel = new JPanel();
        cp.add(BorderLayout.SOUTH, southPanel);
        southPanel.setLayout(new GridLayout(3,1));
        JPanel fromPanel = new JPanel();
        JPanel toPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        // JPanel feedbackPanel = new JPanel(); //Implement if have chance to 
        southPanel.add(fromPanel);
        southPanel.add(toPanel);
        southPanel.add(buttonPanel);

        fromPanel.setBorder(BorderFactory.createTitledBorder("From:"));
        fromPanel.add(fCSBuldingButton);
        fromPanel.add(fNighButton);
        fromPanel.add(fMusicBuldingButton);
        ButtonGroup fromGroup = new ButtonGroup();
        fromGroup.add(fCSBuldingButton);
        fromGroup.add(fNighButton);
        fromGroup.add(fMusicBuldingButton);
        fCSBuldingButton.setSelected(true);

        toPanel.setBorder(BorderFactory.createTitledBorder("To: "));
        toPanel.add(tCSBuldingButton);
        toPanel.add(tNighButton);
        toPanel.add(tMusicBuldingButton);
        ButtonGroup toButton = new ButtonGroup();
        toButton.add(tCSBuldingButton);
        toButton.add(tNighButton);
        toButton.add(tMusicBuldingButton);
        tNighButton.setSelected(true);

        buttonPanel.setBorder(BorderFactory.createTitledBorder("Button"));
        buttonPanel.add(generateButton);
        buttonPanel.add(quitButton);
        
        quitButton.addActionListener(e -> {
            window.getContentPane().removeAll();
            var menu = new MenuScreen(window);
            menu.init();
            window.pack();
            window.revalidate();
        });


    }
}
