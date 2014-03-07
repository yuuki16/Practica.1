package com.uia.is12.domain;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Song {
   
    private String name;
    private ArrayList<Verse> verse;
    
    public Song(){}

    //gets/sets
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Verse> getVerse() {
        return verse;
    }

    public void setVerse(ArrayList<Verse> verse) {
        this.verse = verse;
    }
    
}//Song
