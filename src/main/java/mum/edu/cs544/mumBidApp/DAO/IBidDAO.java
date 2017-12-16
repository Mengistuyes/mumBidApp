package mum.edu.cs544.mumBidApp.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mum.edu.cs544.model.Bid;

public interface IBidDAO extends CrudRepository<Bid, Long> {
	/*public List<Bid> getAllBid();

	public void saveAuction(Bid bid);

	public Bid getBid(Long bidId);*/
}
