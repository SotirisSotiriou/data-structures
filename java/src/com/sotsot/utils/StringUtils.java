package com.sotsot.utils;

import java.math.BigInteger;

public abstract class StringUtils {
    
    /** 
     * @param str
     * @return boolean
     */
    public static boolean isNumeric(String str){
        if(str == null) return false;
        try{
            Integer.parseInt(str);
            Double.parseDouble(str);
            Float.parseFloat(str);
            Long.parseLong(str);
            new BigInteger(str);
        } catch(NumberFormatException e){
            return false;
        }
        return true;
    }

    
    /** 
     * @param str
     * @return boolean
     */
    public static boolean isFloat(String str){
        if(str == null) return false;
        try{
            Float.parseFloat(str);
        } catch(NumberFormatException e){
            return false;
        }
        return true;
    }

    
    /** 
     * @param str
     * @return boolean
     */
    public static boolean isInteger(String str){
        if(str == null) return false;
        try{
            Integer.parseInt(str);
        } catch(NumberFormatException e){
            return false;
        }
        return true;
    }

    
    /** 
     * @param str
     * @return boolean
     */
    public static boolean isDouble(String str){
        if(str == null) return false;
        try{
            Double.parseDouble(str);
        } catch(NumberFormatException e){
            return false;
        }
        return true;
    }

    
    /** 
     * @param str
     * @return boolean
     */
    public static boolean isLong(String str){
        if(str == null) return false;
        try{
            Long.parseLong(str);
        } catch(NumberFormatException e){
            return false;
        }
        return true;
    }
}
