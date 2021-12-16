package com.salesianostriana.dam.validacion.simple.validadores;

import com.salesianostriana.dam.validacion.simple.anotaciones.StrongPassword;
import org.passay.*;
import org.springframework.beans.PropertyAccessorFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class StrongPasswordValidator implements ConstraintValidator<StrongPassword, Object> {

    private String passwordField;

    @Override
    public void initialize(StrongPassword constraintAnnotation) {
        passwordField = constraintAnnotation.passwordField();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        int min = 8, max = 20;
        boolean hasUpper = true;
        boolean hasLower = true;
        boolean hasNumber = true;
        boolean hasAlpha = true;
        boolean hasOthers = true;
        boolean validate = true;
        String password = (String) PropertyAccessorFactory.forBeanPropertyAccess(o).getPropertyValue(passwordField);

        Pattern specialCharPattern = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Pattern UpperCasePattern = Pattern.compile("[A-Z]");
        Pattern LowerCasePattern = Pattern.compile("[a-z]");
        Pattern digitCasePattern = Pattern.compile("[0-9]");
        Pattern AlphaCasePattern = Pattern.compile("[abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ]");




        if(password.length() <= min && password.length() >= max){
            validate = true;
        }

        if(!specialCharPattern.matcher(password).find()){
            validate = false;
        }

        if(!UpperCasePattern.matcher(password).find()){
            validate = false;
        }

        if(!LowerCasePattern.matcher(password).find()){
            validate = false;
        }

        if(!digitCasePattern.matcher(password).find()){
            validate = false;
        }

        if(!AlphaCasePattern.matcher(password).find()){
            validate = false;
        }

        return validate;
    }
}
