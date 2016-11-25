package com.example.johncarter.ahhkaya.Notification;

/**
 * Created by john carter on 11/24/2016.
 */

public class NotificationModel {
    private String name;
    private String message;
    private int imageId;
    private int imageId2;

    public NotificationModel(String name, String message, int imageId, int imageId2) {
        this.name = name;
        this.message = message;
        this.imageId = imageId;
        this.imageId2 = imageId2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getImageId2() {
        return imageId2;
    }
}
