package mum.edu.cs544.mumBidApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
import mum.edu.cs544.mumBidApp.service.IAuctionService;
import mum.edu.cs544.mumBidApp.service.IBidService;

@Controller
public class BidController {
	@Autowired
	private IBidService bidServiceImpl;
	
	@Autowired
	IAuctionService auctionServiceImpl;
		
	@RequestMapping(value = "/auction/bid/{auctionId}", method = RequestMethod.GET)
	public String getAuctionDetail(@ModelAttribute("newBid") Bid bid, @PathVariable("auctionId") Long auctionId,
			Model model) {

		Auction auction = auctionServiceImpl.getAuction(auctionId);
		/*if((auction.getCurrentBidAmount() != null) || (auction.getCurrentBidAmount() != 0.0))
		{
			//
		}*/
	/*	Bid myBid=bidServiceImpl.getMaxBid(auctionId);
		if(myBid!=null)//has value
		{
			model.addAttribute("id", myBid.getId());
			model.addAttribute("CurrentMaxAmount", myBid.getBidAmount());
		}*/
		
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
		if(bid.getBidAmount()<auction.getCurrentBidAmount())
		{
			
		}
		else
		{
			bidServiceImpl.save(bid);
			auction.setCurrentBidAmount(bid.getBidAmount());
			auctionServiceImpl.updateAuction(auction);
		}
		
		//auctionServiceImpl.saveAuction(auction);
		return "redirect:/auction/bid/" + auctionId;
	}
}
