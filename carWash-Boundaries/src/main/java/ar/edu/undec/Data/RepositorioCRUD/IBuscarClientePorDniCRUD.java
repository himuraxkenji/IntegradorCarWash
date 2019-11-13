package ar.edu.undec.Data.RepositorioCRUD;

import ar.edu.undec.Data.ModeloEntity.ClienteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBuscarClientePorDniCRUD extends CrudRepository<ClienteEntity,Integer> {
    ClienteEntity findByDocumento(String documento);
}
