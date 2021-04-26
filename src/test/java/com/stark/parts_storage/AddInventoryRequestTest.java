package com.stark.parts_storage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AddInventoryRequestTest {
    @Test
    public void testPartCode() {
        AddInventoryRequest irr = new AddInventoryRequest();
        irr.setPartCode("PART-CODE");

        assertEquals("PART-CODE", irr.getPartCode());
    }

    @Test
    public void testQuantity() {
        AddInventoryRequest irr = new AddInventoryRequest();
        irr.setQuantity(1);
        assertTrue("quantity compare", 1 == irr.getQuantity());
    }
}
