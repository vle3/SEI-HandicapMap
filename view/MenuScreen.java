package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

public class MenuScreen {
    private JFrame window;
    
    public MenuScreen(JFrame window)
    {
        this.window = window;
    }

    public void init()
    {
        Container cp = window.getContentPane();

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,200));
        panel.setLayout(new GridLayout(2,1));

        JButton handycapUser = new JButton("Handicap User");
        JButton allUser = new JButton("All User");
        panel.add(handycapUser);
        panel.add(allUser);

        cp.add(BorderLayout.CENTER, panel);

        handycapUser.addActionListener(event ->
        {
            window.getContentPane().removeAll();
            var menu = new HandicapUserPanel(window);

            menu.init();

            window.pack();
            window.revalidate();
        });

        allUser.addActionListener(event ->
        {
            window.getContentPane().removeAll();
            var menu = new AllUserPanel(window);

            menu.init();

            window.pack();
            window.revalidate();
        });
    }
}
