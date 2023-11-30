import java.util.Arrays;
public class Platforma {
    public static int findplatform(int[] arrivalTimes, int[] departureTimes) {
        Arrays.sort(arrivalTimes);
        Arrays.sort(departureTimes);
        int numPlatforms = 1;
        int maxPlatforms = 1;
        int i = 1;
        int j = 0;
        while (i < arrivalTimes.length && j < departureTimes.length) {
            if (arrivalTimes[i] <= departureTimes[j]) {
                numPlatforms++;
                i++;
            } else {
                numPlatforms--;
                j++;
            }
            if (numPlatforms > maxPlatforms) {
                maxPlatforms = numPlatforms;
            }
        }
        return maxPlatforms;
    }
    public static void main(String[] args) {
        int[] arrivalTimes = {900, 1100, 1235}; //{900, 940, 950, 1100, 1500, 1800};
        int[] departureTimes = {1000,1200,1240}; //{910, 1200, 1120, 1130, 1900, 2000}
        int numPlatforms = findplatform(arrivalTimes, departureTimes);
        System.out.println("Platformalar soni: " + numPlatforms);
    }
}
