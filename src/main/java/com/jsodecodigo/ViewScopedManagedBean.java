/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsodecodigo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class ViewScopedManagedBean {
    private int count = 0;
    
    
    public int getCount(){
        return ++count;
    }
    
    public void setCount(int count){
        this.count = count;
    }
    
    
}
