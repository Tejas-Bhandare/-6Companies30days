package Company1_Microsoft.Problem04;

import java.util.*;

class Solution {
    private int rects[][]; 
    private int rectsCount;
    private int key = 0;
    private int totalPoints = 0;
    private Random random;
    private int x = 0;
    private int y = 0;
    private int x1 = 0;
    private int y1 = 0;
    private int x2 = 0;
    private int y2 = 0;

    private HashMap<Integer, Integer[]> pointCollection = new HashMap<>();

    public Solution(int[][] rects) { 
        this.rects = rects;
        this.rectsCount = rects.length;
        this.random = new Random();

        for (int i = 0; i < rectsCount; i++) {
            x1 = rects[i][0];
            y1 = rects[i][1];
            x2 = rects[i][2];
            y2 = rects[i][3];

            totalPoints += (x2 - x1 + 1) * (y2 - y1 + 1);
        }        
    }
    
    public int[] pick() {
        int key = random.nextInt(totalPoints);

        int selectedRect = -1;
        int cumulativeArea = 0;

        for (int i = 0; i < rectsCount; i++) {
            int x1 = rects[i][0];
            int y1 = rects[i][1];
            int x2 = rects[i][2];
            int y2 = rects[i][3];
            int area = (x2 - x1 + 1) * (y2 - y1 + 1);
            
            cumulativeArea += area;

            if (key < cumulativeArea) {
                selectedRect = i;
                break;
            }
        }

        
        x1 = rects[selectedRect][0];
        y1 = rects[selectedRect][1];
        x2 = rects[selectedRect][2];
        y2 = rects[selectedRect][3];


        x = random.nextInt(x2 - x1 + 1) + x1;
        y = random.nextInt(y2 - y1 + 1) + y1;

        return new int[]{x, y};
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(rects);
 * int[] param_1 = obj.pick();
 */