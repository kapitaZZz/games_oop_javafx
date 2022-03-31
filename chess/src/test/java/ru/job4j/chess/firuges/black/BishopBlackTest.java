package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        Cell start = Cell.A1;
        Figure blackBishop = new BishopBlack(Cell.A1);
        Assert.assertEquals(start, blackBishop.position());
    }

    @Test
    public void testCorrectWay() {
        Figure blackBishop = new BishopBlack(Cell.A1);
        Cell[] way = blackBishop.way(Cell.E5);
        Cell[] expected = {Cell.B2, Cell.C3, Cell.D4, Cell.E5};
        Assert.assertArrayEquals(way, expected);
    }

    @Test
    public void testIsDiagonal() {
        Cell start = Cell.A1;
        Cell dest = Cell.E5;
        BishopBlack bishopBlack = new BishopBlack(start);
        Assert.assertTrue(bishopBlack.isDiagonal(start, dest));

    }

    @Test
    public void testCopy() {
        Cell dest = Cell.E5;
        Figure blackBishop = new BishopBlack(Cell.A1);
        Assert.assertEquals(blackBishop.copy(dest).position(), dest);
    }
}