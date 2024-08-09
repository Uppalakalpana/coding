class Hello {
    public static void main(String[] args) {
        int n1=103,n2=102;
        while(n1!=n2){
            if(n1>n2)
            n1=n1-n2;
            else
            n2=n2-n1;
        }
        System.out.print(n2);
    }
}
