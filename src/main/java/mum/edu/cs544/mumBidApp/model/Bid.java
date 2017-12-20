package mum.edu.cs544.mumBidApp.model;

import java.util.Date;

import javax.persistence.CascadeType;
<<<<<<< HEAD
import javax.persistence.Entity;
=======
>>>>>>> 5dae028eaf1b86ea5669c91aaccf716fd01dac1e
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
<<<<<<< HEAD
@Entity
public class Bid implements Serializable {
=======

public class Bid {
>>>>>>> 5dae028eaf1b86ea5669c91aaccf716fd01dac1e
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)// I will implemented
	//@ManyToOne
	private Auction auction;
	
	private double bidAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date bidDate;
	
	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="bidder_id")
	private User bidder;

	public Bid()
	{
		
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Auction getAuction() {
		return auction;
	}

	public void setAuction(Auction auction) {
		this.auction = auction;
	}

	public double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}

	public Date getBidDate() {
		return bidDate;
	}

	public void setBidDate(Date bidDate) {
		this.bidDate = bidDate;
	}

	public User getBidder() {
		return bidder;
	}

	public void setBidder(User bidder) {
		this.bidder = bidder;
	}

	
	
}
