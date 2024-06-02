package qlsv;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SV {
	private String masv;
    private String hodem;
    private String tensv;
    private String telsv;
    private String emailsv;
    
    public void setMasv (String varMasv){
        this.masv=varMasv;
    }
    public void setHodem (String varHodem){
        this.hodem=varHodem;
    }
    public void setTensv (String varTensv){
        this.tensv=varTensv;
    }
    public void setTelsv(String varTelsv){
        this.telsv=varTelsv;
    }
    public void setEmailsv(String varEmailsv){
        this.emailsv=varEmailsv;
    }

    public String getMasv (){
        return this.masv;
    }
    public String getHodem (){
        return this.hodem;
    }
    public String getTensv (){
        return this.tensv;
    }
    public String getTelsv(){
        return this.telsv;
    }
    public String getEmailsv(){
        return this.emailsv;
    }
    
    
   

    public SV() {
		
	}
	public SV(String masv, String hodem, String tensv, String telsv, String emailsv) {
		super();
		this.masv = masv;
		this.hodem = hodem;
		this.tensv = tensv;
		this.telsv = telsv;
		this.emailsv = emailsv;
	}
}
