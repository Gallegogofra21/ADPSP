package com.salesianostriana.dam;

import com.salesianostriana.dam.model.Cliente;
import com.salesianostriana.dam.model.LineaDeVenta;
import com.salesianostriana.dam.model.Producto;
import com.salesianostriana.dam.model.Venta;
import com.salesianostriana.dam.repos.ProductoRepositorio;
import com.salesianostriana.dam.repos.VentaRepositorio;
import com.salesianostriana.dam.service.VentaServicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class Ejercicio {

    @MockBean
    ProductoRepositorio productoRepositorio;

    @MockBean
    VentaRepositorio ventaRepositorio;

    VentaServicio ventaServicio;

    @BeforeEach
    public void setUp() {
        ventaServicio = new VentaServicio(productoRepositorio, ventaRepositorio);
    }

    @Test
    void whenNuevaVenta_success() {

        Producto p = Producto.builder()
                .id(1L)
                .codigoProducto("1")
                .nombre("Producto")
                .precio(12.34)
                .build();

        Cliente c = Cliente.builder()
                .id(1L)
                .nombre("Rompetechos")
                .email("rompetechos@prueba.com")
                .dni("12345678A")
                .build();

        Map<Long, Integer> carrito = Map.of(1L, 3);

        Venta v = Venta.builder()
                .id(1L)
                .cliente(c)
                .lineasDeVenta(List.of(LineaDeVenta.builder()
                                .producto(p)
                                .cantidad(3)
                                .pvp(12)
                                .build()))
                .build();

        when(productoRepositorio.findById(any(Long.class))).thenReturn(Optional.of(p));

        when(ventaRepositorio.save(any(Venta.class))).thenReturn(v);

        assertThat(v.equals(ventaServicio.nuevaVenta(carrito, c)));


    }

    @Test
    void whenAddProductoToVenta_success() {

    }
}
