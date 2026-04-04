package ex2;

import ex1.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppointmentBusiness {
    private List<Appointment> appointments;

    public AppointmentBusiness() {
        appointments = new ArrayList<>();
    }

    // nhập dữ liệu
    public void addAppointment(Scanner sc){
        Appointment newAppointment = new Appointment();
        newAppointment.inputData(sc,appointments);
        appointments.add(newAppointment);
        System.out.println("thêm lịch hẹn thành công");
    }

    // hiển thị danh sách
    public void display(){
        appointments.forEach(a-> System.out.println(a));
    }

    // tìm kiếm theo tên bệnh nhân
    public void paitentSearch(Scanner sc){
        String paitent = getInput.getString(sc,"nhập tên bệnh nhân cần tìm: ");
        List<Appointment> a = appointments.stream()
                .filter(p->p.getPaitentName().toLowerCase().contains(paitent))
                .toList();
        if (a.isEmpty()) System.out.println("không tìm thấy bệnh nhân");
        else a.forEach(p-> System.out.println(p));
    }

    // cập nhật theo ID
    public void update(Scanner sc){
        String id = getInput.getString(sc,"nhập id cuộc hẹn: ");
        Appointment ap = findID(id);
        if (ap == null) {
            System.out.println("không tìm thấy cuộc hẹn");
            return;
        }

        String paitent = getInput.getString(sc,"nhập tên bênhj nhân: ");
        ap.setPaitentName(paitent);
        String phone = getInput.getString(sc,"nhập s điện thoại: ");
        ap.setPhoneNumber(phone);
        LocalDate date = getInput.getDate(sc,"nhập ngày khám: ");
        ap.setDate(date);
        String doctor = getInput.getString(sc,"nhập tên bác sĩ: ");
        ap.setDoctor(doctor);
        System.out.println("update thành công");
    }
    private Appointment findID(String id){
        return appointments.stream()
                .filter(p->p.getID().equals(id))
                .findFirst()
                .orElse(null);
    }

    // xóa lịch hẹn theo ID,có xác nhận trước khi xóa
    public void delete(Scanner sc){
        String id = getInput.getString(sc,"nhập id cần xóa: ");
        Appointment ap = findID(id);
        if(ap == null) System.out.println("không tìm thấy cuộc hẹn");
        else {
            while (true){
                String chk = getInput.getString(sc,"xác nhận xóa (y/n): ");
                if (chk.equals("n")){
                    System.out.println("xóa không thành công");
                    return;
                }
                else if (chk.equals("y")) {
                    appointments.remove(ap);
                    System.out.println("xóa thành công");
                    return;
                }
                else System.out.println("vui lòng nhập y hoặc n");
            }
        }
    }

    // thống kê tổng số lịch hẹn và số lịch hẹn theo từng bác sĩ
    public void statistic(){
        // tổng số lịch hẹn
        System.out.println("tổng số lịch hẹn: "+appointments.size());

        // theo từng basc sĩ
        Map<String,Long> result = appointments.stream()
                .collect(Collectors.groupingBy(
                        Appointment::getDoctor,
                        Collectors.counting()
                ));
        result.forEach((doctor,count)-> System.out.println("bác sĩ: "+doctor+", cuộc hẹn: "+count));
    }
}
