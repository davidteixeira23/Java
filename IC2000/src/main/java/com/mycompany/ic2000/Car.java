/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ic2000;

/**
 *
 * @author David
 */
public class Car {
      
 private String StateCarDoorsLeft = "Portas esquerdas fechadas";
 private String StateCarDoorsRight = "Portas direitas fechadas";
    
 public void setStateCarDoorsLeft(String StateCarDoorsLeft){
 this.StateCarDoorsLeft = StateCarDoorsLeft;     
 }
 
 public String getStateCarDoorsLeft() {
 return StateCarDoorsLeft;
 }
 
     
 public void setStateCarDoorsRight(String StateCarDoorsRight){
 this.StateCarDoorsRight = StateCarDoorsRight;     
 }
 
 public String getStateCarDoorsRight() {
 return StateCarDoorsRight;
 }
    
 
 
    
}
