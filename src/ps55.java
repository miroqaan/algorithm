import java.util.Arrays;

public class ps55 {
    public static void main(String[] args) {
        int N = 10; // N, x, y 값을 적절히 설정해야 합니다.
        int x = 5;
        int y = 3;

        Block[] blist = new Block[N];

        for(int i = 0; i < N; i++){
            blist[i] = new Block(x, y);
        }

        Arrays.sort(blist);

        // 정렬된 blist를 출력해보면 좋습니다.
        for(Block b : blist){
            System.out.println(b.getBlock());
        }
    }

    static class Block implements Comparable<Block>{
        int score;
        int order;

        public Block(int block, int select){
            super();
            this.score = block;
            this.order = select;
        }

        @Override
        public int compareTo(Block o) {
            return o.getBlock() - getBlock();
        }

        private int getBlock(){
            return this.score;
        }
    }
}