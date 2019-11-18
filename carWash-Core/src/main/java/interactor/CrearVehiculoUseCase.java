package interactor;

import excepciones.VehiculoExisteException;
import input.ICrearVehiculoInput;
import modelo.Vehiculo;
import repositorio.IRepositorioCrearVehiculo;

public class CrearVehiculoUseCase implements ICrearVehiculoInput {
    private IRepositorioCrearVehiculo crearVehiculoGateway;

    public CrearVehiculoUseCase(IRepositorioCrearVehiculo crearVehiculoGateway) {
        this.crearVehiculoGateway = crearVehiculoGateway;
    }

    public boolean crearVehiculo(Vehiculo vehiculoNuevo) throws VehiculoExisteException {
        if(this.crearVehiculoGateway.findByMatricula(vehiculoNuevo.getMatricula()) == null)
            return this.crearVehiculoGateway.guardar(vehiculoNuevo);
        else
            throw new VehiculoExisteException("Vehiculo ya existe.");
    }
}
