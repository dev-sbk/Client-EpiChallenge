package com.bwialabs.epichallange.domain;

/**
 * Created by Abdelkader on 12/03/2017.
 */

public class Categorie {
    String name;
    String image;

    public Categorie(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {

        return name;
    }

    public String getImage() {
        return image;
    }

}
