/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puj.calculadora;

import java.util.ArrayList;

/**
 * @author jpabl
 */

public class util {
    public static final String MULTIPARAMETER = "{param:(/?(-?[0-9]+))*}";
  //  public static final String MULTIPARAMETER_DIV = "{param:(/?(-?[0-9]+)/(-?[1-9]+))*}";
    

    public static void getParams(String stringPath,ArrayList<Integer> arrParams){
        String [] arrSting = stringPath.split("/");
        System.out.println("tamaño1 "+ arrSting.length);
        for(String itr : arrSting){
            if(!"".equals(itr)){
                System.out.println("tamaño "+arrParams.size());
                arrParams.add(Integer.valueOf(itr));
            }
        }
        
        
    }
    
    
}
