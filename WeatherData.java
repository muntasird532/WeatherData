import java.util.ArrayList;

public class WeatherData {

    public WeatherData(ArrayList<Double> temps) {
        temperatures = temps;
    }



    private ArrayList<Double> temperatures;



    public void cleanData(double lower, double upper) {
        for (int i = 0; i < temperatures.size(); i++) {
            double temp = temperatures.get(i);
            if (temp < lower || temp > upper) {
                temperatures.remove(i);
                i--;
            }
        }
    }

    public String toString() {
        return temperatures.toString();
    }


    public int longestHeatWave(double threshold) {
        int heatWave = 0;
        int heaterWave = 0;

        for(double t : temperatures) {
            if(t > threshold) {
                heatWave++;
            }
            if(heatWave > heaterWave) heaterWave = heatWave;
            else heatWave = 0;
        }
        return heaterWave;
    }


}