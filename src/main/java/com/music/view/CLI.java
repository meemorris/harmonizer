package com.music.view;

import java.util.Scanner;

public class CLI {


    private final Scanner input = new Scanner(System.in);
    private final Menu menu = new Menu(System.in, System.out);

    public String prompt(String output) {
        System.out.println();
        System.out.print(output);
        return input.nextLine();
    }

    public void output(String content) {
        System.out.println();
        System.out.print(content);
    }

    public void pauseOutput() {
        System.out.println();
        System.out.println("Press Enter to continue...");
        input.nextLine();
    }

    public String promptForSelection(String[] options) {
        return (String) menu.getChoiceFromOptions(options);
    }




}
