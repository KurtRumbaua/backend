package com.rijai.users.controller;

import com.rijai.users.model.Account;
import com.rijai.users.services.IAccountService;
import com.rijai.users.services.IDogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rijai.users.model.Dog;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class Controller {

    //Accounts
    @Autowired
    private IAccountService accountService;

    @RequestMapping("/api/accounts")
    public List<Account> findAccounts() { return accountService.getAccounts(); }

    @RequestMapping("/api/show-account/{id}")
    public Account showAccount(@PathVariable("id") long id) {
        return accountService.getAccount(id);
    }

    @RequestMapping(value = "/api/add-account", method = RequestMethod.POST)
    public Account addAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }

    @RequestMapping(value = "/api/update-account/{id}", method = RequestMethod.POST)
    public Account updateAccount(@PathVariable("id") long id, @RequestBody Account account) { return accountService.updateAccount(id, account); }

    @RequestMapping(value = "/api/delete-account/{id}", method = RequestMethod.DELETE)
    public void deleteAccount(@PathVariable("id") long id) {
        accountService.deleteAccount(id);
    }


    @Autowired
    private IDogService dogService;
    //Dogs
    @RequestMapping("/api/dogs")
    public List<Dog> findDogs() { return dogService.getDogs(); }

    @RequestMapping("/api/show-dog/{id}")
    public Dog showDog(@PathVariable("id") long id) {
        return dogService.getDog(id);
    }

    @RequestMapping(value = "/api/add-dog", method = RequestMethod.POST)
    public Dog addDog(@RequestBody Dog dog) {
        return dogService.addDog(dog);
    }

    @RequestMapping(value = "/api/update-dog/{id}", method = RequestMethod.PUT)
    public Dog updateDog(@PathVariable("id") long id, @RequestBody Dog dog) {
        return dogService.updateDog(id, dog);
    }

    @RequestMapping(value = "/api/delete-dog/{id}", method = RequestMethod.DELETE)
    public void deleteDog(@PathVariable("id") long id) {
        dogService.deleteDog(id);
    }

}
