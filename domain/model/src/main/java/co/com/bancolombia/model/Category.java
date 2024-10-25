package co.com.bancolombia.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class Category {
    private Integer id;
    private String name;
}
