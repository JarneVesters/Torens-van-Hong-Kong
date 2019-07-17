package vesters.jarne.taak.herexamen;

import java.util.ArrayList;
import java.util.Iterator;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jarne
 */
public class SpelbordView extends Region {
    public final static int SIZE = 75;
    private Spelbord model;
    private AnchorPane paneel;
    
    
    public SpelbordView(Spelbord model) {
        this.model = model;
        paneel = new AnchorPane();
        Rectangle Rechthoek = new Rectangle(50,50,null);
        
        paneel.getChildren().addAll(Rechthoek);
        
        getChildren().add(paneel);
        
        update();
    }
    public void update() {
        int hoogte = model.getHoogte();
        int breedte = model.getBreedte();
        
        paneel.setTranslateX(breedte);
        paneel.setTranslateY(hoogte);
    }
}
