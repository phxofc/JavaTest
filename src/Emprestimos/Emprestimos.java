package Emprestimos;

public class Emprestimos {

    private double valorEmprestimo;
    private double taxaJuros;
    private double numParcelas;
    private double valorTotalDoEmprestimo;

    public Emprestimos(double valorEmprestimo, double taxaJuros) {
        this.valorEmprestimo = valorEmprestimo;
        this.taxaJuros = (int) taxaJuros;
        this.numParcelas = numParcelas();
        this.valorTotalDoEmprestimo = calcularValorParcelas();
    }

    public int numParcelas() {
        if (valorEmprestimo > 3000 && valorEmprestimo <= 8000) {
            return 12;
        } else if (valorEmprestimo >= 8000 && valorEmprestimo <= 25000) {
            return 36;
        } else if (valorEmprestimo >= 25000 && valorEmprestimo <= 50000) {
            return 60;

        } else if (valorEmprestimo >= 50000 && valorEmprestimo <= 150000) {
            return 120;

        }
        return 0;

    }

    public double calcularValorParcelas() {

        double valorParce = (taxaJuros / 100) * numParcelas;
        double juros = valorParce * valorEmprestimo;
        double valorTotal = valorEmprestimo + juros;
        return valorTotal;

    }

    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public double getNumParcelas() {
        return numParcelas;
    }

    public double getValorTotalDoEmprestimo() {
        return valorTotalDoEmprestimo;
    }

}
