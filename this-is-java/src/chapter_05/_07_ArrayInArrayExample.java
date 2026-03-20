package chapter_05;

public class _07_ArrayInArrayExample {
    public static void main(String[] args) {
        int[][] mathScore = new int[2][3];
        for (int i = 0; i < mathScore.length; i++){
            for (int j = 0; j < mathScore[i].length; j++){
                System.out.println("mathScore[" + i + "][" + j + "] = " + mathScore[i][j]);
            }
        }
        System.out.println();

        int[][] englishScore = new int[2][];
        englishScore[0] = new int[2];
        englishScore[1] = new int[3];
        for (int i = 0; i < englishScore.length; i++){
            for (int j = 0; j < englishScore[i].length; j++){
                System.out.println("englishScore[" + i + "][" + j + "] = " + englishScore[i][j]);
            }
        }
        System.out.println();

        int[][] javaScore = {{95, 80}, {92, 96, 80}};
        for (int i = 0; i < javaScore.length; i++){
            for (int j = 0; j < javaScore[i].length; j++){
                System.out.println("javaScore[" + i + "][" + j + "] = " + javaScore[i][j]);
            }
        }
        System.out.println();
    }
}
