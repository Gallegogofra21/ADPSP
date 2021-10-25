package com.salesianostriana.dam.E07ModeloDeDatosManyToMany.repos;

import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
