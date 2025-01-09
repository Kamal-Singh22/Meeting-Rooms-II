import java.util.*;

public class MeetingRoomsII {
    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        // Sort the intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Use a priority queue to keep track of end times
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add the first meeting's end time
        minHeap.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            // If the current meeting starts after the earliest ending meeting
            if (intervals[i][0] >= minHeap.peek()) {
                minHeap.poll(); // Remove the earliest ending meeting
            }
            // Add the current meeting's end time
            minHeap.add(intervals[i][1]);
        }

        // The size of the heap is the number of meeting rooms required
        return minHeap.size();
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {0, 30},
            {5, 10},
            {15, 20}
        };

        System.out.println("Minimum Meeting Rooms Required: " + minMeetingRooms(intervals));
    }
}
