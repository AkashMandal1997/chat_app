package com.akash.chatapp.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Message {
    private Long id;
    private String sender;
    private String content;
}
