public class Temp {

    public static void main(String[] args) {
        String[] countries;
        int[] totalWasteKgPerCapitaPerYear;
        int[] householdEstimatesKgPerCapitaPerYear;
        int[] householdEstimateTonnesPerYear;
        int[] retailEstimateKgPerCapitaPerYear;
        int[] retailEstimateTonnesPerYear;
        int[] foodServiceEstimateKgPerCapitaPerYear;
        int[] foodServiceEstimateTonnesPerYear;
        String[] confidence;
        String[] region;
        String[] year;
        double[] percentageShareInPoverty;


        CSVReader.populateArrays();

        countries = CSVReader.countries.toArray(new String[CSVReader.countries.size()]);
        totalWasteKgPerCapitaPerYear = CSVReader.totalWasteKgPerCapitaPerYear.stream().mapToInt(i -> i).toArray();
        householdEstimatesKgPerCapitaPerYear = CSVReader.householdEstimatesKgPerCapitaPerYear.stream().mapToInt(i -> i).toArray();
        householdEstimateTonnesPerYear = CSVReader.householdEstimateTonnesPerYear.stream().mapToInt(i -> i).toArray();
        retailEstimateKgPerCapitaPerYear = CSVReader.retailEstimateKgPerCapitaPerYear.stream().mapToInt(i -> i).toArray();
        retailEstimateTonnesPerYear = CSVReader.retailEstimateTonnesPerYear.stream().mapToInt(i -> i).toArray();
        foodServiceEstimateKgPerCapitaPerYear = CSVReader.foodServiceEstimateKgPerCapitaPerYear.stream().mapToInt(i -> i).toArray();
        foodServiceEstimateTonnesPerYear = CSVReader.foodServiceEstimateTonnesPerYear.stream().mapToInt(i -> i).toArray();
        confidence = CSVReader.confidence.toArray(new String[CSVReader.confidence.size()]);
        region = CSVReader.region.toArray(new String[CSVReader.region.size()]);
        year = CSVReader.year.toArray(new String[CSVReader.year.size()]);
        percentageShareInPoverty = CSVReader.percentageShareInPoverty.stream().mapToDouble(i -> i).toArray();

        System.out.println(countries.length);

    }


    
}
