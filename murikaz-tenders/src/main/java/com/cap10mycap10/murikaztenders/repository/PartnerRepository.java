package com.cap10mycap10.murikaztenders.repository;

import com.cap10mycap10.murikaztenders.model.Partner;
import com.cap10mycap10.murikaztenders.proj.PartnerView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface PartnerRepository extends JpaRepository<Partner, Long> {

    Collection<PartnerView> findAllBy();
}
