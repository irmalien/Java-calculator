/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7_package;

/**
 *
 * @author Asus
 */
public class Aprekins {
    public String aprekinsAll(String darbibaString, double num1, double num2){
        String summa = "0";
        double summaDouble = 1.0;
        
        if (darbibaString.equals("+")){
            summaDouble = num1 + num2;

        }
        if (darbibaString.equals("-")){
            summaDouble = num1 - num2;
        }
        if (darbibaString.equals("/")){
            summaDouble = num1 / num2;
        }
        if (darbibaString.equals("x")){
            summaDouble = num1 * num2;
        }
        if (darbibaString.equals("^")){
            for(int i = 0; i<num2; i++){
            summaDouble = summaDouble * num1;
            }
        }
        if (darbibaString.equals("%")){
            summaDouble = (num2/num1) * 100;
        }
        
        //Reads the sum and will write removing unnecesery elements (i.e. .200)
        if (summaDouble % 1.0 != 0)
            summa = String.format("%s", summaDouble);
        else
            summa = String.format("%.0f",summaDouble);  
        
        return summa;
    }
}
