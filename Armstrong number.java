import java.util.*;
class main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int rem,sum=0,temp;
    temp=x;
    while(x>0){
        rem=x%10;
        sum=sum+(rem*rem*rem);
        x=x/10;
    }
    if(sum==temp)
    System.out.print("armstrong number");
    else
   System.out.print(" Not a armstrong number");
}    
}       
