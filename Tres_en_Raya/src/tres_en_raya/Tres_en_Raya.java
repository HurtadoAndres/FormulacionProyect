/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres_en_raya;

import java.util.Scanner;

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
    
    public static int MN[][] = new int[3][3];
    public static String MT[][] = new String[3][3];
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        Scanner leer = new Scanner(System.in);
        //inicializamos la matriz en cero
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                MN[i][j]=0;            
            }
        }
        
     
        //la x dice el turno del jugador
        int x =1;
        int columna=0,fila=0;
        do{
            
               //lleno la matriz que se mostrara al usuario con sus respectivos simbolos
        
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (MN[i][j]==0){
                    MT[i][j]= "| |";
                }else if (MN[i][j]==1){
                    MT[i][j]= "|x|";
                }else{
                    MT[i][j]= "|o|";
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
            
            System.out.print("jugador " +x+" eliga la posicion que va a jugar \n");
            
            System.out.print("primero la columna \n");
            columna = leer.nextInt();
            System.out.print("luego la fila \n");
            fila = leer.nextInt();
            
            if (x==1){
                MN[fila][columna]=1;
                x=2;
            }else{
                MN[fila][columna]=-1;
                x=1;
            }
            
            VerificarG();
            VerificarC();
            
            
        }while(!(J1 || J2));
        //operador logico "o" ||
        //operador logico "y" &&
        
        
        if (J1 && J2){
            System.out.print("Empate \n");
        }else if (J1){
            System.out.print("Felicidades jugador 1 \n");
            NJ1=NJ1+1;
        }else{
             System.out.print("Felicidades jugador 2 \n");
            NJ2=NJ2+1;
        }
        
    }
    
    public static void VerificarG(){
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
