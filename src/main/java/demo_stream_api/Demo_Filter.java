package demo_stream_api;

import java.util.Arrays;
import java.util.List;

public class Demo_Filter {
    public static void main(String[] args) {
        //Tạo 1 collection lưu thông tin họ tên đầy đủ (có cả họ + đệm + tên)
        List<String> list = Arrays.asList("Nguyễn Đức Bình", "Phạm Tiến Dũng", "Nguyễn Mạnh Hùng","Đinh Công Thắng","Nguyễn Hải An","Phạm Gia Khánh","Nguyễn Đức Mạnh");

        //Lấy và in ra những người họ Nguyễn
        System.out.println("Những người họ Nguyễn: ");
        list.parallelStream().filter(name -> name.startsWith("Nguyễn")).forEach(System.out::println);
    }
}
