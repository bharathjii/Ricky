package com.userInputDrawing.inputs;

import com.userInputDrawing.exception.InvalidCommandException;

public interface Inputs {

    void parseParameters() throws InvalidCommandException;

    void execute();
}
