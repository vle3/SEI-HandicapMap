package controller;

import view.HandicapUserPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

import model.UCOMap;


public class MapListener implements ActionListener{
    private HandicapUserPanel panel;
    String path = new String();

    public MapListener(HandicapUserPanel panel){
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        path = getImagePath();

        if(e.getSource() == panel.getGenerateButton())
        {
            if(panel.getfCSBuldingButton().isSelected() && panel.gettMusicBuldingButton().isSelected()) 
                panel.getCanvas().setImagePath("model/images/musicToCMSC.jpg");
            
                
            
            panel.getCanvas().repaint();
        }

        
    }

    public String getImagePath(){
        var path = new String();
        if(panel.getfCSBuldingButton().isSelected() && panel.gettCSBuldingButton().isSelected()) path = "model/images/default.jpg";
        if(panel.getfCSBuldingButton().isSelected() && panel.gettMusicBuldingButton().isSelected()) path = "model/images/musicToCMSC.jpg";
        return path;
    }
}
