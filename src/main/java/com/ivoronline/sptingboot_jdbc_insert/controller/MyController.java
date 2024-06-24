package com.ivoronline.sptingboot_jdbc_insert.controller;

import com.ivoronline.sptingboot_jdbc_insert.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.sql.SQLException;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired
  private MyService myService;

  //=========================================================================================================
  // INSERT
  //=========================================================================================================
  @ResponseBody
  @GetMapping("/insert")
  public int insert() throws SQLException {
    int    success = myService.insert("Jill", 40);
    return success;
  }

}
