package BitManipulation;

public class ClearBit {
    public static void main(String[] args) {
        int n=14;//1110
        int i=2;
        int bitMap=1<<i;//0100
        int notBitMap=~bitMap;//1011
        System.out.println(n & notBitMap);//1110 AND 1011=1010
    }
}
