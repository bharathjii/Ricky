package com.userInputDrawing.inputs;

import com.userInputDrawing.exception.InvalidCommandException;
import com.userInputDrawing.services.Canvas;

abstract class DrawDiagram implements Inputs {
    protected Canvas canvas;
    String fullCommand;

    DrawDiagram(Canvas canvas, String fullCommand) {
        this.canvas = canvas;
        this.fullCommand = fullCommand;
    }

    @Override
    public void parseParameters() throws InvalidCommandException {
    }

    @Override
    public void execute() {
    }

}
