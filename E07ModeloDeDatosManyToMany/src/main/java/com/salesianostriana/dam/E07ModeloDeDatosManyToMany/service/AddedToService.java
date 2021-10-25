package com.salesianostriana.dam.E07ModeloDeDatosManyToMany.service;

import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.model.*;
import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.repos.AddedToRepository;
import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.service.base.BaseService;

public class AddedToService extends BaseService<AddedTo, AddedToPK, AddedToRepository> {


    /*
    public Song artistSong(Artist a, Song s){
        s.getAddedTo().forEach(playlist -> {
            AddedTo ad = AddedTo
                    .builder()
                    .song(s)
                    .playlist(playlist)
                    .build();
            save(ad);
        });

        return s;
    }*/
}
