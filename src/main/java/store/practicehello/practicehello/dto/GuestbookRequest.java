package store.practicehello.practicehello.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuestbookRequest {
    private String name;
    private String message;
}
