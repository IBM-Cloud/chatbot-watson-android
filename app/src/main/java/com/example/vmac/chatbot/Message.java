package com.example.vmac.chatbot;

/**
 * Created by VMac on 17/11/16.
 */

import java.io.Serializable;

public class Message implements Serializable {
    String id, message, createdAt;


    public Message() {
    }

    public Message(String id, String message, String createdAt) {
        this.id = id;
        this.message = message;
        this.createdAt = createdAt;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

}

