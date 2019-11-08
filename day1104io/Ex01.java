package pangu.com.day1104io;

import java.io.*;
import java.util.List;

/**
 * Created on 2019/11/4 6:45 下午
 * : 以文件流的方式把指定文件夹中的图片,mp3读取到指定的文件夹中去
 * @author lgt
 */
public class Ex01 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/edz/desktop/jianli/css");
        File file1 = new File("/Users/edz/desktop/zuoye");
        if (!file1.exists()) { file1.createNewFile();
        }
        InputStream inputStream = null;
        OutputStream outputStream = null;
        String[] arr = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (dir.exists()) {
                    return name.endsWith(".png") || name.endsWith(".mp3");
                }
                return false;
            }
        });
        for (String c : arr) {
            try {
                File file3=new File(file.getAbsolutePath(),c);
                inputStream = new FileInputStream(file3);

                byte[] arr1=new byte[(int)(file3.length())];
                File file4=new File(file1,c);
                if (!file4.exists()) {
                    file4.createNewFile();
                }
                outputStream = new FileOutputStream(file4, true);

                outputStream.write(arr1);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (inputStream != null) {

                        inputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}
