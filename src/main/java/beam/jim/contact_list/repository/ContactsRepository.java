package beam.jim.contact_list.repository;

import beam.jim.contact_list.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {
}
