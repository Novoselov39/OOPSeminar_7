package oop.seminar_7.example.OOPSeminar_7.servise;

import java.util.logging.Logger;

import oop.seminar_7.example.OOPSeminar_7.data.Complex;

public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    public Complex add(Complex a, Complex b){
        LOGGER.info("Операция сложения комплексных чисел");
        Complex result = a.add(b);
        LOGGER.info("Результат: " + result.toString());
        return result;
    }


    public Complex multiply(Complex a, Complex b){
        LOGGER.info("Операция умножения комплексных чисел");
        Complex result = a.multiply(b);
        LOGGER.info("Результат: " + result.toString());
        return result;
    }


    public Complex divide(Complex a, Complex b){
        LOGGER.info("Операция деления комплексных чисел");
        Complex result =  a.divide(b);
        LOGGER.info("Результат: " + result.toString());
        return result;
    }
    
    

    
}
