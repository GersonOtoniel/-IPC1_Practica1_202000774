/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego11;

import java.util.Scanner;

/**
 *
 * @author Gerson
 */
public class pacman {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        String matriz[][] = new String[15][15];
        int x,y;
        int n=2,m=2;
        char mover = 0;
        int puntaje = 0;
        
        for(x=0;x<15;x++){
        for(y=0;y<15;y++){
            System.out.print(matriz[x][y]="");
        }
        }
        //Mapa
        for(x=0;x<15;x++){
        for(y=0;y<15;y++){
            if(x==0 || x==14){
            matriz[x][y]="-";
            }
            
            else if(y==0 || y==14){
            matriz[x][y]="|";
            }
            
            //obstaculos empieza
            else if(x==5 && y>4 && y<10){
            matriz[x][y]="X";
            }
                    
            else if(y==9 && x>6 && x<13){
            matriz[x][y]="X";
            }        
             
            
            else if(x==8 && y>6 && y<13){
            matriz[x][y]="X";
            }           
       
            else if(x==10 && y>1 && y<7){
            matriz[x][y]="X";
            }
            
            else if(y==2 && x>1 && x<5){
            matriz[x][y]="X";
            }
            
            else if(y==11 && x>2 && x<7){
            matriz[x][y]="X";
            }
            //obstaculos termina
           
            //empieza premios
            else {
                matriz[12][12] = "@";
                matriz[x][y]="0";
              
                matriz[4][4] = "@";
                matriz[x][y] = "0";
                
                matriz[8][3] = "@";
                matriz[x][y] = "0";
                
                matriz[2][9] = "@";
                matriz[x][y] = "0";
                
                matriz[12][3] = "@";
                matriz[x][y] = "0";
                        
            }
            
            
            //termina premios
        }
        }
        
        
        //mirar el mapa
        matriz[n][m]="<";
        System.out.println("\t\t\t\t\t\t\tPuntaje: " + puntaje);
        for(x=0;x<15;x++){
        for(y=0;y<15;y++){
            System.out.print(matriz[x][y]+" ");
        }
        System.out.println();
        }
       while(true){   
       System.out.println("\nIngresar un movimiento: ");
       mover = scanner.next().charAt(0);
       
       if(mover=='s'){
          n++;
          
          if(n>0){
          matriz[n-1][m]=" ";
            }
       }
       
       if(mover=='w'){
          n--;
          
          if(n>0){
          matriz[n+1][m]=" ";
            }
       }
       
       
       if(mover=='a'){
          m--;
          
          if(n>0){
          matriz[n][m+1]=" ";
            }
       }
       
       if(mover=='d'){
          m++;
          
          if(n>0){
          matriz[n][m-1]=" ";
            }
       }
       
       if(matriz[n][m]=="@"){
           
           for(int i=0;i<20;i++)
           {
           System.out.println();
           }
           System.out.println("\nFin");
           break;
       }
       
       if(matriz[n][m]=="|"){
           
           for(int i=0;i<20;i++)
           {
           System.out.println();
           }
           System.out.println("\nSe acabo");
           break;
       }
       
       if(matriz[n][m]=="X"){
           
           for(int i=0;i<20;i++)
           {
           System.out.println();
           }
           System.out.println("\nSe acabo");
           System.out.println("\t\t\t\t\t\t\tPuntaje: " + puntaje);
           break;
       }
       
       
       if(matriz[n][m]=="0"){
       
           puntaje+=1;
       }
       for(int i=0;i<20;i++)
           {
           System.out.println();
           }
      
       matriz[n][m]="<";
       System.out.println("\t\t\t\t\t\t\tPuntaje: " + puntaje);
        for(x=0;x<15;x++){
        for(y=0;y<15;y++){
            System.out.print(matriz[x][y]+" ");
        }
        System.out.println();
        }
       
       } 
       
       
       
    
    }
}
