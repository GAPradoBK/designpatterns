import nongofpatterns.specification.*;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertEquals;

public class SpecificationPattern {

    @Test
    public void test()
            throws Exception {

        var apple = new Product("Apple", Color.GREEN, Size.SMALL);
        var tree = new Product("Tree", Color.GREEN, Size.LARGE);
        var house = new Product("House", Color.BLUE, Size.LARGE);

        var products = List.of(apple, tree, house);

        var filter = new ProductFilter();

        var filteredProducts = filter
                .filter( products, new AndSpecification<>(
                        new ProductColorSpecification( Color.GREEN ),
                        new ProductSizeSpecification( Size.LARGE ) ) )
                .collect(Collectors.toList() );

        assertEquals( 1, filteredProducts.size() );

        assertEquals( "Tree", filteredProducts.get(0).name );

    }

}
