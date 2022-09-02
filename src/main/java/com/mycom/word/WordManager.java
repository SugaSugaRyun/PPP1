package main.java.com.mycom.word;

import java.util.Scanner;

public class WordManager {
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;

    public WordManager(){
        wordCRUD = new WordCRUD(s);
    }
    public int selectMenu() {
        System.out.print("***영단어 마스터***\n\n"
                        +"****************\n"
                        +"1.모든 단어 보기\n"
                        +"2.");

        return s.nextInt();
    }
    public void start(){
        while(true) {
            int menu = selectMenu();
            if(menu == 0) break;
            if(menu == 4){
                wordCRUD.addWord();
                //create
            }
            else if(menu == 1){
                wordCRUD.listAll();
            }
        }
    }
}
