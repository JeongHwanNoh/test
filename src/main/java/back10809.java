import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class back10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder();

        HashMap<Integer, Integer> alphabetMap = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            alphabetMap.put('a' + i, -1);
        }

        String j = br.readLine();
        for (int i = 0; i < j.length(); i++) {
            int index = j.charAt(i);
            if (alphabetMap.get(index) == -1) {
                alphabetMap.put(index, i);
            }
        }

        alphabetMap.forEach((key, value) -> {
            s.append(value).append(" ");
        });
        System.out.println(s);
    }
}
