package com.serviceclient.controller;

import com.serviceclient.entities.Client;
import com.serviceclient.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("api/client")
public class ClientController {
    @Autowired
    private ClientService service;

    @GetMapping
    public List<Client> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Client findById(@PathVariable Long id) throws Exception {
        return service.findById(id);
    }

    @PostMapping()
    public void save(@RequestBody Client client) {
        service.addClient(client);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public Client update(@PathVariable Long id,@RequestBody Client client) {
        return service.update(id, client);
    }
}
