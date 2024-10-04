import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;
import java.util.Arrays;
import java.util.List;

public class Tests {

    String[] countries;
    String[] totalWasteKgPerCapitaPerYear;
    String[] householdEstimatesKgPerCapitaPerYear;
    String[] householdEstimateTonnesPerYear;
    String[] retailEstimateKgPerCapitaPerYear;
    String[] retailEstimateTonnesPerYear;
    String[] foodServiceEstimateKgPerCapitaPerYear;
    String[] foodServiceEstimateTonnesPerYear;
    String[] confidence;
    String[] region;
    String[] year;
    String[] percentageShareInPoverty;

    @Before
    public void setUp()
    {
        CSVReader.populateArrays();

        CSVReader.populateArrays();

        countries = CSVReader.countries.toArray(new String[CSVReader.countries.size()]);
        totalWasteKgPerCapitaPerYear = CSVReader.totalWasteKgPerCapitaPerYear.toArray(new String[CSVReader.totalWasteKgPerCapitaPerYear.size()]);
        householdEstimatesKgPerCapitaPerYear = CSVReader.householdEstimatesKgPerCapitaPerYear.toArray(new String[CSVReader.householdEstimatesKgPerCapitaPerYear.size()]);
        householdEstimateTonnesPerYear = CSVReader.householdEstimateTonnesPerYear.toArray(new String[CSVReader.householdEstimateTonnesPerYear.size()]);
        retailEstimateKgPerCapitaPerYear = CSVReader.retailEstimateKgPerCapitaPerYear.toArray(new String[CSVReader.retailEstimateKgPerCapitaPerYear.size()]);
        retailEstimateTonnesPerYear = CSVReader.retailEstimateTonnesPerYear.toArray(new String[CSVReader.retailEstimateTonnesPerYear.size()]);
        foodServiceEstimateKgPerCapitaPerYear = CSVReader.foodServiceEstimateKgPerCapitaPerYear.toArray(new String[CSVReader.foodServiceEstimateKgPerCapitaPerYear.size()]);
        foodServiceEstimateTonnesPerYear = CSVReader.foodServiceEstimateTonnesPerYear.toArray(new String[CSVReader.foodServiceEstimateTonnesPerYear.size()]);
        confidence = CSVReader.confidence.toArray(new String[CSVReader.confidence.size()]);
        region = CSVReader.region.toArray(new String[CSVReader.region.size()]);
        year = CSVReader.year.toArray(new String[CSVReader.year.size()]);
        percentageShareInPoverty = CSVReader.percentageShareInPoverty.toArray(new String[CSVReader.percentageShareInPoverty.size()]);
    }

    /**************************************************************************************************************
     * Testing for the averages
     **************************************************************************************************************/

    @Test
    public void meanTotalWasteKgPerCapitaPerYear()
    {
        assertEquals(129, Main.meanTotalWasteKgPerCapitaPerYear(totalWasteKgPerCapitaPerYear));
    }

    @Test
    public void meanHouseholdEstimatesKgPerCapitaPerYear()
    {
        assertEquals(86, Main.meanHouseholdEstimatesKgPerCapitaPerYear(householdEstimatesKgPerCapitaPerYear));
    }

    @Test
    public void householdEstimateTonnesPerYear()
    {
        assertEquals(3383046, Main.meanHouseholdEstimateTonnesPerYear(householdEstimateTonnesPerYear));
    }

    @Test
    public void meanRetailEstimateKgPerCapitaPerYear()
    {
        assertEquals(16, Main.meanRetailEstimateKgPerCapitaPerYear(retailEstimateKgPerCapitaPerYear));
    }

    @Test
    public void meanRetailEstimateTonnesPerYear()
    {
        assertEquals(707335, Main.meanRetailEstimateTonnesPerYear(retailEstimateTonnesPerYear));
    }

    @Test
    public void meanFoodServiceEstimateKgPerCapitaPerYear()
    {
        assertEquals(28, Main.meanFoodServiceEstimateKgPerCapitaPerYear(foodServiceEstimateKgPerCapitaPerYear));
    }

    @Test
    public void meanFoodServiceEstimateTonnesPerYear()
    {
        assertEquals(1480947, Main.meanFoodServiceEstimateTonnesPerYear(foodServiceEstimateTonnesPerYear));
    }

    /**************************************************************************************************************
     * Testing for the medians
     **************************************************************************************************************/

    @Test
    public void medianTotalWasteKgPerCapitaPerYear()
    {
        assertEquals(127, Main.medianTotalWasteKgPerCapitaPerYear(totalWasteKgPerCapitaPerYear));
    }

    @Test
    public void medianHouseholdEstimatesKgPerCapitaPerYear()
    {
        assertEquals(84, Main.medianHouseholdEstimatesKgPerCapitaPerYear(householdEstimatesKgPerCapitaPerYear));
    }

    @Test
    public void medianHouseholdEstimateTonnesPerYear()
    {
        assertEquals(830017, Main.medianHouseholdEstimateTonnesPerYear(householdEstimateTonnesPerYear));
    }

    @Test
    public void medianRetailEstimateKgPerCapitaPerYear()
    {
        assertEquals(16, Main.medianRetailEstimateKgPerCapitaPerYear(retailEstimateKgPerCapitaPerYear));
    }

    @Test
    public void medianRetailEstimateTonnesPerYear()
    {
        assertEquals(137260, Main.medianRetailEstimateTonnesPerYear(retailEstimateTonnesPerYear));
    }

