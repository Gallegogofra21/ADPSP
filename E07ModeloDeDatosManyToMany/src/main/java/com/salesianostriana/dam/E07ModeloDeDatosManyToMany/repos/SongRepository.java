package com.salesianostriana.dam.E07ModeloDeDatosManyToMany.repos;

import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
