package beam.jim.contact_list.controller;

import beam.jim.contact_list.model.Contacts;
import beam.jim.contact_list.service.ContactsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contacts")
public class ContactsController {
    private final ContactsService service;

    public ContactsController(ContactsService service) {
        this.service = service;
    }

    @GetMapping
    public List<Contacts> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Contacts> getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public ResponseEntity<Contacts> create(@RequestBody Contacts contacts) {
        Contacts createdContact = service.save(contacts);
        return ResponseEntity.ok().body(createdContact);
    }


    @PutMapping("/{id}")
    public Contacts update(@PathVariable Long id,
                           @RequestBody Contacts contacts) {
        contacts.setId(id);
        return service.save(contacts);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }

}

