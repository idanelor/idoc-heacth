package com.dchealth.VO;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/11/28.
 */
public class MessageSendDetail {
    private String id;
    private String title;
    private String content;
    private String sendId;
    private String userName;
    private String status;
    private Timestamp createDate;

    public MessageSendDetail() {
    }

    public MessageSendDetail(String id, String title, String content,String sendId, String userName, String status, Date createDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.sendId = sendId;
        this.userName = userName;
        this.status = status;
        this.createDate = new Timestamp(createDate.getTime());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }
}
