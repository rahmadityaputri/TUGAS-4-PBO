import javax.swing.*;
import java.awt.*;

public class dosen_pbo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dosen dosen_1 = new Dosen();
        Dosen dosen_2 = new Dosen();

        dosen_1.nama = "Aisyah Aqilah";
        dosen_1.umur = 23;
        dosen_1.nip = 1223344;

        dosen_2.nama = "Reiznu Ahmad";
        dosen_2.umur = 32;
        dosen_2.nip = 444555666;

        rerata_nilai.average(80, 85);
        rerata_nilai.average(85.5, 90.5);
        rerata_nilai.average(80, 85, 80);

        dosen_1.info();
        Object rowData[][] = {
                { "O1", dosen_1.nama, dosen_1.umur, dosen_1.nip },
                { "O2", dosen_2.nama, dosen_2.umur, dosen_2.nip }
        };

        Object columnNames[] = { "#", "Nama", "Umur", "NIP"};
        JTable table = new JTable(rowData, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setVisible(true);

    }
}

class orang{
    String nama;
    int umur;
}

class Dosen extends orang {
    int nip;

    String info(){
        return "===DATA DOSEN===";
    }
}

class rerata_nilai {
    public static void average(int a, int b) {
        System.out.println("Rata-Rata Nilai " + a + "," + b);
    }

    public static void average(double a, double b) {
        System.out.println("Rata-Rata Nilai " + a + "," + b);
    }

    public static void average(int a, int b, int c){
        System.out.println("Rata-Rata Nilai " + a + "," + b + "," + c);
    }

}
