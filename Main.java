package oop.seminar_7.example.OOPSeminar_7;

import oop.seminar_7.example.OOPSeminar_7.data.Complex;
import oop.seminar_7.example.OOPSeminar_7.servise.Calculator;
import oop.seminar_7.example.OOPSeminar_7.view.ComplexView;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ComplexView complexView = new ComplexView();

        Complex number_1 = new Complex(10,4);
        Complex number_2 = new Complex(10,3);
        
        Complex resultAdd = calculator.add(number_1, number_2);
        Complex resultMultiplly = calculator.multiply(number_1, number_2);
        Complex resultDivide = calculator.divide(number_1, number_2);

        System.out.println("-------------");
        complexView.printOnConsole(number_1);
        complexView.printOnConsole(number_2);
        System.out.println("-------------");

        complexView.printOnConsole(resultAdd);
        complexView.printOnConsole(resultMultiplly);
        complexView.printOnConsole(resultDivide);
    }
    
    
}
