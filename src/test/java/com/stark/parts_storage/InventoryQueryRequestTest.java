package com.stark.parts_storage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InventoryQueryRequestTest {
    @Test
    public void testInventoryPartCodeAcceptsNumbers() {
        InventoryQueryRequest iqr = new InventoryQueryRequest();
        String value = "1";
        iqr.setPartCode(value);
        assertEquals(value, iqr.getPartCode());
    }

    @Test
    public void testInventoryPartCodeAcceptsAlphanumeric() {
        InventoryQueryRequest iqr = new InventoryQueryRequest();
        String value = "ABC-abc-1";
        iqr.setPartCode(value);
        assertEquals(value, iqr.getPartCode());
    }
}
