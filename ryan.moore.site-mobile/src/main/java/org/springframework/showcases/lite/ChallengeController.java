package org.springframework.showcases.lite;

import org.springframework.mobile.device.site.SitePreference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChallengeController {

	/**
	 * Show the About page to the user.
	 * Declares a {@link SitePreference} parameter to show how you can resolve the user's site preference.
	 * This controller renders a different version of the about view if the user has a mobile site preference.
	 */
	@RequestMapping("/challenge")
	public String challenge(SitePreference sitePreference, Model model) {
        model.addAttribute("blah", "blah");
		return "challenge";
	}

}