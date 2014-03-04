/*
 * 
 */
package ufps.negocio;

import ufps.util.Secuencia;
import ufps.negocio.Pixel;
/**
 *
 * @author FERNEY JARAMILLO VEGA-1150671
 * @author VALERIA GABRIELA SALAZAR-1150674
 */
public class FilaColor {

    Secuencia<Pixel> pixeles  ;
    
    
    
    public FilaColor() {
       
   
        //crea los pixeles
    }
    public FilaColor(int filas){

     this.pixeles= new Secuencia<Pixel>(filas);
     
     for(int i =0 ; i<pixeles.length();i++){
     int dato = (int)(Math.random()*200);
     int dato2 = (int)(Math.random()*200);
     int dato3 = (int)(Math.random()*200);
      pixeles.set(i, new Pixel (dato,dato2,dato3));
    
     }

}
    
    public Secuencia<Pixel> getPixeles(){
        return this.pixeles;
   
    }
    
    public void setPixeles (Secuencia<Pixel> val){
         this.pixeles=val;
    }
   
}
