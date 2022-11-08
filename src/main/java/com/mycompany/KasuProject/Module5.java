package com.mycompany.KasuProject;

import java.util.HashMap;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name="module5")  
@SessionScoped
// @RequestScoped  
public class Module5{
    String q1,q2,q3,q4,q5,q6;

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

    public void setQ5(String q) {
        this.q5 = q;
    }
    public String getQ5() {
        return this.q5;
    }

    public void setQ6(String q) {
        this.q6 = q;
    }
    public String getQ6() {
        return this.q6;
    }


    public String next()
    {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getSessionMap().put("module5", this);
        return "module6";
    }

}
