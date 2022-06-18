package marketplace.marketplaceservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import marketplace.marketplaceservice.entity.Marketplace;
import marketplace.marketplaceservice.repository.MarketplaceRepository;

import java.util.List;

@Service
@Transactional
public class MarketplaceServiceImpl implements MarketplaceService {

    @Autowired
    private MarketplaceRepository marketplaceRepository;

    @Override
    public List<Marketplace> getAllMarketplace() {
        return marketplaceRepository.findAll();
    }

    public Marketplace getMarketplaceById(Long id) {
        return marketplaceRepository.getOne(id);
    }

    @Override
    public Marketplace addMarketplace(Marketplace marketplace) {
        return marketplaceRepository.save(marketplace);
    }
}
