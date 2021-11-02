/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prestamos;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Prestamo {
    int numPrestamo;
    double valor;
    Fecha autorizacion;
    Fecha entrega;
    int numMeses;
    ArrayList<Fecha> cuotas = new ArrayList<Fecha>();

    public Prestamo(int numPrestamo, double valor, Fecha autorizacion, Fecha entrega,int numMeses) {
        this.numPrestamo = numPrestamo++;
        this.valor = valor;
        this.autorizacion = autorizacion;
        this.entrega = entrega;
        this.numMeses=numMeses;
    }

    Prestamo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumPrestamo() {
        return numPrestamo;
    }

    public void setNumPrestamo(int numPrestamo) {
        this.numPrestamo = numPrestamo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Fecha getAutorizacion() {
        return autorizacion;
    }
    public int getMEses() {
        return numMeses;
    }

    public void setAutorizacion(Fecha autorizacion) {
        this.autorizacion = autorizacion;
    }

    public Fecha getEntrega() {
        return entrega;
    }

    public void setEntrega(Fecha entrega) {
        this.entrega = entrega;
    }

    public String getCuotas() {
        String fechas="";
        int num = 1;
        for(Fecha i:cuotas){
            fechas = fechas+"Fecha "+"#"+num+++": ";
            fechas = fechas+i.toString()+"\n";
             
        }
        return fechas;
    }
    public void tresCuotas(){
       Fecha obj1 = new Fecha(this.entrega.dd,this.entrega.mm,this.entrega.aa);      
        obj1.mm++;
        obj1 = compruebaFecha(obj1);
        Fecha obj2 = new Fecha(obj1.dd,obj1.mm,obj1.aa);
        obj2.mm++;
        obj2 = compruebaFecha(obj2);
        Fecha obj3 = new Fecha(obj2.dd,obj2.mm,obj2.aa);
        obj3.mm++;
        obj3 = compruebaFecha(obj3);
        this.cuotas.add(obj1);
        this.cuotas.add(obj2);
        this.cuotas.add(obj3);
    }
    public void cuatroCuotas(){
        Fecha obj1 = new Fecha(this.entrega.dd,this.entrega.mm,this.entrega.aa);      
        obj1.mm++;
        obj1 = compruebaFecha(obj1);
        Fecha obj2 = new Fecha(obj1.dd,obj1.mm,obj1.aa);
        obj2.mm++;
        obj2 = compruebaFecha(obj2);
        Fecha obj3 = new Fecha(obj2.dd,obj2.mm,obj2.aa);
        obj3.mm++;
        obj3 = compruebaFecha(obj3);
        Fecha obj4 = new Fecha(obj3.dd,obj3.mm,obj3.aa);
        obj4.mm++;
        obj4 = compruebaFecha(obj4);
        
        this.cuotas.add(obj1);
        this.cuotas.add(obj2);
        this.cuotas.add(obj3);
        this.cuotas.add(obj4);
    }
    public void cincoCuotas(){
        Fecha obj1 = new Fecha(this.entrega.dd,this.entrega.mm,this.entrega.aa);      
        obj1.mm++;
        obj1 = compruebaFecha(obj1);
        Fecha obj2 = new Fecha(obj1.dd,obj1.mm,obj1.aa);
        obj2.mm++;
        obj2 = compruebaFecha(obj2);
        Fecha obj3 = new Fecha(obj2.dd,obj2.mm,obj2.aa);
        obj3.mm++;
        obj3 = compruebaFecha(obj3);
        Fecha obj4 = new Fecha(obj3.dd,obj3.mm,obj3.aa);
        obj4.mm++;
        obj4 = compruebaFecha(obj4);
        Fecha obj5 = new Fecha(obj4.dd,obj4.mm,obj4.aa);
        obj5.mm++;
        obj5 = compruebaFecha(obj5);
        
        this.cuotas.add(obj1);
        this.cuotas.add(obj2);
        this.cuotas.add(obj3);
        this.cuotas.add(obj4);
        this.cuotas.add(obj5);
    }
      public void seisCuotas(){
        Fecha obj1 = new Fecha(this.entrega.dd,this.entrega.mm,this.entrega.aa);      
        obj1.mm++;
        obj1 = compruebaFecha(obj1);
        Fecha obj2 = new Fecha(obj1.dd,obj1.mm,obj1.aa);
        obj2.mm++;
        obj2 = compruebaFecha(obj2);
        Fecha obj3 = new Fecha(obj2.dd,obj2.mm,obj2.aa);
        obj3.mm++;
        obj3 = compruebaFecha(obj3);
        Fecha obj4 = new Fecha(obj3.dd,obj3.mm,obj3.aa);
        obj4.mm++;
        obj4 = compruebaFecha(obj4);
        Fecha obj5 = new Fecha(obj4.dd,obj4.mm,obj4.aa);
        obj5.mm++;
        obj5 = compruebaFecha(obj5);
        Fecha obj6 = new Fecha(obj5.dd,obj5.mm,obj5.aa);
        obj6.mm++;
        obj6 = compruebaFecha(obj6);
        
        this.cuotas.add(obj1);
        this.cuotas.add(obj2);
        this.cuotas.add(obj3);
        this.cuotas.add(obj4);
        this.cuotas.add(obj5);
        this.cuotas.add(obj6);
    }
     public Fecha compruebaFecha(Fecha aux){
         if(aux.mm>12){
             aux.mm=1;
             aux.aa++;
         }
        return aux;
    }

    @Override
    public String toString() {
        return "\nNumero de prestamo: "+this.getNumPrestamo()+"\nCantidad: "+this.getValor()+"\nNumero de meses: "+this.getMEses()+
                "\nFecha de autorizacion: "+this.getAutorizacion()+"\nFecha de entrega: "+this.getEntrega()+"\nCuotas:\n"+this.getCuotas();
    }
    
    public void mostrarPrestamo(){
        System.out.println("ID de prestamo: "+this.numPrestamo);
        System.out.println("Valor de prestamo: "+this.valor);
        System.out.println("Numero de cuotas: "+this.numMeses);
        this.autorizacion.mostrarFecha();
        this.entrega.mostrarFecha();
        int j=1;
        for(Fecha i:this.cuotas){
            System.out.println("Pago #"+j++ +": ");
            System.out.println(i.getDd()+"."+i.getMm()+"."+i.getAa());
        }
    }
    
    public boolean buscar(int dd, int mm){
       int cont=0;
        for(Fecha i:cuotas){
            if(i.getDd()==dd){
                cont++;
            }
            if(i.getMm()==mm){
                cont++;
            }
            if(cont==2){
                
                return true;
            }
        }
        return false;
    }
}
