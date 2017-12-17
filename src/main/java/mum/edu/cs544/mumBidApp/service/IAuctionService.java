package mum.edu.cs544.mumBidApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mum.edu.cs544.mumBidApp.model.Auction;
@Service
public interface IAuctionService {
	public List<Auction> getAllAuction();

	public Auction saveAuction(Auction auction);

	public Auction getAuction(Long auctionId);
	
	//public List<Auction> getAuctionByStatus(String status);

}
