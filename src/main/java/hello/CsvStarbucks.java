package hello;

import com.opencsv.bean.CsvBindByName;

public class CsvStarbucks{
    @CsvBindByName(column = "latitude", required = true)
    private String latitude;

    @CsvBindByName(column = "longitude", required = true)
    private String longitude;

    @CsvBindByName(column = "name")
    private String name;

    @CsvBindByName
    private String address;


    public String getlatitude() { return latitude; }

    public void setLatitude(String latitude) { this.latitude = latitude; }


    public String getLongitude() { return longitude; }

    public void setLongitude(String longitude) { this.longitude = longitude; }


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }


    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }


    @Override
    public String toString() {
        return "CsvStarbucks{" +
                "latitude='" + latitude + '\'' +
                "longitude='" + longitude + '\'' +
                "name='" + name + '\'' +
                "address='" + address + '\'' +
                '}';
    }
}
