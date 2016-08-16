package eating_pizza;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Eating_pizza {

    public static void main(String[] args) {
        Scanner input=null;
        try{input=new Scanner(Paths.get("/home/habi/NetBeansProjects/eating_pizza/src/eating_pizza/input.in"));}
        catch(IOException io){System.out.println("io");}
        int t=input.nextInt();
        for(int i=0;i<t;i++){
            int x=input.nextInt();
            double a=Math.pow(((4*x)/1.732),0.5);
            double b=Math.pow(a/1.732, 2);
            System.out.println(Math.PI*b);
        }
                

    }
    
}
