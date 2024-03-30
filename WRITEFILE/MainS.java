package directorycheck;
import java.util.Map;

public class MainS{
	public static void main(String[] args) {
		System.out.println("Question2");
        String filePath = "D:\\country,capital.csv"; 
        Map<String, String> countryCapitalMap = CountryMap.loadCsvFileToMap(filePath);
       for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println("Country: " + entry.getKey() + "->"+ "Capital: " + entry.getValue());
        }
    }
}
