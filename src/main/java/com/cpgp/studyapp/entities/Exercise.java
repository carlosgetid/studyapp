package com.cpgp.studyapp.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Exercise {
    private int exerciseID;
    private boolean exerciseSelected;
    private String exerciseText;
    private LocalDateTime exerciseDatetime;
    private boolean exerciseFavorite;
}
