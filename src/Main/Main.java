package Main;

import bean.Student;
import server.studentServer;

import java.util.Date;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {
        studentServer ss=new studentServer();
//        Date date=new Date();
//        System.out.println(date.getTime());
//        java.sql.Date date1=new java.sql.Date(date.getTime());
//        System.out.println(date1);
//        String DateNow = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
//        Student stu=new Student("0","测试02",DateNow,"男");
        try {if (ss.setStudentToDB(10)){
            System.out.println("有数据");
        }else {
            System.out.println("没数据");
        }

//            ss.addStudentToDB(stu);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
