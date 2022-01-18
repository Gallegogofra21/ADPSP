import com.salesianostriana.dam.ejerciciotesting.model.Venta;
import com.salesianostriana.dam.ejerciciotesting.repos.VentaRepositorio;
import com.salesianostriana.dam.ejerciciotesting.services.VentaServicio;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Ejercicio {

    @Mock
    Venta venta;

    @InjectMocks
    VentaServicio service;
}
