package beam.jim.contact_list.service;

import beam.jim.contact_list.model.Contacts;
import beam.jim.contact_list.repository.ContactsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactsService {
    private final ContactsRepository repository;

    public ContactsService(ContactsRepository repository) {
        this.repository = repository;
    }

    public List<Contacts> findAll() {
        return repository.findAll();
    }

    public Optional<Contacts> findById(Long id) {
        return repository.findById(id);
    }

    public Contacts save(Contacts contacts) {
        return repository.save(contacts);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
