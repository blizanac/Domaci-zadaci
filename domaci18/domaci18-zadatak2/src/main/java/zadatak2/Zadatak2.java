package zadatak2;

import com.github.javafaker.Faker;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) throws Exception {

        try {

            Faker faker = new Faker();
            ArrayList<String> listaImena = new ArrayList<>();
            File file = new File("imena.xlsx");

            FileInputStream fileInputStream = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFSheet sheet2 = workbook.getSheetAt(1);
            XSSFRow row2 = sheet2.createRow(0);

//ugnjezdena for petlja za prolazak kroz tabelu i uzimanje podataka.

            int brojRedova = sheet.getPhysicalNumberOfRows();
            int brojKolona = sheet.getRow(0).getPhysicalNumberOfCells();

            for (int i = 0; i < brojRedova; i++) {
                XSSFRow row = sheet.getRow(i);

                for (int j = 0; j < brojKolona; j++) {

                    String cellStrting = sheet.getRow(i).getCell(j).getStringCellValue();
                    listaImena.add(cellStrting);
                    listaImena.add(faker.name().firstName());
                }
                System.out.println(listaImena);
            }

// for petlja za prolazak kroz celu listu i upis poda taka iz liste u tabelu.
            for (int h = 0; h < listaImena.size(); h++) {
                sheet2.getRow(0).createCell(h);
                sheet2.getRow(0).getCell(h).setCellValue(listaImena.get(h));
            }

            FileOutputStream outputStream = new FileOutputStream(file);
            workbook.write(outputStream);


        } catch (Exception exception) {
            System.out.println("Kraj programa.");
        }

    }
}
