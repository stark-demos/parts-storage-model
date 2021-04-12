package com.stark.parts_storage;

public class InventoryReservationRequest {
    private String partCode;
    private Integer quantity;
    private String repairRequestId;

    public String getPartCode() {
        return partCode;
    }

    public void setPartCode(String partCode) {
        this.partCode = partCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getRepairRequestId() {
        return repairRequestId;
    }

    public void setRepairRequestId(String repairRequestId) {
        this.repairRequestId = repairRequestId;
    }

    @Override
    public String toString() {
        return "[InventoryReservationRequest]: partCode: " + getPartCode() + ", repairRequestId: "
                + getRepairRequestId() + ", quantity: " + getQuantity();
    }
}
