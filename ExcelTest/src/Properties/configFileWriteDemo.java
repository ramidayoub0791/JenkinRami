package Properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class configFileWriteDemo {
    public static void main(String[] args) throws IOException {
        String path="Files/test.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("name","Rami");
        properties.store(fileOutputStream,"new name has been added");


    }
}
