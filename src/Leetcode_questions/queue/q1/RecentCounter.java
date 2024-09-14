package Leetcode_questions.queue.q1;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> requests;

    public RecentCounter() {
        // Initialize an empty queue to store the request timestamps.
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        // Add the new request timestamp to the queue.
        requests.add(t);

        // Remove requests that are older than t - 3000.
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }

        // Return the number of requests in the queue, which are within the last 3000 milliseconds.
        return requests.size();
    }

    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));    // Output: 1
        System.out.println(recentCounter.ping(100));  // Output: 2
        System.out.println(recentCounter.ping(3001)); // Output: 3
        System.out.println(recentCounter.ping(3002)); // Output: 3
    }
}
