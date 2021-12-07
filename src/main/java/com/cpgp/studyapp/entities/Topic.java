package com.cpgp.studyapp.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Topic {
    private int topicID;
    private boolean topicSelected;
    private String topicName;
    private LocalDateTime topicDateTime;
    private boolean topicFavorite;
}
