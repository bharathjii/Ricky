package com.userInputDrawing;

import java.util.Collections;
import java.util.List;

import com.userInputDrawing.exception.InvalidCommandException;
import com.userInputDrawing.inputs.Help;
import com.userInputDrawing.inputs.Inputs;
import com.userInputDrawing.services.Canvas;

public class InputExecutor {
    public static void executeCommands(Canvas canvas, List<String> commands) {
        for (String fullCommand : commands) {
            Inputs command = InputsCreator.getCommand(canvas, fullCommand);
            try {
                command.parseParameters();
                command.execute();
            } catch (InvalidCommandException e) {
                command = new Help(e.getMessage());
                command.execute();
            }
        }
    }

    static void executeCommand(Canvas canvas, String command) {
        executeCommands(canvas,Collections.singletonList(command));
        System.out.println(canvas);
    }
}
