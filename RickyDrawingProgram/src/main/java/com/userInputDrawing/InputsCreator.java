package com.userInputDrawing;

import static com.userInputDrawing.essentials.Constants.ERROR_NO_COMMANDS_GIVEN;

import com.userInputDrawing.enums.UserInput;
import com.userInputDrawing.inputs.*;
import com.userInputDrawing.services.Canvas;

public class InputsCreator {

    public static Inputs getCommand(Canvas canvas, String userCommand) {

        if (userCommand.length() == 0) {
            return new Help(ERROR_NO_COMMANDS_GIVEN);
        }
        String commandCode = userCommand.substring(0, 1).toUpperCase();
        
        Inputs command;
        if(UserInput.CREATE_CANVAS.getCommandCode().equals(commandCode)) {
            command = new CreateInput(canvas, userCommand);
        } else if (UserInput.DRAW_LINE.getCommandCode().equals(commandCode)) {
            command = new InputLine(canvas, userCommand);
        } else if (UserInput.DRAW_RECTANGLE.getCommandCode().equals(commandCode)) {
            command = new RectangleInput(canvas, userCommand);
        } else if (UserInput.FILL_BUCKET.getCommandCode().equals(commandCode)) {
            command = new FillInput(canvas, userCommand);
        } else if (UserInput.QUIT.getCommandCode().equals(commandCode)) {
            command = new InputQuit(canvas, userCommand);
        } else if (UserInput.HELP.getCommandCode().equals(commandCode)) {
            command = new Help();
        } else {
            command = new Help("Command not found");
        }
        return command;
    }
}
