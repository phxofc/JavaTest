
import Emprestimos.Emprestimos;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteEmprestimos {

    @Test
    public void deveriaEmprestarComJurosde3600() {
        System.out.println("Emprestimo 1:");
        Emprestimos emprestimos = new Emprestimos(5000, 6);

        assertEquals(8600, emprestimos.getValorTotalDoEmprestimo(), 0);
        
        System.out.println("Valor do emprestimo foi: " + emprestimos.getValorEmprestimo());
        System.out.println("Numero de parcelas foi: " + emprestimos.getNumParcelas());
        System.out.println("A taxa de juros foi: " + emprestimos.getTaxaJuros());
        System.out.println("O total do emprestimo com juros foi de: " + emprestimos.getValorTotalDoEmprestimo());
        System.out.println("==========================================");
    }

    @Test
    public void deveriaEmprestarComJurosde2700000() {
        System.out.println("Emprestimo 2:");
        Emprestimos emprestimos = new Emprestimos(150000, 15);

        assertEquals(2850000, emprestimos.getValorTotalDoEmprestimo(), 0);
        
        System.out.println("Valor do emprestimo foi: " + emprestimos.getValorEmprestimo());
        System.out.println("Numero de parcelas foi: " + emprestimos.getNumParcelas());
        System.out.println("A taxa de juros foi: " + emprestimos.getTaxaJuros());
        System.out.println("O total do emprestimo com juros foi de: " + emprestimos.getValorTotalDoEmprestimo());
        System.out.println("==========================================");
    }

}
