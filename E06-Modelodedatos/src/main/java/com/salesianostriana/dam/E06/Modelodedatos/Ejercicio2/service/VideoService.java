package com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.service;

import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.service.base.BaseService;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.model.Video;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.repo.VideoRepository;
import org.springframework.stereotype.Service;

@Service
public class VideoService extends BaseService<Video, Long, VideoRepository> {
}
