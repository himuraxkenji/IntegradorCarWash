package ar.edu.undec.DataIntegrationTest;

import ar.edu.undec.Data.RepositorioImplementacion.CrearClienteRepoImple;
import excepciones.ClienteIncompletoException;
import modelo.Cliente;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@SqlGroup({
        @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:crearClienteAntes.sql"),
        @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD,scripts = "classpath:crearClienteDespues.sql")
})

public class CrearClienteIT {
    @Autowired
    private CrearClienteRepoImple crearClienteRepoImple;

    @Test
    public void guardarCliente_ClienteGuardado_devuelveTrue() throws ClienteIncompletoException {

        Cliente elCliente = Cliente.factoryCliente(null, "Bautista", "Davila San roman 124", "B° El Asfalto", "36789987");
        boolean resultado = crearClienteRepoImple.guardar(elCliente);
        assertTrue(resultado);
    }
}
