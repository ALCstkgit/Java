package com.example.peliculaspruebasmock;
import static org.assertj.core.api.Assertions.assertThat;
import com.example.peliculaspruebasmock.controller.PeliculaController;
import com.example.peliculaspruebasmock.model.Pelicula;
import com.example.peliculaspruebasmock.service.PeliculaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PeliculaControllerTest {
    @Mock
    PeliculaService peliculaService;
    @InjectMocks
    PeliculaController peliculaController;

    @Test
    public void pruebaListAll(){
        List<Pelicula> peliculasEsperadas = new ArrayList<Pelicula>();
        peliculasEsperadas.add(new Pelicula(1,"sinopsis","titulo",7.23,"url"));
        Mockito.when(peliculaService.listPeliculas()).thenReturn(peliculasEsperadas);
        ResponseEntity<List<Pelicula>> peliculas = peliculaController.listPeliculas();
        final Object pels = peliculas.getBody();
        assertThat(pels).isInstanceOf(List.class);
        List<Pelicula> peliculasRecibidas = (ArrayList<Pelicula>) pels;
        Assertions.assertEquals(peliculasEsperadas, peliculasRecibidas);
        Assertions.assertEquals(1,peliculasRecibidas.size());
    }

    @Test
    public void pruebaFindPelicula(){
        Pelicula peliculaEsperada = new Pelicula(1,"sinopsis","titulo",7.23,"url");
        Mockito.when(peliculaService.findPelicula(1)).thenReturn(peliculaEsperada);
        EntityModel<Pelicula> pel = peliculaController.findPelicula(1);
        Pelicula peliculaRecibida = pel.getContent();
        Assertions.assertEquals(peliculaEsperada, peliculaRecibida);
    }

    @Test
    public void pruebaInsertPelicula(){
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        Pelicula peliculaEsperada = new Pelicula(1,"sinopsis","titulo",7.23,"url");
        Mockito.when(peliculaService.insertPelicula(Mockito.any(Pelicula.class))).thenReturn(peliculaEsperada);
        ResponseEntity<Void> responseEntity = peliculaController.insertPelicula(peliculaEsperada);
        Assertions.assertEquals(HttpStatus.CREATED,responseEntity.getStatusCode());
    }
}
