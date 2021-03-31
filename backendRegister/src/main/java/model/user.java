package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users_info")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_Name")
    private String userName;

    @Column(name = "Mob_no")
    private int Mobno;

    @Column(name = "Email_id")
    private String Emailid;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailid() {
        return Emailid;
    }

    public void setEmailid(String Emailid) {
        this.Emailid = Emailid;
    }

    public String getMobno() {
        return Mobno;
    }

    public void setMobno(String Mobno) {
        this.Mobno = Mobno;
    }
}
