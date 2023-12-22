package com.example.car.controllers;

import com.example.car.services.CarService;

@RestController
@RequestMapping("api/car")
public class CarController {

	@Autowired
	private CarService carService;
	@GetMapping
	public List<CarResponse> findAll(){
		return carService.findAll();
	}
	@GetMapping("/{id}")
	public CarResponse findById(@PathVariable Long id) throws Exception {
		return carService.findById(id);
	}
}
