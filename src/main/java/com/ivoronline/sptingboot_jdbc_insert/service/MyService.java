package com.ivoronline.sptingboot_jdbc_insert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Service
public class MyService {

  //PROPERTIES
  @Autowired private DataSource dataSource;

  //=========================================================================================================
  // INSERT
  //=========================================================================================================
  public int insert(String name, Integer age) throws SQLException {

    //GET DB CONNECTION
    Connection connection = dataSource.getConnection();

    //INSERT RECORDS
    String    sql       = "INSERT INTO PERSON (NAME, AGE) VALUES ('"+name+"',+"+age+")";
    Statement statement = connection.createStatement();
    int       success   = statement.executeUpdate(sql);

    //RETURN SUCCESS
    return success;

  }

}
