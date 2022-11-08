package com.mycompany.KasuProject;


import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name="module2")  
@SessionScoped  
public class Module2{
    String q1,q2,q3;

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

    public String next()
    {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getSessionMap().put("module2", this);
        return "module3";
    }

}
