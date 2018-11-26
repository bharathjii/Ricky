package com.userInputDrawing.enums;

public enum UserInput {
    CREATE_CANVAS("C"),
    DRAW_LINE("L"),
    DRAW_RECTANGLE("R"),
    FILL_BUCKET("B"),
    QUIT("Q"),
    HELP("H");

    private String commandCode;

    UserInput(String commandCode) {
        this.commandCode = commandCode;
    }

    public String getCommandCode() {
        return commandCode;
    }

}
