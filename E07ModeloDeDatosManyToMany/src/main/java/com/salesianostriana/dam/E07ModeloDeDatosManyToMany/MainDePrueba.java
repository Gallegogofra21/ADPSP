package com.salesianostriana.dam.E07ModeloDeDatosManyToMany;

import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.model.Artist;
import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.model.Playlist;
import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.model.Song;
import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.service.AddedToService;
import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.service.ArtistService;
import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.service.PlaylistService;
import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final SongService songService;
    private final PlaylistService playlistService;
    private final ArtistService artistService;
    private final AddedToService addedToService;

    @PostConstruct
    public void test(){

        Song song = Song.builder()
                .title("Mírenme Ahora")
                .album("Lyke Mike")
                .year("2021")
                .build();

        songService.edit(song);

        Artist artist =
    }
}
