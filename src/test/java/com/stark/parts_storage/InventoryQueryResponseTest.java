package com.stark.parts_storage;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InventoryQueryResponseTest {
    @Test
    public void testAvailableQuantitySetter() {
        InventoryQueryResponse iqr = new InventoryQueryResponse();
        iqr.setAvailableQuantity(1);
        assertTrue(1==iqr.getAvailableQuantity());
    }
}
