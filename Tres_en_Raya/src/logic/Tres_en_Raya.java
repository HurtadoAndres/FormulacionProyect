/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Scanner;


/**
 *
 * @author Miller Olaya
 */
public class Tres_en_Raya {
     public static  boolean J1= false,J2= false;
     public  int NJ1=0;
     public  int NJ2=0;
     //la x dice el turno del jugador
        int x =1;
        int columna=0,fila=0;
     public  String variable;

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

   

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    
     
        
    
    public static int MN[][] = new int[3][3];
    public static String MT[][] = new String[3][3];
    public void matriz(){
           //inicializamos la matriz en cero
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                MN[i][j]=0;            
            }
        }
    }
    
    public void triqui(){
      int i;
      int j;
     for (i=0;i<=2;i++){
        for (j=0;j<=2;j++){
            System.out.print("Escribir valor " + i + " , " + j + " : ");
            MT [i][j] = dato.nextInt();
        }
    }
        
    }
    
 
    
    
    
    public  void VerificarG(){
        //verifica si ya existe un ganador
        
        //caso1
        if(MN[0][0]==1 && MN[1][0]==1 && MN[2][0]==1){
            J1=true;
        }else if (MN[0][0]==-1 && MN[1][0]==-1 &&MN[2][0]==-1){
            J2=true;
        }
        
        
        //caso2   
       if(MN[0][1]==1 && MN[1][1]==1 && MN[2][1]==1){
            J1=true;
        }else if (MN[0][1]==-1 && MN[1][1]==-1 &&MN[2][1]==-1){
            J2=true;
        }
       
       
       //caso3
        if(MN[0][2]==1 && MN[1][2]==1 && MN[2][2]==1){
            J1=true;
        }else if (MN[0][2]==-1 && MN[1][2]==-1 &&MN[2][2]==-1){
            J2=true;
        }
        
        
        //caso4
         if(MN[0][0]==1 && MN[0][1]==1 && MN[0][2]==1){
            J1=true;
        }else if (MN[0][0]==-1 && MN[0][1]==-1 &&MN[0][2]==-1){
            J2=true;
        }
         
         //caso5
          if(MN[1][0]==1 && MN[1][1]==1 && MN[1][2]==1){
            J1=true;
        }else if (MN[1][0]==-1 && MN[1][1]==-1 &&MN[1][2]==-1){
            J2=true;
        }
          
          //caso6
           if(MN[2][0]==1 && MN[2][1]==1 && MN[2][2]==1){
            J1=true;
        }else if (MN[2][0]==-1 && MN[2][1]==-1 &&MN[2][2]==-1){
            J2=true;
        }
           
           //caso 7
            if(MN[0][0]==1 && MN[1][1]==1 && MN[2][2]==1){
            J1=true;
        }else if (MN[0][0]==-1 && MN[1][1]==-1 &&MN[2][2]==-1){
            J2=true;
        }
            //caso 8
             if(MN[0][2]==1 && MN[1][1]==1 && MN[2][0]==1){
            J1=true;
        }else if (MN[0][2]==-1 && MN[1][1]==-1 &&MN[2][0]==-1){
            J2=true;
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
              J1=true;J2=true;
          }
    }
    
    }

