import java.util.*;
class main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int rem,sum=0;
    while(x>0){
        rem=x%10;
        sum=sum+rem;
        x=x/10;
    }
    System.out.println(sum);
}    
}       
