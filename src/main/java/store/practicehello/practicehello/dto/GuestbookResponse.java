package store.practicehello.practicehello.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GuestbookResponse {
    private Long id;
    private String name;
    private String message;
}
