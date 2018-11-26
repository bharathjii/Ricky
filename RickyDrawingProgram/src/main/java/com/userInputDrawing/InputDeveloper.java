package com.userInputDrawing;

import java.util.ArrayList;
import java.util.List;

import com.userInputDrawing.enums.UserInput;
import com.userInputDrawing.essentials.Constants;

public class InputDeveloper {
    private List<String> commandsList = new ArrayList<>();

    public InputDeveloper with(UserInput commandCode, Object... params) {
        StringBuilder s = new StringBuilder(commandCode.getCommandCode());
        for (Object param : params) {
            s.append(Constants.COMMAND_SEPARATOR);
            s.append(param.toString());
        }
        commandsList.add(s.toString());
        return this;
    }

    public List<String> build() {
        return commandsList;
    }
}
