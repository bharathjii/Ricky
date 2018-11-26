package com.userInputDrawing;

import org.junit.Test;

import com.userInputDrawing.InputExecutor;
import com.userInputDrawing.services.Canvas;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InputTest {

    @Test
    public void testSingleCommand() {
        Canvas canvas = new Canvas();
        InputExecutor.executeCommand(canvas, "C 20 4");
        assertTrue(canvas.isCanvasInitialized());
    }

    @Test
    public void testMultipleCommands() {
        Canvas canvas = new Canvas();
        InputExecutor.executeCommands(canvas, Arrays.asList("C 20 4", "L 1 1 2 1"));
        assertTrue(canvas.isCanvasInitialized());
    }

    @Test
    public void testInvalidCommand() {
        Canvas canvas = new Canvas();
        InputExecutor.executeCommand(canvas, "C");
        assertFalse(canvas.isCanvasInitialized());
    }
}
