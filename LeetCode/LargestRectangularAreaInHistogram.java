class Solution {
	public int largestRectangleArea(int[] heights) {
		Stack<Integer> s = new Stack<>();
		int n = heights.length;
		int max_area = 0;
		int top;
		int area;

		int i = 0;
		while (i < n) {
			if (s.empty() || heights[s.peek()] <= heights[i]) {
				s.push(i);
				i++;
			}

			else {
				top = s.peek();
				s.pop();

				if (s.empty()) {
					area = heights[top] * i;
				} else {
					area = heights[top] * (i - s.peek() - 1);
				}

				if (max_area < area) {
					max_area = area;
				}
			}
		}


		while (s.empty() == false) {
			top = s.peek();
			s.pop();

			if (s.empty()) {
				area = heights[top] * i;
			} else {
				area = heights[top] * (i - s.peek() - 1);
			}

			if (max_area < area) {
				max_area = area;
			}
		}

		return max_area;
	}
}