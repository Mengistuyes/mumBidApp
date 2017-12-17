package mum.edu.cs544.mumBidApp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Auction {
	@Id @GeneratedValue
	private int Id;
	
	private String item;
	
	private String itemDescription;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date endDate;
	
	private Double minimumBidAmount;
	
	private Double expectedPrice;
	
	private Double currentBidAmount;
	
	@Enumerated(EnumType.STRING)
	private AuctionStatus status;
	
	private String imagePath;
	
	//private List<Bid> listOfBids;
	
	public Auction()
	{
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Double getCurrentBidAmount() {
		return currentBidAmount;
	}

	public void setCurrentBidAmount(Double currentBidAmount) {
		currentBidAmount = currentBidAmount;
	}

	public AuctionStatus getStatus() {
		return status;
	}

	public void setStatus(AuctionStatus status) {
		this.status = status;
	}

	public Double getMinimumBidAmount() {
		return minimumBidAmount;
	}

	public void setMinimumBidAmount(Double minimumBidAmount) {
		this.minimumBidAmount = minimumBidAmount;
	}

	public Double getExpectedPrice() {
		return expectedPrice;
	}

	public void setExpectedPrice(Double expectedPrice) {
		this.expectedPrice = expectedPrice;
	}

	public AuctionStatus getAuctionStatus() {
		return status;
	}

	public void setAuctionStatus(AuctionStatus auctionStatus) {
		status = auctionStatus;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	
	/*public List<Bid> getListOfBids() {
		return listOfBids;
	}

	public void setListOfBids(List<Bid> listOfBids) {
		this.listOfBids = listOfBids;
	}*/
	
	
	
	

}
