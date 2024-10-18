package com.blps.lab1.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DidNotCompletePremoderationExeption extends RuntimeException{
    String message;
}
