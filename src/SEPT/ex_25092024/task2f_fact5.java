package SEPT.ex_25092024;

public class task2f_fact5 {
    //Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
    public static void main(String[] args) {
        int a = 5;
        int t=1;
        for(int i=5; i>=1;i--) {
            t = t * i;
        }
            System.out.println(t);


    }
}
