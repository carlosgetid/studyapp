package com.cpgp.studyapp.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Category {
    private int categoryID;
    private boolean categorySelected;
    private String categoryName;
    private LocalDateTime categoryDateTime;
    private boolean categoryFavorite;
}
