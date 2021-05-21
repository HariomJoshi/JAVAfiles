package com.company;

import java.util.Scanner;

public class cwh_method_overloading {
    static void telljoke(){
        System.out.println("\n" +
                "Teacher: Pappu, please tell me, what is India Gate?\n" +
                "Pappu: Sir, India Gate is fine quality basmati rice.....\n" +
                "Teacher: What is Charminar?\n" +
                "Pappu: Charminar is a very popular cigarette in India and due to its low cost, it is easily affordable.......\n" +
                "Teacher: What is Taj Mahal?\n" +
                "Pappu: Taj Mahal is packet of tea leaves....\n" +
                "Teacher: Rascal, how dare you give such bullshit answers... You are spoiling the name of national treasures....... If you want me to allow you in the classroom tomorrow, don't forget to come with your father's signature!!!!!\n" +
                "Pappu: OK sir.\n" +
                "Next day.....\n" +
                "Teacher (looking at the table): Pappu...!!!!! You idiot!!!! How dare you bring whisky bottle inside the classroom?????\n"+
                "Pappu: Sorry Sir, But you only told me to bring my father's signature today.... I simply obeyed your order...... Now again you are shouting..... this is not fair, Sir!!!!");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("The joke will keep running again and again until you order it not to! ");
        System.out.println("/n");
        while(true){
            telljoke();
            System.out.println("Have you read it? or you want to hear once more? ");
            System.out.println("Type 1 for yes and press any key to exit.");
            String ans = scan.next();
            if (ans.equals("1")){
                telljoke();
            }
            else{
                break;
            }
        }
    }
}