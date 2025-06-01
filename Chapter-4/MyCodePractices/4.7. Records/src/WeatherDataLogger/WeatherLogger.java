package WeatherDataLogger;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.WeakHashMap;

class WeatherLogger {

    private List<WeatherData> records;

    public WeatherLogger() {
        this.records = new ArrayList<>();
    }

    public void logData(double temperature, double humidity, double windSpeed){
        WeatherData data = new WeatherData(temperature, humidity, windSpeed);
        records.add(data);
    }

    public List<WeatherData> queryByTemperatureRange(double minTemp, double maxTemp){
        List<WeatherData> result = new ArrayList<>();
        for (WeatherData data : records){
            if (data.getTemperature() >= minTemp && data.getTemperature() <= maxTemp);
            result.add(data);
        }
    return result;
    }

    public List<WeatherData> queryByDate(Date startDate, Date endDate){
        List<WeatherData> result = new ArrayList<>();
        for (WeatherData data : records) {
            if (!data.getTimestamp().before(startDate) && !data.getTimestamp().after(endDate));
            /***
             * ! (NOT) অপারেটর কী?
             * ✅ ! (NOT) একটি লজিক্যাল অপারেটর, যা কোনো শর্তের মান উল্টে দেয়।
             *
             * যদি কোনো শর্ত true হয়, তাহলে ! সেটিকে false করে দেয়।
             * যদি কোনো শর্ত false হয়, তাহলে ! সেটিকে true করে দেয়।
             */
            result.add(data);
        }
        return result;
    }

}
