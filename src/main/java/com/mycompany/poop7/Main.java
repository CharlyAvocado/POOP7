/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop7;

/**
 *
 * @author Hyperion
 */
public class Main {
    public static void main(String[] args) {
        Empleado emp=new Empleado();
        System.out.println(emp);
        
        Gerente ger=new Gerente();
        System.out.println(ger);
        
        ger.setNombre("Raúl Jiménez");
        ger.setNumEmpleado(5879510);
        ger.setSueldo(25_000);
        System.out.println(ger);
        ger.aumentarSueldo(20);
        ger.asignarPresupuesto(50_000);
        System.out.println(ger);
        System.out.println("Nombre del gerente: "+ger.getNombre());
        
        Gerente ger2=new Gerente("Karen Avalos",596723,80_000,120_000);
        System.out.println(ger2);
        
        Gerente ger3=new Gerente("Samantha Ríos",564984,35_000);
        System.out.println(ger3);
        
        System.out.println("###########Instancias##########");
        if(ger3 instanceof Gerente){
            System.out.println("Gerente es instancia de Gerente");
        }
        if(ger3 instanceof Empleado){
            System.out.println("Gerente es instancia de Empleado");
        }
        if(ger instanceof Object){
            System.out.println("Gerente es instancia de Object");
        }
        System.out.println("#############Actividad#############");
        Ballena ball=new Ballena(15,3,"Willy","Pacífico Norte","Azul");
        ball.nadar("el océano");
        ball.comer("Krill");
        ball.sonido("*grita en Cetáceo*");
        ball.pelearConPinocho();
        System.out.println(ball);
        
        Perro perr=new Perro("Rojo",7, "Filomeno", "Europa","Café");
        perr.correr("el parque");
        perr.comer("Croquetas");
        perr.sonido("guau");
        perr.hacerTrucos("dar la pata");
        System.out.println(perr);
        
        Pajaro paj=new Pajaro("Granívoro",2,"Fred","Australia","verde");
        paj.comer("Semillas");
        paj.sonido("*Trinidos*");
        paj.volar("un valle");
        paj.recolectarRamas();
        System.out.println(paj);
    }   
    
}
