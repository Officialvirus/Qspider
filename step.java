import java.util.Scanner;

public class step {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int y= s.nextInt();
        int z= s.nextInt();   
        if((x*x+y*y)==z*z){
            System.out.println("true");
        }    
        else{
            System.out.println("false");
        }
    }
}
