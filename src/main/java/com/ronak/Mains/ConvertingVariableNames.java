package com.ronak.Mains;

public class ConvertingVariableNames {
    String input = "thisIsAVariable"; // OR "this_is_a_variable"

    public static void main(String[] args) {
        ConvertingVariableNames obj = new ConvertingVariableNames();
        StringBuffer stringBuffer = new StringBuffer();
        if (obj.input.lastIndexOf("_") >= 0) {
            boolean skip = false;
            for (int i = 0; i < obj.input.length(); i++) {
                if (obj.input.charAt(i) == '_') {
                    stringBuffer.append(Character.toUpperCase(obj.input.charAt(i + 1)));
                    skip = true;
                } else if (skip) {
                    skip = false;
                } else {
                    stringBuffer.append(obj.input.charAt(i));
                    skip = false;
                }
            }
            System.out.println(" Result " + stringBuffer);
        } else {
            for (int i = 0; i < obj.input.length(); i++) {
                if (Character.isUpperCase(obj.input.charAt(i))) {
                    stringBuffer.append("_");
                    stringBuffer.append(Character.toLowerCase(obj.input.charAt(i)));
                } else {
                    stringBuffer.append(obj.input.charAt(i));
                }
            }
            System.out.println("Result " + stringBuffer);
        }
    }

}


