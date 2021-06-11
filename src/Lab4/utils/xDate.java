/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author namxg
 */
public class xDate {
    private static SimpleDateFormat formater = new SimpleDateFormat();
    public static Date parse(String text, String pattern) throws RuntimeException{
        try{
            formater.applyPattern(pattern);
            return formater.parse(text);
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static Date parse(String text) throws RuntimeException{
        return xDate.parse(text,"dd-MM-yyyy");
    }
    
}
