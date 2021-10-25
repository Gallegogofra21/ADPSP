package com.salesianostriana.dam.E07ModeloDeDatosManyToMany.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Song implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String album;

    private String year;

    @ManyToOne
    @JoinColumn(name = "artist", foreignKey = @ForeignKey(name = "FK_SONG_ARTIST"))
    private Artist artist;

    @Builder.Default
    @OneToMany(mappedBy = "song")
    private List<AddedTo> addedTo = new ArrayList<>();

    public void addArtist(Artist a){
        this.artist = a;
        a.getSongs().add(this);
    }

    public void removeArtist(Artist a) {
        a.getSongs().remove(this);
        this.artist = null;
    }
}
