public class Main {

    public static void main(String[] args) {
        CSVReader.populateArrays();

        String[] countries = CSVReader.countries.toArray(new String[CSVReader.countries.size()]);
        String[] combinedFiguresKgPerCapitaPerYear = CSVReader.combinedFiguresKgPerCapitaPerYear.toArray(new String[CSVReader.combinedFiguresKgPerCapitaPerYear.size()]);
        String[] householdEstimatesKgPerCapitaPerYear = CSVReader.householdEstimatesKgPerCapitaPerYear.toArray(new String[CSVReader.householdEstimatesKgPerCapitaPerYear.size()]);
        String[] householdEstimateTonnesPerYear = CSVReader.householdEstimateTonnesPerYear.toArray(new String[CSVReader.householdEstimateTonnesPerYear.size()]);
        String[] retailEstimateKgPerCapitaPerYear = CSVReader.retailEstimateKgPerCapitaPerYear.toArray(new String[CSVReader.retailEstimateKgPerCapitaPerYear.size()]);
        String[] retailEstimateTonnesPerYear = CSVReader.retailEstimateTonnesPerYear.toArray(new String[CSVReader.retailEstimateTonnesPerYear.size()]);
        String[] foodServiceEstimateKgPerCapitaPerYear = CSVReader.foodServiceEstimateKgPerCapitaPerYear.toArray(new String[CSVReader.foodServiceEstimateKgPerCapitaPerYear.size()]);
        String[] foodServiceEstimateTonnesPerYear = CSVReader.foodServiceEstimateTonnesPerYear.toArray(new String[CSVReader.foodServiceEstimateTonnesPerYear.size()]);
        String[] confidence = CSVReader.confidence.toArray(new String[CSVReader.confidence.size()]);
        String[] region = CSVReader.region.toArray(new String[CSVReader.region.size()]);
        String[] year = CSVReader.year.toArray(new String[CSVReader.year.size()]);
        String[] percentageShareInPoverty = CSVReader.percentageShareInPoverty.toArray(new String[CSVReader.percentageShareInPoverty.size()]);
    }
}
