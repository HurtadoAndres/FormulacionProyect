/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import view.Vista;

/**
 *
 * @author Estudiante
 */
public class Tres_en_Raya {

    /**
     * @param args the command line arguments
     */
     public static boolean J1= false,J2= false;
     public static int NJ1=0;
     public static int NJ2=0;
     private static int columna=0,fila=0;
     public String simbolo;
       //la x dice el turno del jugador
        int x =1;
    
    public static int MN[][] = new int[3][3];
    public static String MT[][] = new String[3][3];

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    
    

    public static int getColumna() {
        return columna;
    }

    public static void setColumna(int columna) {
        Tres_en_Raya.columna = columna;
    }

    public static int getFila() {
        return fila;
    }

    public static void setFila(int fila) {
        Tres_en_Raya.fila = fila;
    }
    
    
    
    public void main() {
    
        //inicializamos la matriz en cero
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                MN[i][j]=0;            
            }
            
        }
     
    }
    String Vector []=new  String [MT.length];
    public void mostrar(){
         if (x==1){
                MN[fila][columna]=1;
                x=2;
                simbolo="X";
            }else{
                MN[fila][columna]=-1;
                simbolo="O";
                x=1;
            }
                      //lleno la matriz que se mostrara al usuario con sus respectivos simbolos
      
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                switch (MN[i][j]) {
                    case 0:
                        MT[i][j]= "||";
                       
                        break;
                    case 1:
                      MT[i][j]= "|X|";
                     
                   
                       
                        
                        break;
                    default:
                       MT[i][j]= "|O|";
                      
                      
                       
                        break;            
                }
                
            }
          
        }
              //monstramos la matriz al usuario
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
               System.out.print(MT[i][j]);
               
              
            }
            //salto de linea
            System.out.print("\n");
          
        
    }
       
   
        
     
   }
    
    
    
    public static void VerificarG(){
        //verifica si ya existe un ganador
        
        //caso1
        if(MN[0][0]==1 && MN[1][0]==1 && MN[2][0]==1){
            
            J1=true;
            JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador1");
        }else if (MN[0][0]==-1 && MN[1][0]==-1 &&MN[2][0]==-1){
            J2=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador2");
        }
        
        
        //caso2   
       if(MN[0][1]==1 && MN[1][1]==1 && MN[2][1]==1){
            J1=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador1");
             
        }else if (MN[0][1]==-1 && MN[1][1]==-1 &&MN[2][1]==-1){
            J2=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador2");
        }
       
       
       //caso3
        if(MN[0][2]==1 && MN[1][2]==1 && MN[2][2]==1){
            J1=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador1");
        }else if (MN[0][2]==-1 && MN[1][2]==-1 &&MN[2][2]==-1){
            J2=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador2");
        }
        
        
        //caso4
         if(MN[0][0]==1 && MN[0][1]==1 && MN[0][2]==1){
            J1=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador1");
        }else if (MN[0][0]==-1 && MN[0][1]==-1 &&MN[0][2]==-1){
            J2=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador2");
        }
         
         //caso5
          if(MN[1][0]==1 && MN[1][1]==1 && MN[1][2]==1){
            J1=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador1");
        }else if (MN[1][0]==-1 && MN[1][1]==-1 &&MN[1][2]==-1){
            J2=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador2");
        }
          
          //caso6
           if(MN[2][0]==1 && MN[2][1]==1 && MN[2][2]==1){
            J1=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador1");
        }else if (MN[2][0]==-1 && MN[2][1]==-1 &&MN[2][2]==-1){
            J2=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador2");
        }
           
           //caso 7
            if(MN[0][0]==1 && MN[1][1]==1 && MN[2][2]==1){
            J1=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador1");
        }else if (MN[0][0]==-1 && MN[1][1]==-1 &&MN[2][2]==-1){
            J2=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador2");
        }
            //caso 8
             if(MN[0][2]==1 && MN[1][1]==1 && MN[2][0]==1){
            J1=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador1");
        }else if (MN[0][2]==-1 && MN[1][1]==-1 &&MN[2][0]==-1){
            J2=true;
             JOptionPane.showMessageDialog(null, "Felicidades ganador Jugador2");
        }
        
        
        
    }
    
    public static void VerificarC(){
        //verifica si aun quedan casillas vacias
        boolean casillas = false;
        //true para casiillas vacias aun existentes , false para ninguna
        
          for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (MN[i][j]==0){
                    casillas=true;
                } 
                
                if (casillas){
                    i=3;
                    j=3;
                }
            }
        }
          if(!casillas){
              if (J1=true) {
                  
              }
               if (J2=true) {
                  
              }
              J1=true;J2=true;
               JOptionPane.showMessageDialog(null, "Empatados");
               
          }
    }
    
  
   
    public String mostarboton(){

          String resultado=simbolo;
        
         return resultado;
    }
 
    
}        
        
            

