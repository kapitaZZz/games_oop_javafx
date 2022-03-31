package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.QueenBlack;

public class LogicTest {

    @Test(expected = ImpossibleMoveException.class)
    public void testPositionPointNotFound() throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A3));
        logic.move(Cell.A3, Cell.D7);
    }

    @Test(expected = OccupiedCellException.class)
    public void wrongMoveOnOccupiesCell() throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.add(new QueenBlack(Cell.D4));
        logic.move(Cell.A1, Cell.D4);
    }

    @Test(expected = FigureNotFoundException.class)
    public void testFigureNotFound() throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A3));
        logic.move(Cell.E2, Cell.D1);
    }
}