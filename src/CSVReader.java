
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVReader {

    //1
    static ArrayList<String> countries = new ArrayList<>();
    static ArrayList<String> combinedFiguresKgPerCapitaPerYear = new ArrayList<>();
    static ArrayList<String> householdEstimatesKgPerCapitaPerYear = new ArrayList<>();
    static ArrayList<String> householdEstimateTonnesPerYear = new ArrayList<>();
    static ArrayList<String> retailEstimateKgPerCapitaPerYear = new ArrayList<>();
    static ArrayList<String> retailEstimateTonnesPerYear = new ArrayList<>();
    static ArrayList<String> foodServiceEstimateKgPerCapitaPerYear = new ArrayList<>();
    static ArrayList<String> foodServiceEstimateTonnesPerYear = new ArrayList<>();
    static ArrayList<String> confidence = new ArrayList<>();

    //11
    static ArrayList<String> region = new ArrayList<>();
    
    //14
    static ArrayList<String> year = new ArrayList<>();
    static ArrayList<String> percentageShareInPoverty = new ArrayList<>();

    public static void populateArrays() {

        File file = new File("src/combined_data.csv");

        int numCols = 16;

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.readLine();
    
            String line;
            while((line = br.readLine()) !=null)
            {
                String[] values = line.split(",");
                for (int i = 0; i < numCols; i++)
                {
                    switch(i)
                    {
                        case 1 -> countries.add(values[i]);
                        case 2 -> combinedFiguresKgPerCapitaPerYear.add(values[i]);
                        case 3 -> householdEstimatesKgPerCapitaPerYear.add(values[i]);
                        case 4 -> householdEstimateTonnesPerYear.add(values[i]);
                        case 5 -> retailEstimateKgPerCapitaPerYear.add(values[i]);
                        case 6 -> retailEstimateTonnesPerYear.add(values[i]);
                        case 7 -> foodServiceEstimateKgPerCapitaPerYear.add(values[i]);
                        case 8 -> foodServiceEstimateTonnesPerYear.add(values[i]);
                        case 9 -> confidence.add(values[i]);
    
                        case 11 -> region.add(values[i]);
    
                        case 14 -> year.add(values[i]);
                        case 15 -> percentageShareInPoverty.add(values[i]);
                        
                        default -> {
                        }
                    }
                }
            }
            br.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
