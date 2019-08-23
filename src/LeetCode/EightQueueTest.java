package LeetCode;

/**
 * 八皇后问题
 * 一种正确的摆法
 */
public class EightQueueTest {

    static final int MAX_NUM = 8;

    int chessBoard[][] = new int[MAX_NUM][MAX_NUM];
    //检查落点是否符合规则
    boolean check(int x,int y){
        for (int i = 0; i < y; i++) {
            //检查纵向
            if (chessBoard[x][i]==1){
            return false;
        }
        //检查左侧斜向
            if (x-1-i>=0&&chessBoard[x-1-i][y-1-i]==1){
                return false;
            }
            //检查右侧斜向
            if (x+1+i<MAX_NUM&&chessBoard[x+1+i][y-1-i]==1){
                return false;
            }

        }
        return true;
    }

    boolean settleQueen(int y){
        //行数等于8 说明找到答案
        if (y==MAX_NUM){
            return true;
        }
        //遍历当前行，逐一格子验证
        for (int i = 0; i < MAX_NUM; i++) {
            //位当前行清零，以免在回溯的时候出现脏数据
            for (int x = 0; x < MAX_NUM; x++) {
                chessBoard[x][y] = 0;
            }

            //检查是否符合规则，如果符合，更改元素值并进一步递归
            if (check(i,y)){
                chessBoard[i][y] = 1;
                //递归如果返回true,说明下层已经找到解法，无需继续循环
                if (settleQueen(y+1)){
                    return true;
                }
            }
        }
        return false;
    }

    void printChessBoard(){
        for (int i = 0; i < MAX_NUM; i++) {
            for (int j = 0; j < MAX_NUM; j++) {
                System.out.println(chessBoard[j][i]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        EightQueueTest queen8 = new EightQueueTest();
        queen8.settleQueen(0);
        queen8.printChessBoard();
    }
}
