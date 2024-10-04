
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVReader {

    //1
    static ArrayList<String> countries;
    static ArrayList<Integer> totalWasteKgPerCapitaPerYear;
    static ArrayList<Integer> householdEstimatesKgPerCapitaPerYear;
    static ArrayList<Integer> householdEstimateTonnesPerYear;
    static ArrayList<Integer> retailEstimateKgPerCapitaPerYear;
    static ArrayList<Integer> retailEstimateTonnesPerYear;
    static ArrayList<Integer> foodServiceEstimateKgPerCapitaPerYear;
    static ArrayList<Integer> foodServiceEstimateTonnesPerYear;
    static ArrayList<String> confidence;

    //11
    static ArrayList<String> region;
    
    //14
    static ArrayList<String> year;
    static ArrayList<Double> percentageShareInPoverty;

    public static void populateArrays() {

        countries = new ArrayList<>();
        totalWasteKgPerCapitaPerYear = new ArrayList<>();
        householdEstimatesKgPerCapitaPerYear = new ArrayList<>();
        householdEstimateTonnesPerYear = new ArrayList<>();
        retailEstimateKgPerCapitaPerYear = new ArrayList<>();
        retailEstimateTonnesPerYear = new ArrayList<>();
        foodServiceEstimateKgPerCapitaPerYear = new ArrayList<>();
        foodServiceEstimateTonnesPerYear = new ArrayList<>();
        confidence = new ArrayList<>();
        region = new ArrayList<>();
        year = new ArrayList<>();
        percentageShareInPoverty = new ArrayList<>();

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
                        case 2 -> {
                            int value = Integer.parseInt(values[i]);
                            totalWasteKgPerCapitaPerYear.add(value);
                            }
                        case 3 -> {
                            int value = Integer.parseInt(values[i]);
                            householdEstimatesKgPerCapitaPerYear.add(value);
                        }
                        case 4 -> {
                            int value = Integer.parseInt(values[i]);
                            householdEstimateTonnesPerYear.add(value);
                        }
                        case 5 -> {
                            int value = Integer.parseInt(values[i]);
                            retailEstimateKgPerCapitaPerYear.add(value);
                        }
                        case 6 -> {
                            int value = Integer.parseInt(values[i]);
                            retailEstimateTonnesPerYear.add(value);
                        }
                        case 7 -> {
                            int value = Integer.parseInt(values[i]);
                            foodServiceEstimateKgPerCapitaPerYear.add(value);
                        }
                        case 8 -> {
                            int value = Integer.parseInt(values[i]);
                            foodServiceEstimateTonnesPerYear.add(value);
                        }
                        case 9 -> confidence.add(values[i]);
    
                        case 11 -> region.add(values[i]);
    
                        case 14 -> year.add(values[i]);
                        case 15 -> {
                            double value = Double.parseDouble(values[i]);
                            percentageShareInPoverty.add(value);
                        }
                        
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
