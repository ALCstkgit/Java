package com.example.peliculaspruebasmock;

import com.example.peliculaspruebasmock.exceptions.ObjectNotFound;
import com.example.peliculaspruebasmock.model.Pelicula;
import com.example.peliculaspruebasmock.repository.IPeliculaRepository;
import com.example.peliculaspruebasmock.service.PeliculaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class PeliculaServiceTest {
    @Mock
    IPeliculaRepository peliculaRepository;
    @InjectMocks
    PeliculaService peliculaService;

    @Test
    public void pruebaFindAll(){
        List<Pelicula> pels = new ArrayList<Pelicula>();
        pels.add(new Pelicula(1,"sinopsis","titulo",7.23,"url"));
        Mockito.when(peliculaRepository.findAll()).thenReturn(pels);
        List<Pelicula> peliculas = peliculaService.listPeliculas();
        Assertions.assertEquals(1,peliculas.size());
    }

    @Test
    public void pruebaFindPelicula(){
        Optional<Pelicula> pel = Optional.of(new Pelicula(1, "sinopsis", "titulo", 7.23, "url"));
        Mockito.when(peliculaRepository.findById(1)).thenReturn(pel);
        Pelicula pelicula = peliculaService.findPelicula(1);
        Assertions.assertNotEquals(null,pelicula);
        Assertions.assertThrows(ObjectNotFound.class,()->peliculaService.findPelicula(2));
    }

    @Test
    public void pruebaInsert(){
        Pelicula pel = new Pelicula(1, "sinopsis", "titulo", 7.23, "url");
        Mockito.when(peliculaRepository.save(pel)).thenReturn(pel);
        Pelicula pelicula = peliculaService.insertPelicula(pel);
        Assertions.assertNotEquals(null,pelicula);
    }
}
