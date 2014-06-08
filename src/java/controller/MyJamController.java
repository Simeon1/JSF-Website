/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author simeon
 */
@ManagedBean(name="controller")
@SessionScoped
public class MyJamController {
    
}

public class ShannonsTheoremController implements Serializable{
    private static long serialVersionUID = -3377875199072595764L;
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
}
