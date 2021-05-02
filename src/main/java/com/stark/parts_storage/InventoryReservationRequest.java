package com.stark.parts_storage;

public class InventoryReservationRequest {
    private String partCode;
    private Integer quantity;
    private String repairRequestId;
    private String branchCode;

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

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    @Override
    public String toString() {
        return "[InventoryReservationRequest]: partCode: " + getPartCode() + ", repairRequestId: "
                + getRepairRequestId() + ", quantity: " + getQuantity() + ", branchCode: " + getBranchCode();
    }
}
