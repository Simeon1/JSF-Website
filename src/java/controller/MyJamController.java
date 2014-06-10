/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.MyJamModel;
import model.SongDescription;

/**
 *
 * @author simeon
 */
@ManagedBean(name="controller")
@SessionScoped
public class MyJamController implements Serializable{
    private static long serialVersionUID = -3377875199072595764L;
    private MyJamModel model;
    public MyJamController(){
        model = new MyJamModel();
       
    }
    public void setModel(MyJamModel model){
        this.model = model;
    }
    public MyJamModel getModel(){
        model.addItems(new ArrayList<SongDescription>());
        return model;
    }
    
}
/*

    private ShannonsTheoremModel model;
    
    public ShannonsTheoremController(){
        super();
        model = new ShannonsTheoremModel();
    }
    public ShannonsTheoremModel getModel(){
        return model;
    }

    public String doCalculateMDR(){
        model.calculateMDR();
        return "index";
    }
*/

