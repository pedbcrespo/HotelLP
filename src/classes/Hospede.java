package classes;


import java.util.ArrayList;

public class Hospede {
    
    private String nome, cpf;
    private int dia, mes, ano, quant_estadia, num_quartos;
    private double preco_total;     //restante a ser pago ou total a ser pago caso primeira_parcela for falso;
    private boolean cafe_manha;
    private boolean check_in;       //se a primeira parcela foi paga   
    private final ArrayList<Quarto> quartos;
        
    public Hospede(String nome, String cpf, int dia, int mes, int ano, int quant_estadia,int num_quartos, double preco_total, boolean cafe_manha, boolean check_in, ArrayList<Quarto> quartos){
    	this.nome = nome;
        this.cpf = cpf;
        this.dia = dia;
	this.mes = mes;
	this.ano = ano;
	this.quant_estadia = quant_estadia;
        this.num_quartos = num_quartos;
	this.preco_total = preco_total;
	this.cafe_manha = cafe_manha;
	this.check_in = check_in;
        this.quartos = quartos;
    }


    public void setNum_quartos(int num_quartos) {
        this.num_quartos = num_quartos;
    }

    public void setNome(String nome){
		this.nome = nome;
	}
    
    public void setDia(int dia){
		this.dia = dia;
	}

    public void setMes(int mes){
		this.mes = mes;
	}

    public void setAno(int ano){
		this.ano = ano;
	}

    public void setQuant_estadia(int quant_estadia){
		this.quant_estadia = quant_estadia;
	}

    public void setPreco_total(double preco_total){
		this.preco_total = preco_total;
	}

    public void setCafe_manha(boolean cafe_manha){
		this.cafe_manha = cafe_manha;
	}

    public void setCheck_in(boolean check_in){
		this.check_in = check_in;
	}

    public String getNome(){
		return this.nome;
	}
    
    public int getNum_quartos() {
        return num_quartos;
    }
    
    public int getQuant_estadia(){
		return this.quant_estadia;
	}

    public double getPreco_total(){
		return this.preco_total;
	}

    public boolean getCafe_manha(){
		return this.cafe_manha;
	}

    public boolean getCheck_in(){
		return this.check_in;
	}

    public int[] getData(){
		int data[] = {this.dia, this.mes, this.ano};
		return data;
	}
        
}
