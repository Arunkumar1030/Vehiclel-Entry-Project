package com.Project.ProjectBackend.entity;

import javax.persistence.*;


@Entity
@Table(name = "mrc")

public class Mrc {
    @Id
    @Column(name = "mrc_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mrcid;

    @Column(name = "mrc_number", length = 50)
    private String mrcnumber;

    @Column(name = "mrc_drivername", length = 50)
    private String mrcdrivername;

    @Column(name = "mrc_time", length = 50)
    private String mrctime;

    @Column(name = "mrc_date", length = 50)
    private String mrcdate;

    @Column(name = "mrc_place", length = 50)
    private String mrcplace;

    @Column(name = "mrc_loadone", length = 50)
    private String mrcloadone;

    @Column(name = "mrc_loadtwo", length = 50)
    private String mrcloadtwo;

    @Column(name = "mrc_status", length = 50)
    private String mrcstatus;

    public Mrc(int mrcid, String mrcnumber, String mrcdrivername, String mrctime, String mrcdate, String mrcplace, String mrcloadone, String mrcloadtwo, String mrcstatus) {
        this.mrcid = mrcid;
        this.mrcnumber = mrcnumber;
        this.mrcdrivername = mrcdrivername;
        this.mrctime = mrctime;
        this.mrcdate = mrcdate;
        this.mrcplace = mrcplace;
        this.mrcloadone = mrcloadone;
        this.mrcloadtwo = mrcloadtwo;
        this.mrcstatus = mrcstatus;
    }

    public Mrc() {
    }

    public Mrc(String mrcnumber, String mrcdrivername,String mrctime,String mrcdate, String mrcplace, String mrcloadone,String mrcloadtwo, String mrcstatus) {
        this.mrcnumber = mrcnumber;
        this.mrcdrivername = mrcdrivername;
        this.mrctime = mrctime;
        this.mrcdate = mrcdate;
        this.mrcplace = mrcplace;
        this.mrcloadone = mrcloadone;
        this.mrcloadtwo = mrcloadtwo;
        this.mrcstatus = mrcstatus;
    }

    public int getMrcid() {
        return mrcid;
    }

    public void setMrcid(int mrcid) {
        this.mrcid = mrcid;
    }

    public String getMrcnumber() {
        return mrcnumber;
    }

    public void setMrcnumber(String mrcnumber) {
        this.mrcnumber = mrcnumber;
    }

    public String getMrcdrivername() {
        return mrcdrivername;
    }

    public void setMrcdrivername(String mrcdrivername) {
        this.mrcdrivername = mrcdrivername;
    }

    public String getMrctime() {
        return mrctime;
    }

    public void setMrctime(String mrctime) {
        this.mrctime = mrctime;
    }

    public String getMrcdate() {
        return mrcdate;
    }

    public void setMrcdate(String mrcdate) {
        this.mrcdate = mrcdate;
    }


    public String getMrcplace() {
        return mrcplace;
    }

    public void setMrcplace(String mrcplace) {
        this.mrcplace = mrcplace;
    }

    public String getMrcloadone() {
        return mrcloadone;
    }

    public void setMrcloadone(String mrcloadone) {
        this.mrcloadone = mrcloadone;
    }

    public String getMrcloadtwo() {
        return mrcloadtwo;
    }

    public void setMrcloadtwo(String mrcloadtwo) {
        this.mrcloadtwo = mrcloadtwo;
    }
    public String getMrcstatus() {
        return mrcstatus;
    }

    public void setMrcstatus(String mrcstatus) {
        this.mrcstatus = mrcstatus;
    }

    @Override
    public String toString() {
        return "MrcDTO{" +
                "mrcid=" + mrcid +
                ", mrcnumber='" + mrcnumber + '\'' +
                ", mrcdrivername='" + mrcdrivername + '\'' +
                ", mrctime='" + mrctime + '\'' +
                ", mrcdate='" + mrcdate + '\'' +
                ", mrcplace='" + mrcplace + '\'' +
                ", mrcloadone='" + mrcloadone + '\'' +
                ", mrcloadtwo='" + mrcloadtwo + '\'' +
                ", mrcstatus='" + mrcstatus + '\'' +
                '}';
    }
}
