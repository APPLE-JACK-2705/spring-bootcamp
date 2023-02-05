package com.adilkhanov.springbootcamp.controllers;

import com.adilkhanov.springbootcamp.entities.Bid;
import com.adilkhanov.springbootcamp.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class BidController {

    @Autowired
    BidService bidService;

    @GetMapping("/api/bids")
    public List<Bid> getAllBids() {
        return bidService.getAllBids();
    }

    @GetMapping("/api/bids/{id}")
    public Optional<Bid> getOneBid(@PathVariable Long id) {
        return bidService.getBidById(id);
    }

    @PostMapping("/api/bids")
    public Bid postNewBid(@RequestBody Bid bid) {
        var isSaved = bidService.postNewBid(bid);
        return bidService.postNewBid(bid);
    }

    @GetMapping("/api/bids/{auctionId}")
    public ResponseEntity<List<Bid>> getAllBidsByAuctionId(@PathVariable long auctionId) {
        var bids = bidService.findBidsByAuctionId(auctionId);
        return ResponseEntity.ok(bids);
    }
}
