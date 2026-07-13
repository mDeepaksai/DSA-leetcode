class Solution {
	public int longestKSubstr(String s, int k) {
		HashMap<Character, Integer> map = new HashMap<>();
		int left = 0;
		int maxlen = 0;
		for (int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			while (map.size()>k) {
				char cleft = s.charAt(left);
				map.put(cleft, map.get(cleft) - 1);
				if (map.get(cleft) == 0) {
					map.remove(cleft);
				}
				left++;
			}
			if (map.size() == k) {
				maxlen = Math.max(maxlen, i - left + 1);
			}
		}
		if (maxlen == 0)
			return - 1;
		return maxlen;
	}
}
