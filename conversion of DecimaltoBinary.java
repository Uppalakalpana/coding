public class DecimaltoBinary{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        if(n<0){
            n=-n;
        }

        if(n==0){
            System.out.println("Zero");
        }
        else{
            System.out.print("Binary: "+Integer.toBinaryString(n));
        }
    }
}
