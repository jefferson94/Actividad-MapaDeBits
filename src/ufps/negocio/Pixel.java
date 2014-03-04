
package ufps.negocio;

import java.awt.Color;

/**
 * @author FERNEY JARAMILLO-1150671
 * @author VALERIA GABRIELA SALAZAR-1150674
 */
public class Pixel {
   
    private Color rgb ;

    public Pixel() {
        
    }
/**
 * ortografiasssss
 * comentar cosntructor vacio
 * 
 * Metodo encargado de crear el objeto pixel.
 *    @param red:cantidad de rojo en un pixel.
 *    @param green:cantidad de verde en un pixel.
 *    @param blue:cantidad de azul en un pixel.
 */
    public Pixel(int red , int green , int blue) {
        
     this.rgb=new Color(red,green,blue);
    
    }
    
    public Color getRgb (){
        
     return this.rgb ;
    }
    
    public void setRgb (Color valor){
    
        this.rgb= valor ;
   
    }
    public void cambiarANegro(){
    this.setRgb(new Color(0, 0, 0));
    
    
    }
      public void cambiarABlanco(){
    this.setRgb(new Color(255, 255, 255));
    
}

      public void pintarEnGris (){
          int color= (this.rgb.getRed()+rgb.getBlue()+rgb.getBlue())/3;
          Color x=new Color(color, color, color);
          this.setRgb(x);
          
      }
}
