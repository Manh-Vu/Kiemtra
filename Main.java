package Day5a.KiemTra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        KyThuat kt1= new KyThuat("TP1234","Nguyen van A","01/01/2000","ha Noi","CNTT");
        KyThuat kt2= new KyThuat("TP2");
        System.out.println("Nhap ho ten");
        kt2.setName(sc.nextLine());
        System.out.println("Nhap nam sinh");
        kt2.setYear(sc.nextLine());
        System.out.println("Nhap Dia chi");
        kt2.setAddress(sc.nextLine());
        System.out.println("Nhap Nhap chuyen nganh");
        kt2.setSpecialize(sc.nextLine());

        System.out.println(kt1.toString());
        System.out.println(kt2.toString());

        VanBan vb= new VanBan("   hhjkk    ujhuh juh   joijo   ");
        System.out.println(vb.toString());

        Circle c1= new Circle(2.0);
        System.out.println(c1.toString());
         Circle c2= new Circle(0);
         System.out.println(c2.toString());

    }
}
