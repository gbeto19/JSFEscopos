/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsodecodigo;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@ConversationScoped
public class ConversationScopedManagedBean implements Serializable{
    @Inject
    private Conversation conversation;
    private int count = 0;
    
    public void iniciar(){
        if(isTransient()){
            conversation.setTimeout(1800000L);
            conversation.begin();
        }
    }
    
    private boolean isTransient(){
       return conversation.isTransient();
    }
    
    public int getCount(){
        return ++count;
    }
    
    public void setCount(int count){
        this.count = count;
    }
    
    public String finalizar(){
        if(!isTransient()){
          conversation.end();  
        }
        return "conversationScoped.xhtml?faces-redirect=true";
    }
    public String enviar(){
        return null; 
    }
}
