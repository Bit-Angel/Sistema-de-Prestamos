/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prestamos;

/**
 *
 * @author User
 */
public class Fecha {
    int dd;
    int mm;
    int aa;

    public Fecha(int dd, int mm, int aa) {
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
    }

    Fecha() {
        this.aa=0;
        this.dd=0;
        this.mm=0;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }
    
    public void verificaFecha(){
        if(this.dd>30){
            this.dd=1;
            this.mm++;
        }
        if(this.mm>12){
             this.mm=1;
             this.aa++;
         }
    }
     public void diaSiguiente(){
        this.dd=this.dd++;
        this.verificaFecha();
    }
      public void obtenerFechaEntrega(){
          for(int i=0; i<7;i++){
              this.dd++;
              this.verificaFecha();
          }
      }

    @Override
    public String toString() {
        
        return  dd + "." + mm + "." + aa;
    }
    public void mostrarFecha(){
        System.out.println("Fecha: " + this.dd + "." + this.mm + "." + this.aa);
    }
    
}
