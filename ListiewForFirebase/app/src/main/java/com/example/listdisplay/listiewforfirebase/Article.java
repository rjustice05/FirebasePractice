package com.example.listdisplay.listiewforfirebase;

/**
 * Created by rebekahjustice on 9/29/16.
 */

    public class Article {
    private String url;
    private String name;
    private String description;

    public Article(){
        super();
    }

    public Article(String url, String name, String description) {
        super();
        this.url = url;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return this.name + ".\n " + this.url + "\n" + this.description;
    }
}
