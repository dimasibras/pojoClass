import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class pojoClass {
    public static void main(String[] args) {
        City[] cityList = new City[5];

        cityList[0] = new City("Banda Aceh", "Aceh");
        cityList[1] = new City("Bekasi", "West Java");
        cityList[2] = new City("South Jakarta", "DKI Jakarta");
        cityList[3] = new City("Denpasar", "Bali");
        cityList[4] = new City("Samarinda", "East Kalimantan");

        try {
            String message = "";
            File file = new File("ListCity.txt");
            FileOutputStream fos = new FileOutputStream(file);
            for (City city : cityList) {
                message = message  + city.getCity_name() + " is the city of Capital " + city.getCapital() + "\n";
            }
            fos.write(message .getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
