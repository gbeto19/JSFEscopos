/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsodecodigo;

import java.io.Serializable;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;



@ManagedBean(eager = true)
@ApplicationScoped
public class ApplicationScopedManagedBean implements Serializable{
    private int count = 0;
    
    
    public int getCount(){
        return ++count;
    }
    
    public void setCount(int count){
        this.count = count;
    }
    

    public String enviar(){
        return null; 
    }
}
