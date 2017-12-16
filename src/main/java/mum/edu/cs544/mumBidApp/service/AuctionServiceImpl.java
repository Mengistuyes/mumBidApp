package mum.edu.cs544.mumBidApp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import mum.edu.cs544.dao.AuctionDAO;
import mum.edu.cs544.dao.IAuctionDAO;
import mum.edu.cs544.model.Auction;
import mum.edu.cs544.model.AuctionStatus;
@Service
public class AuctionServiceImpl implements IAuctionService {
	@Autowired
	private IAuctionDAO auctionDAO;
	
	public void addAuction(Auction auction) {
		auctionDAO.saveAuction(auction);
	}
	
	@Override
	@Transactional
	public List<Auction> getAllAuction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void saveAuction(Auction auction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public Auction getAuction(Long auctionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
