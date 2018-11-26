package com.userInputDrawing;

import java.util.Scanner;

import com.userInputDrawing.services.Canvas;

public class MainPrograme {

    public static void main(String[] args) throws Exception {
        Canvas canvas = new Canvas();
        while (canvas.isCanvasActive()) {
            System.out.println("Enter command: ");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            InputExecutor.executeCommand(canvas, userInput);
        }
    }
}
