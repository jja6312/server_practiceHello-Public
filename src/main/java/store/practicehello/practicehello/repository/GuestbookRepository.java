package store.practicehello.practicehello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import store.practicehello.practicehello.entity.GuestbookEntry;

public interface GuestbookRepository extends JpaRepository<GuestbookEntry, Long> {
}
