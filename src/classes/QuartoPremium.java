/*
    A separação da classe em arquivos diferentes se deve ao fato da visibilidade.
    Em algum momento, eu precisaria instanciar a subclasse em alguma outra classe, e nao ha possibilidade de 
    deixa-la publica no mesmo arquivo do Quarto.
    A consequencia de deixar a subclasse dentro do mesmo arquivo da classe mae é que somente a classe mae poderia 
    ter acesso a classe filha
 */
package classes;

public class QuartoPremium extends Quarto{
    private boolean hidromassagem, colchao_massagem;
    
    //Construtor da classe
    public QuartoPremium(int numero, boolean ocupado,boolean TV_cabo, boolean WiFi, boolean hidromassagem, boolean colchao_massagem){
        
        super(numero,ocupado,TV_cabo,WiFi);
        
        this.hidromassagem = hidromassagem;
        this.colchao_massagem = colchao_massagem;
        this.setPreco_quarto(250);
    }   
    //Metodos basicos para inserir e ter acesso aos atributos da classe
    public boolean isHidromassagem() {
        return hidromassagem;
    }
    public void setHidromassagem(boolean hidromassagem) {
        this.hidromassagem = hidromassagem;
    }
    public boolean isColchao_massagem() {
        return colchao_massagem;
    }
    public void setColchao_massagem(boolean colchao_massagem) {
        this.colchao_massagem = colchao_massagem;
    }
    
    //aqui entra os metodos de aplicação do programa. Porem, funcionarão um pouco diferente da classe Quarto por conta dos diferenciais
    @Override
    /*Nesse metodo, verifico cada atributo boolean a fim de ter o valor $$ do quarto.*/
    public double total(){
        double ret = this.getPreco_quarto() + getCama_solteiro()*1.5 + getCama_casal()*2.5;
        if(colchao_massagem)
            ret = ret + 20;
        if(hidromassagem)
            ret = ret + 15;
        return ret;
    }
    @Override
    
    /*Nesse metodo eu retorno todas as informações do quarto*/
    public String infoQuarto(){
        String info = "";
        
        info += "TV a cabo: " + this.isTV_cabo() +"\n";
        info += "Wifi: " + this.isWiFi() + "\n";
        info += "Cama de casal: " + this.getCama_casal() + "\n";
        info += "Cama de solteiro: " + this.getCama_solteiro()+ "\n";
        info += "Colchão especial: " + this.colchao_massagem + "\n";
        info += "Hidromassagem: " + this.hidromassagem + "\n";
        
        info += "Valor total $:" + this.total() + "\n";
        
        return info;
    }
}

