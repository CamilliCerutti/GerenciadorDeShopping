
public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataDeValidae) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataDeValidae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataDeValidade) {
        this.dataValidade = dataDeValidade;
    }


    public boolean estaVencido(Data data) {
        if (data.getAno() < dataValidade.getAno()) {
            return true;
        } else if (data.getAno() == dataValidade.getAno()){
            if (data.getMes() > dataValidade.getMes()){
                return false;
            } else {
                return true;
            }
        }
       return false;
    }

    @Override
    public String toString() {
        return "[Nome do produto: " + getNome() + "] [Valor R$: " + getPreco() + "] [Validade " + getDataValidade() + "-" ;
    }


}
