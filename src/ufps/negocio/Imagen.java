/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.negocio;

import ufps.util.Secuencia;

/**
 *
 * @author FERNEY JARAMILLO VEGA-1150671
 * @author VALERIA GABRIELA SALAZAR-1150674
 */
public class Imagen {
 Secuencia <FilaColor> filaColores ;
  
 
 public Imagen() {
    }
    public Imagen (int n , int m){
    
        filaColores = new Secuencia <FilaColor> (n) ;
        
     for (int i = 0 ; i <filaColores.length(); i ++){
         
         filaColores.set(i, new FilaColor(m));
         
          
        }
     
        
    }
    
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
    
    public void flipHorizontal(){
        int j=filaColores.length()-1;
        for (int i =0; i<filaColores.length()/2;i++,j--){
             FilaColor aux= filaColores.get(i);
         filaColores.set(i, filaColores.get(j));
         filaColores.set(j, aux);
             
         }   
        }
        
    
    
    public void invertirGama (String tipoColorRGB){
    
        for (int i = 0 ; i<filaColores.length();i++){
        
          for (int j = 0 ; i<filaColores.length();j++){
          
          filaColores.get(i).getPixeles().get(j).pintarEnGris();
          }
        
        }
        
        
    
    }
     public void detectarPatron (String tipoColorRGB){
         
         
         
    
    }
     
    public void cortar(int fila, int columna, int ancho, int alto) {


        for (int i = fila; i < ancho + columna; i++) {

            for (int j = fila; j < fila + alto; j++) {

                this.filaColores.get(i).getPixeles().get(j).cambiarABlanco();

            }


        }
    }

    public void setFilaColores(Secuencia<FilaColor> val) {

        this.filaColores = val;

    }

    public Secuencia<FilaColor> getFilaColores1() {
        return (this.filaColores);

    }
}
