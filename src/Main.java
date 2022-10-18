import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Unijeti n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%sumaCifara(i)==0)
                System.out.println(i);
        }
    }
    public static int sumaCifara(int n){
        int suma=0;
        while(n!=0){
            suma=suma+(n%10);
            n=n/10;
        }
        return suma;
    }
}