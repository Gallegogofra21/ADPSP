package com.salesianostriana.dam.E07ModeloDeDatosManyToMany;

import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.model.AddedTo;
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
import java.util.List;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final SongService songService;
    private final ArtistService artistService;
    private final PlaylistService playlistService;
    private final AddedToService addedToService;

    @PostConstruct
    public void test(){

        Song song = Song.builder()
                .title("Mírenme Ahora")
                .album("Lyke Mike")
                .year("2021")
                .build();

        songService.edit(song);

        Artist artist = Artist.builder()
                .name("Myke Towers")
                .build();

        artistService.save(artist);

        Playlist playlist = Playlist.builder()
                .name("Lyke Mike")
                .description("Playlist de Myke Towers")
                .build();

        playlistService.save(playlist);

        List<AddedTo> addedToList = List.of(
                AddedTo.builder().datetime("04/07/2021").order("Primero").build()
        );

        for (int i = 0; i < addedToList.size(); i++){
            addedToList.get(i).addToSong(song);
        }

        addedToService.saveAll(addedToList);
    }
}
