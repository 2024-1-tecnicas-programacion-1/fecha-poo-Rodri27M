package com.mycompany.fecha.poo;

import java.util.HashMap;
import java.util.Map;

public class Fecha {
    // TODO: Aquí va el código de la clase fechas
  private int dia;
  private int mes;
  private int ano;
public static void main(String[] args){
    
}
  public Fecha(int dia, int mes, int ano){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }
  
  public String fechaCorta(){ // COMPLEJIDAD TEMPORAL O(1)
     
      String Fechahecha = dia + "/" + mes + "/" + ano;

      return Fechahecha;
             
  }
     public boolean validarFecha(){ // COMPLEJIDAD TEMPORAL O(1)
         if (mes < 1 || 12 < mes){
            return false;     
         }
         else if (mes == 2){
             if (ano%4==0 && dia>=1 && dia<=29){
               return true;
             }}
           else {
                if ((mes==1 || mes==3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes==12) && dia >=1 && dia<=31){
                    return true;
                }
                else if (dia<=30 && 1<=dia){
                    return true;                 
                }
         }
         
      return false;
      
     }
     public String mesLetra(){ // COMPLEJIDAD LINEAL O(N)
         Map<Integer, String> meses = new HashMap<>();  
         meses.put(1, "enero");
         meses.put(2, "febrero");
         meses.put(3, "marzo");
         meses.put(4, "abril");
         meses.put(5, "mayo");
         meses.put(6, "junio");
         meses.put(7, "julio");
         meses.put(8, "agosto");
         meses.put(9, "septiembre");
         meses.put(10, "octubre");
         meses.put(11, "noviembre");
         meses.put(12, "diciembre");
         
           String meslargo = meses.get(mes);
           return meslargo;
         
     }
     public String fechaLarga(){ // COMPLEJIDAD TEMPORAL O(1)
        String fechames = dia + " de " + mesLetra() + " de " + ano;
        
      return fechames;

}
}

