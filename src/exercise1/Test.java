package exercise1;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test extends JFrame {

    int count = 0, answer = 0, correct = 0, incorrect = 0;
    private String[] questions = {"Question 1?", "Question 2?","Question 3?","Question 4?","Question 5?"};
    private String[] q1 = {"a", "b", "c", "d"};// Q1 Answers
    private String[] q2 = {"a", "b", "c", "d"};// Q2 Answers
    private String[] q3 = {"a", "b", "c", "d"};// Q3 Answers
    private String[] q4 = {"a", "b", "c", "d"};// Q4 Answers
    private String[] q5 = {"a", "b", "c", "d"};// Q5 Answers
    private Object[] options = {q1, q2, q3, q4, q5};
    private int[] answers = {0,2,1,3,1}; //A C B D B


    public static void main(String[] args) {
        Test test = new Test();
        test.inputAnswer();
    }

    public void inputAnswer () {
        for (int i = 0; i < 5; i++) {
            simulateQuestion();
            count++;
        }
        int p = correct*100/5;
        JOptionPane.showMessageDialog(null, "Correct answers : "+correct+"\nIncorrect answers : " +incorrect+
                "\nPercentage : "+p+"%");

    }

    public void simulateQuestion() {
        answer = JOptionPane.showOptionDialog(null, questions[count], "Question "+(count+1),
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, (Object[]) options[count], null);
        checkAnswer(answer);
    }

    public void checkAnswer(int answer) {
        boolean yes = false;
        if (answer == answers[count]) {
            correct++;
            yes = true;
        } else {
            incorrect++;
        }
        generateMessage(yes);
    }

    public void generateMessage(boolean yes) {
        String[] good = {"Excellent!", "Keep up the good work!", "Good!", "Nice Work!"};
        String[] bad = {"No.", "Wrong.", "Don't give up!", "No. Keep trying."};
        String[] test = (String[]) options[count];
        Random random = new Random();
        switch (random.nextInt(4)) {
            case 0:
                JOptionPane.showMessageDialog(null,
                        yes ? good[0] : bad[0]+" The correct answer was "+test[answers[count]]);
                break;
            case 1:
                JOptionPane.showMessageDialog(null,
                        yes ? good[1] : bad[1]+" The correct answer was "+test[answers[count]]);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        yes ? good[2] : bad[2]+" The correct answer was "+test[answers[count]]);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,
                        yes ? good[3] : bad[3]+" The correct answer was "+test[answers[count]]);
                break;
        }
    }
}