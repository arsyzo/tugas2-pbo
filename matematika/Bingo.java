/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_cth.matematika;

/**
 *
 * @author Marsy
 */
public class Bingo {
    int loop;
    String replace;
    char[] bingo = {'B', 'I', 'N', 'G', 'O'};

    public Bingo(int loop, String replace) {
        this.loop = loop;
        this.replace = replace;
    }

    // Method untuk mencetak tulisan berulang
    void printTeks() {
        System.out.println("There was a who had a dog");
        System.out.println("And Bingo was his name-o.");
    }

    // Method untuk mencetak baris bingo dengan menggantikan beberapa huruf
    void printBingoLine(int numReplacements) {
        for (int i = 0; i < bingo.length; i++) {
            if (i < numReplacements) {
                System.out.print(replace);
            } else {
                System.out.print(bingo[i]);
            }
            if (i != bingo.length - 1) {
                System.out.print("-");
            }
        }
        System.out.println(" ");
    }

    // Method utama untuk mencetak semua teks
    void printBingo() {
        for (int i = 0; i < 6; i++) {
            printTeks();
            for (int j = 0; j < loop; j++) {
                printBingoLine(i);
            }
            System.out.println("And Bingo was his name-o\n");
        }
    }
}
