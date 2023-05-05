public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (verificaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Alterando para 01/01/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public boolean verificaAnoBissexto() {
        if (this.ano % 4 == 0 && this.ano %100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean verificaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int diasMes = 0;

        switch (mes) {
            case 2:
                if (verificaAnoBissexto()) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;

            default:
                diasMes = 31;
                break;
        }

        if (dia > diasMes) {
            return false;

        }
        return true;

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        String diaStr = String.format("%02d", this.dia); // adiciona zero à esquerda se o dia tiver apenas um dígito
        String mesStr = String.format("%02d", this.mes); // adiciona zero à esquerda se o mês tiver apenas um dígito
        return diaStr + "/" + mesStr + "/" + this.ano;
    }


    public static void main(String[] args) {
        Data data = new Data(1, 2, 2021);
        System.out.println(data);

    }
}
