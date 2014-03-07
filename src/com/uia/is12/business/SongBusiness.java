package com.uia.is12.business;

import com.uia.is12.data.SongDAO;
import com.uia.is12.domain.Song;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;
/**
 *
 * @author Administrador
 */
public class SongBusiness {
    
    private SongDAO songDao;
    
    public SongBusiness(){
        this.songDao = new SongDAO();
    }//SongBusiness
    
    public Song getSong(){       
        return songDao.getSong();
    }
    
}//SongBusiness
