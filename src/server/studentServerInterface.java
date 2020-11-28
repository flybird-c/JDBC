package server;

import bean.Student;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface studentServerInterface {
    public default List<Student> selectDB(Connection x) {
        return null;
    }
    public void addStudentToDB(Student x) throws SQLException, ClassNotFoundException;
    public void deleteStudentToDB(int  id) throws SQLException, ClassNotFoundException;
    public void upDataStudentToDB(int  id,Student x) throws SQLException, ClassNotFoundException;
    public boolean setStudentToDB(int  id) throws SQLException, ClassNotFoundException;
}
