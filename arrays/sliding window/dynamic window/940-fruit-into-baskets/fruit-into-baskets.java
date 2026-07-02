////brute force/////


import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        int ans = 0;

        for (int left = 0; left < fruits.length; left++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int count = 0;

            for (int right = left; right < fruits.length; right++) {
                map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

                if (map.size() > 2) {
                    break;
                }

                count++;
            }

            ans = Math.max(ans, count);
        }

        return ans;
    }
}

////opimized code/////

class Solution {
    public int totalFruit(int[] fruits) {
        int ans = 0;
        int l = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int r = 0; r < fruits.length; r++) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);

                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }

                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
