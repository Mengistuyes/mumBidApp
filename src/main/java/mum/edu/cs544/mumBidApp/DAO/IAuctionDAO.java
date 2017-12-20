package mum.edu.cs544.mumBidApp.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mum.edu.cs544.mumBidApp.model.Auction;
import mum.edu.cs544.mumBidApp.model.AuctionStatus;

@Repository
public interface IAuctionDAO extends JpaRepository<Auction, Long> {
	
	@Query("Select a from Auction a where a.status = :status")
    public Iterable<Auction> findByStatus(String status);
	//public List<Auction> getAllAuction();
//	@Query("Select a from Auction a where a.status = 'APPROVED'")
//	public List<Auction> getAllApprovedAuctions();
	
	@Query("Select a from Auction a where a.status = :status")
	public List<Auction> getAllApprovedAuctions(@Param("status") AuctionStatus status);

	public List<Auction> findByStatus(AuctionStatus status);

	@Query("Select a from Auction a where a.status = 'APPROVED' OR  a.status = 'ACTIVE'")
    public List<Auction> getAllApprovedAndActive();
	
	//public Auction getAuction(Long auctionId);
	
	//public List<Auction> getAuctionByStatus();

}
