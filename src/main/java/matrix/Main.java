package matrix;

public class Main {
    public static void main(String[] args) {
        //最大表示サイズ：横８６文字（半角）
        while (true) {
            for (int i = 0; i < 20; i++) {
                System.out.println(Matrix.generateLine());
            }
        }
    }
}
