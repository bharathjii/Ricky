package com.userInputDrawing.inputs;

import com.userInputDrawing.exception.InvalidCommandException;
import com.userInputDrawing.services.Canvas;

public class InputQuit extends DrawDiagram {
    public InputQuit(Canvas canvas, String fullCommand) {
        super(canvas, fullCommand);
    }

    @Override
    public void parseParameters() throws InvalidCommandException {
    }

    @Override
    public void execute() {
        canvas.setCanvasActive(false);
    }

}
