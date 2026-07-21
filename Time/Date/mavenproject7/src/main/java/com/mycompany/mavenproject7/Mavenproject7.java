/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author David
 */
public class Mavenproject7 {

    public static void main(String[] args) {
        // OBTENDO A DATA ATUAL.
        
        LocalDate date  = LocalDate.now();
        System.err.println("Hello, you are running this code in the day :" + date );
        
        // Definindo uma hora manualmente
        LocalDate BirthDate = LocalDate.of(2009, Month.OCTOBER, 23);
        System.err.println("David´s birthday is :" + BirthDate);
                
        LocalDate Advice = date.plusWeeks(13);
        System.err.println("Future date" + Advice);
        
        LocalDate Subtractrion = date.minusWeeks(3);
        System.err.print(Subtractrion);
    }
}
