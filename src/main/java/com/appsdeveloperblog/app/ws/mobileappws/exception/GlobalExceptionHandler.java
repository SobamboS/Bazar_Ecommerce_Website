package com.appsdeveloperblog.app.ws.mobileappws.exception;

import com.appsdeveloperblog.app.ws.mobileappws.Utils.ApiResponse;
import com.appsdeveloperblog.app.ws.mobileappws.dto.response.MessageResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


@RestControllerAdvice
public class GlobalExceptionHandler{

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    @ExceptionHandler(UserException.class)
    public ResponseEntity<ApiResponse> handleGenericException(UserException genericException,
                                                              HttpServletRequest httpServletRequest) {
        ApiResponse errorResponse = ApiResponse.builder().isSuccessful(false)
                .data(MessageResponse.builder().message((genericException.getMessage())).build())
                .status(HttpStatus.BAD_REQUEST.value()).path(httpServletRequest.getRequestURI())
                .timeStamp(Instant.now()).build();
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse> handleValidationException(MethodArgumentNotValidException ex,
                                                                 HttpServletRequest httpServletRequest) {
        BindingResult bindingResult = ex.getBindingResult();
        List<String> errorMessages = new ArrayList<>();
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            errorMessages.add(fieldError.getDefaultMessage());
        }
        ApiResponse errorResponse = ApiResponse.builder()
                .isSuccessful(false)
                .data(errorMessages)
                .status(HttpStatus.BAD_REQUEST.value())
                .path(httpServletRequest.getRequestURI())
                .timeStamp(Instant.now())
                .build();
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

}
