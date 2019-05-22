package hello;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OpenCSVReaderStarbucks{
    private static final String SAMPLE_CSV_fILE_PATH = "csv/starbucks.csv";


    public static void main(String[] args) throws IOException {
        List<CsvStarbucks> starbucks = new ArrayList<>();
        try(
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_fILE_PATH));

            //    CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build()

        ) {
            CsvToBean<CsvStarbucks> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(CsvStarbucks.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            Iterator<CsvStarbucks> csvStarbucksIterator = csvToBean.iterator();

            while(csvStarbucksIterator.hasNext()) {
            CsvStarbucks csvStarbucks = csvStarbucksIterator.next();
            starbucks.add(csvStarbucks);
            }
        } catch (Exception e) {
            System.err.println("Ooops something went wrong!");
            System.err.println("What happened?");
            e.printStackTrace();
        }

        System.out.println("----- Starbucks -----");
        for (CsvStarbucks starbuck : starbucks) {
            System.out.println(starbuck);
        }

    }
}
// Reading Records One by One in a String array
//            String[] nextRecord;
//            while ((nextRecord = csvReader.readNext()) != null) {
//                System.out.println("latitude : " + nextRecord[0]);
//                System.out.println("longitude : " + nextRecord[1]);
//                System.out.println("name : " + nextRecord[2]);
//                System.out.println("address : " + nextRecord[3]);
//              //  System.out.println("country : " + nextRecord[4]);
//                System.out.println("==========================");