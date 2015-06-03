package org.android.share.utils;
/**
 * 
 * @author DIM
 *@date 2015/06/03
 *@version V1.0
 */
public class ConvertHelper {
   /**
    * byte 数组转换为十六进制的字符串
    * @param b  输入需要转换的byte数组
    * @return 返回十六进制 字符串
    */
    public final static String byte2HexString(byte[] b) {
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7',
                      '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] newChar = new char[b.length * 2];
        for(int i = 0; i < b.length; i++) {
            newChar[2 * i] = hex[(b[i] & 0xf0) >> 4];
            newChar[2 * i + 1] = hex[b[i] & 0xf];
             
            
        }
        return new String(newChar);
    }
/**
 * byte数组转换为十六进制字符串
 * @param b 输入要转换的byte数组
 * @param begin  从byte数组中，第几个开始转换
 * @param count 转换多少个
 * @return 返回十六进制字符串
 */
    public final static String byte2HexString(byte[] b,int begin,int count) {
        if(b==null||begin>=b.length)return null;
        else{
	    	byte[] abyte=new byte[count];
	        System.arraycopy(b,begin, abyte, 0, count);
	        return byte2HexString(b);
        }
    }
  /**
   *十六进制字符串 转换为byte数组 
   * @param hexString  输入十六进制字符串
   * @return 返回byte 数组
   */
    public final static byte[] hexString2ByteArray(String hexString) {
        if(hexString.length() % 2 != 0) {
            //throw new IllegalArgumentException("error");
        	return null;
        }
        char[] chars = hexString.toCharArray();
        byte[] b = new byte[chars.length / 2];
        for(int i = 0; i < b.length; i++) {
        	
            int high = Character.digit(chars[2 * i], 16) << 4;
            int low = Character.digit(chars[2 * i + 1], 16);
            b[i] = (byte)(high | low);
        }
        return b;
    }
    /**
     * 连接byte 数组
     * @param b1  数组1
     * @param b2 数组2
     * @return 返回连接好的 byte数组
     */
    public final static byte[] byteArrayJoin(byte[] b1,byte[] b2){
    	byte[] bRes=new byte[b1.length   +   b2.length];
    	System.arraycopy(b1, 0, bRes, 0, b1.length); 
    	System.arraycopy(b2, 0, bRes, b1.length,b2.length); 
    	return bRes;
    }
    /*
     * 字节数组转int
     * asc（与desc对应）：如果值是false则为小端模式，反之为大端模式
     * */
    public final static int byteArray2Integer(byte[] buf, boolean asc) {
        if (buf == null) {
          throw new IllegalArgumentException("byte array is null!");
        }
        if (buf.length > 4) {
          throw new IllegalArgumentException("byte array size > 4 !");
        }
        int r = 0;
        if (asc)
          for (int i = buf.length - 1; i >= 0; i--) {
            r <<= 8;
            r |= (buf[i] & 0x000000ff);
          }
        else
          for (int i = 0; i < buf.length; i++) {
            r <<= 8;
            r |= (buf[i] & 0x000000ff);
          }
        return r;
      }
    /*
     * byteArray转long
     * */
    public final static long byteArray2Long(byte[] buf, boolean asc) {
      if (buf == null) {
        throw new IllegalArgumentException("byte array is null!");
      }
      if (buf.length > 8) {
        throw new IllegalArgumentException("byte array size > 8 !");
      }
      long r = 0;
      if (asc)
        for (int i = buf.length - 1; i >= 0; i--) {
          r <<= 8;
          r |= (buf[i] & 0x00000000000000ff);
        }
      else
        for (int i = 0; i < buf.length; i++) {
          r <<= 8;
          r |= (buf[i] & 0x00000000000000ff);
        }
      return r;
    }
    /*
     * short转 byteArray
     * */
    public final static byte[] short2ByteArray(short s, boolean asc) {
        byte[] buf = new byte[2];
        if (asc)
          for (int i = buf.length - 1; i >= 0; i--) {
            buf[i] = (byte) (s & 0x00ff);
            s >>= 8;
          }
        else
          for (int i = 0; i < buf.length; i++) {
            buf[i] = (byte) (s & 0x00ff);
            s >>= 8;
          }
        return buf;
      }
      public final static byte[] int2ByteArray(int s, boolean asc) {
        byte[] buf = new byte[4];
        if (asc)
          for (int i = buf.length - 1; i >= 0; i--) {
            buf[i] = (byte) (s & 0x000000ff);
            s >>= 8;
          }
        else
          for (int i = 0; i < buf.length; i++) {
            buf[i] = (byte) (s & 0x000000ff);
            s >>= 8;
          }
        return buf;
      }
      
      /*long转 byteArray
       * */
      public final static byte[] long2ByteArray(long s, boolean asc) {
        byte[] buf = new byte[8];
        if (asc)
          for (int i = buf.length - 1; i >= 0; i--) {
            buf[i] = (byte) (s & 0x00000000000000ff);
            s >>= 8;
          }
        else
          for (int i = 0; i < buf.length; i++) {
            buf[i] = (byte) (s & 0x00000000000000ff);
            s >>= 8;
          }
        return buf;
      }
      /*
       * byteArray转short
       * */
      public final static short byteArray2Short(byte[] buf, boolean asc) {
        if (buf == null) {
          throw new IllegalArgumentException("byte array is null!");
        }
        if (buf.length > 2) {
          throw new IllegalArgumentException("byte array size > 2 !");
        }
        short r = 0;
        if (asc)
          for (int i = buf.length - 1; i >= 0; i--) {
            r <<= 8;
            r |= (buf[i] & 0x00ff);
          }
        else
          for (int i = 0; i < buf.length; i++) {
            r <<= 8;
            r |= (buf[i] & 0x00ff);
          }
        return r;
      }
      
      /**
       * 十六进制字符串 转 二进制字符串
       * @param hexString  输入 十六进制字符串
       * @return 返回二进制字符串
       */
    	public static String hexString2binaryString(String hexString)  
        {  
            if (hexString == null || hexString.length() % 2 != 0)  
                return null;  
            String bString = "", tmp;  
            for (int i = 0; i < hexString.length(); i++)  
            {  
                tmp = "0000"  
                        + Integer.toBinaryString(Integer.parseInt(hexString  
                                .substring(i, i + 1), 16));  
                bString += tmp.substring(tmp.length() - 4);  
            }  
            return bString;  
        }  
}
