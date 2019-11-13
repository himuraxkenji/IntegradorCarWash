package ar.edu.undec.Data.ModeloEntity;


import modelo.Cliente;

import javax.persistence.*;

@Entity(name="vehiculos")
@SequenceGenerator(name="seq_vehiculo", sequenceName = "seq_vehiculo",initialValue = 1, allocationSize = 1)
public class VehiculoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vehiculo")
    private Integer idVehiculo;
    private String matricula;
    private String marca;
    private String modelo;
    private Cliente cliente;

    public VehiculoEntity(){}

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
