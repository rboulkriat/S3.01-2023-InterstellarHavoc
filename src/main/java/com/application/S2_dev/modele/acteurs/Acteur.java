package com.application.S2_dev.modele.acteurs;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public abstract class Acteur {
    private DoubleProperty x, y; // Positions X de l'acteur
    protected String id; // Identifiant de l'acteur
    protected IntegerProperty vie; // Points de vie de l'acteur
    protected int degats;
    protected int prix;
    protected int portee; // Portée de l'acteur (à la fois pour les ennemis et les tours)
    protected static int compteur = 0; // Compteur d'ennemis pour générer l'identifiant unique

    public Acteur(double valX, double valY) {
        x = new SimpleDoubleProperty(valX);
        y = new SimpleDoubleProperty(valY);
        vie = new SimpleIntegerProperty(0);
        compteur++;
    }
    public abstract void attaquerActeur(Acteur acteur);
    protected double calculerDistance(double x, double y) {
        return Math.sqrt(Math.pow((x - getX()), 2) + Math.pow((y - getY()), 2));
    }
    public boolean estDansPortee(Acteur acteur) {
        double distance = this.calculerDistance(acteur.getY(), acteur.getX());
        return distance <= portee;
    }

    public int getPrix() {
        return prix;
    }

    public void infligerDegats(int valeur) {
        vie.setValue(vie.getValue() - valeur);
    }
    public boolean estVivant() {
        return vie.getValue() > 0;
    }
    public void meurt(){
        this.vie.setValue(0);
    }
    public double getX() {
        return x.getValue();
    }
    public double getY() {
        return y.getValue();
    }
    public DoubleProperty getXProperty() {
        return x;
    }
    public DoubleProperty getYProperty() {
        return y;
    }
    public String getId() {
        return id;
    }
    public int getVie() {
        return vie.getValue();
    }
    public IntegerProperty vieProperty() {
        return vie;
    }
    public void setVie(int vie) {
        this.vie.set(vie);
    }
    public void setX(double x1) {
        this.x.setValue(x1);
    }
    public void setY(double y1) {
        this.y.setValue(y1);
    }
    public int getPortee() {
        return portee;
    }
    @Override
    public String toString() {
        return "id "+id;
    }
}
