package mum.edu.cs544.mumBidApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.cs544.mumBidApp.model.Auction;
import mum.edu.cs544.mumBidApp.model.Bid;
import mum.edu.cs544.mumBidApp.service.AuctionServiceImpl;
import mum.edu.cs544.mumBidApp.service.BidServiceImpl;
import mum.edu.cs544.mumBidApp.service.IBidService;

public class BidController {
	private IBidService bidService;
	//Active 
	@RequestMapping(value = { "/bid" }, method = RequestMethod.GET)
	public String activeAuction(Model model) {
		//List<Bid> bids = bidService.get
	//	model.addAttribute("bids", bids);
		return "home";
	}
	
	
	@Autowired
	AuctionServiceImpl auctionServiceImpl;

	@Autowired
	BidServiceImpl bidServiceImpl;

	@RequestMapping(value = "/auction/bid/{auctionId}", method = RequestMethod.GET)
	public String getAuctionDetail(@ModelAttribute("newBid") Bid bid, @PathVariable("auctionId") Long auctionId,
			Model model) {
		Auction auction = auctionServiceImpl.getAuction(auctionId);
		bid.setAuction(auction);
		model.addAttribute("auction", auction);
		return "biddingPage";
	}

	@RequestMapping(value = "/auction/bid/{auctionId}", method = RequestMethod.POST)
	public String bidAuction(@PathVariable("auctionId") Long auctionId, @Valid @ModelAttribute("newBid") Bid bid,
			BindingResult result, Model model, RedirectAttributes redirectAttributes) {
		Auction auction = auctionServiceImpl.getAuction(auctionId);
		bid.setAuction(auction);

		model.addAttribute("auction", auction);

		bidServiceImpl.save(bid);
		return "redirect:/auction/bid/" + auctionId;
	}
}
