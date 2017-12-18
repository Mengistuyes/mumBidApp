package mum.edu.cs544.mumBidApp.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import mum.edu.cs544.mumBidApp.model.Auction;
@Service
public interface IAuctionService {

	
	public List<Auction> getAllAuction();
	
	public List<Auction> getAllApprovedAuctions();
	
	public Auction saveAuction(Auction auction);

	public Auction getAuction(Long auctionId);
	
	public Auction approveAuction(Long auctionId);

	public Auction rejectAuction(Long auctionId);

	public Auction approveAuction(Auction auction);
	
	public List<Auction> findByStatus(String status);
	
	
	
	//public List<Auction> getAuctionByStatus(String status);

}
