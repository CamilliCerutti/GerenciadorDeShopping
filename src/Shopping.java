import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaxLojas){
        this.nome = nome;
        this.endereco = endereco;
        lojas = new Loja[quantidadeMaxLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja loja) {
        for(int i = 0; i < lojas.length; i ++){
            if(lojas[i] == null && i < lojas.length){
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoDeLoja) {
        int total = 0;

        for (Loja loja : lojas) {
            switch (tipoDeLoja) {
                case "Cosmético":
                    if(loja instanceof Cosmetico)
                        total++;
                    break;
                case "Vestuário":
                    if(loja instanceof Vestuario)
                        total++;
                    break;
                case "Bijuteria":
                    if(loja instanceof Bijuteria)
                        total++;
                    break;
                case "Alimentação":
                    if(loja instanceof Alimentacao)
                        total++;
                    break;
                case "Informática":
                    if(loja instanceof Informatica)
                        total++;
                    break;
                default:
                    return -1;
            }
        }
        return total;
    }


        public Informatica lojaSeguroMaisCaro() {
            Informatica lojaMaisCara = null;
            double valorSeguroMaisCaro = 0.0;

            for (Loja loja : lojas) {
                if (loja instanceof Informatica) {
                    Informatica informatica = (Informatica) loja;
                    double valorSeguro = informatica.getSeguroEletronicos();

                    if (valorSeguro > valorSeguroMaisCaro) {
                        valorSeguroMaisCaro = valorSeguro;
                        lojaMaisCara = informatica;
                    }
                }
            }

            return lojaMaisCara;
        }


    @Override
    public String toString() {
        return "Shopping{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", lojas=" + Arrays.toString(lojas) +
                '}';
    }
}
