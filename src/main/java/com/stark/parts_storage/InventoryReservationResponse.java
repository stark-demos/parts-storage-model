package com.stark.parts_storage;

public class InventoryReservationResponse extends InventoryReservationRequest {
    private String reservationId;
    private Integer remainingParts;

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Integer getRemainingParts() {
        return remainingParts;
    }

    public void setRemainingParts(Integer remainingParts) {
        this.remainingParts = remainingParts;
    }

    @Override
    public String toString() {
        return "[InventoryReservationResponse]: partCode: " + getPartCode() + ", repairRequestId: "
                + getRepairRequestId() + ", quantity: " + getQuantity() + ", reservationId: " + getReservationId()
                + ", remainingParts: " + getRemainingParts();
    }

}
