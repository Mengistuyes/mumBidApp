package mum.edu.cs544.mumBidApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import mum.edu.cs544.dao.IBidDAO;
import mum.edu.cs544.model.Auction;
import mum.edu.cs544.model.Bid;


public class BidServiceImpl implements IBidService {

	@Autowired
	IBidDAO bidDAO;
	
	@Override
	public List<Bid> getAllBid() {
		return (List<Bid>)bidDAO.findAll();
	}

	@Override
	public void saveAuction(Bid bid) {
		Auction auction = bid.getAuction();
		//I will add something
		bidDAO.save(bid);	
	}

	@Override
	public Bid getBid(Long bidId) {
		return bidDAO.findOne(bidId);
	}


}
