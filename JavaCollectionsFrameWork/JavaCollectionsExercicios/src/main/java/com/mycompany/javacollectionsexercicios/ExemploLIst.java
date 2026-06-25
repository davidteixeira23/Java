package com.mycompany.javacollectionsexercicios;

import java.util.List;
import java.util.ArrayList;

/**
 * @author David
 */
public class ExemploLIst {

    public static void main(String[] args) {
        
        // 1. Criamos a lista   
        List<Pessoa> pessoas = new ArrayList<>();

        // 2. Adicionamos a nova Pessoa (singular, sem os rótulos id: e nome:)
        pessoas.add(new Pessoa(1, "joao"));

        // 3. Pegamos o primeiro elemento da lista (posição 0)
        Pessoa a = pessoas.get(0);
        
        pessoas.remove(a);
        
        for(Pessoa pessoa: pessoas ){
        System.out.println(pessoa.getNome());
        }
        
        System.out.println("-----------------");
     pessoas.add(a);
      
      for(Pessoa pessoa: pessoas ){
        System.out.println(pessoa.getNome());
        }
     
    }
}