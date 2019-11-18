package classes;

public interface InterfaceHotel {
    
    public void reserva(Hospede hosp);
    public void alt_reserva(Hospede hosp);
    public void rmv_reserva(Hospede hosp);
    
    public double lucro_estimativa();
    
}
