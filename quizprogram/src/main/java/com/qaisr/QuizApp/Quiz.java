package QuizApp;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Quiz {

    static int a, b, c, d;
static int Counter = 0, i=0;
public static Object questions;
    static void rand() {
        Random rand = new Random();

        d = rand.nextInt(111) * rand.nextInt(111);
        switch (d % 4) {
            case 3 -> {
                a = 2;
                b = 1;
                c = 0;
                d = d % 4;
            }
            case 2 -> {
                a = 0;
                b = 3;
                c = 1;
                d = d % 4;

            }
            case 1 -> {
                a = 2;
                b = 0;
                c = 3;
                d = d % 4;

            }
            default -> {
                a = 1;
                b = 2;
                c = 3;
                d = d % 4;

            }
        }

    }

    public static void Run() throws InterruptedException {

        JFrame window = new JFrame("241");
        window.setSize(1400, 800);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        
        String[] Answer = new String[4];

        while (true) {
            int score = 0, x, seconds = 0;
            int time = -1; //sec  
            quiz2[] Question = new quiz2[287];
            

            Answer[0] = "Secondary Storage";
            Answer[1] = "RAM";
            Answer[2] = "Cache";
            Answer[3] = "Optical disk";
            rand();
            Question[i] = new quiz2("Expansion of Main Memory that provides nonvolatile capacity :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
              
            
            
            
            
            
            while (Counter != Question.length && seconds > time) {
                 Random rand = new Random();
                questions quiz = new questions(Question[Counter], window);
                quiz.getAnswer(time);
                x = quiz.getTime().M;
                seconds = quiz.getTime().S;
                score = quiz.getScore();
                if (Counter == Question.length - 1 || (seconds == time)) {
                   
                }
                Counter++;
            }

            int CounterQ = Question.length;
            scorePane scorePane = new scorePane(window, score, CounterQ);
            scorePane.choose();

        }
    }

}
