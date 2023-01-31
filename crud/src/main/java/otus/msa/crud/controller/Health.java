package otus.msa.crud.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
public class Health {
    @GetMapping
    public ResponseEntity<Object> health() {
        return ResponseEntity.ok().build();
    }
}
