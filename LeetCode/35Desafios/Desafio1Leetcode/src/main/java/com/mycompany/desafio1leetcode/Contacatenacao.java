/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio1leetcode;

import java.lang.reflect.Array;

/**
 *
 * @author David
 */
public class Contacatenacao {
public int[] getConcatenation(int[] nums) {
  int n = nums.length;
  
int[] resposta= new int[n * 2]; {
    for( int i =0; i <n; i++) { 
    resposta[i] = nums[i]; 
    resposta[i+n] = nums[i];}
    
} 
    return resposta;

}
 
}    
    

