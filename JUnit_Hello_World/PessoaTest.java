package junit;
import java.time.LocalDate;
import org.junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void validarCalculoIdade() {
        Pessoa pessoa = new Pessoa("julia", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(4, pessoa.getIdade());
    }
}
