package BitManipulation;

public class GetBit {
    public static void main(String[] args) {
        int n=5;//0101
        int i=2;
        int bitMask=1<<i;//0001
        if((n & bitMask)==0){//(0101 AND 0001=0100 )==0 //TRUE
            System.out.println("Bit is 0");
        }else{//otherwise 1(Non-Zero)
            System.out.println("Bit is 1");
        }
    }
}
