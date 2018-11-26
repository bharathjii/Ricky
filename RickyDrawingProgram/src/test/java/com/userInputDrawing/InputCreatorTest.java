package com.userInputDrawing;

import org.junit.Test;

import com.userInputDrawing.InputsCreator;
import com.userInputDrawing.inputs.*;
import com.userInputDrawing.services.Canvas;

import static org.junit.Assert.assertTrue;

public class InputCreatorTest {

    @Test
    public void testEmptyCommand() {
        Inputs command = InputsCreator.getCommand(new Canvas(), "");
        assertTrue("Factory returned wrong instance", command instanceof Help);
    }

    @Test
    public void testCreateCanvas() {
        Inputs command = InputsCreator.getCommand(new Canvas(), "C");
        assertTrue("Factory returned wrong instance", command instanceof CreateInput);
    }

    @Test
    public void testDrawLine() {
        Inputs command = InputsCreator.getCommand(new Canvas(), "L");
        assertTrue("Factory returned wrong instance", command instanceof InputLine);
    }

    @Test
    public void testDrawRectangle() {
        Inputs command = InputsCreator.getCommand(new Canvas(), "R");
        assertTrue("Factory returned wrong instance", command instanceof RectangleInput);
    }

    @Test
    public void testFillBucket() {
        Inputs command = InputsCreator.getCommand(new Canvas(), "B");
        assertTrue("Factory returned wrong instance", command instanceof FillInput);
    }

    @Test
    public void testHelpCommand() {
        Inputs command = InputsCreator.getCommand(new Canvas(), "H");
        assertTrue("Factory returned wrong instance", command instanceof Help);
    }

    @Test
    public void testQuitCommand() {
        Inputs command = InputsCreator.getCommand(new Canvas(), "Q");
        assertTrue("Factory returned wrong instance", command instanceof InputQuit);
    }

    @Test
    public void testInvalidCommand() {
        Inputs command = InputsCreator.getCommand(new Canvas(), "Z");
        assertTrue("Factory returned wrong instance", command instanceof Help);
    }
}
