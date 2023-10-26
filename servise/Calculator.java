package oop.seminar_7.example.OOPSeminar_7.servise;

import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


import oop.seminar_7.example.OOPSeminar_7.data.Complex;

public class Calculator {
 

    static Logger LOGGER;
    static {
        try(FileInputStream ins = new FileInputStream("C:\\Users\\novos\\Documents\\Даша\\java\\oop\\seminar_7\\example\\OOPSeminar_7\\Loger\\Log.config")){
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Calculator.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }
    
    

    public Complex add(Complex a, Complex b){
        LOGGER.log(Level.CONFIG,"Operation add");
        Complex result = a.add(b);
        LOGGER.info("Result: " + result.toString());
        return result;
    }


    public Complex multiply(Complex a, Complex b){
        //LOGGER.log(Level.INFO,"Начало main, создаем лист с типизацией Integers");
        LOGGER.info("Operation multiply");
        Complex result = a.multiply(b);
        LOGGER.info("Result: " + result.toString());
        return result;
    }


    public Complex divide(Complex a, Complex b){        
        LOGGER.info("Operation divide");
        Complex result =  a.divide(b);
        LOGGER.info("Result: " + result.toString());
        return result;
    }
    
    

    
}
