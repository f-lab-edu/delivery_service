package user.delivery.infrastructure.partner;

import org.springframework.data.jpa.repository.JpaRepository;
import user.delivery.domain.partner.Partner;
import user.delivery.domain.user.User;

public interface PartnerJpaRepository extends JpaRepository<Partner, Long> {
}
