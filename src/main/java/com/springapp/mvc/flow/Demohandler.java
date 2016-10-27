package com.springapp.mvc.flow;

import com.springapp.mvc.forms.UserForm;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.xml.bind.ValidationException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class Demohandler {

    public UserBean initFlow() {
        return new UserBean();
    }

    public String validateDetails(UserBean userBean, MessageContext messageContext) {
        String status = "success";
        if (userBean.getUserId().isEmpty()) {
            messageContext.addMessage(new MessageBuilder().error().source(
                    "userId").defaultText("UserId cannot be Empty").build());
            status = "failure";
        }
        if (userBean.getEmail().isEmpty()) {
            messageContext.addMessage(new MessageBuilder().error().source(
                    "email").defaultText("Email cannot be Empty").build());
            status = "failure";
        }
        if (userBean.getAge() == null) {
            messageContext.addMessage(new MessageBuilder().error().source(
                    "age").defaultText("Age cannot be Empty").build());
            status = "failure";
        }
        return status;
    }

    public String validatePersonalData(UserForm userForm, MessageContext messageContext) {
        Map<String, List<String>> propertyMap = new LinkedHashMap<String, List<String>>();
        propertyMap.put("email", null);
        boolean valid = ModelValidator.validateModelProperties(userForm,
                propertyMap);

        String status = "success";
        if (!valid) {
            MessageContext messages = messageContext;//context.getMessageContext();
            for (Map.Entry<String, List<String>> entry : propertyMap.entrySet()) {
                String key = entry.getKey();
                List<String> values = entry.getValue();
                if (null != key && !key.isEmpty() && null != values
                        && null != values.get(0) && !values.get(0).isEmpty()) {
                    messages.addMessage(new MessageBuilder().error()
                            .source(key).defaultText(values.get(0)).build());
                }
            }
            status = "failure";
        }

//        if (userBean.getUserId().isEmpty()) {
//            messageContext.addMessage(new MessageBuilder().error().source(
//                    "userId").defaultText("UserId cannot be Empty").build());
//            status = "failure";
//        }
//        if (userBean.getEmail().isEmpty()) {
//            messageContext.addMessage(new MessageBuilder().error().source(
//                    "email").defaultText("Email cannot be Empty").build());
//            status = "failure";
//        }
//        if (userBean.getAge() == null) {
//            messageContext.addMessage(new MessageBuilder().error().source(
//                    "age").defaultText("Age cannot be Empty").build());
//            status = "failure";
//        }
        return status;
    }

    public String validateContactsData(UserForm userForm, MessageContext messageContext) {
        String status = "success";
//        if (userBean.getUserId().isEmpty()) {
//            messageContext.addMessage(new MessageBuilder().error().source(
//                    "userId").defaultText("UserId cannot be Empty").build());
//            status = "failure";
//        }
//        if (userBean.getEmail().isEmpty()) {
//            messageContext.addMessage(new MessageBuilder().error().source(
//                    "email").defaultText("Email cannot be Empty").build());
//            status = "failure";
//        }
//        if (userBean.getAge() == null) {
//            messageContext.addMessage(new MessageBuilder().error().source(
//                    "age").defaultText("Age cannot be Empty").build());
//            status = "failure";
//        }
        return status;
    }
}