package View;

import Model.Elelmiszer;

import java.util.List;
import java.util.Scanner;

public class RaktarView {

    private final Scanner scanner = new Scanner(System.in);

    public int readInt(){
        while (true){
            try {
                String line = scanner.nextLine();
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e){
                System.out.println("Érvénytelen érték!");
            }
        }
    }

    public int readIntWithPrompt(String message){
        System.out.println(message);
        return this.readInt();
    }

    public String readLine(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    public void showMessage(String message){
        System.out.println(message);
    }

    public void showError(String message){
        System.out.println("Hiba: " + message);
    }

    public void lista(List<Elelmiszer> elelmiszerek) {
        System.out.println("A teljes készlet: ");
        for (Elelmiszer elelmiszer : elelmiszerek) {
            System.out.println(elelmiszer.toString());
        }
    }

}
