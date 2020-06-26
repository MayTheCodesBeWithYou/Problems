class Solution {
public:
    int calculateMinimumHP(vector<vector<int>>& dungeon) {

        int row = dungeon.size();
        int col = dungeon[0].size();

        // create our minimum health 2-D array
        vector<vector<int>> minhealth(row, vector<int>(col));

        // solve for the last cell
        if (dungeon[row - 1][col - 1] > 0) {
            minhealth[row - 1][col - 1] = 1;
        } else {
            minhealth[row - 1][col - 1] = 1 - dungeon[row - 1][col - 1];
        }

        //solve for last row and last column
        for (int i = row - 2; i >= 0; i--) {
            minhealth[i][col - 1] = max(minhealth[i + 1][col - 1] - dungeon[i][col - 1], 1);
        }
        for (int j = col - 2; j >= 0; j--) {
            minhealth[row - 1][j] = max(minhealth[row - 1][j + 1] - dungeon[row - 1][j], 1);
        }


        // solve for remaining cells
        for (int i = row - 2; i >= 0; i--) {
            for (int j = col - 2; j >= 0; j--) {
                minhealth[i][j] = max(min(minhealth[i + 1][j], minhealth[i][j + 1]) - dungeon[i][j], 1);
            }
        }

        return minhealth[0][0];

    }
};