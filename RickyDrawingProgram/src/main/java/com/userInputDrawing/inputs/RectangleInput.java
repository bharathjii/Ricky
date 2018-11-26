package com.userInputDrawing.inputs;

import static com.userInputDrawing.enums.UserInput.DRAW_LINE;
import static com.userInputDrawing.essentials.Constants.*;
import static com.userInputDrawing.essentials.DrawEssentials.getCommandParams;

import java.util.List;

import com.userInputDrawing.InputDeveloper;
import com.userInputDrawing.InputExecutor;
import com.userInputDrawing.exception.InvalidCommandException;
import com.userInputDrawing.services.Canvas;
import com.userInputDrawing.services.Point;

public class RectangleInput extends DrawDiagram {
    private Point point1;
    private Point point2;

    public RectangleInput(Canvas canvas, String fullCommand) {
        super(canvas, fullCommand);
    }

    @Override
    public void parseParameters() throws InvalidCommandException {
        if (!canvas.isCanvasInitialized()) {
            throw new InvalidCommandException(ERROR_CANVAS_NOT_INITIALIZED);
        }
        String splitString[] = getCommandParams(fullCommand);
        if (splitString.length != 5) {
            throw new InvalidCommandException(ERROR_INVALID_NUMBER_OF_ARGUMENTS);
        }
        try {
            point1 = new Point(Integer.parseInt(splitString[1]), Integer.parseInt(splitString[2]));
            point2 = new Point(Integer.parseInt(splitString[3]), Integer.parseInt(splitString[4]));
        } catch (NumberFormatException e) {
            throw new InvalidCommandException(ERROR_INVALID_POINTS_COORDINATES);
        }
        if (!point1.isValidPoint() || !point2.isValidPoint()) {
            throw new InvalidCommandException(ERROR_NOT_POSITIVE_POINT_COORDINATES);
        }
        if (!canvas.isPointInsideCanvas(point1) || !canvas.isPointInsideCanvas(point2)) {
            throw new InvalidCommandException(ERROR_POINT_OUTSIDE_CANVAS);
        }
    }

    @Override
    public void execute() {
        List<String> commands = new InputDeveloper()
                .with(DRAW_LINE, point1.getX(), point1.getY(), point2.getX(), point1.getY())
                .with(DRAW_LINE, point2.getX(), point2.getY(), point1.getX(), point2.getY())
                .with(DRAW_LINE, point1.getX(), point1.getY(), point1.getX(), point2.getY())
                .with(DRAW_LINE, point2.getX(), point2.getY(), point2.getX(), point1.getY())
                .build();
        InputExecutor.executeCommands(canvas, commands);
    }

}
