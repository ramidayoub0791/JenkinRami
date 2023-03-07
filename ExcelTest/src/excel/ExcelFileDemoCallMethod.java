package excel;

import Utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFileDemoCallMethod {
    public static void main(String[] args) throws IOException {
       List<Map<String,String>>excelData= ExcelReader.read();
        // or :
     //   var excelData= ExcelReader.read();
      //  System.out.println(excelData);
        for (Map<String, String> row:excelData){
         //   System.out.println(row);
            for(Map.Entry<String,String> entry:row.entrySet()){
      // OR :      for (var entry:row.entrySet()){
             //   System.out.println(entry);
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
