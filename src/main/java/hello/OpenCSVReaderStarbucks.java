package hello;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OpenCSVReaderStarbucks{
    private static final String SAMPLE_CSV_fILE_PATH = "csv/starbucks.csv";


    public static void main(String[] args) throws IOException {
        try(
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_fILE_PATH));

                CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build()

        ) {
            // Reading Records One by One in a String array
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("latitude : " + nextRecord[0]);
                System.out.println("longitude : " + nextRecord[1]);
                System.out.println("name : " + nextRecord[2]);
                System.out.println("address : " + nextRecord[3]);
              //  System.out.println("country : " + nextRecord[4]);
                System.out.println("==========================");

            }
        }
    }
}
