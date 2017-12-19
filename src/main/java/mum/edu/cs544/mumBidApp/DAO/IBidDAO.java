package mum.edu.cs544.mumBidApp.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.cs544.mumBidApp.model.Bid;
@Repository
public interface IBidDAO extends CrudRepository<Bid, Long> {
	/*public List<Bid> getAllBid();

	public void saveAuction(Bid bid);

	public Bid getBid(Long bidId);*/
}
