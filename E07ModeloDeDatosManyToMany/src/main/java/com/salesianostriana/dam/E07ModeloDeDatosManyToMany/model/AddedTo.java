package com.salesianostriana.dam.E07ModeloDeDatosManyToMany.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
public class AddedTo {

    @Builder.Default
    @EmbeddedId
    private AddedToPK id = new AddedToPK();

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name = "song_id")
    private Song song;

    public String datetime;
    public String order;

    public void addToPlaylist(Playlist p) {
        playlist = p;
        p.getAddedTo().add(this);
    }

    public void removeFromPlaylist(Playlist p){
        p.getAddedTo().remove(this);
        playlist = null;
    }

    public  void addToSong(Song s){
        song = s;
        s.getAddedTo().add(this);
    }

    public void removeFromSong(Song s){
        s.getAddedTo().remove(this);
        song = null;
    }

    public void addSongPlaylist(Playlist p, Song s){
        addToPlaylist(playlist);
        addToSong(song);
    }

    public void removeSongPlaylist(Playlist p, Song s){
        removeFromPlaylist(playlist);
        removeFromSong(song);
    }
}
