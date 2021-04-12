package com.stark.parts_storage;

public class InventoryQueryResponse extends InventoryQueryRequest {
    private Integer availableQuantity;

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public String toString() {
        return "[InventoryQueryResponse]: partCode=" + getPartCode() + "; availableQuantity: " + getAvailableQuantity();
    }
}
