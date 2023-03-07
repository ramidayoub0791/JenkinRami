package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        //  String path ="C:\\Users\\ramid\\IdeaProjects\\Alll\\ExcelSheet\\test.xlsx";
        String path = "ExcelSheet/Test.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet= xssfWorkbook.getSheet("Sheet1");
      //  Row row=sheet.getRow(2);
     //   Cell cell=row.getCell(0);
     //   System.out.println(cell);
        int noOfRow=sheet.getPhysicalNumberOfRows();
        for (int i=0;i<noOfRow;i++){
            Row row=sheet.getRow(i);
            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j=0;j<noOfCells;j++){
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }

    }
}
