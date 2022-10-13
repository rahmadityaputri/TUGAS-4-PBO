import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Katak katak_1 = new Kecebong();
        Katak katak_2 = new Kecebong();

        katak_1.nama = "Froggy";
        katak_1.umur = 5;
        ((Kecebong) katak_1).panjangEkor = 0;

        katak_2.nama = "JuniorFrog";
        katak_2.umur = 2;
        ((Kecebong) katak_2).panjangEkor = 10;

        Object rowData[][] = {
                { "O1", katak_1.umur, katak_1.nama, ((Kecebong) katak_1).panjangEkor, katak_1.caraBergerak("Melompat") },
                { "O2", katak_2.umur, katak_2.nama, ((Kecebong) katak_2).panjangEkor, katak_2.caraBergerak("Berenang") }
        };

        Object columnNames[] = { "Obyek", "Umur", "Nama", "Panjang Ekor", "Cara Bergerak" };
        JTable table = new JTable(rowData, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}

class Katak {
    int umur;
    String nama;

    public static String caraBergerak(String cara_bergerak) {
        return cara_bergerak;
    }
}

class Kecebong extends Katak {
    double panjangEkor;
}
