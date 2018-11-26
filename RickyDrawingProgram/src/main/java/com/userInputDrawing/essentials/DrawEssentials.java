package com.userInputDrawing.essentials;

import static com.userInputDrawing.essentials.Constants.COMMAND_SEPARATOR;

import org.apache.commons.lang3.StringUtils;

import com.userInputDrawing.services.Point;

public class DrawEssentials {
    private DrawEssentials() {
    }

    public static boolean isStraightLine(Point point1, Point point2) {
        return point1.getX() == point2.getX() || point1.getY() == point2.getY();
    }

    public static boolean isHorizontalLine(Point point1, Point point2) {
        return point1.getX() == point2.getX();
    }

    public static boolean isVerticalLine(Point point1, Point point2) {
        return point1.getY() == point2.getY();
    }

    public static Point getRightPoint(Point point) {
        return new Point(point.getX() + 1, point.getY());
    }

    public static Point getLeftPoint(Point point) {
        return new Point(point.getX() - 1, point.getY());
    }

    public static Point getAbovePoint(Point point) {
        return new Point(point.getX(), point.getY() - 1);
    }

    public static Point getBelowPoint(Point point) {
        return new Point(point.getX(), point.getY() + 1);
    }

    public static String[] getCommandParams(String fullCommand) {
        return StringUtils.split(fullCommand, COMMAND_SEPARATOR);
    }
}
