package com.mycompany.lab12;
public class YellowLightThread {
    public void run(){
        while(true) {
            try {
                System.out.println("Yellow Light");
                Thread.sleep(2000);
            }

            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
