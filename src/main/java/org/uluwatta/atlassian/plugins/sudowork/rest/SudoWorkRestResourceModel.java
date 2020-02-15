package org.uluwatta.atlassian.plugins.sudowork.rest;

import javax.xml.bind.annotation.*;
@XmlRootElement(name = "message")
@XmlAccessorType(XmlAccessType.FIELD)
public class SudoWorkRestResourceModel {

    @XmlElement(name = "value")
    private String message;

    public SudoWorkRestResourceModel() {
    }

    public SudoWorkRestResourceModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}