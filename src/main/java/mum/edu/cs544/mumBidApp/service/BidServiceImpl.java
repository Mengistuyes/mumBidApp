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
		// TODO Auto-generated method stub
		return null;
	}

	public void saveAuction(Bid bid) {
		// TODO Auto-generated method stub
		
	}

	public Bid getBid(Long bidId) {
		// TODO Auto-generated method stub
		return null;
	}

}
