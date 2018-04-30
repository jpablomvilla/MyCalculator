/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puj.calculadora;

import java.util.ArrayList;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author jpabl
 */

@Path("calculator")

public class Calc extends RestConf {

    private ArrayList <Integer> facts ;


    
    
    @GET
    @Path("add"+ util.MULTIPARAMETER)
    public String add(@PathParam("param") String param) {
        int result = 0;
        facts = new ArrayList<Integer>();
        util.getParams(param, facts);
        for(int i = 0; i< facts.size();i++){
            result = result + facts.get(i);
        }
        return String.valueOf(result);
    }

    @GET
    @Path("subs"+ util.MULTIPARAMETER)
    public String subtract(@PathParam("param") String param) {      
        int result = 0;
        facts = new ArrayList<Integer>();
        util.getParams(param, facts);
        for(int i = 0; i< facts.size();i++){
            if (i == 0){
                result = facts.get(i);
            }else{
                result = result - facts.get(i);
            }
        }
        return String.valueOf(result);
    }
    
    @GET
    @Path("mult"+ util.MULTIPARAMETER)
    public String multiply(@PathParam("param") String param) {
        int result = 1;
        facts = new ArrayList<Integer>();
        util.getParams(param, facts);
        for(int i = 0; i< facts.size();i++){
            result = result * facts.get(i);
        }
        return String.valueOf(result);
    }   
    @GET
    @Path("div"+ util.MULTIPARAMETER)
    public String div(@PathParam("param") String param) {
        System.out.println(param);
        double result = 0;
        facts = new ArrayList<Integer>();
        util.getParams(param, facts);
        for(int i = 0; i< facts.size();i++){
            if (i == 0){
                result = facts.get(i);
            }else{
                result = result / facts.get(i);
            }
        }
        return String.valueOf(result);
    }     
    
}
