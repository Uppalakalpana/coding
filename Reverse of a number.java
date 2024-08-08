import java.util.*;
class Number {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int rem,sum=0,rev=0;
    while(x>0){
        rem=x%10;
       rev=(rev*10)+rem;
        x=x/10;
    }
    System.out.println(rev);
}    
}       
