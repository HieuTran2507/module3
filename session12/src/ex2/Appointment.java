package ex2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Appointment {
    private String ID;
    private String paitentName;
    private String phoneNumber;
    private LocalDate date;
    private String doctor;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Appointment() {
    }

    public Appointment(String ID, String paitentName, String phoneNumber, LocalDate date, String doctor) {
        this.ID = ID;
        this.paitentName = paitentName;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.doctor = doctor;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPaitentName() {
        return paitentName;
    }

    public void setPaitentName(String paitentName) {
        this.paitentName = paitentName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void inputData(Scanner sc, List<Appointment> appointments){
        // nhập id
        while (true){
            String id = getInput.getString(sc, "nhập ID (6 ký tự): ");
            boolean chkID;
            if(id.length()==6){
                chkID = appointments.stream().anyMatch(a->a.getID().equals(id));
                if(!chkID){
                    this.ID = id;
                    break;
                }else System.out.println("ID đã tồn tại");
            } else System.out.println("vui lòng nhập đủ 6 ký tự");
        }

        // nhập tên bệnh nhân
        while (true){
            String paitentName = getInput.getString(sc,"nhập tên bệnh nhân: ");
            if(paitentName.length()>=10 && paitentName.length()<=50){
                this.paitentName = paitentName;
                break;
            }else System.out.println("vui lòng nhập từ 10 - 50 ký tự");
        }

        // nhập soo điện thoại
        while (true){
            String phone = getInput.getString(sc,"nhập sdt bệnh nhân: ");
            if(Pattern.matches("^(03|05|07|08|09)\\d{8}$",phone)){
                this.phoneNumber = phone;
                break;
            }else System.out.println("vui lòng nhập sdt VN");
        }

        // nhập ngày hẹn
        LocalDate date = getInput.getDate(sc,"nhập ngày hẹn: ");
        this.date = date;

        // nhập bác sĩ
        while (true){
            String doctor = getInput.getString(sc,"nhập tên bác sĩ: ");
            if (doctor.length()<=200){
                this.doctor = doctor;
                break;
            }else System.out.println("vui lòng nhập dưới 200 ký tự");
        }
    }

    @Override
    public String toString(){
        return "\nid cuộc hẹn: "+ID+
                "\ntên bệnh nhân: "+paitentName+
                "\nsdt: "+phoneNumber+
                "\nngày hẹn: "+date+
                "\nbác sĩ: "+doctor;
    }
}
