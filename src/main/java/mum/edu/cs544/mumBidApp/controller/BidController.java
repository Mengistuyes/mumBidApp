package mum.edu.cs544.mumBidApp.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs544.model.Bid;
import mum.edu.cs544.service.IBidService;

public class BidController {
	private IBidService bidService;
	//Active 
	@RequestMapping(value = { "/bid" }, method = RequestMethod.GET)
	public String activeAuction(Model model) {
		List<Bid> bids = bidService.getAllBid();
		model.addAttribute("bids", bids);
		return "home";
	}
}
