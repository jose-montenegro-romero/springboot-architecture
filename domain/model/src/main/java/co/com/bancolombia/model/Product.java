package co.com.bancolombia.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder(toBuilder = true)
public class Product {

    private Integer id;
    private String title;
    private double price;
    private String description;
    private List<String> images;
    private Category category;
}
