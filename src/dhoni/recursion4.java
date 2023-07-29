package dhoni;

public class recursion4{
    public static void main(String[] args) {
        int x=5;
        int n=3;
        int ans=calcPow(x,n);
        System.out.println(ans);
    }

    public static int calcPow(int x,int n){
        if(n==0){
            return 1;

        }if(x==0){
            return 0;
        }
        int xpownm1=calcPow(x,n-1);
        int xpown=x*xpownm1;
        return xpown;
    }

//    public static void main(String[] args) {
//        int x=5,n=3;
//        int ans=calcPow(x,n);
//        System.out.println(ans);
//    }
}
