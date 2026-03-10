package demo_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo_Sort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Cường", "Tiến", "Nam", "Lan", "Đức", "Cường");

        System.out.println("Sắp xếp danh sách tăng dần: ");
        names.stream().sorted().forEach(System.out::println);

        System.out.println("\nDanh sách giảm dần: ");
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
