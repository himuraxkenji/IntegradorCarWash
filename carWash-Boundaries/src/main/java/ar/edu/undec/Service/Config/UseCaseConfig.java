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
    private IObtenerVehiculoMasLavadoEntreFechaRepo iObtenerVehiculoMasLavadoEntreFechaRepo;

    @Autowired
    private IObtnerEmpleadoPorNombreRepo obtnerEmpleadoPorNombreRepo;

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
    @Autowired
    private IModificarClienteRepo iModificarClienteRepo;
    @Autowired
    private IModificarTurnoRepo iModificarTurnoRepo;

    @Autowired
    private IModificarEmpleadoRepo modificarEmpleadoRepo;
    @Autowired
    private IObtenerTurnoPorClienteYVehiculoRepo iObtenerTurnoPorClienteYVehiculoRepo;
    @Autowired
<<<<<<< Updated upstream
    private IObtenerTop3EmpleadosPorTurnosRepo iObtenerTop3EmpleadosPorTurnosRepo;
=======
<<<<<<< HEAD
    private IObtenerMontoIngresadoPorTurnosEntreFechasRepo iObtenerMontoIngresadoPorTurnosEntreFechasRepo;
=======
    private IObtenerTop3EmpleadosPorTurnosRepo iObtenerTop3EmpleadosPorTurnosRepo;
>>>>>>> master
>>>>>>> Stashed changes

    @Bean
    public CrearVehiculoUseCase crearVehiculoUseCase() { return new CrearVehiculoUseCase(iRepositorioCrearVehiculo);
    }

    @Bean
    public ObtenerVehiculoPorMatriculaUseCase obtenerVehiculoPorMatriculaUseCase() {return new ObtenerVehiculoPorMatriculaUseCase(iObtenerVehiculoPorMatriculaRepo); }

    @Bean
    public ObtenerVehiculoMasLavadoEntreFechaUseCase obtenerVehiculoMasLavadoEntreFechaUseCase(){return new ObtenerVehiculoMasLavadoEntreFechaUseCase(iObtenerVehiculoMasLavadoEntreFechaRepo);}

    @Bean
    public ObtenerEmpleadoPorNombreUseCase obtenerEmpleadoPorNombreUseCase(){return new ObtenerEmpleadoPorNombreUseCase(obtnerEmpleadoPorNombreRepo);}

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
    @Bean
    public ModificarClienteUseCase modificarClienteUseCase(){ return new ModificarClienteUseCase(iModificarClienteRepo);}

    @Bean
    public ModificarTurnoUseCase modificarTurnoUseCase(){return new ModificarTurnoUseCase(iModificarTurnoRepo);}

    @Bean
    public ModificarEmpleadoUseCase modificarEmpleadoUseCase(){
        return new ModificarEmpleadoUseCase(modificarEmpleadoRepo);
    }
    @Bean
    public ObtenerturnoPorClienteYVehiculoUseCase obtenerturnoPorClienteYVehiculoUseCase(){
        return new ObtenerturnoPorClienteYVehiculoUseCase(iObtenerTurnoPorClienteYVehiculoRepo);
    }
    @Bean
<<<<<<< Updated upstream
    public ObtenerTop3EmpleadosPorTurnoUseCase obtenerTop3EmpleadosPorTurnoUseCase(){
        return new ObtenerTop3EmpleadosPorTurnoUseCase(iObtenerTop3EmpleadosPorTurnosRepo);
=======
<<<<<<< HEAD
    public ObtenerMontoPorTurnoEntreFechasUseCase obtenerMontoPorTurnoEntreFechasUseCase(){
        return new ObtenerMontoPorTurnoEntreFechasUseCase(iObtenerMontoIngresadoPorTurnosEntreFechasRepo);
=======
    public ObtenerTop3EmpleadosPorTurnoUseCase obtenerTop3EmpleadosPorTurnoUseCase(){
        return new ObtenerTop3EmpleadosPorTurnoUseCase(iObtenerTop3EmpleadosPorTurnosRepo);
>>>>>>> master
>>>>>>> Stashed changes
    }
}