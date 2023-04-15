package matrix;

import java.util.Random;

public class Matrix {

    //文字列を生成
    public static String generateLine() {
        StringBuilder sb = new StringBuilder();
        char[] list = new char[] {'0', '1'};
        for (int i = 0; i < 86; i++) {
            if (i % new Random().nextInt(1, 10) == 0) {
                sb.append(list[new Random().nextInt(0, list.length)]);
            } else {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
