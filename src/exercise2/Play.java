package exercise2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Play {

    public static void playNow() {
        int selectedNumber = 0;

        int sum = 0;
        int[] randomnum = new int[3];
        int flag = 0;

        for (int i = 0; i < 5; i++) {
            Lotto lottogame = new Lotto();
            try {
                BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Select Number Between 3 and 27");

                selectedNumber = Integer.parseInt(inp.readLine());

                while (selectedNumber < 3 || selectedNumber > 27) {
                    System.out.println("Select Number Must Be Between 3 and 27");
                    selectedNumber = Integer.parseInt(inp.readLine());

                }
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("selected Number = " + selectedNumber);

            randomnum = lottogame.getRandomNumber();
            sum = randomnum[0] + randomnum[1] + randomnum[2];

            if (sum == selectedNumber) {
                System.out.println("inside if statement");
                flag = 1;
                break;
            }

            //printing number of try left
            write(Integer.toString(4 - i) + " TRY LEFT");
        }

        if (flag == 1) {

            write("YOU WON");

        } else {
            write("COMPUTER WON");
        }

    }

    private static void write(String write) {

        System.out.println( write );

    }
}
