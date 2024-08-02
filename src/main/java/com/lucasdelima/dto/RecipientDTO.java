package com.lucasdelima.dto;

public class RecipientDTO {
    public static String recipientName;
    public static String recipientEmail;
    public static String recipientPhone;
    public static String recipientAddress;

    RecipientDTO(String recipientName, String recipientEmail, String recipientPhone, String recipientAddress) {
        this.recipientName = recipientName;
        this.recipientEmail = recipientEmail;
        this.recipientPhone = recipientPhone;
        this.recipientAddress = recipientAddress;
    }

    public static String getRecipientName() {
        return recipientName;
    }

    public static void setRecipientName(String recipientName) {
        RecipientDTO.recipientName = recipientName;
    }

    public static String getRecipientEmail() {
        return recipientEmail;
    }

    public static void setRecipientEmail(String recipientEmail) {
        RecipientDTO.recipientEmail = recipientEmail;
    }

    public static String getRecipientPhone() {
        return recipientPhone;
    }

    public static void setRecipientPhone(String recipientPhone) {
        RecipientDTO.recipientPhone = recipientPhone;
    }

    public static String getRecipientAddress() {
        return recipientAddress;
    }

    public static void setRecipientAddress(String recipientAddress) {
        RecipientDTO.recipientAddress = recipientAddress;
    }
}
