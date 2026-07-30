package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class RatInMaze {

    static boolean isSafeToMove(int newX, int newY, int n, int[][] maze, boolean[][] visited) {

        if (newX < 0 || newX >= n || newY < 0 || newY >= n) {
            return false;
        }

        if (maze[newX][newY] == 0) {
            return false;
        }

        if (visited[newX][newY]) {
            return false;
        }

        return true;
    }

    static void solve(int[][] maze, int srcX, int srcY,
            int destX, int destY,
            int n,
            boolean[][] visited,
            String path,
            ArrayList<String> ans) {

        // Base Case
        if (srcX == destX && srcY == destY) {
            ans.add(path);
            return;
        }

        // Mark current cell as visited
        visited[srcX][srcY] = true;

        // Up
        int newX = srcX - 1;
        int newY = srcY;

        if (isSafeToMove(newX, newY, n, maze, visited)) {
            solve(maze, newX, newY, destX, destY, n, visited, path + "U", ans);
        }

        // Down
        newX = srcX + 1;
        newY = srcY;

        if (isSafeToMove(newX, newY, n, maze, visited)) {
            solve(maze, newX, newY, destX, destY, n, visited, path + "D", ans);
        }

        // Left
        newX = srcX;
        newY = srcY - 1;

        if (isSafeToMove(newX, newY, n, maze, visited)) {
            solve(maze, newX, newY, destX, destY, n, visited, path + "L", ans);
        }

        // Right
        newX = srcX;
        newY = srcY + 1;

        if (isSafeToMove(newX, newY, n, maze, visited)) {
            solve(maze, newX, newY, destX, destY, n, visited, path + "R", ans);
        }

        // Backtrack
        visited[srcX][srcY] = false;
    }

    public ArrayList<String> ratInMaze(int[][] maze) {

        ArrayList<String> ans = new ArrayList<>();

        int n = maze.length;

        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return ans;
        }

        boolean[][] visited = new boolean[n][n];

        solve(maze, 0, 0, n - 1, n - 1, n, visited, "", ans);

        Collections.sort(ans);

    }
}