package com.mycompany.fecha.poo;

import java.util.Scanner;

public class Principal {
    // TODO: Aquí va el código de la clase Principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();
        Fecha fecha = new Fecha(dia, mes, ano);
        Fecha valida = new Fecha(dia, mes, ano);
        System.out.println(valida.validarFecha());
        if(valida.validarFecha() == true){
            System.out.println(fecha.fechaLarga());
            
        }
        }
   

}
