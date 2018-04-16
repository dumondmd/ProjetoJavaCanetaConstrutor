/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

/**
 *
 * @author dumon
 */
public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    void status () {
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
            
    }
    
    public void rabiscar () {
        if (this.tampada == true){
            System.out.println("Erro! Não posso escrever");
        } else {
            System.out.println("OK! Estou escrevendo");
        }
    }
    
    public void tampar () {
        this.tampada = true;
    }
    
    public void destampar () {
        this.tampada = false;
    }

}
