package ar.edu.undec.Service.Config;

import interactor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repositorio.*;

@Configuration
public class UseCaseConfig {

    @Autowired
    private IRepositorioCrearVehiculo iRepositorioCrearVehiculo;

    @Autowired
    private IObtenerVehiculoPorMatriculaRepo iObtenerVehiculoPorMatriculaRepo;

    @Autowired
    private IRepositorioCrearCliente iRepositorioCrearCliente;

    @Autowired
    private IRepositorioCrearEmpleado iRepositorioCrearEmpleado;

    @Autowired
    private IRepositorioCrearTurno iRepositorioCrearTurno;

    @Autowired
    private IBuscarClientePorNombreRepo iBuscarClientePorNombreRepo;

    @Autowired
    private IModificarVehiculoRepo imodificarVehiculoRepo;

    @Bean
    public CrearVehiculoUseCase crearVehiculoUseCase() { return new CrearVehiculoUseCase(iRepositorioCrearVehiculo);
    }

    @Bean
    public ObtenerVehiculoPorMatriculaUseCase obtenerVehiculoPorMatriculaUseCase() {return new ObtenerVehiculoPorMatriculaUseCase(iObtenerVehiculoPorMatriculaRepo); }

    @Bean
    public CrearTurnoUseCase crearTurnoUseCase() {return new CrearTurnoUseCase(iRepositorioCrearTurno);}

    @Bean
    public CrearClienteUseCase crearClienteUseCase() {
        return new CrearClienteUseCase(iRepositorioCrearCliente);
    }

    @Bean
    public CrearEmpleadoUseCase crearEmpleadoUseCase() {
        return new CrearEmpleadoUseCase(iRepositorioCrearEmpleado);
    }

    @Bean
    public BuscarClientesPorNombreUseCase buscarClientesPorNombreUseCase() {return new BuscarClientesPorNombreUseCase(iBuscarClientePorNombreRepo); }

    @Bean
    public ModificarVehiculoUseCase modificarVehiculoUseCase() {return new ModificarVehiculoUseCase(imodificarVehiculoRepo); }
}