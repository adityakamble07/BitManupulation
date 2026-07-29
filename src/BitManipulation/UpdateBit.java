package BitManipulation;

public class UpdateBit {
    public static void main(String[] args) {
        int n=10;//1010
        int i=2;//0100
        int bitMask=1<<i;
        int notbitMask=~bitMask;
        int value=1;
        if(value==0){
            System.out.println(n & notbitMask);
        }else{
            System.out.println(n | bitMask);
        }
    }
}
