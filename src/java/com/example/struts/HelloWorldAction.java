/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.struts;

/**
 *
 * @author Varun
 */
public class HelloWorldAction{
   private String name;

   public String execute() throws Exception {
      return "success";
   }
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}