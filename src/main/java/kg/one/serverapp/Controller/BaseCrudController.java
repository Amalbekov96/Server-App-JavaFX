package kg.one.serverapp.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/ap1")
public interface BaseCrudController<S, T>{

    @PostMapping("/save")
    S save(@RequestBody S s);
    @PutMapping("/update")
    S update(@RequestBody S s);
    @GetMapping("/all")
    List<S> findAll();
    @GetMapping("/findById/{id}")
    S findById(@PathVariable T t);
    @DeleteMapping("/DeleteById/{id}")
    void deleteById(@PathVariable T t);
}
