/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CorridaMaluca;

/**
 *
 * @author Admin
 */
public class Veiculos {
    IMotor motor;
    Veiculos (IMotor m){
    this.motor = m;
    }

    public String acelerar(){
        return this.motor.acelerar();
}
}