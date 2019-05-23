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
    private List<CsvStarbucks> starbucks = new ArrayList<>();

    public List<CsvStarbucks> getStarbucks() {
        return starbucks;
    }
                            ///possibly wrong
    public void processCsv() throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_fILE_PATH));

        CsvToBean<CsvStarbucks> csvToBean = new CsvToBeanBuilder(reader)
                .withType(CsvStarbucks.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        Iterator<CsvStarbucks> csvStarbucksIterator = csvToBean.iterator();

        while(csvStarbucksIterator.hasNext()) {
            CsvStarbucks csvStarbucks = csvStarbucksIterator.next();
            starbucks.add(csvStarbucks);
        }
    }


    public static void main(String[] args) throws IOException {
        List<CsvStarbucks> starbucks = new ArrayList<>();

        // 1. create a new openCsvReaderStarbucks object
        OpenCSVReaderStarbucks starbucksStores = new OpenCSVReaderStarbucks();
        // 2. call s.processCsv
        starbucksStores.processCsv();
        // 3. assign starbucks = s.getStarbucks
        starbucks = starbucksStores.getStarbucks();


        System.out.println("----- Starbucks -----");
        for (CsvStarbucks starbuck : starbucks) {
            System.out.println(starbuck);
        }

    }
}
