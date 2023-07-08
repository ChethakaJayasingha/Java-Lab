package com.mycompany.lab09;
public class CylindricalContainer extends Container {
    
    private double height;
    private double radius;
    
    public double CylindricalContainer(double h,double r){
      radius =r;
      height = h;
    }
    
    @Override
    public void Volume(){
       return 3.14159*radius*radius*height;
    }
    
    
}
