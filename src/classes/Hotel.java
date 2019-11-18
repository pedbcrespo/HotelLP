package classes;


import java.util.ArrayList;

public class Hotel implements InterfaceHotel{
    public ArrayList<Hospede> listHosp = new ArrayList();
    public Quarto quartos[] = new Quarto[50];
    private double total_arrecadado=0, total_estimado;

    public double getTotal_arrecadado() {
        return total_arrecadado;
    }

    public void setTotal_arrecadado(double total_arrecadado) {
        this.total_arrecadado = total_arrecadado;
    }

    public double getTotal_estimado() {
        return total_estimado;
    }

    public void setTotal_estimado(double total_estimado) {
        this.total_estimado = total_estimado;
    }
    
    @Override
    public double lucro_estimativa(){
        double tt=0;
        for(Hospede p : listHosp){
            tt=tt+p.getPreco_total();
        }
        return tt + this.total_arrecadado;
    }

    @Override
    public void reserva(Hospede hosp) {
        listHosp.add(hosp);
    }

    @Override
    public void alt_reserva(Hospede hosp) {
        
    }

    @Override
    public void rmv_reserva(Hospede hosp) {
        listHosp.remove(hosp);
    }
}
