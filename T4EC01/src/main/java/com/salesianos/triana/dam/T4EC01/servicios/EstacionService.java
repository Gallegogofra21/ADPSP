package com.salesianos.triana.dam.T4EC01.servicios;

import com.salesianos.triana.dam.T4EC01.errores.excepciones.ListEntityNotFoundException;
import com.salesianos.triana.dam.T4EC01.errores.excepciones.SingleEntityNotFoundException;
import com.salesianos.triana.dam.T4EC01.model.Estacion;
import com.salesianos.triana.dam.T4EC01.repo.EstacionRepository;
import com.sun.xml.bind.v2.model.core.ID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstacionService {

    private final EstacionRepository repository;


    public List<Estacion> findAll(){
        List<Estacion> result = repository.findAll();

        if(result.isEmpty()) {
            throw new ListEntityNotFoundException(Estacion.class);
        }else {
            return result;
        }
    }

    public Estacion findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new SingleEntityNotFoundException(id.toString(), Estacion.class));
    }

    public Estacion save (Estacion estacion) {
        return repository.save(estacion);
    }

    public Estacion edit (Estacion estacion){
        return repository.save(estacion);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }


}
