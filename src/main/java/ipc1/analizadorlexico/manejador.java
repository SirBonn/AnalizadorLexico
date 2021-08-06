/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.analizadorlexico;

import java.util.ArrayList;

/**
 *
 * @author byron
 */
public class manejador {

     private final String textoEntrada;
     private String palabra = "";
     private String numero = "";
     private String simbolo = "";
    private String datos = "";
     ArrayList<String> palabras = new ArrayList<>();
     ArrayList<String> numeros = new ArrayList<>();
     ArrayList<String> simbolos = new ArrayList<>();

     private final char[] lex;

     public manejador(String textoEntrada) {
          this.textoEntrada = textoEntrada;
          lex = textoEntrada.toCharArray();
          analizar();
     }

     private void analizar() {
          
          for (int i = 0; i < lex.length; i++) {
               
               String tmpString = String.valueOf(lex[i]);
               
               if (Character.isDigit(lex[i])) {
                    numero += tmpString;
               } if (!Character.isLetter(lex[i]) && !Character.isDigit(lex[i]) && !tmpString.equals(" ")){
                    simbolo+=tmpString;
               }
               else {
                    for (Alfabeto value : Alfabeto.values()) {
                         if (tmpString.equals(value.toString())) {
                              palabra += tmpString;
                         }
                    }
               }

               if (tmpString.equals(" ") || i == lex.length - 1) {
                    if (!palabra.equals("")) {
                         datos+= "\nID: " + palabra;
                         palabras.add(this.palabra);
                         palabra = "";
                    }
                    if (!numero.equals("")) {
                         datos+= "\nNumero " + numero;
                         numeros.add(numero);
                         numero = "";
                    }
                    if (!simbolo.equals("")) {
                         datos+= "\nSimbolo: " + simbolo;
                         simbolos.add(simbolo);
                         simbolo = "";
                    }
               }
          }
     }

     public String getDatos() {
          return datos;
     }

     
     
}
