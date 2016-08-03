import java.util.Random;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


public class Temp {
    /**
     * @param args
     */
    public static void main(String[] args) {
      /*  // 空指针 java.lang.NullPointerException
        Object unknownObject = null;
        if(unknownObject.equals("knownObject")){
            System.err.println("This may result in NullPointerException if unknownObject is null");
         }
        //数组下标越界  ArrayIndexOutOfBoundsException
        int[] a = {1,2,3};
        System.out.println(a[3]);

        //   ArrayIndexOutOfBoundsException
        System.out.println(Integer.parseInt("131!!1"));*/
        Hex hex = new Hex();
        String str = "中文";
        char[] enbytes = null;
        String encodeStr = null;
        byte[] debytes = null;
        String decodeStr = null;

        enbytes = hex.encodeHex(str.getBytes());
        encodeStr = new String(enbytes);
        try {
            debytes = hex.decodeHex(enbytes);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        decodeStr = new String(debytes);

        System.out.println("编码前:" + str);
        System.out.println("编码后:" + encodeStr);
        System.out.println("解码后:" + decodeStr);
    }
    
}
