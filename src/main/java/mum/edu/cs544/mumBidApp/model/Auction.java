package mum.edu.cs544.mumBidApp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	private Double InitialPrice;
	
	private Double ExpectedPrice;
	
	@Enumerated(EnumType.STRING)
	private String AuctionStatus;
	
	//private List<Bid> listOfBids;
	
	/*@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="owner_id")
	private User owner;*/
	
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

	public Double getInitialPrice() {
		return InitialPrice;
	}

	public Double getExpectedPrice() {
		return ExpectedPrice;
	}

	public void setExpectedPrice(Double expectedPrice) {
		ExpectedPrice = expectedPrice;
	}

	public void setInitialPrice(Double initialPrice) {
		InitialPrice = initialPrice;
	}

	public String getAuctionStatus() {
		return AuctionStatus;
	}

	public void setAuctionStatus(String auctionStatus) {
		AuctionStatus = auctionStatus;
	}

	/*public List<Bid> getListOfBids() {
		return listOfBids;
	}

	public void setListOfBids(List<Bid> listOfBids) {
		this.listOfBids = listOfBids;
	}*/
	
	
	
	

}
