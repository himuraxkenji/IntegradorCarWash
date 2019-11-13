package ar.edu.undec.Service.ModeloService;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VehiculoDTO {
    @JsonProperty("idVehiculo")
    private Integer idVehiculo;
    @JsonProperty("matricula")
    private String matricula;
    @JsonProperty
    private String marca;
    @JsonProperty
    private String modelo;

    public VehiculoDTO(@JsonProperty("idVehiculo") Integer idVehiculo, @JsonProperty("matricula") String matricula,
                       @JsonProperty("marca") String marca, @JsonProperty("modelo") String modelo) {
        this.idVehiculo= idVehiculo;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
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
}
