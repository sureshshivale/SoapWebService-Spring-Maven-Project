package com.example.controller;

import org.example.applicantservice.ApplicantException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Applicant;
import com.example.model.Location;
import com.example.model.Shop;
import com.example.webService.client.ApplicantServiceClient;

@Controller
@RequestMapping(value = "/webapp")
public class BaseController {

	private static int counter = 0;
	private static final String VIEW_INDEX = "index";
	private final static org.slf4j.Logger logger = LoggerFactory
			.getLogger(BaseController.class);

	@Autowired
	private ApplicantServiceClient applicantServiceClient;
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(ModelMap model) {

		logger.info("Entered in welcome()");
		model.addAttribute("message", "Welcome");
		model.addAttribute("counter", ++counter);
		logger.debug("[welcome] counter : {}", counter);
		logger.info("Ended welcome()");
		return VIEW_INDEX;

	}

	@RequestMapping(value = "/welcome/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {

		logger.info("Entered in welcomeName()");
		model.addAttribute("message", "Welcome " + name);
		model.addAttribute("counter", ++counter);
		logger.debug("[welcomeName] counter : {}", counter);
		logger.info("Ended welcomeName()");
		return VIEW_INDEX;

	}

	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public @ResponseBody
	Shop getShopInJson() {
		logger.info("Entered in getShopInJson()");
		final Shop shop = new Shop();
		shop.setShopName("KFC");
		shop.setShopLocation(new String[] { "Pune", "Kolkata", "Mumbai",
				"Delhi" });
		logger.info("Ended getShopInJson()");
		return shop;
	}

	@RequestMapping(value = "/location", method = RequestMethod.GET)
	public @ResponseBody
	Location getLocationInXml() {
		logger.info("Entered in getLocationInXml()");
		final Location location = new Location();
		location.setLocationId("A101");
		location.setLocationName("Alska");
		location.setAreaCode("42156");
		location.setBranches(new String[]{"BranchA1","BranchA2","BranchA3"});
		logger.info("Ended getLocationInXml()");
		return location;
	}
	
	@RequestMapping(value = "/applicant/{applicantCode}", method = RequestMethod.GET)
	public @ResponseBody Applicant searchApplicant(@PathVariable final String applicantCode) throws ApplicantException{
		logger.info("Entered in searchApplicant()");
		final Applicant applicant = applicantServiceClient.searchApplicant(applicantCode);
		logger.info("Ended searchApplicant()");
		return applicant;
	}
}