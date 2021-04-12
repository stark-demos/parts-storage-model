package com.stark.parts_storage;

public class InventoryQueryRequest {
    private String partCode;

    public String getPartCode() {
        return partCode;
    }

    public void setPartCode(String partCode) {
        this.partCode = partCode;
    }

    @Override
    public String toString() {
        return "[InventoryQueryRequest]: partCode=" + partCode;
    }
}
