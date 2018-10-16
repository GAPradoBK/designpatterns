package nongofpatterns.specification;

public class ProductColorSpecification implements Specification<Product> {

    private Color color;

    public ProductColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.color == color;
    }

}
