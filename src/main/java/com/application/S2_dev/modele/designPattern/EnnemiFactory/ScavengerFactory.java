package com.application.S2_dev.modele.designPattern.EnnemiFactory;

import com.application.S2_dev.modele.Parametre;
import com.application.S2_dev.modele.acteurs.ennemis.Ennemi;
import com.application.S2_dev.modele.acteurs.ennemis.Scavenger;
import com.application.S2_dev.modele.map.Terrain;

public class ScavengerFactory implements EnnemiFactory {

    @Override
    public Ennemi créerEnnemi(Terrain terrain) {
        return new Scavenger(Parametre.posXennemi, Parametre.posYennemi, terrain) ;
    }
}
