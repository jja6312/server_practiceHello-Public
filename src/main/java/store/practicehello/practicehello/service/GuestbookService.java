package store.practicehello.practicehello.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import store.practicehello.practicehello.dto.GuestbookRequest;
import store.practicehello.practicehello.dto.GuestbookResponse;
import store.practicehello.practicehello.entity.GuestbookEntry;
import store.practicehello.practicehello.repository.GuestbookRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GuestbookService {

    private final GuestbookRepository guestbookRepository;

    public GuestbookResponse saveEntry(GuestbookRequest request) {
        GuestbookEntry saved = guestbookRepository.save(
                GuestbookEntry.builder()
                        .name(request.getName())
                        .message(request.getMessage())
                        .build()
        );
        return GuestbookResponse.builder()
                .id(saved.getId())
                .name(saved.getName())
                .message(saved.getMessage())
                .build();
    }

    public List<GuestbookResponse> getAllEntries() {
        return guestbookRepository.findAll().stream()
                .map(entry -> GuestbookResponse.builder()
                        .id(entry.getId())
                        .name(entry.getName())
                        .message(entry.getMessage())
                        .build())
                .collect(Collectors.toList());
    }
}
