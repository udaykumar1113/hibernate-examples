package com.uday.hibernate.entities;


import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="DATE_TIME")
public class TemporalDateTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int timeDateId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Temporal(TemporalType.TIME)
    private Date time;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;

    private java.sql.Date sqlDate;

    private java.sql.Time sqltime;

    private java.sql.Timestamp sqlDateTime;

    private java.sql.Timestamp sqlTimestamp;

    public int getTimeDateId() {
        return timeDateId;
    }

    public void setTimeDateId(int timeDateId) {
        this.timeDateId = timeDateId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public java.sql.Date getSqlDate() {
        return sqlDate;
    }

    public void setSqlDate(java.sql.Date sqlDate) {
        this.sqlDate = sqlDate;
    }

    public Time getSqltime() {
        return sqltime;
    }

    public void setSqltime(Time sqltime) {
        this.sqltime = sqltime;
    }

    public Timestamp getSqlDateTime() {
        return sqlDateTime;
    }

    public void setSqlDateTime(Timestamp sqlDateTime) {
        this.sqlDateTime = sqlDateTime;
    }

    public Timestamp getSqlTimestamp() {
        return sqlTimestamp;
    }

    public void setSqlTimestamp(Timestamp sqlTimestamp) {
        this.sqlTimestamp = sqlTimestamp;
    }
}
