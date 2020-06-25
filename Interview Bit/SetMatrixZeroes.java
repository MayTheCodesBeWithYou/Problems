public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
		int rows = a.size();
		int cols = a.get(0).size();
		boolean rowvisited[] = new boolean[a.size()];
		boolean colvisited[] = new boolean[a.get(0).size()];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (a.get(i).get(j) == 0) {
					rowvisited[i] = true;
					colvisited[j] = true;
				}
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (rowvisited[i] || colvisited[j]) a.get(i).set(j, 0);
			}
		}
	}
}