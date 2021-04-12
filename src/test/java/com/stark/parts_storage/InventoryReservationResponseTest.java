package com.stark.parts_storage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InventoryReservationResponseTest {
    @Test
    public void testReservationId() {
        InventoryReservationResponse irr = new InventoryReservationResponse();
        irr.setReservationId("ABC-abc-123");
        assertEquals("ABC-abc-123", irr.getReservationId());
    }

    @Test
    public void testRemainQuantity() {
        InventoryReservationResponse irr = new InventoryReservationResponse();
        irr.setRemainingParts(1);
        assertTrue("Compare remaining parts", irr.getRemainingParts() == 1);
    }
}
