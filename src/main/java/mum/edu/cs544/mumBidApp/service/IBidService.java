package mum.edu.cs544.mumBidApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mum.edu.cs544.mumBidApp.model.Bid;

@Service
public interface IBidService {
	public List<Bid> getAllBid();

	public void saveAuction(Bid bid);

	public Bid getBid(Long bidId);
	
}
