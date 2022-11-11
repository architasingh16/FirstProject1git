/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.utility.firstproject1;

/**
 *
 * @author archita
 */
public class FirstProject1 {
   private int id;
   private String name;
   
public FirstProject1() {
    }
   
    public FirstProject1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "FirstProject1{" + "id=" + id + ", name=" + name + '}';
    }

    
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
   
   
   
   
    
}
