# Meeting-Rooms-II
You are given an array of intervals representing meeting times where each interval is represented as [start, end]. Your task is to find the minimum number of meeting rooms required to accommodate all the meetings.
Explanation:
Sorting:

Sort intervals by their start times to process meetings in chronological order.
Priority Queue:

Use a Min-Heap to track the earliest ending meeting. The heap stores the end times of meetings currently in progress.
For each meeting, check if it can reuse an existing room (i.e., if its start time is after or equal to the earliest end time).
Output:

The size of the heap at the end gives the number of rooms required.

Complexity:
Time Complexity: 
𝑂(𝑛log𝑛)O(nlogn) for sorting + 𝑂(𝑛log𝑘)
O(nlogk) for heap operations, where 𝑘
k is the maximum number of concurrent meetings. Thus, overall 
𝑂(𝑛log⁡𝑛)O(nlogn).
Space Complexity: 
𝑂(𝑘)O(k), where 𝑘
k is the maximum number of meeting rooms required.
