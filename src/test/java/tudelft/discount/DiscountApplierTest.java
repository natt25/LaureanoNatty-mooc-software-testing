package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountApplierTest {

    @Test
    public void applyDiscountsCorrectly() {
        Product homeProduct = new Product("Silla", 100.0, "HOME");
        Product businessProduct = new Product("Escritorio", 200.0, "BUSINESS");

        List<Product> products = Arrays.asList(homeProduct, businessProduct);

        ProductDao mockDao = Mockito.mock(ProductDao.class);
        Mockito.when(mockDao.all()).thenReturn(products);

        DiscountApplier applier = new DiscountApplier(mockDao);
        applier.setNewPrices();

        // HOME → 90% de 100 = 90.0
        assertEquals(90.0, homeProduct.getPrice(), 0.001);
        // BUSINESS → 110% de 200 = 220.0
        assertEquals(220.0, businessProduct.getPrice(), 0.001);
    }

    @Test
    public void noDiscountForOtherCategory() {
        Product otherProduct = new Product("Cuadro", 50.0, "ART");

        List<Product> products = Arrays.asList(otherProduct);

        ProductDao mockDao = Mockito.mock(ProductDao.class);
        Mockito.when(mockDao.all()).thenReturn(products);

        DiscountApplier applier = new DiscountApplier(mockDao);
        applier.setNewPrices();

        assertEquals(50.0, otherProduct.getPrice(), 0.001); // no cambio
    }
}
