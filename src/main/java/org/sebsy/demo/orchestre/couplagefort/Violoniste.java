package org.sebsy.demo.orchestre.couplagefort;

public class Violoniste {
    private Violon violon;
    private String morceau;

    public Violoniste(String morceau) {
        super();
        this.violon = new Violon();
        this.morceau = morceau;
    }

    public void jouerMorceau() {
        violon.afficher();
        System.out.println("et je joue le morceau " + morceau);
        violon.jouer();
    }
}
