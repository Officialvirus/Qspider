import java.util.Scanner;

class check_temp{
    public static void main(String[] args) {
        int low_temp=70;
        int uper_temp=80;

        Scanner s = new Scanner(System.in);
       double curr_temp= s.nextInt();

            curr_temp= (curr_temp+(9.0/5))+32;
            System.out.println(curr_temp);

       if(curr_temp>=low_temp && curr_temp<=uper_temp){
        System.out.println("temprature is within the range");
       }
    }
}