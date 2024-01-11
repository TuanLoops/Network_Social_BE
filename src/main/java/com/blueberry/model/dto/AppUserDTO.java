package com.blueberry.model.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class AppUserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String avatarImage;
    private String bannerImage;
    private boolean isOnline;
}
