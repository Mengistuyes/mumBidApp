package mum.edu.cs544.mumBidApp.controller;

import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;

import mum.edu.cs544.mumBidApp.exception.fileUploadException;
import mum.edu.cs544.mumBidApp.model.Auction;
import mum.edu.cs544.mumBidApp.service.IAuctionService;

@Controller
public class AuctionController {
	
	@Autowired
	private IAuctionService auctionService;
	
	@Autowired
	ServletContext servletContext;
	
	@Autowired
	public void setAuctionService(IAuctionService auctionService){
		this.auctionService =auctionService;
	}
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String homeAuction(Model model) {
		List<Auction> auctions = auctionService.getAllApprovedAndActive();
		model.addAttribute("auctions", auctions);
		return "home";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addAuction(@ModelAttribute("addNewAuction") Auction auction, Model model) {
		return "auctionForm";
	}

	@RequestMapping(value = "/auction/add/{id}", method = RequestMethod.GET)
	public String addAuction(@PathVariable("id") Long id, Model model,
		@ModelAttribute("addNewAuction") Auction auction) {
		auction = auctionService.getAuction(id);
		model.addAttribute("addNewAuction", auction);
		return "auctionForm";
	}
	
	@RequestMapping(value = "/auction/getApprovedById/{id}", method = RequestMethod.GET)
	public String getApprovedAuctionById(@PathVariable("id") Long id, Model model,
		@ModelAttribute("updateAuctionStatus") Auction auction) {
		auction = auctionService.getAuction(id);
		model.addAttribute("status", auction);
		model.addAttribute("id", auction.getId());
		return "updateAuctionStatusForm";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addAuction(@Valid @ModelAttribute("addNewAuction") Auction auction, BindingResult result,
			Model model, HttpServletRequest request, RedirectAttributes redirectAttributes) {
			
		MultipartFile image = auction.getImage();
		String rootDirectory = servletContext.getRealPath("/");
		
		UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        //Not working
		String imagePath = rootDirectory + "/resources/images/" + randomUUIDString + ".jpg";
		
		if (image != null && !image.isEmpty()) {

		try {
			image.transferTo(new File(imagePath));
		} catch (Exception ex) {

			throw new fileUploadException("Saving the image was not successful", ex);
		}
		
	}
		//	auction.setImagePath(servletContext.getServletContextName() + "/mumBidApp/src/main/webapp/resources/images/" + auction.getId() + ".jpg");
		auction.setImageName(randomUUIDString);
		auction.setImagePath(servletContext.getServletContextName() + "/resources/images/" + randomUUIDString + ".jpg");
		Calendar now1 = Calendar.getInstance();
		Calendar now2 = Calendar.getInstance();
		
		//It is temporary
		auction.setStartDate(now1.getTime());
		now2.set(Calendar.HOUR_OF_DAY, 17);
		auction.setEndDate(now2.getTime());
		
		auction = auctionService.saveAuction(auction);

		model.addAttribute("ItemName", auction.getItem());
        model.addAttribute("ItemDescription", auction.getItemDescription());
        model.addAttribute("MinimumBidAmount", auction.getMinimumBidAmount());
        model.addAttribute("expectedPrice", auction.getExpectedPrice());
        model.addAttribute("endDate1", auction.getEndDate());
        
       // ObjectMapper objectMapper = new ObjectMapper();
        //result.addObject("endDate", objectMapper.writeValueAsString(auction.getEndDate());
        
		//return "redirect:/auction/add/" + auction.getId();
		return "successfulMessage";
}
  
	@RequestMapping(value = { "/activeAuctions" }, method = RequestMethod.GET)
	public String activeAuction(Model model) {
		System.out.println("activeAuctions");
		List<Auction> auctions = auctionService.getAllApprovedAuctions();
		//List<Auction> auctions = auctionService.getAllApprovedAuctions();
		model.addAttribute("auctions", auctions);
		return "home";
	}

	@RequestMapping(value = { "/getAllAuctions" }, method = RequestMethod.GET)
	public String getAllAuction(Model model) {
		List<Auction> auctions = auctionService.getAllAuction();
		model.addAttribute("listOfAuctions", auctions);
		return "displayListOfAuction";
	}
		
	@RequestMapping(value = "/approve/{auctionId}", method = RequestMethod.PUT)
	public @ResponseBody Auction approveAuction(@PathVariable("auctionId") Long auctionId) {		
		return auctionService.approveAuction(auctionId);
	}
	
	@RequestMapping(value = "/reject/{auctionId}", method = RequestMethod.PUT)
	public @ResponseBody Auction rejectAuction(@PathVariable("auctionId") Long auctionId) {		
		return auctionService.rejectAuction(auctionId);
	}
}


/*Calendar now = Calendar.getInstance();
		now.set(Calendar.HOUR_OF_DAY, 9);
		now.set(Calendar.MINUTE, 00);
		now.set(Calendar.SECOND, 00);
		now.add(Calendar.DAY_OF_MONTH, 2);

		auction.setStartDate(now.getTime());
		now.add(Calendar.DAY_OF_MONTH, 3);
		now.set(Calendar.HOUR_OF_DAY, 16);

		auction.setEndDate(now.getTime());*/