package com.lucasdelima.dto;

import com.lucasdelima.database.DeliveryStatus;

public class DeliveryDTO {
    public static String recipientName;
    public static String recipientEmail;
    public static String recipientPhone;
    public static String recipientAddress;
    public static String deliveryCode;
    public static DeliveryStatus deliveryStatus;
    private static String deliveryId;
    private static String confirmationCode;

    public DeliveryDTO(String recipientName, String recipientEmail, String recipientPhone, String recipientAddress, String deliveryCode, DeliveryStatus deliveryStatus, String deliveryId, String confirmationCode) {
        this.recipientName = recipientName;
        this.recipientEmail = recipientEmail;
        this.recipientPhone = recipientPhone;
        this.recipientAddress = recipientAddress;
        this.deliveryCode = deliveryCode;
        this.deliveryStatus = deliveryStatus;
        this.deliveryId = deliveryId;
        this.confirmationCode = confirmationCode;
    }

    public static String getRecipientName() {
        return recipientName;
    }

    public static void setRecipientName(String recipientName) {
        DeliveryDTO.recipientName = recipientName;
    }

    public static String getRecipientEmail() {
        return recipientEmail;
    }

    public static void setRecipientEmail(String recipientEmail) {
        DeliveryDTO.recipientEmail = recipientEmail;
    }

    public static String getRecipientPhone() {
        return recipientPhone;
    }

    public static void setRecipientPhone(String recipientPhone) {
        DeliveryDTO.recipientPhone = recipientPhone;
    }

    public static String getRecipientAddress() {
        return recipientAddress;
    }

    public static void setRecipientAddress(String recipientAddress) {
        DeliveryDTO.recipientAddress = recipientAddress;
    }

    public static String getDeliveryCode() {
        return deliveryCode;
    }

    public static void setDeliveryCode(String deliveryCode) {
        DeliveryDTO.deliveryCode = deliveryCode;
    }

    public static DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public static void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        DeliveryDTO.deliveryStatus = deliveryStatus;
    }

    public static String getDeliveryId() {
        return deliveryId;
    }

    public static void setDeliveryId(String deliveryId) {
        DeliveryDTO.deliveryId = deliveryId;
    }

    public static String getConfirmationCode() {
        return confirmationCode;
    }

    public static void setConfirmationCode(String confirmationCode) {
        DeliveryDTO.confirmationCode = confirmationCode;
    }
}
