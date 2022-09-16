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


	@GetMapping("/companies")
	public String companies() {
		return "companies";
	}

	// job posting

	@GetMapping("/newjob")
	public String newjob() {
		return "new-job";
	}

	
	@GetMapping("/newcandidate")
	public String newPerson() {
		return "newcandidate";
	}
	
	@GetMapping("/candidatetable")
	public String personTable() {
		return "candidatetable";
	}
	
	@GetMapping("/joblist")
	public String joblist() {
		return "job-list";
	}

	@GetMapping("/jobview")
	public String jobview() {
		return "job-view";
	}

	
	
	

		//vendorregistration
		@GetMapping("/vendorregistration")
		public String vendorRegistration() {
			return "vendor-registration";
		}
		/*
		 * @GetMapping("/vendorcreation") public String vendorCreation() { return
		 * "vendor-creation"; }
		 */

	// vendor profile view
	@GetMapping("/vendorprofile")
	public String vendorProfile() {
		return "vendor-profiles";
	}

	// vendor tables
	@GetMapping("/vendortables")
	public String vendortables() {
		return "vendor-tables";
	}
	

	@GetMapping("/client")
	public String client() {
		return "client";
	}
	@GetMapping("/clientTable")
	public String clientTable() {
		return "clientTable";
	}

}
