package mum.edu.cs544.mumBidApp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.cs544.mumBidApp.model.Auction;


public interface IAuctionDAO extends JpaRepository<Auction, Long> {
	//public List<Auction> getAllAuction();


	//public Auction getAuction(Long auctionId);
	
	//public List<Auction> getAuctionByStatus();

}
