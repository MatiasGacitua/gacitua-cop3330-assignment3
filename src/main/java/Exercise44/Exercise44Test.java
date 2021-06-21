package Exercise44;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Matias Gacitua
 */


 import org.junit.Test;

 import static org.junit.Assert.assertEquals;

 public class ProductInventoryTest
 {
     @Test
     public void test_that_product_information_is_returned_for_a_valid_product() throws Exception
     {
         //arrange
         ProductInventory pi = new ProductInventory("src/ex44productSearch/products.json");
         String expectedResults = "Name: Thing\n" +
                 "Price: $15.00\n" +
                 "Quantity On Hand: 5\n";

         //act
         String searchResults = pi.findProduct("Thing");

         //assert
         assertEquals(expectedResults, searchResults);
     }

     @Test
     public void test_than_a_message_is_return_when_product_does_not_exist() throws Exception
     {
         //arrange
         ProductInventory pi = new ProductInventory("src/ex44productSearch/products.json");
         String expectedResults = "Product was not found. Please try again.";

         //act
         String searchResults = pi.findProduct("Pencil");

         //assert
         assertEquals(expectedResults, searchResults);
     }
 }