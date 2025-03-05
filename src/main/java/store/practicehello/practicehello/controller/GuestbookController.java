package store.practicehello.practicehello.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import store.practicehello.practicehello.dto.GuestbookRequest;
import store.practicehello.practicehello.dto.GuestbookResponse;
import store.practicehello.practicehello.service.GuestbookService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/guestbook")
@RequiredArgsConstructor
public class GuestbookController {

    private final GuestbookService guestbookService;

    @PostMapping
    public GuestbookResponse saveEntry(@RequestBody GuestbookRequest request) {
        return guestbookService.saveEntry(request);
    }

    @GetMapping
    public List<GuestbookResponse> getEntries() {
        return guestbookService.getAllEntries();
    }
}
