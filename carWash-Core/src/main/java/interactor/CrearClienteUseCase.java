package interactor;

import excepciones.ClienteExisteException;
import input.ICrearClienteInput;
import modelo.Cliente;
import repositorio.IRepositorioCrearCliente;

public class CrearClienteUseCase implements ICrearClienteInput {
    private  IRepositorioCrearCliente crearClienteGateway;
    public CrearClienteUseCase(IRepositorioCrearCliente crearClienteGateway) {
        this.crearClienteGateway=crearClienteGateway;
    }

    public boolean crearCliente(Cliente clienteNuevo) throws ClienteExisteException {
        if(this.crearClienteGateway.findByDocumento(clienteNuevo.getDocumento())==null){
            return this.crearClienteGateway.guardar(clienteNuevo);
        }else throw new ClienteExisteException("el cliente Existe");
    }
}
