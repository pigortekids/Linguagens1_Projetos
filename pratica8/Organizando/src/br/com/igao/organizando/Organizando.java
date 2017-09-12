/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igao.organizando;

import br.com.Rodrigo.organizando.*;

public class Organizando {

    
    
    public static void main(String[] args) {
        br.com.igao.organizando.Cliente eu = new br.com.igao.organizando.Cliente("potato");
        br.com.Rodrigo.organizando.Cliente ele = new br.com.Rodrigo.organizando.Cliente();
        
        System.out.println("BATAAAAATAAAA");
        System.out.println(eu.getNome());
        System.out.println(ele.retornaNome("boi tata"));
    }
    
}
