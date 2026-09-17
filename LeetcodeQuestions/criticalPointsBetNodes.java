package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class criticalPointsBetNodes {

class Solution {

    public int[] nodesBetweenCriticalPoints(ListNode head) {

        // If the linked list is empty, there cannot be any critical points
        if (head == null) {
            return new int[] { -1, -1 };
        }

        ListNode prev = head;
        ListNode curr = head.next;
        int i = 1;

        // Store the indexes of all critical points
        List<Integer> criticalPoints = new ArrayList<>();

        // We need curr.next because a critical point must have
        // both a previous node and a next node
        while (curr != null && curr.next != null) {

            // Check if curr is a local maximum
            // Example: 1 -> 5 -> 2
            //             ↑
            //         critical point
            if (curr.val > prev.val && curr.val > curr.next.val) {
                criticalPoints.add(i);
            }

            // Check if curr is a local minimum
            // Example: 5 -> 1 -> 3
            //             ↑
            //         critical point
            if (curr.val < prev.val && curr.val < curr.next.val) {
                criticalPoints.add(i);
            }

            // Move both pointers one step forward
            curr = curr.next;
            prev = prev.next;

            // Move to the next index
            i += 1;
        }

        // At least two critical points are required
        // to calculate a distance
        if (criticalPoints.size() < 2) {
            return new int[] { -1, -1 };
        }

        // Start with the largest possible integer
        int minDist = Integer.MAX_VALUE;

        // Find the minimum distance between consecutive critical points
        for (int j = 1; j < criticalPoints.size(); j++) {

            int distance = criticalPoints.get(j) - criticalPoints.get(j - 1);

            minDist = Math.min(minDist, distance);
        }

        // Maximum distance is between the first and last critical points
        int maxDist = criticalPoints.get(criticalPoints.size() - 1) - criticalPoints.get(0);

        // Return [minimum distance, maximum distance]
        return new int[] { minDist, maxDist };
    }
}
}
