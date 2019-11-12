package interactorUnitTest;

import excepciones.VehiculoExisteException;
import excepciones.VehiculoIncompletoException;
import interactor.ModificarVehiculoUseCase;
import mockito.MockitoExtension;
import modelo.Vehiculo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import repositorio.IModificarVehiculoRepo;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ModificarVehiculoUnitTest {
    @Mock
    IModificarVehiculoRepo modificarVehiculoRepo;

    @Test
    public void modificarVehiculo_VehiculoExistente_GuardaCorrectamente() throws VehiculoIncompletoException, VehiculoExisteException {
        Vehiculo vehiculoNuevo =  Vehiculo.factoryVehiculo(1,"IXI056","Toyota","2019");
        when(modificarVehiculoRepo.findByMatricula("IXI056")).thenReturn(null);
        when(modificarVehiculoRepo.modificarVehiculo(vehiculoNuevo)).thenReturn(true);
        ModificarVehiculoUseCase modificarVehiculoUseCase = new ModificarVehiculoUseCase(modificarVehiculoRepo);
        boolean resultado= modificarVehiculoUseCase.modificarVehiculo(vehiculoNuevo);
        Assertions.assertTrue(resultado);

    }

    @Test
    public void ModificarVehiculo_ConflictoEnId_VehiculoExistente() throws VehiculoIncompletoException {
        Vehiculo vehiculoNuevo =  Vehiculo.factoryVehiculo(1,"IXI056","Toyota","2019");
        when(modificarVehiculoRepo.findByMatricula("IXI056")).thenReturn(Vehiculo.factoryVehiculo(2,"IXI056","Toyota","2019"));
        ModificarVehiculoUseCase modificarVehiculoUseCase = new ModificarVehiculoUseCase(modificarVehiculoRepo);
        Assertions.assertThrows(VehiculoExisteException.class, () -> modificarVehiculoUseCase.modificarVehiculo(vehiculoNuevo));

    }

    @Test
    public void modificarVehiculo_ConflictoConVehiculoExistentePeroEsElMismo_GuardaCorrectamente() throws VehiculoIncompletoException, VehiculoExisteException {

        Vehiculo vehiculoNuevo =  Vehiculo.factoryVehiculo(1,"IXI056","Toyota","2019");
        when(modificarVehiculoRepo.findByMatricula("IXI056")).thenReturn(Vehiculo.factoryVehiculo(1,"ADF897","Ford","2015"));
        when(modificarVehiculoRepo.modificarVehiculo(vehiculoNuevo)).thenReturn(true);
        ModificarVehiculoUseCase modificarVehiculoUseCase = new ModificarVehiculoUseCase(modificarVehiculoRepo);
        boolean resultado= modificarVehiculoUseCase.modificarVehiculo(vehiculoNuevo);
        Assertions.assertTrue(resultado);

    }
}
