package com.accor.wco.sample.vaultconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accor.wco.sample.vaultconfig.config.ServiceConfig;
import com.accor.wco.sample.vaultconfig.model.Hotel;

@RestController
@RequestMapping(value="v1/hotels")
public class HotelController {
    @Autowired
    ServiceConfig config;
	@RequestMapping(value="/{hotelId}",method = RequestMethod.GET)
	public Hotel getHotel(@PathVariable("hotelId") String hotelId ) {
		return new Hotel()
				.withHotelId(hotelId)
				.withHotelName("MyHotel")
				.withHotelComment(config.getComment());
	}
}
