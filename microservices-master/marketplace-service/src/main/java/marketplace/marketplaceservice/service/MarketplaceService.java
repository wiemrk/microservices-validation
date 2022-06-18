package marketplace.marketplaceservice.service;

import java.util.List;

import marketplace.marketplaceservice.entity.Marketplace;

public interface MarketplaceService {
    public List<Marketplace> getAllMarketplace();
    public Marketplace getMarketplaceById(Long id);
    public Marketplace addMarketplace(Marketplace product);
}
