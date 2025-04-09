import javax.swing.tree.AbstractLayoutCache;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int[][] sudoku;
    static ArrayList<int[]> blanks = new ArrayList<>();
    public static void dfs(int depth){
        if(depth == blanks.size()){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 9 ; i++){
                for(int j = 0; j<9;j++){
                    sb.append(sudoku[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }
        int row = blanks.get(depth)[0];
        int col = blanks.get(depth)[1];

        for(int i = 0; i < 9; i++){
            if(isPossible(i+1, row, col)){
                sudoku[row][col] = i+1;
                dfs(depth+1);
                sudoku[row][col] = 0;
            }
        }

    }

    public static boolean isPossible(int num, int row, int col){
        //가로체크
        for(int i = 0; i < 9; i++){
            if(sudoku[row][i] == num) return false;
        }
        //세로체크
        for(int i = 0; i < 9; i++){
            if(sudoku[i][col] == num) return false;
        }
        // 사각형 체크
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for(int p = startRow; p < startRow+3; p++){
            for(int q = startCol; q<startCol+3; q++){
                if (sudoku[p][q] == num){
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sudoku = new int[9][9];
        for(int i = 0; i< 9;i++){
            sudoku[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j = 0; j < 9; j++){
                if (sudoku[i][j] == 0){
                    blanks.add(new int[] {i,j});
                }
            }
        }
        dfs(0);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 9 ; i++){
            for(int j = 0; j<9;j++){
                sb.append(sudoku[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
