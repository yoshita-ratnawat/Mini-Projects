package com.MiniProjects;

import java.util.Formatter;
import java.util.ArrayList;
import java.util.Scanner;

class question{
    String que;
    ArrayList<String> option;
    char correctAns;

    question(String que, ArrayList<String> option, char correctAns){
        this.que = que;
        this.option = option;
        this.correctAns = correctAns;
    }
}
public class MCQQuizUsingArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Enrollment: ");
        String enrollment = sc.next();

        System.out.println("Are you ready for quiz? Y/N");
        if(sc.next().charAt(0) == 'N'){
            System.out.println("Okay Thank You");
        }else{
            System.out.println("Let's Start!!");
            int correct = 0;

            ArrayList<question> q = new ArrayList<>();

            //Question 1
            System.out.println("Question 1");
            ArrayList<String> options1 = new ArrayList<>();
            options1.add("A. largest railway station");
            options1.add("B. highest railway station");
            options1.add("C. longest railway station");
            options1.add("D. None of the above");
            q.add(new question("Grand Central Terminal, Park Avenue, New York is the world's -", options1,'A'));

            System.out.println(q.get(0).que);
            System.out.println(q.get(0).option.get(0));
            System.out.println(q.get(0).option.get(1));
            System.out.println(q.get(0).option.get(2));
            System.out.println(q.get(0).option.get(3));
            System.out.println("Choose the correct answer.");
            char ans1 = sc.next().charAt(0);

            if(ans1 == q.get(0).correctAns){
                correct++;
            }

            System.out.println("---------------------------------------------------***-------------------------------------------------------");

            //Question 2
            System.out.println("Question 1");
            ArrayList<String> options2 = new ArrayList<>();
            options2.add("A. Behavior of human beings");
            options2.add("B. Insects");
            options2.add("C. The origin and history of technical and scientific terms");
            options2.add("D. The formation of rocks");
            q.add(new question("Entomology is the science that studies -", options2,'B'));

            System.out.println(q.get(1).que);
            System.out.println(q.get(1).option.get(0));
            System.out.println(q.get(1).option.get(1));
            System.out.println(q.get(1).option.get(2));
            System.out.println(q.get(1).option.get(3));
            System.out.println("Choose the correct answer.");
            char ans2 = sc.next().charAt(0);

            if(ans2 == q.get(1).correctAns){
                correct++;
            }

            System.out.println("---------------------------------------------------***-------------------------------------------------------");

            //Question 3
            System.out.println("Question 3");
            ArrayList<String> options3 = new ArrayList<>();
            options3.add("A. Asia");
            options3.add("B. Africa");
            options3.add("C. Europe");
            options3.add("D. Australia");
            q.add(new question("Eritrea, which became the 182nd member of the UN in 1993, is in the continent of -",options3,'B'));

            System.out.println(q.get(2).que);
            System.out.println(q.get(2).option.get(0));
            System.out.println(q.get(2).option.get(1));
            System.out.println(q.get(2).option.get(2));
            System.out.println(q.get(2).option.get(3));
            System.out.println("Choose the correct answer.");
            char ans3 = sc.next().charAt(0);

            if(ans3 == q.get(2).correctAns){
                correct++;
            }

            System.out.println("---------------------------------------------------***-------------------------------------------------------");

            //Question 4
            System.out.println("Question 4");
            ArrayList<String> options4 = new ArrayList<>();
            options4.add("A. Junagarh, Gujarat");
            options4.add("B. Diphu, Assam");
            options4.add("C. Kohima, Nagaland");
            options4.add("D. Gangtok, Sikkim");
            q.add(new question("Garampani sanctuary is located at -", options4,'B'));

            System.out.println(q.get(3).que);
            System.out.println(q.get(3).option.get(0));
            System.out.println(q.get(3).option.get(1));
            System.out.println(q.get(3).option.get(2));
            System.out.println(q.get(3).option.get(3));
            System.out.println("Choose the correct answer.");
            char ans4 = sc.next().charAt(0);

            if(ans4 == q.get(3).correctAns){
                correct++;
            }

            System.out.println("---------------------------------------------------***-------------------------------------------------------");

            //Question 5
            System.out.println("Question 5");
            ArrayList<String> options5 = new ArrayList<>();
            options5.add("A. Physics and Chemistry");
            options5.add("B. Physiology or Medicine");
            options5.add("C. Literature, Peace and Economics");
            options5.add("D. All of the above");
            q.add(new question("For which of the following disciplines is Nobel Prize awarded?", options5,'D'));

            System.out.println(q.get(4).que);
            System.out.println(q.get(4).option.get(0));
            System.out.println(q.get(4).option.get(1));
            System.out.println(q.get(4).option.get(2));
            System.out.println(q.get(4).option.get(3));
            System.out.println("Choose the correct answer.");
            char ans5 = sc.next().charAt(0);

            if(ans1 == q.get(4).correctAns){
                correct++;
            }

            System.out.println("---------------------------------------------------***-------------------------------------------------------");

            //Question 6
            System.out.println("Question 6");
            ArrayList<String> options6 = new ArrayList<>();
            options6.add("A. Labour Party");
            options6.add("B. Nazi Party");
            options6.add("C. Ku-Klux-Klan");
            options6.add("D. Democratic Party");
            q.add(new question("Hitler party which came into power in 1933 is known as- ", options6,'B'));

            System.out.println(q.get(5).que);
            System.out.println(q.get(5).option.get(0));
            System.out.println(q.get(5).option.get(1));
            System.out.println(q.get(5).option.get(2));
            System.out.println(q.get(5).option.get(3));
            System.out.println("Choose the correct answer.");
            char ans6 = sc.next().charAt(0);

            if(ans6 == q.get(5).correctAns){
                correct++;
            }

            System.out.println("---------------------------------------------------***-------------------------------------------------------");

            //Question 7
            System.out.println("Question 7");
            ArrayList<String> options7 = new ArrayList<>();
            options7.add("A. Foreign Finance Corporation");
            options7.add("B. Film Finance Corporation");
            options7.add("C. Federation of Football Council");
            options7.add("D. None of the above");
            q.add(new question("FFC stands for", options7,'B'));

            System.out.println(q.get(6).que);
            System.out.println(q.get(6).option.get(0));
            System.out.println(q.get(6).option.get(1));
            System.out.println(q.get(6).option.get(2));
            System.out.println(q.get(6).option.get(3));
            System.out.println("Choose the correct answer.");
            char ans7 = sc.next().charAt(0);

            if(ans7 == q.get(6).correctAns){
                correct++;
            }

            System.out.println("---------------------------------------------------***-------------------------------------------------------");

            //Question 8
            System.out.println("Question 8");
            ArrayList<String> options8 = new ArrayList<>();
            options8.add("A. largest railway station");
            options8.add("B. highest railway station");
            options8.add("C. longest railway station");
            options8.add("D. None of the above");
            q.add(new question("Grand Central Terminal, Park Avenue, New York is the world's -", options8,'B'));

            System.out.println(q.get(7).que);
            System.out.println(q.get(7).option.get(0));
            System.out.println(q.get(7).option.get(1));
            System.out.println(q.get(7).option.get(2));
            System.out.println(q.get(7).option.get(3));
            System.out.println("Choose the correct answer.");
            char ans8 = sc.next().charAt(0);

            if(ans8 == q.get(7).correctAns){
                correct++;
            }

            System.out.println("---------------------------------------------------***-------------------------------------------------------");

            //Question 9
            System.out.println("Question 9");
            ArrayList<String> options9 = new ArrayList<>();
            options9.add("A. Dr. G. D. Bist");
            options9.add("B. J.R.D. Tata");
            options9.add("C. J.M. Tagore");
            options9.add("D. Khudada Khan");
            q.add(new question("Fastest shorthand writer was", options9,'A'));

            System.out.println(q.get(8).que);
            System.out.println(q.get(8).option.get(0));
            System.out.println(q.get(8).option.get(1));
            System.out.println(q.get(8).option.get(2));
            System.out.println(q.get(8).option.get(3));
            System.out.println("Choose the correct answer.");
            char ans9 = sc.next().charAt(0);

            if(ans9 == q.get(8).correctAns){
                correct++;
            }

            System.out.println("---------------------------------------------------***-------------------------------------------------------");

            //Question 10
            System.out.println("Question 10");
            ArrayList<String> options10 = new ArrayList<>();
            options10.add("A. Horse racing");
            options10.add("B. Polo");
            options10.add("C. Shooting");
            options10.add("D. Snooker");
            q.add(new question("Epsom (England) is the place associated with", options10,'A'));

            System.out.println(q.get(9).que);
            System.out.println(q.get(9).option.get(0));
            System.out.println(q.get(9).option.get(1));
            System.out.println(q.get(9).option.get(2));
            System.out.println(q.get(9).option.get(3));
            System.out.println("Choose the correct answer.");
            char ans10 = sc.next().charAt(0);

            if(ans10 == q.get(9).correctAns){
                correct++;
            }

            System.out.println("---------------------------------------------------***-------------------------------------------------------");

            float percent = (correct/10)*100;

            System.out.println("Your Result");

            Formatter frm= new Formatter();
            System.out.println("-------------------------------------------------");
            frm.format("%-15s %-15s %-15s %-15s\n","Name", "Enrollment","Marks","Percentage");
            frm.format("%-15s %-15s %-15s %-15s",name.substring(0,name.indexOf(" ")),enrollment,correct,percent);

            System.out.println(frm);

            System.out.println("--------------------------------------------------");

        }
    }
}
