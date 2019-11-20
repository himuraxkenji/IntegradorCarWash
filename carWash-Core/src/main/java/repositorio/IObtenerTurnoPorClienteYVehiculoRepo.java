package repositorio;

import modelo.Cliente;
import modelo.Turno;
import modelo.Vehiculo;

import java.util.Collection;

public interface IObtenerTurnoPorClienteYVehiculoRepo {

    Collection<Turno> obtenerTurnoPorClienteyVehiculo(Cliente cliente,Vehiculo vehiculo);
}
