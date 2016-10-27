package com.springapp.mvc.flow;

import org.springframework.webflow.core.FlowException;
import org.springframework.webflow.execution.FlowExecutionOutcome;
import org.springframework.webflow.execution.repository.NoSuchFlowExecutionException;
import org.springframework.webflow.mvc.servlet.AbstractFlowHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookingFlowHandler extends AbstractFlowHandler {

    private static final String DEFAULT_URL = "/flow/test";

    @Override
    public String handleExecutionOutcome(FlowExecutionOutcome outcome, HttpServletRequest request,
	    HttpServletResponse response) {
	return DEFAULT_URL;
    }

    @Override
    public String handleException(FlowException e, HttpServletRequest request, HttpServletResponse response) {
	if (e instanceof NoSuchFlowExecutionException) {
	    return DEFAULT_URL;
	} else {
	    throw e;
	}
    }

}
