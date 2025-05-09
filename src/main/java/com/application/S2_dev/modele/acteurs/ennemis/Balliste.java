package com.application.S2_dev.modele.acteurs.ennemis;

import com.application.S2_dev.modele.bfs.Cellule;
import com.application.S2_dev.modele.données.PixelMoveTimeEvent;
import com.application.S2_dev.modele.map.Terrain;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.LinkedList;

public class Balliste extends Ennemi {
    public Balliste(int Posx, int Posy, Terrain terrain) {
        super(Posx, Posy, terrain, true);
        this.degats = 5; // Portée de la tour
        this.portee = 30; // Dommages infligés aux tours
        this.vie = new SimpleIntegerProperty(60);
    }
}