/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorabasicakaren;

/**
 *
 * @author DELL
 */
public class Controlador {
   Vista vistacalcu;
   Modelo modelocalcu;

    public Controlador(Vista vistacalcu, Modelo modelocalcu) {
        this.vistacalcu = vistacalcu;
        this.modelocalcu = modelocalcu;
    }
   
   public void realizarcalcu(){
   double num1= Vista.getNumero1();
   }
}
