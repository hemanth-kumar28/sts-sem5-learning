import java.util.*;

class Main {
    static Set<String> results = new TreeSet<>();

    static void permute(String selected, String remain) {
        if (remain.isEmpty()) {
            results.add(selected);
            return;
        }

        for (int i = 0; i < remain.length(); i++) {
            permute(selected + remain.charAt(i),
                remain.substring(0, i) + remain.substring(i + 1));
        }
    }

    public static void main(String[] args) {
        String str = "lagalaka";

        permute("", str);
        System.out.println(results);
    }
}