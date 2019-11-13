package ar.edu.undec.Data.RepositorioImplementacion;

import ar.edu.undec.Data.EntityMapper.EmpleadoEntityMapper;
import ar.edu.undec.Data.ModeloEntity.EmpleadoEntity;
import ar.edu.undec.Data.RepositorioCRUD.IBuscarEmpleadoPorLegajoCRUD;
import ar.edu.undec.Data.RepositorioCRUD.ICrearEmpleadoCRUD;
import modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repositorio.IRepositorioCrearEmpleado;

@Repository
public class CrearEmpleadoRepoImple implements IRepositorioCrearEmpleado {

    @Autowired
    ICrearEmpleadoCRUD crearEmpleadoCRUD;
    @Autowired
    IBuscarEmpleadoPorLegajoCRUD buscarEmpleadoPorLegajoCRUD;


    @Override
    public boolean guardarEmpleado(Empleado empleadoNuevo) {
        EmpleadoEntity empleadoEntity = new EmpleadoEntityMapper().mapeoCoreData(empleadoNuevo);
        return crearEmpleadoCRUD.save(empleadoEntity).getIdEmpleado() != null;
    }

    @Override
    public Empleado findByLegajo(Integer legajo) {
        Empleado empleado = new EmpleadoEntityMapper().mapeoDataCore(buscarEmpleadoPorLegajoCRUD.findByLegajo(legajo));
        if(empleado != null){
            return empleado;
        }
        return null;
    }
}
