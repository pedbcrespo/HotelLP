package classes;


import java.util.ArrayList;
/*Aqui, é onde junto as classes Hotel e Quarto.
Há uma quantidade fixa de quartos, porem é possivel que haja uma quantidade quase ilimitada de hospedes
*/


public class Hotel{
    private ArrayList<Hospede> listHosp = new ArrayList();
    public  ArrayList<Quarto> quartos = new ArrayList();
    public final int quant = 50;
    private double total_arrecadado;
    
    //Construtor
    public Hotel(){
        for(int i=0; i<quant; i++){
            if(i<30){
                Quarto q = new Quarto(i+100,false,false,false);
                quartos.add(q);
            }
            else{
                Quarto q = new QuartoPremium(i+100,false, false, false, false, false);
                quartos.add(q);
            }
        }
        
        total_arrecadado = 0;
    }
    
    //Metodos basicos para inserir e ter acesso aos atributos da classe
    public double getTotal_arrecadado() {
        return total_arrecadado;
    }

  
    
    //Esse metodo adiciona mais um hospede a lista de hospedes do hotel, juntamente com os quartos reservados
    public void reserva(ArrayList<Hospede> hospedes) {

          for(Hospede h : hospedes){
              listHosp.add(h);
          }
          
    }
    
    //Esse metodo tem a finalidade de alterar as informações de determinado hospede, ja registrado 
    public void alt_reserva(Hospede hosp, Hospede hospAtualizado) {
        
        rmv_reserva(hosp);
        listHosp.add(hospAtualizado);
    }
    //Esse metodo exclui todos os hospedes contidos em um quarto 
    public void rmv_reserva(Quarto q){
                 
        /*Nesse loop, percorro a lista de hospedes relacionados ao quarto selecionado e removo do registro de hospedes,
        finalizando a estadia*/
        for(Hospede h : q.getHospede()){
            listHosp.remove(h);
        }
        
        /*Não há  a necessidade de atribuir todo o elemento ao nulo. Basta apenas indicar que o quarto esta livre para
        novos hospedes*/
        q.setOcupado(false);
        q.getHospede().clear();
    }
    
    public void rmv_reserva(Hospede h){
            
            if(buscaQuarto(h.getQuarto().numero).getHospede().size()==1)
                rmv_reserva(buscaQuarto(h.getQuarto().numero));
            else{
                listHosp.remove(h);
                buscaQuarto(h.getQuarto().numero).getHospede().remove(h);
            }
            
            
            
    }
    
    //Esse metodo retorna todos os Quartos livres do hotel
    public ArrayList<Quarto> quartosLivres(){
        ArrayList<Quarto> livres = new ArrayList();
        
        /*Para cada quarto 'q', que esta contido na lista 'quartos', é verificado se seu status é 'livre', caso seja,
        é adicionado á uma outra lista chamada 'livres', sem necessariamente remover da lista 'quartos'.*/
        for(Quarto q : quartos){
            if(! q.isOcupado())
                livres.add(q);
        }
        return livres;
    }
    
    //Esse metodo percorre a lista de hospedes e retorna o Hospede procurado, caso nao econtre, retorna null
    public Hospede buscaHospede(String nm){
        /*Loop no qual percorre a lista de Hospedes, comparando os nomes com o nome passado como parametro, ou seja
        o 'nm'*/
        for(Hospede h : listHosp){
            if(h.getNome().equals(nm)){
                return h;
            }
        }
        return null;
    }
    //Metodo que retorna o Quarto a partir de seu numero de identificação
    public Quarto buscaQuarto(int num){
        return quartos.get(num-100);
    }
    
    public Quarto buscaQuarto(Hospede h){
        return h.getQuarto();
    }
    //Retorna em forma de String, as informações do Hospede selecionado pelo nome
    public String infoHospedeQuarto(int nm){
        String info = "";
        /*Aqui o loop percorre a lista de hospedes de um quarto em especifico. 
        OBS:. Cada Hospede esta relacionado a 1 quarto, mas cada quarto pode estar relacionado a varios hospedes.*/
        for(Hospede h : quartos.get(nm-100).getHospede()){
            info += h.infoHospede()+"\n\n";
        }
        return info + quartos.get(nm-100).infoQuarto();
    }
    
    //Esse metodo atualiza a lista de quartos, adicionando as modficações feitas para o hospede
    /*Esse codigo parece com o alt_reserva, porem, ele nao modifica as informações, apenas subsititui os dados desatualizados.
    Esse metodo é chamado depois que se é adicionado, removido ou aterado dados sobre hospedes e quartos relacionados.*/
    public void AtualizaDados(Quarto q){
        quartos.remove(quartos.get(q.numero - 100));
        quartos.add(q.numero-100, q);
               
    }
    
    double ValorTotalQuarto(Quarto q){
        double valor_total = 0;
        if(q.isOcupado()){
            for(Hospede h: q.getHospede()){
                valor_total =+ h.valorTotal();
            }
            valor_total += q.total();
        }
        return valor_total;
    }
    /*Metodo que atualiza o campo de Lucro_arrecadado, dado um determinado quarto
    O metodo percorre a lista de Hospedes contidos no quarto e, caso tenham efetuado o check in, soma seus planos pessoais.
    Apos isso, é somado o valor do quarto e por fim, adicionado aos lucros*/
    public void AtualizaLucro(){
        
        for(Quarto q : quartos){
            total_arrecadado += ValorTotalQuarto(q);
        }
        
    }
    
}
