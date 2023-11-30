//import java.util.*;
//class Train {
//    int arrivalTime;
//    int departureTime;
//    public Train(int arrivalTime, int departureTime) {
//        this.arrivalTime = arrivalTime;
//        this.departureTime = departureTime;
//    }
//}
//public class RailwayStation {
//    public static int findMinimumPlatforms(List<Train> trains) {
//        Collections.sort(trains, Comparator.comparingInt(t -> t.arrivalTime));
//
//        int platforms = 1;
//        PriorityQueue<Integer> departureTimes = new PriorityQueue<>();
//        departureTimes.add(trains.get(0).departureTime);
//
//        for (int i = 1; i < trains.size(); i++) {
//            Train currentTrain = trains.get(i);
//            if (currentTrain.arrivalTime >= departureTimes.peek()) {
//                departureTimes.poll();
//            } else {
//                platforms++;
//            }
//            departureTimes.add(currentTrain.departureTime);
//        }
//        return platforms;
//    }
//    public static void main(String[] args) {
//        List<Train> trains = new ArrayList<>();
//        trains.add(new Train(900, 910));
//        trains.add(new Train(940, 1200));
//        trains.add(new Train(950, 1120));
//        trains.add(new Train(1100, 1130));
//        trains.add(new Train(1500, 1900));
//        trains.add(new Train(1800, 2000));
//
//        int minimumPlatforms = findMinimumPlatforms(trains);
//        System.out.println("Kerak bo'ladigan platforma soni " + minimumPlatforms);
//    }
//}