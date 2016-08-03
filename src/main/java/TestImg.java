import javax.imageio.ImageIO; 

import java.awt.image.BufferedImage; 
import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.util.HashMap; 
import java.util.Map; 

/** 
* 图片信息获取测试 
* 
* @author leizhimin 2009-6-30 16:03:05 
*/ 
public class TestImg { 
        /** 
         * 计算图片尺寸大小等信息：w宽、h高、s大小。异常时返回null。 
         * 
         * @param imgpath 图片路径 
         * @return 图片信息map 
         */ 
        public static Map<String, Long> getImgInfo(String imgpath) {
                Map<String, Long> map = new HashMap<String, Long>(3); 
                File imgfile = new File(imgpath); 
                try { 
                        FileInputStream fis = new FileInputStream(imgfile); 
                        BufferedImage buff = ImageIO.read(imgfile); 
                        map.put("w", buff.getWidth() * 1L); 
                        map.put("h", buff.getHeight() * 1L); 
                        map.put("s", imgfile.length()); 
                        fis.close(); 
                } catch (FileNotFoundException e) { 
                        System.err.println("所给的图片文件" + imgfile.getPath() + "不存在！计算图片尺寸大小信息失败！"); 
                        map = null; 
                } catch (IOException e) { 
                        System.err.println("计算图片" + imgfile.getPath() + "尺寸大小信息失败！"); 
                        map = null; 
                } 
                return map; 
        } 


        public static void main(String[] args) throws Exception { 
                String p = "d:\\1.png"; 
                Map<String, Long> m = getImgInfo(p); 
                for (Map.Entry<String, Long> entry : m.entrySet()) { 
                        System.out.println(entry.getKey() + " " + entry.getValue()); 
                } 
        } 
}