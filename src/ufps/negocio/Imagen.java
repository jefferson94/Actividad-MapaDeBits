/*
  Clase Imagen
 */
 
package ufps.negocio;

import ufps.util.Secuencia;

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
     */
    public Imagen (int n , int m){
    
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
        int j=filaColores.get(i).getPixeles().length()-1;
        for (; i<filaColores.length()/2;i++,j--){
             FilaColor aux= filaColores.get(i);
         filaColores.set(i, filaColores.get(j));
         filaColores.set(j, aux);
             
         }   
        }
        
    
    /**
     * 
     */ 
    public void invertirGama (String tipoColorRGB){
    
        for (int i = 0 ; i<filaColores.length();i++){
        
          for (int j = 0 ; j<filaColores.length();j++){
          
          filaColores.get(i).getPixeles().get(j).pintarEnGris();
          }
        
        }
        
        
    
    }
     public void detectarPatron (String tipoColorRGB){
         
         
         
    
    }
    
    /**
     * Método que permite cortar una sección de la Imagen
     * 
     */ 
    public void cortar(int fila, int columna, int ancho, int alto) {


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
     */ 
    public Secuencia<FilaColor> getFilaColores1() {
        return (this.filaColores);

    }
}
