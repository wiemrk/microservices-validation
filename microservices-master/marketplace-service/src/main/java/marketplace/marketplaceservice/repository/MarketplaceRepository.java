package marketplace.marketplaceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import marketplace.marketplaceservice.entity.Marketplace;


@Repository
public interface MarketplaceRepository extends JpaRepository<Marketplace, Long> {
}
