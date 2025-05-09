package com.application.S2_dev.modele.acteurs.objet;

import com.application.S2_dev.modele.designPattern.strategieObjet.ComportementBombe;
import com.application.S2_dev.modele.map.Environnement;
import com.application.S2_dev.modele.map.Terrain;

public class Hydrogene extends Objet {

    public Hydrogene(Environnement environnement, Terrain terrain) {

        super(environnement, terrain);
        this.prix = 300; // prix de l'objet
        this.setPortee(700);
        setComportement(new ComportementBombe());
    }

}
