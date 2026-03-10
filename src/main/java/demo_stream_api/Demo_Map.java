package demo_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo_Map {
    public static void main(String[] args) {
        //Tạo danh sách lưu các tên
        List<String> names = Arrays.asList("Cường", "Tiến", "Nam", "Lan", "Đức", "Cường");

        //Duyệt qua danh sách và chuyển thành chữ hoa
        List<String> newNames = names
                .parallelStream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(newNames);

        newNames.parallelStream().forEach(System.out::println);

    }
}
