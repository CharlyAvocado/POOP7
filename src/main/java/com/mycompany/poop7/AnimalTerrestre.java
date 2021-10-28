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
public class AnimalTerrestre extends Animal{
    private int numeroPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
    public void correr(String corriendo){
        System.out.println("Estoy corriendo en "+corriendo);
    }

    @Override
    public String toString() {
        return super.toString()+
                "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + '}';
    }
    
}
