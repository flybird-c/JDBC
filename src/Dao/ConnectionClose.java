package Dao;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionClose {
//   @Test
    public void connectionClose(){
        try {
            Connection conn=DBUtils.getConn();
            if (conn!=null&&!conn.isClosed()){
                System.out.println("连接获取成功正在关闭");
                conn.close();
            }

//            Connection conn1 = Dao.DBUtils.getConn();
//            if (conn1 != null && !conn1.isClosed()){
//                System.out.println("连接获取成功正在关闭");
//                conn1.close();
//            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
