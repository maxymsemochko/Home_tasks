package com.softserve.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tapeMeasureTest {
    tapeMeasure measure = new tapeMeasure();
    @Test
    void isOut() {
        assertTrue(measure.isOut(true));
    }

    @Test
    void isNotOut() {
        assertFalse(measure.isNotOut(false));
    }

    @Test
    void holdButton() {
        assertTrue(measure.holdButton(true));
    }

    @Test
    void noHoldButton() {
        assertFalse(measure.noHoldButton(false));
    }
}