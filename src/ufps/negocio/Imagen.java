/*
  Clase Imagen
 */
 
package ufps.negocio;

import java.awt.Color;
import ufps.util.Secuencia;
import ufps.util.ExceptionUFPS;
/**
 *
 * @author FERNEY JARAMILLO VEGA-1150671
 * @author VALERIA GABRIELA SALAZAR-1150674
 */
 
 /**
  * La clase Imagen tiene un atributo Secuencia de tipo FilaColor
  */
  
public class Imagen {
 Secuencia <FilaColor> filaColores ;
  
 /**
  * Constructor vacio de la clase Imagen
  * 
  */
 public Imagen() {
    }
    
    /**
     * Constructor de la clase Imagen parametrizado
     * @param n : Numero de filas que tendra la secuencia.
     * @param m: numero de Columnas utilizada para crear una secuencia de Filacolor.
     */
    public Imagen (int n , int m) throws ExceptionUFPS {
    
        
     if (n<3||n>50||m>50||m<3|| n ==0 || m==0 ||m<3){
        
        throw new ExceptionUFPS("error no se puede crear , digite numeros validos  entre 3 y 50");
        
        }
       
        filaColores = new Secuencia <FilaColor> (n) ;
        
     for (int i = 0 ; i <filaColores.length(); i ++){
        
         filaColores.set(i, new FilaColor(m));
      
       }
        
    }
    /**
     * Método que  permite crear el marco a la Imagen
     * 
     */
    public void crearMarco (){
   
        int ultimo = filaColores.get(0).getPixeles().length()-1;
       
    
    for ( int i = 0 ; i<filaColores.length();i++){
       
            
            
        if (i==0  || i == filaColores.length()-1 ){
            
            for ( int j= 0 ; j<filaColores.get(i).getPixeles().length();j++){
            
                this.filaColores.get(i).getPixeles().get(j).cambiarANegro();
                 
            }
        }
        else {
       
            this.filaColores.get(i).getPixeles().get(0).cambiarANegro();
        
        this.filaColores.get(i).getPixeles().get(ultimo).cambiarANegro();
      
        
                }
        
        }
        
    
    }
    
    /**
     * Método que permite realizar cambio de filas (la primera con la última, la siguiente con la penúltima y asi sucesivamente)
     */ 
    public void flipHorizontal(){
        
        int i=0;
        
        int j=filaColores.length()-1;
        
        for (; i<filaColores.length()/2;i++,j--){
            
         FilaColor aux= filaColores.get(i);
         filaColores.set(i, filaColores.get(j));
         filaColores.set(j, aux);
             
         }   
        }
        
    
   /**
    * Metodo que permite cambiar a su gamma de grises un color.
    * @param tipoColorRGB : color al cual deseamos convertir a su escala de grises.
    */
    public void invertirGama (String tipoColorRGB){
    
      
       for (int i = 0 ; i<filaColores.length();i++){
        
          for (int j = 0 ; j<filaColores.length();j++){
            
               
             boolean c =filaColores.get(i).getPixeles().get(j).isGamma(tipoColorRGB);
         if (c )
         {
                 filaColores.get(i).getPixeles().get(j).pintarEnGris();
         }
         
             }
      }
      }
    /**
     * Metodo que permite detectar si un color es de una gamma en especifico (Roja,Verde,Azul) 
     * y si hay mas de dos colores de la misma gamma seguidos en la secuencia se cambian a blanco.
     * @param tipoColorRGB: color al que deseamos buscarle un patron.
     */
     
     public void detectarPatron (String tipoColorRGB) {
         
//         if (!(tipoColorRGB.equalsIgnoreCase("rojo"))||!(tipoColorRGB.equalsIgnoreCase("Azul"))||!(tipoColorRGB.equalsIgnoreCase("verde"))){
//         throw new ExceptionUFPS("Solo se puede detectar los colores Azul , verde , rojo");
//         }
         int cont =1 ;
           for (int i = 0 ; i<filaColores.length();i++){
           
               int indice = i ;
              for (int j = 0 ; j<filaColores.length();j++){
            boolean c =filaColores.get(i).getPixeles().get(j).isGamma(tipoColorRGB);
            if (c){
                
                cont ++;
            }
       
              }
              if ( cont >=2 ){
              
              for (int x =indice ; x <cont + indice-1 ;x ++){
              
              this.getFilaColores1().get(i).getPixeles().get(x).cambiarABlanco();
              
              }
              
              
              }
              else 
                  cont =1 ;
           }
        
     }
   
    /**
     * Método que permite cortar una sección de la Imagen
     * @param fila:pocision de la que se desea comenzar a cortar.
     * @param columna: Columna de la que se desa comenzar a cortar.
     * @param ancho: ancho que se desa recortar.
     * @param alto :numero de pixeles que se desean cortar 
     * 
     */ 
    public void cortar(int fila, int columna, int ancho, int alto){


        
        for (int i = fila; i < ancho + columna; i++) {

            for (int j = fila; j < fila + alto; j++) {

                this.filaColores.get(i).getPixeles().get(j).cambiarABlanco();

            }


        }
    }
    
    /**
     * Método set de la clase  Imagen que realiza el cambio respectivo de variable
     */ 
    public void setFilaColores(Secuencia<FilaColor> val) {

        this.filaColores = val;

    }
    
    /**
     * Método get de la clase Imagen
     * @return: retorna la secuecia de Filacolores actual
     */ 
    public Secuencia<FilaColor> getFilaColores1() {
        return (this.filaColores);

    }
}
