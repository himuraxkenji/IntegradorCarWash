package ar.edu.undec.Data.EntityMapper;

import ar.edu.undec.Data.ModeloEntity.ClienteEntity;
import excepciones.ClienteIncompletoException;
import modelo.Cliente;
import modelo.Vehiculo;

public class ClienteEntityMapper {

    public ClienteEntity mapeoCoreData(Cliente clienteCore) {
        ClienteEntity clienteEntity =new ClienteEntity();
        clienteEntity.setIdCliente(clienteCore.getIdCliente());
        clienteEntity.setNombre(clienteCore.getNombre());
        clienteEntity.setDomicilio(clienteCore.getDomicilio());
        clienteEntity.setBarrio(clienteCore.getBarrio());
        clienteEntity.setDocumento(clienteCore.getDocumento());
       // clienteEntity.setVehiculos(new VehiculoEntityMapper().mapeoCoreData(clienteCore.getVehiculos()));
        return clienteEntity;
    }

    public Cliente mapeoDataCore(ClienteEntity elCliente) {
        try {
            if(elCliente!=null){
                return Cliente.factoryCliente(elCliente.getIdCliente(),elCliente.getNombre(),elCliente.getDomicilio(),elCliente.getBarrio(),elCliente.getDocumento());
            }
            return null;
            //falta la exception vehiculo de la coleccion
        } catch (ClienteIncompletoException e ) {
            e.printStackTrace();
            return null;
        }
    }
}
