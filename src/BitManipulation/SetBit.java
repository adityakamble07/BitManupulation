package BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        int n=10;//1010
        int i=2;//shift position 2 times
        int bitMap=n |1<<i;//1<<i=0100 1010 OR 0100 =1110//14
        System.out.println(bitMap);

    }
}
