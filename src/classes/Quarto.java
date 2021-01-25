package classes;

import java.util.ArrayList;

public class Quarto {
    public int numero;
    private boolean ocupado, TV_cabo,WiFi;
    private int cama_solteiro, cama_casal;
    private double preco_quarto;
    
    private ArrayList<Hospede> hosp;
    
    
    //Construtor da classe Quarto
    public Quarto(int numero, boolean ocupado, boolean TV_cabo, boolean WiFi) {
        this.numero = numero;
        this.ocupado = ocupado;
        this.TV_cabo = TV_cabo;
        this.WiFi = WiFi;
        cama_solteiro = 0;
        cama_casal = 0;
        preco_quarto = 110;
    }

    //Metodos basicos de inserir e ter acesso aos atributos da classe.
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    public boolean isTV_cabo() {
        return TV_cabo;
    }
    public void setTV_cabo(boolean TV_cabo) {
        this.TV_cabo = TV_cabo;
    }
    public boolean isWiFi() {
        return WiFi;
    }
    public void setWiFi(boolean WiFi) {
        this.WiFi = WiFi;
    }
    public int getCama_solteiro() {
        return cama_solteiro;
    }
    public void setCama_solteiro(int cama_solteiro) {
        this.cama_solteiro = cama_solteiro;
    }
    public int getCama_casal() {
        return cama_casal;
    }
    public void setCama_casal(int cama_casal) {
        this.cama_casal = cama_casal;
    }
    public double getPreco_quarto(){
        return this.preco_quarto;
    }
    public void setPreco_quarto(double preco_quarto) {
        this.preco_quarto = preco_quarto;
    }
    public void setHospede(ArrayList<Hospede> hospedes){
        this.hosp = hospedes;
    }
    public void setHospede(Hospede novo){
        ArrayList<Hospede> hospede = new ArrayList();
        hospede.add(novo);
        this.hosp = hospede;
    }
    public ArrayList<Hospede> getHospede(){
        return this.hosp;
    }
    //Metodos de aplicação do programa
        
    //Nesse metodo, serão verificados cada valor boolena e a quantidade de camas e com isso sera retornado o valor total do quarto
    public double total(){
        double preco = preco_quarto + cama_solteiro*1.5 + cama_casal*2.5;
        if(WiFi){
            preco += 10;
        }
        if(TV_cabo){
            preco += 5;
        }
        return preco;
    } 
    //Nesse metodo as informações do quarto serão retornadas em forma de texto.
    public String infoQuarto(){
        String info = "";
        info += "TV a cabo: " + this.TV_cabo +"\n";
        info += "Wifi: " + this.WiFi + "\n";
        info += "Cama de casal: " + this.cama_casal + "\n";
        info += "Cama de solteiro: " + this.cama_solteiro + "\n";
        info += "Valor quarto $:" + this.total() + "\n";
        return info;
    }
}
