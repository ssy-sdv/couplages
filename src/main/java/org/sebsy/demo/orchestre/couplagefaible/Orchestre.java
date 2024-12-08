package org.sebsy.demo.orchestre.couplagefaible;

import java.util.ArrayList;
import java.util.List;

public class Orchestre {
    private List<Musicien> listeMusiciens;

    public Orchestre() {
        listeMusiciens = new ArrayList<>();
    }

    public void ajout(Musicien musicien) {
        listeMusiciens.add(musicien);
    }

    public void jouer() {
        for (Musicien musicien : listeMusiciens) {
            musicien.jouerMorceau();
        }
    }

}
