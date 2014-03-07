package com.uia.is12.view;

import com.uia.is12.business.SongBusiness;
import com.uia.is12.domain.Song;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class SongView extends Thread{
    
    private SongBusiness songBusiness;

    public SongView(){
        this.songBusiness= new SongBusiness();
        
    }//SongView
    
    public void run(){
        ArrayList<Verse> verses= songBusiness.getSong().getVerse();
        Song song= songBusiness.getSong();
        
        for (Verse v: verses) {
            try {
                Thread.sleep(v.getVerseTime());
                System.out.println(v.getParagraph());
            } catch (InterruptedException ex) {
                Logger.getLogger(SongView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
    
}//SongView

