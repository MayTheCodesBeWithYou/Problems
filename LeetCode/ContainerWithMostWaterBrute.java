public static int maxArea(int height[]) {
  int len = height.length;
  int max_area = 0;
  for (int i = 0; i < len; i++) {
    for (int j = i + 1; j < len; j++) {
      max_area = Math.max(max_area, (min(height[j], height[i]) * (j - i)));
    }
  }
  return max_area;
}