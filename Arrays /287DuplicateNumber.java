class Solution {
    public int findDuplicate(int[] nums) {
        //since it is given that we have n+1 number of elements and they lie in [1,n]
        //so there will be some case where they both meet each other 
        //this technique is called the Floyd's hare and tortoise method
        int slow = nums[0];
        int fast = nums[0];

        // Move slow and fast pointers until they meet
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Reset slow to the start and move both pointers until they meet again
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow; // Return the duplicate number
    }
}
