package com.day4;

public class JavaProgram5 {
    public static void main(String args[]){
        String names[][] = {
                //0     1       2       3
                {"Peter","Paul","Mary","Billie"}, //0
                {"Anna","Mark","Jean","Janice"},  //1
                {"Brayan","Riley","Jenny","Kaye"} //2
        };

        //displaying value via loop
        int x = 0;
        while(x<3){
            int y = 0;
            while(y < 4){
                System.out.print(names[x][y]);
                System.out.print(" ");
                y++;
            }
            System.out.println();
            x++;
        }
    }
}
