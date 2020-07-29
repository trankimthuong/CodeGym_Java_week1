import java.util.Arrays;

public class MineSweeperMap {
    public static void main(String[] args) {
        String[][] map = {{"*",".",".",".","*"},
                {"*","*",".",".","."},
                {".",".","*",".","."},
                {".",".",".",".","."},
                {".",".",".",".","."}};
        final int WIDTH = map.length;
        int[][] report = {{0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}} ;
        for (int i = 0; i < WIDTH ; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (map[i][j].equals("*")) {
                    report[i][j] = 10;
                    if( i  >= 1 )
                        report[i - 1][j] += 1;
                    if( j  >= 1 && i >= 1)
                        report[i - 1][j - 1] += 1;
                    if(j - 1 >=0)
                        report[i][j -1 ] +=1;
                    if(i + 1 < WIDTH)
                        report[i + 1][j] += 1;
                    if(j + 1 < WIDTH)
                        report[i][j + 1] +=1;
                    if ( i + 1 < WIDTH && j + 1 < WIDTH)
                        report[i + 1][ j + 1] += 1;
                    if( j - 1 >= 0 && i + 1 < WIDTH )
                        report[i + 1][ j -1] += 1;
                    if ( i - 1 >= 0 && j  + 1 < WIDTH)
                        report[i - 1][j + 1] += 1;
                }
            }
        }
        for (int i = 0; i < WIDTH ; i++){
            for (int j = 0 ; j < WIDTH; j++){
                if(!map[i][j].equals("*")){
                    map[i][j] = String.valueOf(report[i][j]);
                }
            }
        }
        System.out.println(Arrays.toString(map[0]));
        System.out.println(Arrays.toString(map[1]));
        System.out.println(Arrays.toString(map[2]));
        System.out.println(Arrays.toString(map[3]));
        System.out.println(Arrays.toString(map[4]));
    }

}