    @Test
    public void medianFoodServiceEstimateKgPerCapitaPerYear()
    {
        assertEquals(28, Main.medianFoodServiceEstimateKgPerCapitaPerYear(foodServiceEstimateKgPerCapitaPerYear));
    }

    @Test
    public void medianFoodServiceEstimateTonnesPerYear()
    {
        assertEquals(261488, Main.medianFoodServiceEstimateTonnesPerYear(foodServiceEstimateTonnesPerYear));
    }

    /**************************************************************************************************************
     * Testing for the minimums
     **************************************************************************************************************/

    @Test
    public void minTotalWasteKgPerCapitaPerYear()
    {
        assertEquals(61, Main.minTotalWasteKgPerCapitaPerYear(totalWasteKgPerCapitaPerYear));
    }

    @Test
    public void minHouseholdEstimatesKgPerCapitaPerYear()
    {
        assertEquals(34, Main.minHouseholdEstimatesKgPerCapitaPerYear(householdEstimatesKgPerCapitaPerYear));
    }

    @Test
    public void minHouseholdEstimateTonnesPerYear()
    {
        assertEquals(850, Main.minHouseholdEstimateTonnesPerYear(householdEstimateTonnesPerYear));
    }

    @Test
    public void minRetailEstimateKgPerCapitaPerYear()
    {
        assertEquals(4, Main.minRetailEstimateKgPerCapitaPerYear(retailEstimateKgPerCapitaPerYear));
    }

    @Test
    public void minRetailEstimateTonnesPerYear()
    {
        assertEquals(138, Main.minRetailEstimateTonnesPerYear(retailEstimateTonnesPerYear));
    }

    @Test
    public void minFoodServiceEstimateKgPerCapitaPerYear()
    {
        assertEquals(3, Main.minFoodServiceEstimateKgPerCapitaPerYear(foodServiceEstimateKgPerCapitaPerYear));
    }

    @Test
    public void minFoodServiceEstimateTonnesPerYear()
    {
        assertEquals(276, Main.minFoodServiceEstimateTonnesPerYear(foodServiceEstimateTonnesPerYear));
    }

    /**************************************************************************************************************
     * Testing for the minimums
     **************************************************************************************************************/

    @Test
    public void maxTotalWasteKgPerCapitaPerYear()
    {
        assertEquals(260, Main.maxTotalWasteKgPerCapitaPerYear(totalWasteKgPerCapitaPerYear));
    }

    @Test
    public void maxHouseholdEstimatesKgPerCapitaPerYear()
    {
        assertEquals(189, Main.maxHouseholdEstimatesKgPerCapitaPerYear(householdEstimatesKgPerCapitaPerYear));
    }

    @Test
    public void maxHouseholdEstimateTonnesPerYear()
    {
        assertEquals(91646213, Main.maxHouseholdEstimateTonnesPerYear(householdEstimateTonnesPerYear));
    }

    @Test
    public void maxRetailEstimateKgPerCapitaPerYear()
    {
        assertEquals(79, Main.maxRetailEstimateKgPerCapitaPerYear(retailEstimateKgPerCapitaPerYear));
    }

    @Test
    public void maxRetailEstimateTonnesPerYear()
    {
        assertEquals(22424705, Main.maxRetailEstimateTonnesPerYear(retailEstimateTonnesPerYear));
    }

    @Test
    public void maxFoodServiceEstimateKgPerCapitaPerYear()
    {
        assertEquals(90, Main.maxFoodServiceEstimateKgPerCapitaPerYear(foodServiceEstimateKgPerCapitaPerYear));
    }

    @Test
    public void maxFoodServiceEstimateTonnesPerYear()
    {
        assertEquals(65377741, Main.maxFoodServiceEstimateTonnesPerYear(foodServiceEstimateTonnesPerYear));
    }

    /**************************************************************************************************************
     * Misc Tests
     **************************************************************************************************************/

    public void getCountryTotalWastePerYear()
    {
        assertEquals(127, Main.getCountryTotalWastePerYear("Albania", countries, totalWasteKgPerCapitaPerYear));
        assertEquals(97, Main.getCountryTotalWastePerYear("Belize", countries, totalWasteKgPerCapitaPerYear));
        assertEquals(139, Main.getCountryTotalWastePerYear("United States of America", countries, totalWasteKgPerCapitaPerYear));
    }

    public void getCountriesWithHighestPovertyPercentage()
    {
        List<String> countries = Arrays.asList(Main.getCountriesWithHighestPovertyPercentage(countries, percentageShareInPoverty));
        assertTrue(countries.contains("Guinea-Bissau"));
        assertTrue(countries.contains("Madagascar"));
        assertTrue(countries.contains("Mali"));
        assertTrue(countries.contains("Somalia"));
        assertEquals(4, countries.size());
    }

    public void getCountriesWithHighConfidence()
    {
        List<String> countries = Arrays.asList(Main.getCountriesWithHighConfidence(countries, confidence));
        assertTrue(countries.contains("Australia"));
        assertTrue(countries.contains("Austria"));
        assertTrue(countries.contains("Denmark"));
        assertTrue(countries.contains("Germany"));
        assertTrue(countries.contains("Italy"));
        assertTrue(countries.contains("Sweden"));
        assertTrue(countries.contains("United Kingdom"));
        assertTrue(countries.contains("United States of America"));

        assertEquals(8, countries.size());
    }

    public void getCountryWithMostWastePerCapita()
    {
        assertEquals("Malaysia", Main.getCountryWithMostWastePerCapita(countries, totalWasteKgPerCapitaPerYear));
    }
}
