package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/starbucks")
     public List<CsvStarbucks> getStarbucks() throws IOException {
        OpenCSVReaderStarbucks requestStarbucks = new OpenCSVReaderStarbucks();
        requestStarbucks.processCsv();
        List<CsvStarbucks> starbucks = requestStarbucks.getStarbucks();
        return starbucks;
    }
}


