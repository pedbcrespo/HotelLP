package classes;

public class Hospede {
    
    private String nome;
    private int quant_estadia;
    private int data[]; 
    private double preco_total;    ;
    private boolean cafe_manha;
    private boolean check_in;     
    private Quarto quarto;
    
    //Construtor da classe
    public Hospede(String nome, int[] data, int quant_estadia){
    	this.nome = nome;
        this.data = data;
	this.quant_estadia = quant_estadia;
    }

    //Metodos basicos para inserir e ter acesso aos atributos da classe
    public Quarto getQuarto() {
        return quarto;
    }
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }   
    public void setNome(String nome){
	this.nome = nome;
    }    
    public void setQuant_estadia(int quant_estadia){
	this.quant_estadia = quant_estadia;
    }
    public void setCafe_manha(boolean cafe_manha){
	this.cafe_manha = cafe_manha;
    }
    public void setCheck_in(boolean check_in){
	this.check_in = check_in;
    }
    public int[] getData() {
        return data;
    }
    public void setData(int[] data) {
        this.data = data;
    }    
    public String getNome(){
	return this.nome;
    }        
    public int getQuant_estadia(){
		
        return this.quant_estadia;
    }
    public boolean getCafe_manha(){
	return this.cafe_manha;
    }
    public boolean getCheck_in(){
	return this.check_in;
    }
    
    //aqui entra os metodos de aplicação do programa.
    
    /*Nesse metodo, é verificado se determinado quarto, dado seu numero de identificação esta contido na lista de quartos
    do hospede, caso esteja, retorna a posiçao na lista, senao, retorna -1, mostrando que o quarto nao esta na lista do hospede*/
    public boolean pertenceQuarto(int num){

            if(quarto.numero==num){
                return true;
            }

        return false;
    } 

    //Nesse metodo, as informações sobre o Hospede sao retornadas em forma de String
    public String infoHospede(){
        String info = "";
        info += "Nome: " + this.nome + "\n";
        info += "Cafe da manha: " + this.cafe_manha + "\n";
        info += "Data de Hospedagem:" + this.data[0] +"/"+ this.data[1] +"/"+this.data[2]+"\n";
        info += "Check in: " + this.check_in;
        return info;
    }
    
    //Nessa é calculado todo o custo da estadia do hospede, considerando todos os quartos em seu nome
    public double valorTotal(){
        
        if(cafe_manha){
            preco_total += 20;
        }
        return preco_total;
    }
}
