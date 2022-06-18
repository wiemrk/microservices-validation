package marketplace.marketplaceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

import marketplace.marketplaceservice.entity.Marketplace;
import marketplace.marketplaceservice.http.header.HeaderGenerator;
import marketplace.marketplaceservice.service.MarketplaceService;
import java.util.List;


@RestController
@RequestMapping("/marketplace")

public class MarketplaceController {

	@Autowired
	private MarketplaceService marketplaceRepository;

	@Autowired
	private HeaderGenerator headerGenerator;

	@PostMapping(value = "/marketplaces")
	private ResponseEntity<Marketplace> addMarketplace(@RequestBody Marketplace marketplace, HttpServletRequest request) {
		if (marketplace != null) {
			try {
				marketplaceRepository.addMarketplace(marketplace);
				return new ResponseEntity<Marketplace>(
						marketplace,
						headerGenerator.getHeadersForSuccessPostMethod(request, marketplace.getId()),
						HttpStatus.CREATED);
			} catch (Exception e) {
				e.printStackTrace();
				return new ResponseEntity<Marketplace>(
						headerGenerator.getHeadersForError(),
						HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		return new ResponseEntity<Marketplace>(
				headerGenerator.getHeadersForError(),
				HttpStatus.BAD_REQUEST);
	}

	@GetMapping(value = "/marketplaces")
	public ResponseEntity<List<Marketplace>> getAllMarketplaces() {
		List<Marketplace> marketplaces = marketplaceRepository.getAllMarketplace();
		if (!marketplaces.isEmpty()) {
			return new ResponseEntity<List<Marketplace>>(
					marketplaces,
					headerGenerator.getHeadersForSuccessGetMethod(),
					HttpStatus.OK);
		}
		return new ResponseEntity<List<Marketplace>>(
				headerGenerator.getHeadersForError(),
				HttpStatus.NOT_FOUND);
	}

	@GetMapping(value = "/marketplaces/{id}")
	public ResponseEntity<Marketplace> getOneMarketplaceById(@PathVariable("id") long id) {
		Marketplace marketplace = marketplaceRepository.getMarketplaceById(id);
		if (marketplace != null) {
			return new ResponseEntity<Marketplace>(
					marketplace,
					headerGenerator.getHeadersForSuccessGetMethod(),
					HttpStatus.OK);
		}
		return new ResponseEntity<Marketplace>(
				headerGenerator.getHeadersForError(),
				HttpStatus.NOT_FOUND);
	}
}
