/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;
import java.time.LocalTime;

/**
 *
 * @author David
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        LocalTime horaEntrada = LocalTime.of(22,20,00 );
        System.out.println("Hora atual " + horaAtual);
        System.out.println("--------------");
        
        
        System.out.println("hora de entrada no serviço é igual a " + horaEntrada);
        System.out.println("--------------");

        LocalTime HoraPrimeiraDoseMedicacao = LocalTime.now().plusHours(2);
        LocalTime HoraSegundaDoseMedicacao = HoraPrimeiraDoseMedicacao.plusHours(2);
        System.out.println("Hora da primeira medicação " + HoraPrimeiraDoseMedicacao);
        System.out.println("Hora da segunda medicação  " + HoraSegundaDoseMedicacao);

        LocalTime ReducaoHoras = HoraPrimeiraDoseMedicacao.minusHours(72);
        System.out.println("Horas antes do ocorrído " + ReducaoHoras);

        
    }
}
