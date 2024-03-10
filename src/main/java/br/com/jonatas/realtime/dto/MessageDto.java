package br.com.jonatas.realtime.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"user", "message"})
public record MessageDto(
        String user,
        String message
) {
}
