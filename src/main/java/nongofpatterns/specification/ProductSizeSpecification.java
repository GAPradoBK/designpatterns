package nongofpatterns.specification;

public class ProductSizeSpecification implements Specification<Product> {

    private Size size;

    public ProductSizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.size == size;
    }

}
