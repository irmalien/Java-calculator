/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Asus
 */
public class Logic {
    public String calculate(String calculation, double num1, double num2){
        String sum = "0";
        double sumDouble = 1.0;
        
        if (calculation.equals("+")){
            sumDouble = num1 + num2;

        }
        if (calculation.equals("-")){
            sumDouble = num1 - num2;
        }
        if (calculation.equals("/")){
            sumDouble = num1 / num2;
        }
        if (calculation.equals("x")){
            sumDouble = num1 * num2;
        }
        if (calculation.equals("^")){
            for(int i = 0; i<num2; i++){
            sumDouble = sumDouble * num1;
            }
        }
        if (calculation.equals("%")){
            sumDouble = (num2/num1) * 100;
        }
        
        //Reads the sum and will write removing unnecesery elements (i.e. .200)
        if (sumDouble % 1.0 != 0)
            sum = String.format("%s", sumDouble);
        else
            sum = String.format("%.0f",sumDouble);  
        
        return sum;
    }
}
