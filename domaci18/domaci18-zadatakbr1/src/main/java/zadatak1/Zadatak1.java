package zadatak1;

import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Zadatak1 {

    public static void main(String[] args) throws IOException {
        try {

            File file = new File("brojevi.xlsx");

            FileInputStream ulazniTokDatoteke = new FileInputStream(file);

            XSSFWorkbook workbook = new XSSFWorkbook(ulazniTokDatoteke);
            XSSFSheet sheet = workbook.getSheetAt(0);

            int brojRedova = sheet.getPhysicalNumberOfRows();
            int brojCelija = sheet.getRow(0).getPhysicalNumberOfCells();

            for (int i = 0; i < brojRedova; i++) {
                XSSFRow row = sheet.getRow(i);

                double sumOfRow = 0;
                double avgOfrow = 0;
                for (int j = 0; j < brojCelija; j++) {
                    XSSFCell cell = row.getCell(j);
                    double cellValue = sheet.getRow(i).getCell(j).getNumericCellValue();
                    sumOfRow += cellValue;
                    System.out.print(cellValue + " ");
                }
                avgOfrow = sumOfRow / brojCelija;

                System.out.println();
                System.out.println("---------------------------");
                System.out.println("Suma je: " + sumOfRow);
                System.out.println("Broj celija je: " + brojCelija);
                System.out.println("Prosek je: " + avgOfrow);
                System.out.println("---------------------------");


                XSSFCell avg = row.createCell(5);
                XSSFCell provera = row.createCell(6);
                avg.setCellValue(avgOfrow);


                FileOutputStream izlazniPodaci = new FileOutputStream(file);
                workbook.write(izlazniPodaci);

                workbook.close();
                ulazniTokDatoteke.close();

            }
        } catch (IOException exception) {
            System.out.println("Kraj programa.");
        }



    }

}
