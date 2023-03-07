package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileDemoo {
    public static void main(String[] args) throws IOException {
        String path="ExcelSheet/Test.xlsx";
        FileInputStream file=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(file);
        Sheet sheet2=xssfWorkbook.getSheet("Sheet2");

        int noOfRow=sheet2.getPhysicalNumberOfRows();
        for (int i=0;i<noOfRow ;i++){
            Row row=sheet2.getRow(i);

           int noOfCell=row.getPhysicalNumberOfCells();
            for (int j=0;j<noOfCell;j++){
                Cell cell=row.getCell(j);
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }
    }
}
