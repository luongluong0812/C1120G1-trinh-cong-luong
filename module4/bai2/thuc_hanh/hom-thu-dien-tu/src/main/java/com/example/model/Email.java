package com.example.model;

public class Email {
    private String languages;
    private int pageSize;
    private String spam;
    private String signature;

    public Email() {
    }

    public Email(String languages, int pageSize, String spam, String signature) {
        this.languages = languages;
        this.pageSize = pageSize;
        this.spam = spam;
        this.signature = signature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSpam() {
        return spam;
    }

    public void setSpam(String spam) {
        this.spam = spam;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
