package mum.edu.cs544.mumBidApp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mum.edu.cs544.mumBidApp.model.Auction;


public interface IAuctionDAO extends JpaRepository<Auction, Long> {
	
	@Query("Select a from Auction a where a.status = :status")
    public Iterable<Auction> findByStatus(String status);
	//public List<Auction> getAllAuction();


	//public Auction getAuction(Long auctionId);
	
	//public List<Auction> getAuctionByStatus();

}
