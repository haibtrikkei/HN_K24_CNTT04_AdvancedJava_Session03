package demo_datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SoSanhKieuNgay {
    public static void main(String[] args) {
        LocalDate birthday;
        LocalDate now = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ngày sinh của bạn: ");
        birthday = LocalDate.parse(sc.nextLine(), formatter);

        System.out.println("Ngày sinh của bạn: "+birthday.format(formatter));
        System.out.println("Ngày hiện tại: "+now.format(formatter));
//        Period period = Period.between(birthday, now);
        System.out.println("Bạn đã sống trên trái đất: "+ ChronoUnit.DAYS.between(birthday,now)+" ngày");
    }
}
