package com.example.customQueries.entity.StatusEnum;

public enum StatusEnum {
    ONTIME("On Time"),
    DELAYED("Delayed"),
    CANCELLED("CANCELLED");
     private String statusEnum;

    StatusEnum(String statusEnum) {
        this.statusEnum = statusEnum;
    }

    StatusEnum() {
    }

    public String getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(String statusEnum) {
        this.statusEnum = statusEnum;
    }
}
