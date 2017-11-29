/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9;

/**
 *
 * @author shols
 */
public class Ex9BConverter {
    //Distance
    public Double mi2km(Double valueFrom){
        return (valueFrom / 0.62137);
    }
    
    public Double km2mi(Double valueFrom){
        return (valueFrom * 0.62137);
    }
    
    public Double y2m(Double valueFrom){
        return (valueFrom * 0.9144);
    }
    
    public Double m2y(Double valueFrom){
        return (valueFrom / 0.9144);
    }
    
    public Double mi2y(Double valueFrom){
        return (valueFrom * 1760.00);
    }
    
    public Double mi2m(Double valueFrom){
        return (valueFrom * 1609.34);
    }
    
    public Double km2m(Double valueFrom){
        return (valueFrom * 1000.00);
    }
    
    public Double km2y(Double valueFrom){
        return (valueFrom * 1093.61);
    }
    
    public Double y2mi(Double valueFrom){
        return (valueFrom / 1760);
    }
    
    public Double y2km(Double valueFrom){
        return (valueFrom / 1093.61);
    }
    
    public Double m2km(Double valueFrom){
        return (valueFrom / 1000.00);
    }
    
    public Double m2mi(Double valueFrom){
        return (valueFrom / 1609.34);
    }
    
    //Area
    public Double a2sqm(Double valueFrom){
        return (valueFrom * 4046.856);
    }
    
    public Double sqm2a(Double valueFrom){
        return (valueFrom / 4046.856);
    }
    
    public Double sqft2sqdm(Double valueFrom){
        return (valueFrom * 9.2903);
    }
    
    public Double sqdm2sqft(Double valueFrom){
        return (valueFrom / 9.2903);
    }
    
    public Double a2sqft(Double valueFrom){
        return (valueFrom * 43560.00);
    }
    
    public Double a2sqdm(Double valueFrom){
        return (valueFrom * 404686.00);
    }
    
    public Double sqm2sqft(Double valueFrom){
        return (valueFrom * 10.7639);
    }
    
    public Double sqm2sqdm(Double valueFrom){
        return (valueFrom * 100.00);
    }
    
    public Double sqft2a(Double valueFrom){
        return (valueFrom / 43560.00);
    }
    
    public Double sqft2sqm(Double valueFrom){
        return (valueFrom / 10.7639);
    }
    
    public Double sqdm2sqm(Double valueFrom){
        return (valueFrom / 100.00);
    }
    
    public Double sqdm2a(Double valueFrom){
        return (valueFrom / 404686.00);
    }
    
    //Volume
    public Double g2l(Double valueFrom){
        return (valueFrom * 3.78541);
    }
    
    public Double l2g(Double valueFrom){
        return (valueFrom / 3.78541);
    }
    
    public Double floz2ml(Double valueFrom){
        return (valueFrom * 29.5735);
    }
    
    public Double ml2floz(Double valueFrom){
        return (valueFrom / 29.5735);
    }
    
    public Double g2floz(Double valueFrom){
        return (valueFrom * 128.00);
    }
    
    public Double g2ml(Double valueFrom){
        return (valueFrom * 3785.41);
    }
    
    public Double l2floz(Double valueFrom){
        return (valueFrom * 33.814);
    }
    
    public Double l2ml(Double valueFrom){
        return (valueFrom * 1000.00);
    }
    
    public Double floz2g(Double valueFrom){
        return (valueFrom / 128.00);
    }
    
    public Double floz2l(Double valueFrom){
        return (valueFrom / 33.814);
    }
    
    public Double ml2g(Double valueFrom){
        return (valueFrom / 3785.41);
    }
    
    public Double ml2l(Double valueFrom){
        return (valueFrom / 1000.00);
    }
    
    //Mass
    
    public Double lb2kg(Double valueFrom){
        return (valueFrom / 2.20462);
    }
    
    public Double lb2g(Double valueFrom){
        return (valueFrom * 453.592);
    }
    
    public Double lb2st(Double valueFrom){
        return (valueFrom / 14.00);
    }
    
    public Double kg2lb(Double valueFrom){
        return (valueFrom * 2.20462);
    }
}
