package com.java.presentation;
import java.io.*;
import javax.script.*;  

public class Nashorn {  
    public static void main(String[] args) throws Exception{  
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
        ee.eval(new FileReader("hello.js"));  
    }  
}  