package mum.edu.cs544.mumBidApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mum.edu.cs544.mumBidApp.DAO.IBidDAO;
import mum.edu.cs544.mumBidApp.model.Auction;
import mum.edu.cs544.mumBidApp.model.Bid;


public class BidServiceImpl implements IBidService {
	@Autowired
	IBidDAO bidDAO;
	
	public List<Bid> getAllBid() {
		return (List<Bid>)bidDAO.findAll();
	}

	public void save(Bid bid) {
		Auction auction=bid.getAuction();
		auction.setCurrentBidAmount(bid.getBidAmount());
		bidDAO.save(bid);
	}

	public Bid getBid(Long bidId) {	
		return bidDAO.findOne(bidId);
	}

}
