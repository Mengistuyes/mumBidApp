package mum.edu.cs544.mumBidApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs544.mumBidApp.model.Auction;
import mum.edu.cs544.mumBidApp.service.IAuctionService;

@Controller
public class AuctionController {
	
	@Autowired
	private IAuctionService auctionService;
	
	@Autowired
	public void setAuctionService(IAuctionService auctionService){
		this.auctionService =auctionService;
	}
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String homeAuction(Model model) {
		List<Auction> auctions = auctionService.getAllAuction();
		//auctions.addAll(auctionService.getAllFutureAuctions());
		//model.addAttribute("auctions", auctions);
		return "auction";
	}
   @RequestMapping(value= "/auction/add", method = RequestMethod.POST)
	public String addAuction(@ModelAttribute("auction") Auction auction){
		//	auctionService.saveAuction(auction);		
	//	return "redirect:/auctions";		
		return "redirect:/auctions";
	}
	@RequestMapping(value = { "/activeAuctions" }, method = RequestMethod.GET)
	public String activeAuction(Model model) {
		System.out.println("activeAuctions");
		//	List<Auction> auctions = auctionService.getAuctionByStatus();
		//model.addAttribute("auctions", auctions);
		return "home";
	}
	
}
