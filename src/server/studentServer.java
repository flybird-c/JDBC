package server;

import Dao.DBUtils;
import bean.Student;

import java.sql.*;
public class studentServer implements studentServerInterface{

    @Override
    public void addStudentToDB(Student x) throws SQLException, ClassNotFoundException {
        Connection con=DBUtils.getConn();
        Student student=x;
       if(setStudentToDB(student.getStuId())){
           System.out.println("该编号学生存在");
       }else {
           String sql = " insert into test values (?,?,?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setInt(1,student.getStuId());
           pst.setString(2,student.getStuName());
           pst.setString(3,student.getStuBirthday());
           pst.setString(4,student.getStuGender());
           //更新数据库
           pst.executeUpdate();

//            pst.executeQuery();
//           while (rs.next()){
//               System.out.println("学号:"+rs.getString(1));
//               System.out.println("姓名:"+rs.getString(2));
//               System.out.println("性别:"+rs.getString(3));
//               System.out.println("生日:"+rs.getString(4));
//           }
       }
    }

    @Override
    public void deleteStudentToDB(int id) throws SQLException, ClassNotFoundException {
        Connection con=DBUtils.getConn();
        String sql = "delete from test where id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,id);
        pst.executeUpdate();
    }

    @Override
    public void upDataStudentToDB(int id,Student x) throws SQLException, ClassNotFoundException {
        Connection con=DBUtils.getConn();
        String sql = "update from test where id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,id);
        pst.executeUpdate();
    }

    @Override
    public boolean setStudentToDB(int id) throws SQLException, ClassNotFoundException {
        Connection con=DBUtils.getConn();
        String sql = "select * from test where id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,id);
        ResultSet rs = pst.executeQuery();
        pst.execute();
            while (rs.next()){
                System.out.println("学号:"+rs.getString(1));
                System.out.println("姓名:"+rs.getString(2));
                System.out.println("性别:"+rs.getString(3));
                System.out.println("生日:"+rs.getString(4));
            }

        return true;
    }
}
