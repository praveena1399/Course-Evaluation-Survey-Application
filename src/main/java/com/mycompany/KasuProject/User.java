/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.KasuProject;


import java.util.ArrayList;
import java.util.HashMap;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author WORKSTATION
 */
class Application{
    static HashMap<String, String> users = new HashMap<String, String>();
    static ArrayList<String> usersCompleted = new ArrayList<String>();
    

}

@ManagedBean(name="user")  
@SessionScoped  
public class User {
    String name=null;
    String password=null;
    
    public User()
    {
        Application.users.put("","");
        Application.users.put("praveena","praveena123");
        Application.users.put("praveena@uhcl.edu","praveena123");
        // FacesContext context = FacesContext.getCurrentInstance();
        // context.getExternalContext().getSessionMap().put("usersDone", usersCompleted);
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getLogin() {
        return password;
    }

    public void setLogin(String password) {
        this.password = password;
    }
    
    public String login()
    {

        if(Application.users.containsKey(this.name) && Application.users.get(this.name).equals(this.password))
        {
            if(Application.usersCompleted.contains(this.name))
                return "";
            else{
                FacesContext context = FacesContext.getCurrentInstance();
                context.getExternalContext().getSessionMap().put("user", this);
                return "modules/home-page";
            }

        }
        return "failure";
//        System.out.println("Got Data!");
        
        
    }
    
    public String logout(){
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().invalidateSession();
        // return "../../index.xhtml/?faces-redirect=true";
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        try
        {
            ec.redirect(ec.getRequestContextPath() + "/");
        }
        catch (Exception e)
        {
            e.printStackTrace();   
        }
        return "";
    }

    public String formfilling()
    {
        if(Application.usersCompleted.contains(this.name) && this.name != null)
            return "";
        else
            return "module1";
            
    }
}
