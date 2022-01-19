package com.salesianostriana.dam;

import com.salesianostriana.dam.model.Cliente;
import com.salesianostriana.dam.model.LineaDeVenta;
import com.salesianostriana.dam.model.Producto;
import com.salesianostriana.dam.model.Venta;
import com.salesianostriana.dam.repos.ProductoRepositorio;
import com.salesianostriana.dam.repos.VentaRepositorio;
import com.salesianostriana.dam.service.VentaServicio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.lenient;

@ExtendWith(SpringExtension.class)
public class Ejercicio {

    @MockBean
    ProductoRepositorio productoRepositorio;

    @MockBean
    VentaRepositorio ventaRepositorio;

    @InjectMocks
    VentaServicio ventaServicio;

    @Test
    void whenNuevaVenta_success() {

        Producto p = Producto.builder()
                .codigoProducto("1")
                .nombre("Producto")
                .precio(12.34)
                .build();

        Cliente c = Cliente.builder()
                .nombre("Rompetechos")
                .email("rompetechos@prueba.com")
                .dni("12345678A")
                .build();


        lenient().when(productoRepositorio.findOne(1)).thenReturn(p);

        Map<String, Integer> carrito = Map.of("1", 2);

        Venta venta = new Venta();
        venta.setId(2L);
        venta.setCliente(c);
        venta.setLineasDeVenta(List.of(new LineaDeVenta(p, 2, 12.34)));

        lenient().when(VentaRepositorio.save(venta)).thenReturn(venta);

        assertEquals(venta, ventaServicio.nuevaVenta(carrito, c));
    }
}
