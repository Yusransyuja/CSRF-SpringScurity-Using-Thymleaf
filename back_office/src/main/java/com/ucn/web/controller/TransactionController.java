package com.ucn.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ucn.web.message.transactionForm;

@Controller
@RequestMapping (value = "/transaction")
public class TransactionController {

	private static Logger logger = LogManager.getLogger(TransactionController.class);
	
	
	@PostMapping(value="/doShowEntry")
	public String doTransfer(transactionForm form, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		try {
			
		}catch (Exception e) {
			logger.error("Exception", e);
			form.setErrorMessage(e.getMessage());
		}
		return "common/main";
	}
	
}
