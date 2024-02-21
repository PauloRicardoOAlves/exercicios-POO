public class Carro {
    private String modelo;
    private String ano;
    private String cor;

    public void mudarCor (String novaCor){
        this.cor = novaCor;
    }

    public String getModelo(){
        return this.modelo;
    }
}
