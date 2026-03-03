package LAB_5.Q_7;

enum answerStatus {
    CORRECT,WRONG,UNANSWERED;
}

public class MarksCalculator {
    public static void main(String[] args) {
        char[] answer = {'C', 'A', 'B', 'D', 'B', 'C', 'C', 'A'};
        int correctCount = 0;
        int incorrectCount = 0;
        int unansweredCount = 0;
        
        for (int i=0; i<8; i++)
        {
            System.out.print("  " + (i + 1) + "\t");
            System.out.print(args[i].charAt(0) + "\t");
            System.out.print(answer[i] + "\t");

            if (args[i].charAt(0) == answer[i])
            {
                System.out.println(answerStatus.CORRECT);
                correctCount++;
            }
            else if (args[i].charAt(0) == 'X')
            {
                System.out.println(answerStatus.UNANSWERED);
                unansweredCount++;
            }
            else
            {
                System.out.println(answerStatus.WRONG);
                incorrectCount++;
            }
        }

        System.out.println("No. of correct answered: " + correctCount);
        System.out.println("NO. of incorrect answered: " + incorrectCount);
        System.out.println("No. of unanswered: " + unansweredCount);

        if (correctCount >= 5)
        {
            System.out.println("Student has passed");
        }
        else
        {
            System.out.println("Student has failed");
        }
    }
}
