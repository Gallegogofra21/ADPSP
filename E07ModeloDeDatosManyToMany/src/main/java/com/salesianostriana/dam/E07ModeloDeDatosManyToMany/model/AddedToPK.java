package com.salesianostriana.dam.E07ModeloDeDatosManyToMany.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

@Embeddable
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class AddedToPK implements Serializable {

    private long song_id;
    private long playlist_id;
}
