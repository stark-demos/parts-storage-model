package com.stark.parts_storage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InventoryReservationRequestTest {
    @Test
    public void testPartCode() {
        InventoryReservationRequest irr = new InventoryReservationRequest();
        irr.setPartCode("PART-CODE");

        assertEquals("PART-CODE", irr.getPartCode());
    }

    @Test
    public void testQuantity() {
        InventoryReservationRequest irr = new InventoryReservationRequest();
        irr.setQuantity(1);
        assertTrue("quantity compare", 1 == irr.getQuantity());
    }

    @Test
    public void testRequestId() {
        InventoryReservationRequest irr = new InventoryReservationRequest();
        irr.setRepairRequestId("ABC-abc-123");
        assertEquals("ABC-abc-123", irr.getRepairRequestId());
    }

    @Test
    public void testBranchCode() {
        InventoryReservationRequest irr = new InventoryReservationRequest();
        irr.setBranchCode("ABC-abc-123");
        assertEquals("ABC-abc-123", irr.getBranchCode());
    }

}
