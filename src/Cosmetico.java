public class Cosmetico extends Loja{
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionarios, Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantiadeMaxProdutos) {
        super(nome, quantidadeFuncionarios,salarioBaseFuncionarios, endereco, dataFundacao, quantiadeMaxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Cosmetico{" +
                "taxaComercializacao=" + getTaxaComercializacao() +
                '}';
    }
}
