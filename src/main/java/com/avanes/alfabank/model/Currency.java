package com.avanes.alfabank.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Currency {
    private String disclaimer;
    private String license;
    private Long timestamp;
    @JsonProperty(value = "base")
    private String base;

    private Map<String, String> rates;

}
