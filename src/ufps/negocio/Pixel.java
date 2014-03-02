/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.negocio;

import java.awt.Color;

/**
 *
 * @author FERNEY JARAMILLO
 */
public class Pixel {
    private java.awt.Color rgb ;

    public Pixel() {
        
    }
/**
 * Metodo encargado de crear el objeto pixel.
 * @param red:cantidad de rojo en un pixel.
 * @param green:cantidad de verde en un pixel.
 * @param blue:cantidad de azul en un pixel.
 */
    public Pixel(int red , int green , int blue) {
        
     java.awt.Color p =new java.awt.Color(red,green,blue);
      this.rgb=p;
        
        
    }
    
    public java.awt.Color getRgb (){
        return (null);
   
    }
    
    public java.awt.Color setRgb (java.awt.Color val){
        return null;
  
    }
}
