class Solution {

	public String minWindow(String s, String t) {

		int lenS = s.length();
		int lenT = t.length();

		if (lenS < lenT) {
			return "";
		}

		int t_box[] = new int[256];
		int s_box[] = new int[256];

		for (int i = 0; i < lenT; i++) {
			t_box[t.charAt(i)] += 1;
		}

		int start = 0, start_index = -1, length = Integer.MAX_VALUE;

		int count = 0;
		for (int j = 0; j < lenS ; j++) {
			s_box[s.charAt(j)] += 1;

			if (t_box[s.charAt(j)] != 0 && s_box[s.charAt(j)] <= t_box[s.charAt(j)] ) {
				count++;
			}

			if (count == lenT) {
				while ( s_box[s.charAt(start)] > t_box[s.charAt(start)] || t_box[s.charAt(start)] == 0) {

					if (s_box[s.charAt(start)] > t_box[s.charAt(start)]) {
						s_box[s.charAt(start)] -= 1;
					}
					start++;
				}

				int window_size = j - start + 1;
				if (length > window_size) {
					length = window_size;
					start_index = start;
				}
			}
		}

		if (start_index == -1) {
			return "";
		}

		return s.substring(start_index, start_index + length);

	}
}