package com.salesianostriana.dam.E07ModeloDeDatosManyToMany.repos;

import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
