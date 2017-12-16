package mum.edu.cs544.mumBidApp.service;

import java.util.List;

import mum.edu.cs544.model.Auction;

public interface IAuctionService {
	public List<Auction> getAllAuction();

	public void saveAuction(Auction auction);

	public Auction getAuction(Long auctionId);
	
	//public List<Auction> getAuctionByStatus(String status);

}
