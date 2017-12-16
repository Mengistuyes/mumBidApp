package mum.edu.cs544.mumBidApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.cs544.mumBidApp.DAO.IAuctionDAO;
import mum.edu.cs544.mumBidApp.model.Auction;
import mum.edu.cs544.mumBidApp.model.AuctionStatus;

@Service
public class AuctionServiceImpl implements IAuctionService {
	@Autowired
	private IAuctionDAO auctionDAO;

	public List<Auction> getAllAuction() {
		return (List<Auction>) auctionDAO.findAll();
	}

	public void saveAuction(Auction auction) {
		auction.setAuctionStatus(AuctionStatus.PENDING.toString());
		auctionDAO.save(auction);
		
	}

	public Auction getAuction(Long auctionId) {
		return auctionDAO.findOne(auctionId);
	}
	
		

}
