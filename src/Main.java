//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println(i + " 3 ve 5 Bölünür");
            }

            else if (i % 3 == 0) {
                System.out.println(i + " 3 e Bölünür");
            }

            else if (i % 5 == 0) {
                System.out.println(i + " 5 e Bölünür");
            }
        }
    }


}

