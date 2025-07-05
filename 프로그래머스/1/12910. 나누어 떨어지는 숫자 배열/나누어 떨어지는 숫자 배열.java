class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] filtered = java.util.Arrays.stream(arr)
                .filter(num -> num % divisor == 0)
                .toArray();
        
        if (filtered.length == 0) {
            return new int[]{-1};
        }
        
        java.util.Arrays.sort(filtered);

        return filtered;
    }
}