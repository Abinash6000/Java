import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class revision22 {
   public static void main(String args[]) {
    int n = 4;
    int pos = 2;
    int bitMask = 1<<pos;
    int notBitMask = ~bitMask;
    int clearedThirdBit = n&notBitMask;
    System.out.println(clearedThirdBit);
   }
}
