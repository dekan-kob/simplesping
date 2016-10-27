package com.springapp.mvc.flow;

import org.springframework.webflow.engine.model.AbstractModel;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.Serializable;
import java.util.*;

/**
 * @author Denis Koblov
 * @e-mail dekankob@gmail.com
 * @date 24.10.2016
 */
public class ModelValidator {
    private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    private static Validator validator = factory.getValidator();

    public static boolean validateModelProperties(Serializable model, Map<String, List<String>> messages) {
        boolean isValid = true;

        if (null == messages) {
            messages = new LinkedHashMap<String, List<String>>();
        }

        Set<ConstraintViolation<Serializable>> constraintViolations = null;

        for (String key : messages.keySet()) {
            constraintViolations = validator.validateProperty(model, key);

            if (constraintViolations.size() > 0) {
                isValid = false;
                List<String> values = new ArrayList<String>();
                for (ConstraintViolation<Serializable> violation : constraintViolations) {
                    values.add(violation.getMessage());
                }
                messages.put(key, values);
            }
        }

        return isValid;
    }
}