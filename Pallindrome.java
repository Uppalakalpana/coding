class pallindrome {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n=131;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(n==sum){
        System.out.print("pallindrome");
        }
        else
         System.out.print(" Not a pallindrome");
        
    }
}
