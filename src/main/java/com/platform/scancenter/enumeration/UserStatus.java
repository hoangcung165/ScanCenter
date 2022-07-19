package com.platform.scancenter.enumeration;

public enum UserStatus {
    ACTIVE(1),
    DISABLE(2);

    private Integer statusId;

    UserStatus(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
}
