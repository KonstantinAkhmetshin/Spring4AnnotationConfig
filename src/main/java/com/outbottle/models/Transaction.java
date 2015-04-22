package com.outbottle.models;

public class Transaction {
    private int transactionId;
    private String panId;
    private String operationDescr;
    private String operationDate;

    public Transaction() {
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getPanId() {
        return panId;
    }

    public void setPanId(String panId) {
        this.panId = panId;
    }

    public String getOperationDescr() {
        return operationDescr;
    }

    public void setOperationDescr(String operationDescr) {
        this.operationDescr = operationDescr;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate;
    }
}
