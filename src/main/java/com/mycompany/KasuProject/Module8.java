package com.mycompany.KasuProject;

import java.util.HashMap;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

@ManagedBean(name="module8")  
@SessionScoped
// @RequestScoped  
public class Module8{
    @ManagedProperty(value="#{user.name}")
    private String username ;
    
    String q1,q2,q3,q4,q5,q6,q7,q8;

    public void setQ1(String q1) {
        this.q1 = q1;
    }
    public String getQ1() {
        return this.q1;
    }

    public void setQ2(String q) {
        this.q2 = q;
    }
    public String getQ2() {
        return this.q2;
    }

    public void setQ3(String q) {
        this.q3 = q;
    }
    public String getQ3() {
        return this.q3;
    }

    public void setQ4(String q) {
        this.q4 = q;
    }
    public String getQ4() {
        return this.q4;
    }

    public void setUsername(String q) {
        this.username = q;
    }
    public String getUsername() {
        return this.username;
    }

    public String next()
    {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getSessionMap().put("module8", this);
        System.out.println("asdfasdf: " + username);
        Application.usersCompleted.add(username);
        for(String n : Application.usersCompleted)
        System.out.println("Users: "+ n);
        // context.getExternalContext().getSessionMap().get("usersDone").add()
        return "finish-and-view";
    }

    public String home()
    {
        return "home-page";
    }
}
