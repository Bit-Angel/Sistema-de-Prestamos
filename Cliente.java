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
public class Cliente {
    int identidad;
    String nombre;
    String apellido;
    String apellido2;
    String correo;
    long telefono;
    ArrayList<Prestamo> prestamo = new ArrayList<Prestamo>();

    public Cliente(int identidad, String nombre, String apellido, String apellido2, String correo, long telefono) {
        this.identidad = identidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getPrestamo() {
        return prestamo.toString();
    }

    public void setPrestamo(ArrayList<Prestamo> prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "identidad: " + identidad + "\nnombre: " + nombre + "\napellido: " + apellido + "\napellido2: " + apellido2 + "\ncorreo: " + correo + "\ntelefono: " + telefono + prestamo.toString() + '}';
    }
    
    public void mostrarCliente(){
        System.out.println("Nombre: "+this.nombre+ " " + this.apellido+ " " + this.apellido2);
        System.out.println("ID: "+this.identidad);
        System.out.println("Correo: "+this.correo);
        System.out.println("Numero: "+this.telefono);
        for(Prestamo i:prestamo){
            i.mostrarPrestamo();
        }
    }
    
    public boolean compruebaSaldo(double nuevo){
        double suma=0; 
        for(Prestamo i:prestamo){
            suma=i.getValor()+suma;
        }
        suma=suma+nuevo;
        if(suma>10000){
            return false;
        }else
            return true;
    
}
   public boolean buscarFecha(int dd,int mm){
       boolean veri = false;
       for(Prestamo i:prestamo ){
           veri =  i.buscar(dd,mm);
           if(veri==true){
               i.cuotas.remove(0);
               return true;
           }
        }
        return veri;
    }
    public boolean buscarFecha2(int dd,int mm){
       boolean veri = false;
       int cont=0;
       for(Prestamo i:prestamo ){
           if(i.getEntrega().dd==dd){
               cont++;
           }
           if(i.getEntrega().mm==mm){
               cont++;
           }
           if(cont==2){
               return true;
           }
        }
        return veri;
    }
    public boolean buscarFecha3(int dd,int mm){
       boolean veri = false;
       for(Prestamo i:prestamo ){
           veri =  i.buscar(dd,mm);
           if(veri==true){
               return true;
           }
        }
        return veri;
    }
}
