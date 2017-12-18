package mum.edu.cs544.mumBidApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.mumBidApp.DAO.IAuctionDAO;
import mum.edu.cs544.mumBidApp.model.Auction;
import mum.edu.cs544.mumBidApp.model.AuctionStatus;

@Service
public class AuctionServiceImpl implements IAuctionService {
	
	@Autowired
	private IAuctionDAO auctionDAO;
	
	@Transactional
	public List<Auction> getAllAuction() {
		return (List<Auction>) auctionDAO.findAll();
	}
	@Transactional
	public Auction saveAuction(Auction auction) {
		auction.setAuctionStatus(AuctionStatus.PENDING);
	//	auction.setImagePath(auction.getImagePath() + auction.getId() + ".jpg");
		return auctionDAO.save(auction);	
	}
	@Transactional
	public Auction getAuction(Long auctionId) {
		return auctionDAO.findOne(auctionId);
	}
	
	
	@Override
	public Auction approveAuction(Long auctionId) {

		Auction auction = auctionDAO.findOne(auctionId);
		auction.setStatus(AuctionStatus.APPROVED);
		return auctionDAO.save(auction);
	}
	
	@Override
	public Auction approveAuction(Auction auction) {

		auction.setStatus(AuctionStatus.APPROVED);
		return auctionDAO.save(auction);
	}

	@Override
	public Auction rejectAuction(Long auctionId) {
		Auction auction = auctionDAO.findOne(auctionId);
		auction.setStatus(AuctionStatus.CANCELLED);
		return auctionDAO.save(auction);

	}

	@Override
	public List<Auction> findByStatus(String status){
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Auction> getAllApprovedAuctions() {
		return auctionDAO.getAllApprovedAuctions(AuctionStatus.APPROVED);	
	}
		

}
