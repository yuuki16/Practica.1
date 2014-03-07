package com.uia.is12.data;

import com.uia.is12.domain.Song;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class SongDAO {
    
    
    public SongDAO(){}//SongDao
    
    public Song getSong(){ 
        ArrayList<Verse> verses= new ArrayList();
        Song song= new Song();
        
         verses.add(new Verse("No, my only goal", 5000));
         verses.add(new Verse("is to see", 5000));
         verses.add(new Verse("when I'm only fast asleep.", 5000));
         verses.add(new Verse("Is it so hard not to believe", 5000));
         verses.add(new Verse("that we'll never know?", 5000));
         verses.add(new Verse("So, hold me close", 5000));
         verses.add(new Verse("to my heart beating with every step,", 5000));
         verses.add(new Verse("hold me close.", 5000));
         song.setVerse(verses);
         
        return song;
        
    }//getSong
    
   
    
    
}//SongDAO

