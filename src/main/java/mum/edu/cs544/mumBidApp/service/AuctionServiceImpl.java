package mum.edu.cs544.mumBidApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.mumBidApp.DAO.IAuctionDAO;
import mum.edu.cs544.mumBidApp.model.Auction;
import mum.edu.cs544.mumBidApp.model.AuctionStatus;

@Service
public class AuctionServiceImpl implements IAuctionService {
	
	@Autowired
	private IAuctionDAO auctionDAO;
	
	@Transactional
	public List<Auction> getAllAuction() {
		return (List<Auction>) auctionDAO.findAll();
	}
	@Transactional
	public Auction saveAuction(Auction auction) {
		auction.setAuctionStatus(AuctionStatus.PENDING);
		return auctionDAO.save(auction);	
	}
	@Transactional
	public Auction getAuction(Long auctionId) {
		return auctionDAO.findOne(auctionId);
	}
	
		

}
