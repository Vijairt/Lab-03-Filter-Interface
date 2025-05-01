import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class ShortLister {
    public static void main(String[] args) {
        Filter f = new ShortWordFilter();

        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();

            try (Scanner in = new Scanner(file)) {
                while (in.hasNext()) {
                    String word = in.next();
                    if (f.accept(word)) {
                        System.out.println(word);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
