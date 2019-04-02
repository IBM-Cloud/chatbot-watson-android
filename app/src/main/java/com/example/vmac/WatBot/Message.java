package com.example.vmac.WatBot;

/**
 * Created by VMac on 17/11/16.
 */

import com.ibm.watson.developer_cloud.assistant.v2.model.DialogRuntimeResponseGeneric;

import java.io.Serializable;

public class Message implements Serializable {
    String id, message, url, title, description;
    Type type;
    public Message() {
        this.type = Type.TEXT;
    }


    public Message(String id, String message, String createdAt) {
        this.id = id;
        this.message = message;


    }

    public Message(DialogRuntimeResponseGeneric r) {
        this.message = "";
        this.title = r.getTitle();
        this.description = r.getDescription();
        this.url = r.getSource();
        this.id = "2";
        this.type = Type.IMAGE;
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

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public enum Type {
        TEXT,
        IMAGE
    }
}

