package com.salesianostriana.dam.E07ModeloDeDatosManyToMany.repos;

import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.model.AddedTo;
import com.salesianostriana.dam.E07ModeloDeDatosManyToMany.model.AddedToPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddedToRepository extends JpaRepository<AddedTo, AddedToPK> {
}
