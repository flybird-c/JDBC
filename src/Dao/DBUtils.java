package Dao;


import properties.FinalData;
import properties.DBProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

 public static Connection getConn() throws ClassNotFoundException, SQLException {
  Connection conn=null;
  //驱动注册
  Class.forName(DBProperties.getProperties(FinalData.DRIVER_CLASS));
  //获取连接
  conn= DriverManager.getConnection(DBProperties.getProperties(FinalData.JDBC_JDBCURL),
          DBProperties.getProperties(FinalData.USER_NAME),
          DBProperties.getProperties(FinalData.JDBC_PASSWORD));
  //返回连接
  return conn;
 }
}