package com.avanes.alfabank.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


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
    private String base;
    private Map<String,String> rates ;
    private LocalDate localDate = LocalDate.now().minusDays(-1);


}
