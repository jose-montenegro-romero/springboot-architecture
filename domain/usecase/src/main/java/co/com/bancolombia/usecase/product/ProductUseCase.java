package co.com.bancolombia.usecase.product;

import co.com.bancolombia.model.Product;
import co.com.bancolombia.model.gateway.ProductGateway;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class ProductUseCase {

    private final ProductGateway productGateway;

    public Flux<Product> getProduct(){
        return productGateway.getProducts();
    }

    public Flux<Product> getProductFilter(){
        return productGateway.getProducts()
                .filter(product -> product.getPrice() > 100);
    }
}
