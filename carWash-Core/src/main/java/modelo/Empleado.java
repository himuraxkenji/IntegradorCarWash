package modelo;

import excepciones.EmpleadoIncompletoException;

import java.util.ArrayList;
import java.util.List;

public class Empleado {

    private Integer idEmpleado;
    private String nombre;
    private Integer legajo;

    private Empleado(Integer idEmpleado, String nombre, Integer legajo) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.legajo = legajo;

    }

    public static Empleado factoryEmpleado(Integer idEmpleado, String nombre, Integer legajo) throws EmpleadoIncompletoException {
        if(nombre == null || legajo == null){
            throw new EmpleadoIncompletoException();
        }
        else {
            return new Empleado(idEmpleado, nombre, legajo);
        }

    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

}
