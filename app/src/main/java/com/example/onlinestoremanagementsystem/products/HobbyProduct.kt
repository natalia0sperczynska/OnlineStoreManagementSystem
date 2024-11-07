package com.example.onlinestoremanagementsystem.products

import com.example.onlinestoremanagementsystem.products.categories.CategoryHobbyProduct
/**
 * Represents a hobby-related product in the online store.
 *
 * @property id The unique identifier for the product.
 * @property name The name of the product.
 * @property status The availability status of the product (e.g., AVAILABLE, SOLD_OUT).
 * @property price The price of the product in the store.
 * @property category The specific category of the hobby product (e.g., BOOK, GAME, SPORT).
 */
class HobbyProduct(override val id:String,
                   override val name:String,
                   override var status :Enum<Status>,
                   override var price:Double,
                   val category: Enum<CategoryHobbyProduct>
): Product() {
    /**
     * Prints all details of the hobby product, including its category.
     * Calls the superclass's `printAllProductInfo` method and adds category information.
     */
    override fun printAllProductInfo() {
        super.printAllProductInfo()
        println("category : ${category}")
    }
}