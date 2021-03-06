package mum.edu.cs544.mumBidApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.mumBidApp.DAO.IBidDAO;
import mum.edu.cs544.mumBidApp.model.Auction;
import mum.edu.cs544.mumBidApp.model.Bid;

@Service
@Transactional
public class BidServiceImpl implements IBidService {
	@Autowired
	IBidDAO bidDAO;
	@Override
	public List<Bid> getAllBid() {
		return (List<Bid>)bidDAO.findAll();
	}
	@Override
	public void save(Bid bid) {
		Auction auction=bid.getAuction();
		auction.setCurrentBidAmount(bid.getBidAmount());
		bidDAO.save(bid);
	}
	@Override
	public Bid getBid(Long bidId) {	
		return bidDAO.findOne(bidId); 
	}
	
	/*@Override
	public Bid getMaxBid(Long auctionId) {
		return bidDAO.getMaxBid(auctionId);
	}*/

}
