package com.mycompany.lab12;
public class Lab12 {

    public static void main(String[] args) {
        RedLightThread rl=new RedLightThread();
        GreenLightThread g1=new GreenLightThread();
        YellowLightThread y1=new YellowLightThread();

        rl.start();
        g1.start();
        y1.start();
    }
}
