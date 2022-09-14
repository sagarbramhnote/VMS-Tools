package com.vms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/app_profile")
	public String app_profile() {
		return "app-profile";
	}
	
	@GetMapping("/email_inbox")
	public String email_inbox() {
		return "email-inbox";
	}
	
	
	// Dashboard 
	
	@GetMapping("/jobs")
	public String jobs() {
		return "jobs-page";
	}
	
	@GetMapping("/application")
	public String application() {
		return "application-page";
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "my-profile";
	}
	
	@GetMapping("/statistics")
	public String statistics() {
		return "statistics-page";
	}
	
	@GetMapping("/companies")
	public String companies() {
		return "companies";
	}
	
	
	

	// job posting
	
	@GetMapping("/newjob")
	public String newjob() {
		return "new-job";
	}
	
	@GetMapping("/newperson")
	public String newPerson() {
		return "newperson";
	}
	
	@GetMapping("/persontable")
	public String personTable() {
		return "persontable";
	}
	
	@GetMapping("/joblist")
	public String joblist() {
		return "job-list";
	}
	
	@GetMapping("/jobview")
	public String jobview() {
		return "job-view";
	}
	
	@GetMapping("/jobapplication")
	public String job_application() {
		return "job-application";
	}
	
	@GetMapping("/applyjob")
	public String apply_job() {
		return "apply-job";
	}
	
}
