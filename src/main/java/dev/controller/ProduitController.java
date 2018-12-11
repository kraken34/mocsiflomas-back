package dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.domain.Produit;
import dev.repository.ProduitRepo;

@CrossOrigin
@RestController()
@RequestMapping()
public class ProduitController {

	@Autowired
	private ProduitRepo produitRepo;
	
	@GetMapping
	public List<Produit> findAll() {
		return this.produitRepo.findAll();
	}
	
	@Secured(value = { "ROLE_ADMINISTRATEUR" })
	@PatchMapping
	public Produit patchProduit(@PathVariable String nomFigurine) {
		Produit prod = this.produitRepo.findByNomFigurine(nomFigurine);
		
		this.produitRepo.save(prod);
		return prod;
	}
}
