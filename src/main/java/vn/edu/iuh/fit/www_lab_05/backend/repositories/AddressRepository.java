package vn.edu.iuh.fit.www_lab_05.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_lab_05.backend.models.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
